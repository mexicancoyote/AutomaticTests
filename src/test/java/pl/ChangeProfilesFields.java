package pl;


import Tools.ElementsLocations;
import Tools.Functions;
import Tools.Methods;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ChangeProfilesFields extends Methods{
    ElementsLocations element = new ElementsLocations();
    String apartUrl = "https://www.apart.pl/users/login";
    String temporaryMail;
    String transferPass;

    @Test
    public  void odczyt () throws FileNotFoundException {

      File file = new File("PassLog.txt");
      Scanner in = new Scanner(file);

      temporaryMail = in.nextLine();
      transferPass = in.nextLine();
       }
    @Test (priority = 1)
    public void openTestingPage () throws InterruptedException {
        openTestingPage(apartUrl);
        waitUntilPageLoad(element.getEmail());
        Assert.assertEquals(apartUrl,driver.getCurrentUrl());
    }
    @Test (priority = 2)
    public void loging (){

        if (temporaryMail!=null && transferPass!=null) {
            element.getEmail().sendKeys(temporaryMail);
            element.getPassword1().sendKeys(transferPass);
            element.getLog().click();
        }
        else {
            element.getEmail().sendKeys("zokoka@ax80mail.com");
            element.getPassword1().sendKeys("#2N2O*$%#RHPH#^");
            element.getLog().click();
        }

    }
    @Test (priority = 3)
    public void changeProfileFields (){

        element.getMyAccount().click();
        element.getMyData().click();
        element.getChangeData().click();

        Functions method = new Functions();

        element.getChangeFirstName().sendKeys(method.getRandomString(5));
        element.getChangeLastName().sendKeys(method.getRandomString(5));
        element.getChangeMobile().sendKeys(method.getRandomNumber(7));
        element.getChangeAddress().sendKeys(method.getRandomString(5));
        element.getChangeAddress2().sendKeys(method.getRandomString(5));
        element.getChangeCity().sendKeys(method.getRandomString(5));
        element.getChangePostcode().sendKeys(method.getRandomNumber(5));
        method.randomDropdownClick(element.getChangeCountry_id());
        element.getSafeChanges_id().click();

        Assert.assertEquals(element.getSuccessAfterChanges().getText(),"Twoje zmiany zostały zapisane");

    }
}

