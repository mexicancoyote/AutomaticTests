package Tools;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.*;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class DataGenerators extends TestMainMethods{
    Mapping.TempMailSite tempElement = new Mapping.TempMailSite();
    Scanner in;
    /* This method generates random string with established length,
     using variables from methods bellow.*/

    public String stringGenerator(int x, String str) {
        StringBuffer strb = new StringBuffer();
        Random rnd = new Random();
        while (strb.length() < x) { // length of the random string.
            int index = (int) (rnd.nextFloat() * str.length());
            strb.append(str.charAt(index));
        }
        String saltStr = strb.toString();
        return saltStr;
    }
    // This method passes specified letters to stringGenerator.

    public String getRandomString(int x) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return stringGenerator(x, str);
    }
    // This method passes all numbers to stringGenerator.

    public String getRandomNumber(int x) {
        String str = "1234567890";
        return stringGenerator(x, str);
    }
    // This method passes specified letters, numbers and special characters to stringGenerator.

    public String getRandomPassword(int x) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*1234567890";
        return stringGenerator(x, str);

    }

    // This method generate random click on webelement from possible variants.

    public void randomClick(List<WebElement> elements) {
        Random random = new Random();
        int index = random.nextInt(elements.size());
        elements.get(index).click();
    }

    // This method passes count of webelement size to randomClick.

    public void randomDropdownClick(WebElement element) {
        Select oSelect = new Select(element);
        List<WebElement> oSize = oSelect.getOptions();
        randomClick(oSize);
    }
    // This method copy specified string to clipboard.

    public void clipboardData(String string){
        StringSelection stringSelection = new StringSelection(string);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    }

    //Opens temporary e-mail page, waits to load and copies mail name to String.
    public String copyTemporaryMail (){
        driver.get(temporaryMailSite);
        waitUntilPageLoad(tempElement.getTemporaryMail());
        logMail = tempElement.getTemporaryMail().getAttribute("value");
        return logMail;
    }
    public String passThePasword (){
        logPass = getRandomPassword(10);
        return logPass;
    }
    public  void savePassMailToFile (){
        try {
            PrintWriter zapis = new PrintWriter(new FileWriter("PassLog.txt", true));
            zapis.println(logMail);
            zapis.println(logPass);
            zapis.close();
        }
        catch(IOException e){
            Assert.assertTrue(false,"brak dostępu do pliku");
        }

    }
    public void reader () {
        File file = new File("PassLog.txt");
        if(file.exists() && !file.isDirectory()) {
            try{
            in = new Scanner(file);
            }
            catch (FileNotFoundException e){

            }
        }
    }
    public String loadMailFromFile (){
        reader();
        logMail = in.nextLine();
        return logMail;
    }
    public String loadPassFromFile (){
        reader();
        in.nextLine();
        logPass = in.nextLine();
        return logPass;
    }
}