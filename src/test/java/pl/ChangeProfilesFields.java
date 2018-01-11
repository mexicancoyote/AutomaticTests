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
        apartProfilePage.getChangeFirstName().clear();
        apartProfilePage.getChangeFirstName().sendKeys(newFirstname);

        String newLastName=method.getRandomString(5);
        apartProfilePage.getChangeLastName().clear();
        apartProfilePage.getChangeLastName().sendKeys(newLastName);

        String newMobile=method.getRandomNumber(7);
        apartProfilePage.getChangeMobile().clear();
        apartProfilePage.getChangeMobile().sendKeys(newMobile);

        String newAddress=method.getRandomString(5);
        apartProfilePage.getChangeAddress().clear();
        apartProfilePage.getChangeAddress().sendKeys(newAddress);

        String newAddress2=method.getRandomString(5);
        apartProfilePage.getChangeAddress2().clear();
        apartProfilePage.getChangeAddress2().sendKeys(newAddress2);

        String newCity=method.getRandomString(5);
        apartProfilePage.getChangeCity().clear();
        apartProfilePage.getChangeCity().sendKeys(newCity);

        String newPostcode=method.getRandomNumber(5);
        apartProfilePage.getChangePostcode().clear();
        apartProfilePage.getChangePostcode().sendKeys(newPostcode);

        String newCountry=apartProfilePage.getChangeCountry_id().getText();
        method.randomDropdownClick(apartProfilePage.getChangeCountry_id());

        apartProfilePage.getSafeChanges_id().click();

        Assert.assertEquals(apartProfilePage.getSuccessAfterChanges().getText(),"Twoje zmiany zostały zapisane");

        Assert.assertEquals(newFirstname,apartProfilePage.getChangeFirstName().getAttribute("value"));
        Assert.assertEquals(newLastName,apartProfilePage.getChangeLastName().getAttribute("value"));
        Assert.assertEquals(newMobile,apartProfilePage.getChangeMobile().getAttribute("value"));
        Assert.assertEquals(newAddress,apartProfilePage.getChangeAddress().getAttribute("value"));
        Assert.assertEquals(newAddress2,apartProfilePage.getChangeAddress2().getAttribute("value"));
        Assert.assertEquals(newCity,apartProfilePage.getChangeCity().getAttribute("value"));
        Assert.assertEquals(newPostcode,apartProfilePage.getChangePostcode().getAttribute("value"));
        Assert.assertEquals(newCountry,apartProfilePage.getChangeCountry_id().getText());
    }
}

