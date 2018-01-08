//package com;
//
//import Tools.DriverInstance;
//import Tools.Mapping;
//import Tools.TestFunctions;
//import Tools.TestMainMethods;
//import org.openqa.selenium.By;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;
//
//public class HappyPath extends TestMainMethods{
//
//    @Test
//    public  void happyPath () throws InterruptedException{
//        String demoqaURL = "http://demoqa.com/registration/";
//        Mapping element = new Mapping();
//        TestFunctions method = new TestFunctions();
//        DriverInstance instance = new DriverInstance();
//
//        //Opens temporary e-mail page, waits to load and copies mail name to String.
//
//        instance.openTemporaryMailPage();
//        instance.waitUntilPageLoad(By.id("mail"));
//        String temporaryMail = element.getTemporaryMail().getAttribute("value");
//
//
//        //Opens testing page, waits to load.
//        instance.openTestingPage(demoqaURL);
//        instance.waitUntilPageLoad(By.name("pie_submit"));
//
//        //Clicks 'Submit' button so all the mandatory fields are shown.
//
//        element.getSubmitButton().click();
//
//        //Fills all the mandatory fields with proper values.
//
//        element.getFirstName().sendKeys(method.getRandomString(25));
//        element.getLastName().sendKeys(method.getRandomString(25));
//        method.randomClick(element.getHobby());
//        element.getPhoneNumber().sendKeys(method.getRandomNumber(10));
//        element.getUsername().sendKeys(method.getRandomString(10));
//        element.getEMail().sendKeys(temporaryMail);
//        String randomPass = method.getRandomPassword(15);
//        element.getPassword().sendKeys(randomPass);
//        element.getConfirmPassword().sendKeys(randomPass);
//
//    }
//}
