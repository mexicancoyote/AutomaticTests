package pl;

import Tools.DataGenerators;
import Tools.TestMainMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class Loging extends TestMainMethods{
    Mapping.TempMailSite tempMailSite = new Mapping.TempMailSite();
    Mapping.ApartMainPage apartMainPage = new Mapping.ApartMainPage();
    Mapping.ApartLogPage apartLogPage = new Mapping.ApartLogPage();
    Mapping.ApartProfilePage apartProfilePage = new Mapping.ApartProfilePage();

    DataGenerators method = new DataGenerators();

    public void openTestingPage (){
        openUrl(apartLogUrl);
        waitUntilPageLoad(apartLogPage.getSignUpBtn());
        Assert.assertEquals(apartLogUrl,driver.getCurrentUrl());
    }
    //This method below checks if there is a file with logging values saved after
    //registration. If there isn't method uses values from saved strings.

    @Test
    public void loggingHappyPath(){
        openTestingPage();
        File file=new File("PassLog.txt");

        try {
            logMail=method.loadMailFromFile();
            logPass=method.loadPassFromFile();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        if (file.length()==0||(logPass.equals("null")&&logMail.equals("null"))) {
            tempMailSite.getEmail().sendKeys("zokoka@ax80mail.com");
            apartProfilePage.getPassword1().sendKeys("#2N2O*$%#RHPH#^");
            apartProfilePage.getLog().click();
            Assert.assertEquals(apartUrl,driver.getCurrentUrl());
        }
        else {
            tempMailSite.getEmail().sendKeys(logMail);
            apartProfilePage.getPassword1().sendKeys(logPass);
            apartProfilePage.getLog().click();
            Assert.assertEquals(apartUrl,driver.getCurrentUrl());
        }
        Assert.assertEquals(apartMainPage.getMyAccount().getText(),"MOJE KONTO");
    }
    @Test
    public void loggingIncorrectMail (){
        openTestingPage();
        tempMailSite.getEmail().sendKeys("z@ax80mail.com");
        apartProfilePage.getPassword1().sendKeys("#2N2O*$%#RHPH#^");
        apartProfilePage.getLog().click();
        Assert.assertEquals(apartLogUrl,driver.getCurrentUrl());
        Assert.assertEquals(apartLogPage.getErrorLogFailed().getText(),"Błąd logowania! Proszę sprawdzić swój email i hasło");
    }
    @Test
    public void loggingIncorrectPassword (){
        openTestingPage();
        tempMailSite.getEmail().sendKeys("zokoka@ax80mail.com");
        apartProfilePage.getPassword1().sendKeys(method.getRandomString(5));
        apartProfilePage.getLog().click();
        Assert.assertEquals(apartLogUrl,driver.getCurrentUrl());
        Assert.assertEquals(apartLogPage.getErrorLogFailed().getText(),"Błąd logowania! Proszę sprawdzić swój email i hasło");
    }
    @Test
    public void logingIncorrectMailFormat (){
        openTestingPage();
        tempMailSite.getEmail().sendKeys(method.getRandomString(5));
        apartProfilePage.getPassword1().sendKeys("#2N2O*$%#RHPH#^");
        apartProfilePage.getLog().click();
        Assert.assertEquals(apartLogUrl,driver.getCurrentUrl());
        Assert.assertEquals(apartLogPage.getErrorInvalidMailFormat().getText(),"Wprowadzony adres email jest nie poprawnego formatu.");
    }
}
