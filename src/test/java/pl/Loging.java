package pl;

import Tools.Mapping;
import Tools.TestFunctions;
import Tools.TestMainMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class Loging extends TestMainMethods{

    Mapping element = new Mapping();
    TestFunctions method = new TestFunctions();

    public void openTestingPage () throws InterruptedException {
        openTestingPage(apartLogUrl);
        waitUntilPageLoad(element.getSignUpBtn());
        Assert.assertEquals(apartLogUrl,driver.getCurrentUrl());
    }
    @Test
    public void logingHappyPath () throws InterruptedException {
        openTestingPage();
        File file=new File("PassLog.txt");

        try {
            logMail=method.loadMailFromFile();
            logPass=method.loadPassFromFile();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        if (file.length()==0||(logPass.equals("null")&&logMail.equals("null"))) {
            element.getEmail().sendKeys("zokoka@ax80mail.com");
            element.getPassword1().sendKeys("#2N2O*$%#RHPH#^");
            element.getLog().click();
            Assert.assertEquals(apartUrl,driver.getCurrentUrl());
        }
        else {
            element.getEmail().sendKeys(logMail);
            element.getPassword1().sendKeys(logPass);
            element.getLog().click();
            Assert.assertEquals(apartUrl,driver.getCurrentUrl());
        }
        Assert.assertEquals(element.getMyAccount().getText(),"MOJE KONTO");
    }
    @Test
    public void logingSadPathIncorectMail () throws InterruptedException {
        openTestingPage();
        element.getEmail().sendKeys("z@ax80mail.com");
        element.getPassword1().sendKeys("#2N2O*$%#RHPH#^");
        element.getLog().click();
        Assert.assertEquals(apartLogUrl,driver.getCurrentUrl());
        Assert.assertEquals(element.getErrorLogFailed().getText(),"Błąd logowania! Proszę sprawdzić swój email i hasło");
    }
    @Test
    public void logingSadPathIncorectPassword () throws InterruptedException {
        openTestingPage();
        element.getEmail().sendKeys("zokoka@ax80mail.com");
        element.getPassword1().sendKeys(method.getRandomString(5));
        element.getLog().click();
        Assert.assertEquals(apartLogUrl,driver.getCurrentUrl());
        Assert.assertEquals(element.getErrorLogFailed().getText(),"Błąd logowania! Proszę sprawdzić swój email i hasło");
    }
    @Test
    public void logingSadPathIncorectMailFormat () throws InterruptedException {
        openTestingPage();
        element.getEmail().sendKeys(method.getRandomString(5));
        element.getPassword1().sendKeys("#2N2O*$%#RHPH#^");
        element.getLog().click();
        Assert.assertEquals(apartLogUrl,driver.getCurrentUrl());
        Assert.assertEquals(element.getErrorInvalidMailFormat().getText(),"Wprowadzony adres email jest nie poprawnego formatu.");
    }
}
