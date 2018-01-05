package Tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ElementsLocations extends Methods {

    //These methods bellow gets webelements locations.

    public WebElement getFirstName(){
        return driver.findElement(By.id("name_3_firstname"));
    }

    public WebElement getLastName(){
        return driver.findElement(By.id("name_3_lastname"));
    }
    public List<WebElement> getHobby(){
        return driver.findElements(By.name("checkbox_5[]"));
    }
    public WebElement getCountry(){return driver.findElement(By.id("dropdown_7")); }
    public WebElement getMonth(){return driver.findElement(By.id("mm_date_8")); }
    public WebElement getDay(){return driver.findElement(By.id("dd_date_8")); }
    public WebElement getYear(){return driver.findElement(By.id("yy_date_8")); }
    public WebElement getPhoneNumber(){
        return driver.findElement(By.id("phone_9"));
    }

    public List<WebElement> getMaritalStatus (){return driver.findElements(By.name("radio_4[]")); }

    public WebElement getUsername(){
        return driver.findElement(By.id("username"));
    }

    public WebElement getEMail(){
        return driver.findElement(By.id("email_1"));
    }

    public WebElement getAboutYourself(){
        return driver.findElement(By.id("description"));
    }

    public WebElement getPassword(){
        return driver.findElement(By.id("password_2"));
    }

    public WebElement getConfirmPassword(){
        return driver.findElement(By.id("confirm_password_password_2"));
    }

    public WebElement getYourProfilePictureButton(){
        return driver.findElement(By.id("profile_pic_10"));
    }

    public WebElement getSubmitButton(){
        return driver.findElement(By.name("pie_submit"));
    }
    public WebElement getTemporaryMail(){
        return driver.findElement(By.id("mail"));
    }

    public WebElement getMessage () {return  driver.findElement(By.className("piereg_message"));}

    public WebElement getMyApart (){return driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/nav/li[3]/a"));}
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
    public WebElement getEmail (){return driver.findElement(By.id("email"));}
    public WebElement getPassword1 (){return driver.findElement(By.id("password"));}
    public WebElement getLog (){return driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div[2]/form/div/div[3]/input"));}
    public WebElement getLogOut (){return driver.findElement(By.linkText("Wyloguj"));}
    public WebElement getMyAccount (){return driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/nav/li[3]/a"));}
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

    public WebElement getDeleteAccount (){return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[3]/div[1]/div/div/div[2]/div/a[2]"));}
    public WebElement getDeleteConfirm (){return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/form/div/div[1]/div/div/label/input"));}
    public WebElement getDeleteConfirmButton (){return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/form/div/div[2]/div/button"));}















}