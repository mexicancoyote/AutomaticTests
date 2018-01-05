package Tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import static org.testng.Assert.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Methods {
    public static WebDriver driver; //Driver that will execute the tests
    String temporaryMail = "https://temp-mail.org/pl/";

    public void openTestingPage (String url){
        driver.get(url);
    }

    public void openTemporaryMailPage (){
        driver.get(temporaryMail);
    }


    //Will only run once, after every test have been executed
    @AfterClass
    public void afterClass() {
        driver.quit(); //Quits this driver, closing every associated window.
    }

    //Will run before every test
    @BeforeClass
    public void setUp() {
        driver = new FirefoxDriver(); //An instance of the driver that will drive a Firefox browser.
    }

    //Will run after every test

    public void tearDown() {
        driver.close(); //Close the current window..
    }
    public void waitUntilPageLoad(WebElement object) throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(object));}
}
