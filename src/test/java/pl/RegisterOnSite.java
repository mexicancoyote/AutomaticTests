package pl;

import Tools.Mapping;
import Tools.TestFunctions;
import Tools.TestMainMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class RegisterOnSite extends TestMainMethods {

    Mapping element = new Mapping();
    TestFunctions method = new TestFunctions();

    @Test
    public void openTestingPage () throws InterruptedException {
        logMail=method.copyTemporaryMail();
        logPass= method.passThePasword();
        openTestingPage(apartUrl);
        waitUntilPageLoad(element.getSignUpBtn());
        Assert.assertEquals(apartUrl,driver.getCurrentUrl());

    }
    @Test
    public void registerHappyPath() throws FileNotFoundException {


        Assert.assertNotEquals(logMail, null);
        Assert.assertNotEquals(logPass,null);
        element.getMyApart().click();
        element.getEmailField().sendKeys(logMail);
        element.getRegisterButton().click();

        element.getPassword2().sendKeys(logPass);
        element.getConfirmedPassword2().sendKeys(logPass);
        method.randomClick(element.getTytuł());
        element.getImię().sendKeys(method.getRandomString(5));
        element.getNazwisko().sendKeys(method.getRandomString(5));
        element.getAdres().sendKeys(method.getRandomString(5));
        element.getAdres2().sendKeys(method.getRandomString(5));
        element.getKodPocztowy().sendKeys(method.getRandomNumber(5));
        element.getMiejscowość().sendKeys(method.getRandomString(5));
        element.getTelefon().sendKeys(method.getRandomNumber(7));
        element.getCard().click();
        element.getRegulamin().click();
        element.getNewsleter().click();
        element.getNastepny1().click();

        Assert.assertEquals(element.getMyAccount().getText(),"MOJE KONTO");
        method.savePassMailToFile();
    }

}
