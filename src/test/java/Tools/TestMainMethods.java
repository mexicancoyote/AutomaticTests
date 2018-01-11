package Tools;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestMainMethods {

    public String logMail=null;
    public String logPass=null;
    public String apartLogUrl = "https://www.apart.pl/users/login";
    public String apartUrl = "https://www.apart.pl/bizuteria";
    public String temporaryMailSite = "https://temp-mail.org/pl/";


    public static WebDriver driver; //Driver that will execute the tests

    public void waitUntilPageLoad(WebElement object){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(object));}

    public void openUrl(String url){
        driver.get(url);
    }

    //Will only run once, after every test have been executed

    @AfterClass
    public void afterClass() {
        driver.quit(); //Quits this driver, closing every associated window.
    }
    //Will run before every Class

    @BeforeClass
    public void setUp() {
        driver = new FirefoxDriver(); //An instance of the driver that will drive a Firefox browser.
    }

}
