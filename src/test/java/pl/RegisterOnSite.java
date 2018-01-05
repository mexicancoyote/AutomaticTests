package pl;

import Tools.ElementsLocations;
import Tools.Functions;
import Tools.Methods;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class RegisterOnSite extends Methods{

    String apartUrl = "https://www.apart.pl/bizuteria";
    ElementsLocations element = new ElementsLocations();
    Functions method = new Functions();

    String temporaryMail;
    String transferPass = method.getRandomPassword(10);

    @Test
    public void copyTemporaryMail () throws InterruptedException {
        openTemporaryMailPage();
        waitUntilPageLoad(element.getTemporaryMail());
        temporaryMail = element.getTemporaryMail().getAttribute("value");
        Assert.assertEquals("https://temp-mail.org/pl/",driver.getCurrentUrl());
    }

    @Test
    public void openTestingPage () throws InterruptedException {
        openTestingPage(apartUrl);
        waitUntilPageLoad(element.getSignUpBtn());
        Assert.assertEquals(apartUrl,driver.getCurrentUrl());
    }
    @Test
    public void register (){

        element.getMyApart().click();
        element.getEmailField().sendKeys(temporaryMail);
        element.getRegisterButton().click();

        element.getPassword2().sendKeys(transferPass);
        element.getConfirmedPassword2().sendKeys(transferPass);
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

    }
    @Test
        public  void savePassLoginToFile () throws FileNotFoundException {
            PrintWriter zapis = new PrintWriter("PassLog.txt");
            zapis.println(temporaryMail);
            zapis.println(transferPass);
            zapis.close();
        }
}
