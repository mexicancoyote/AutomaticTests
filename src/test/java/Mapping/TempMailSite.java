package Mapping;

        import Tools.TestMainMethods;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebElement;

public class TempMailSite extends TestMainMethods{

    // web elements from temporaryMailSite = "https://temp-mail.org/pl/";
    public WebElement getTemporaryMail(){ return driver.findElement(By.id("mail")); }
    public WebElement getEmail (){return driver.findElement(By.id("email"));}
}
