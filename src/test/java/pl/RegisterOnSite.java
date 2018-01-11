package pl;

import Tools.DataGenerators;
import Tools.TestMainMethods;
import org.testng.Assert;
import org.testng.annotations.Test;


public class RegisterOnSite extends TestMainMethods {

    Mapping.ApartMainPage apartMainPage = new Mapping.ApartMainPage();
    Mapping.ApartLogPage apartLogPage = new Mapping.ApartLogPage();
    DataGenerators method = new DataGenerators();


    public void openTestingPage (){
        logMail=method.copyTemporaryMail();
        logPass= method.passThePasword();
        openUrl(apartUrl);
        waitUntilPageLoad(apartLogPage.getSignUpBtn());
        Assert.assertEquals(apartUrl,driver.getCurrentUrl());

    }
    // method that register on site and also uses method which saves login and password to file
    @Test
    public void registerHappyPath(){

        openTestingPage();
        Assert.assertNotNull(logMail);
        Assert.assertNotNull(logPass);
        apartMainPage.getMyApart().click();
        apartLogPage.getEmailField().sendKeys(logMail);
        apartLogPage.getRegisterButton().click();

        apartLogPage.getPassword2().sendKeys(logPass);
        apartLogPage.getConfirmedPassword2().sendKeys(logPass);
        method.randomClick(apartLogPage.getTytuł());
        apartLogPage.getImię().sendKeys(method.getRandomString(5));
        apartLogPage.getNazwisko().sendKeys(method.getRandomString(5));
        apartLogPage.getAdres().sendKeys(method.getRandomString(5));
        apartLogPage.getAdres2().sendKeys(method.getRandomString(5));
        apartLogPage.getKodPocztowy().sendKeys(method.getRandomNumber(5));
        apartLogPage.getMiejscowość().sendKeys(method.getRandomString(5));
        apartLogPage.getTelefon().sendKeys(method.getRandomNumber(7));
        apartLogPage.getCard().click();
        apartLogPage.getRegulamin().click();
        apartLogPage.getNewsleter().click();
        apartLogPage.getNastepny1().click();

        Assert.assertEquals(apartMainPage.getMyAccount().getText(),"MOJE KONTO");
        method.savePassMailToFile();
    }

}
