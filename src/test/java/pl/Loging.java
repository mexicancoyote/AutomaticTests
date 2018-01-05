//package pl;
//
//import Tools.DriverInstance;
//import Tools.ElementsLocations;
//import Tools.Functions;
//import org.openqa.selenium.By;
//
//public class Loging {
//    public void loging (String transferMail, String transferPass) throws InterruptedException {
//        ElementsLocations element = new ElementsLocations();
//        Functions method = new Functions();
//        DriverInstance instance = new DriverInstance();
//        Register register = new Register();
//        String apartUrl = "https://www.apart.pl/users/login";
//
//
//        instance.openTestingPage(apartUrl);
//        instance.waitUntilPageLoad(By.id("password"));
//        element.getEmail().sendKeys(transferMail);
//        element.getPassword1().sendKeys(transferPass);
//        element.getLog().click();
//
//    }
//}
