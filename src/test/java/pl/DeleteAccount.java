//package pl;
//
//import Tools.DriverInstance;
//import Tools.ElementsLocations;
//import Tools.Functions;
//import org.openqa.selenium.By;
//
//public class DeleteAccount {
//    public void deleteAccount () throws InterruptedException {
//        ElementsLocations element = new ElementsLocations();
//        Functions method = new Functions();
//        DriverInstance instance = new DriverInstance();
//
//        element.getMyData().click();
//
//        instance.waitUntilPageLoad(By.xpath("/html/body/div[2]/div/div/div[1]/ul/li[1]/a"));
//
//        element.getDeleteAccount().click();
//
//        instance.waitUntilPageLoad(By.xpath("/html/body/div[2]/div/div/div[2]/div/form/div/div[1]/div/div/label/input"));
//
//        element.getDeleteConfirm().click();
//
//        element.getDeleteConfirmButton().click();
//
//    }
//}
