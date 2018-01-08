package pl;


import Tools.Mapping;
import Tools.TestFunctions;
import Tools.TestMainMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class ChangeProfilesFields extends TestMainMethods {

    Mapping element = new Mapping();
    TestFunctions method = new TestFunctions();
    Loging log = new Loging();

    @Test (priority = 1)
    public void openTestingPage () throws InterruptedException {
        openTestingPage(apartLogUrl);
        waitUntilPageLoad(element.getEmail());
        Assert.assertEquals(apartLogUrl,driver.getCurrentUrl());
        log.logingHappyPath();
    }

    @Test (priority = 2)
    public void changeProfileFields (){

        element.getMyAccount().click();
        element.getMyData().click();
        element.getChangeData().click();

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

