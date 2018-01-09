package Mapping;

import Tools.TestMainMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ApartProfilePage extends TestMainMethods{

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
