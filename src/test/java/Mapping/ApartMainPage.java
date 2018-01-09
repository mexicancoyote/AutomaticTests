package Mapping;

import Tools.TestMainMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ApartMainPage extends TestMainMethods{

    // web elements from apartUrl = "https://www.apart.pl/bizuteria";
    public WebElement getMyAccount (){return driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/nav/li[3]/a"));}
    public WebElement getMyApart (){return driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/nav/li[3]/a"));}
}
