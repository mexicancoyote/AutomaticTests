package pl;


import Tools.DataGenerators;
import Tools.TestMainMethods;

import org.testng.Assert;
import org.testng.annotations.Test;


public class ChangeProfilesFields extends TestMainMethods {

    Mapping.TempMailSite tempMailSite = new Mapping.TempMailSite();
    Mapping.ApartMainPage apartMainPage = new Mapping.ApartMainPage();
    Mapping.ApartProfilePage apartProfilePage = new Mapping.ApartProfilePage();
    DataGenerators method = new DataGenerators();
    Loging log = new Loging();

    public void openTestingPage (){
        openUrl(apartLogUrl);
        waitUntilPageLoad(tempMailSite.getEmail());
        Assert.assertEquals(apartLogUrl,driver.getCurrentUrl());
        log.loggingHappyPath();
    }

    @Test
    public void changeProfileFields (){

        openTestingPage();
        apartMainPage.getMyAccount().click();
        apartProfilePage.getMyData().click();
        apartProfilePage.getChangeData().click();

        String newFirstname=method.getRandomString(5);
        apartProfilePage.getChangeFirstName().sendKeys(newFirstname);

        String newLastName=method.getRandomString(5);
        apartProfilePage.getChangeLastName().sendKeys(newLastName);

        String newMobile=method.getRandomNumber(7);
        apartProfilePage.getChangeMobile().sendKeys(newMobile);

        String newAddress=method.getRandomString(5);
        apartProfilePage.getChangeAddress().sendKeys(newAddress);

        String newAddress2=method.getRandomString(5);
        apartProfilePage.getChangeAddress2().sendKeys(newAddress2);

        String newCity=method.getRandomString(5);
        apartProfilePage.getChangeCity().sendKeys(newCity);

        String newPostcode=method.getRandomNumber(5);
        apartProfilePage.getChangePostcode().sendKeys(newPostcode);

        String newCountry=apartProfilePage.getChangeCountry_id().getText();
        method.randomDropdownClick(apartProfilePage.getChangeCountry_id());

        apartProfilePage.getSafeChanges_id().click();

        Assert.assertEquals(apartProfilePage.getSuccessAfterChanges().getText(),"Twoje zmiany zostały zapisane");

        Assert.assertNotEquals(newFirstname,apartProfilePage.getChangeFirstName().getText());
        Assert.assertNotEquals(newLastName,apartProfilePage.getChangeLastName().getText());
        Assert.assertNotEquals(newMobile,apartProfilePage.getChangeMobile().getText());
        Assert.assertNotEquals(newAddress,apartProfilePage.getChangeAddress().getText());
        Assert.assertNotEquals(newAddress2,apartProfilePage.getChangeAddress2().getText());
        Assert.assertNotEquals(newCity,apartProfilePage.getChangeCity().getText());
        Assert.assertNotEquals(newPostcode,apartProfilePage.getChangePostcode().getText());
        Assert.assertNotEquals(newCountry,apartProfilePage.getChangeLastName().getText());
    }
}

