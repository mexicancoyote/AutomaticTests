//package com;
//
//import Tools.ElementsLocations;
//import Tools.Functions;
//import org.testng.annotations.Test;
//
//import java.awt.*;
//
//public class NonMandtoryHappyPath {
//
//    @Test
//    public void happyPathWithNonMandtoryField () throws AWTException {
//        ElementsLocations element = new ElementsLocations();
//        Functions method = new Functions();
//
//        //Fills all the none-mandatory fields with proper values.
//
//        method.randomClick(element.getMaritalStatus());
//        method.randomDropdownClick(element.getCountry());
//        method.randomDropdownClick(element.getMonth());
//        method.randomDropdownClick(element.getDay());
//        method.randomDropdownClick(element.getYear());
//        element.getYourProfilePictureButton().click();
//        method.uploadUserPicture();
//        element.getAboutYourself().sendKeys(method.getRandomString(1000));
//    }
//
//
//
//
//
//
//
//}
