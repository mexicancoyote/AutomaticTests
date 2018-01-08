package Tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Mapping extends TestMainMethods {

    //These methods bellow gets webelements locations.

    // web elements from temporaryMailSite = "https://temp-mail.org/pl/";
    public WebElement getTemporaryMail(){ return driver.findElement(By.id("mail")); }
    public WebElement getEmail (){return driver.findElement(By.id("email"));}

    // web elements from apartUrl = "https://www.apart.pl/bizuteria";
    public WebElement getMyAccount (){return driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/nav/li[3]/a"));}
    public WebElement getMyApart (){return driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/nav/li[3]/a"));}

    // web elements from apartLogUrl = "https://www.apart.pl/users/login";
    public WebElement getErrorInvalidMailFormat (){return driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[2]/form/div/div[1]/p"));}
    public WebElement getErrorLogFailed (){return driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]"));}
    public WebElement getSignUpBtn (){return driver.findElement(By.id("newsletterSignUpBtn"));}
    public WebElement getEmailField (){return driver.findElement(By.id("new_email"));}
    public WebElement getRegisterButton (){return driver.findElement(By.xpath("//*[@id=\"register-checkemail\"]/div[2]/button"));}
    public WebElement getPassword2 (){return driver.findElement(By.id("form[1][password]"));}
    public WebElement getConfirmedPassword2 (){return driver.findElement(By.id("form[1][password_confirmation]"));}
    public List<WebElement> getTytuł (){return driver.findElements(By.className("radio-inline"));}
    public WebElement getImię (){return driver.findElement(By.id("form[1][firstname]"));}
    public WebElement getNazwisko (){return driver.findElement(By.id("form[1][lastname]"));}
    public WebElement getAdres (){return driver.findElement(By.id("form[1][address]"));}
    public WebElement getAdres2 (){return driver.findElement(By.id("form[1][address2]"));}
    public WebElement getKodPocztowy (){return driver.findElement(By.id("form[1][postcode]"));}
    public WebElement getMiejscowość (){return driver.findElement(By.id("form[1][city]"));}
    public WebElement getTelefon (){return driver.findElement(By.id("form[1][mobile]"));}
    public WebElement getCard (){return driver.findElement(By.id("toggleAdcLoginFormBtn"));}
    public WebElement getRegulamin (){return driver.findElement(By.xpath("//*[@id=\"terms_accepted\"]"));}
    public WebElement getNewsleter (){return driver.findElement(By.xpath("//*[@id=\"newsletter\"]"));}
    public WebElement getNastepny1 (){return driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div[1]/div[2]/form/div[17]/button"));}

    // web elements from https://www.apart.pl/users/profile
    public WebElement getPassword1 (){return driver.findElement(By.id("password"));}
    public WebElement getLog (){return driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div[2]/form/div/div[3]/input"));}
    public WebElement getMyData (){return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/ul/li[1]/a"));}
    public WebElement getChangeData (){return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[3]/div[1]/div/div/div[2]/div/a[1]"));}
    public WebElement getChangeFirstName (){return driver.findElement(By.id("firstname"));}
    public WebElement getChangeLastName (){return driver.findElement(By.id("lastname"));}
    public WebElement getChangeMobile (){return driver.findElement(By.id("mobile"));}
    public WebElement getChangeAddress (){return driver.findElement(By.id("address"));}
    public WebElement getChangeAddress2 (){return driver.findElement(By.id("address2"));}
    public WebElement getChangeCity (){return driver.findElement(By.id("city"));}
    public WebElement getChangePostcode (){return driver.findElement(By.id("postcode"));}
    public WebElement getChangeCountry_id (){return driver.findElement(By.id("country_id"));}
    public WebElement getSafeChanges_id (){return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[3]/div[1]/form[1]/div/div/div[2]/div/button"));}
    public WebElement getSuccessAfterChanges (){return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[3]/div[1]/div/div/div/h4"));}












}