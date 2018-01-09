package Mapping;

import Tools.TestMainMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ApartLogPage extends TestMainMethods{

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
}
