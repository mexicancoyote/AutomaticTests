//package pl;
//
//import Tools.DriverInstance;
//import Tools.ElementsLocations;
//import Tools.Functions;
//import org.openqa.selenium.By;
//import org.testng.annotations.Test;
//
//public class Register {
//    @Test
//    public void register(String transferMail, String transferPass) throws InterruptedException{
//        String apartUrl = "https://www.apart.pl/bizuteria";
//        ElementsLocations element = new ElementsLocations();
//        Functions method = new Functions();
//        DriverInstance instance = new DriverInstance();
//
//
//        //Opens testing page, waits to load.
//        instance.openTestingPage(apartUrl);
//        instance.waitUntilPageLoad(By.xpath("/html/body/header/div[1]/div/div/div[2]/nav/li[3]/a"));
//
//        element.getMyApart().click();
//        instance.waitUntilPageLoad(By.id("new_email"));
//        element.getEmailField().sendKeys(transferMail);
//        element.getRegisterButton().click();
//
//
//        element.getPassword2().sendKeys(transferPass);
//        element.getConfirmedPassword2().sendKeys(transferPass);
//        method.randomClick(element.getTytuł());
//        element.getImię().sendKeys(method.getRandomString(10));
//        element.getNazwisko().sendKeys(method.getRandomString(10));
//        element.getAdres().sendKeys(method.getRandomString(10));
//        element.getAdres2().sendKeys(method.getRandomString(10));
//        element.getKodPocztowy().sendKeys(method.getRandomNumber(5));
//        element.getMiejscowość().sendKeys(method.getRandomString(10));
//        element.getTelefon().sendKeys(method.getRandomNumber(9));
//        element.getCard().click();
//        element.getRegulamin().click();
//        element.getNewsleter().click();
//        element.getNastepny1().click();
//
//
//    }
//}