//package pl;
//
//import Tools.DriverInstance;
//import Tools.Functions;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import java.awt.*;
//import java.io.IOException;
//
//public class Main {
//
//
//    public static void main(String[] args) throws InterruptedException, AWTException, IOException {
//        com.Main.driver = new FirefoxDriver();
//        Functions method = new Functions();
//        DriverInstance instance = new DriverInstance();
//        Register register = new Register();
//        Loging loging = new Loging();
//        ChangeProfilesFields changeProfilesFields = new ChangeProfilesFields();
//        DeleteAccount deleteAccount = new DeleteAccount();
//
//        String transferMail = method.copyTempMail();
//        String transferPass = method.getRandomPassword(15);
//
//
//
//        register.register(transferMail, transferPass);
//        instance.waitUntilPageLoad(By.id("more-secondrow"));
//        method.logOut();
//        loging.loging(transferMail, transferPass);
//        changeProfilesFields.changeProfileFields();
//        deleteAccount.deleteAccount();
//
//
//
//
//
//
//    }
//}