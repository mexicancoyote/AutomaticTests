package Tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Random;

public class Functions {

    /* This method generates random string with established length,
     using variables from methods bellow.*/
    ElementsLocations element = new ElementsLocations();


    public String stringGenerator (int x, String str) {
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

    public void randomDropdownClick (WebElement element){
        Select oSelect = new Select(element);
        List<WebElement> oSize = oSelect.getOptions();
        randomClick(oSize);
    }
    // This method copy specified string to clipboard.

    public void clipboardData (String string) throws AWTException {
        StringSelection stringSelection = new StringSelection(string);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    }

    // This method paste declared string from clipboard to webelement.

    public void uploadUserPicture () throws AWTException {
        clipboardData("C:\\Users\\mex\\IdeaProjects\\Automats\\palczak.jpg");
        //native key strokes for CTRL, V and ENTER keys
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    /* This method checks messege that displayes, after successful registration and
     generates also proper message */

    public void happyPathFunctionality(Boolean message) {
        if (message==true) {
            System.out.println("Happy path works great ");
        } else {
            System.out.println("Something goes wrong");
        }
    }
    //Opens temporary e-mail page, waits to load and copies mail name to String.



    public void logOut (){
        element.getLogOut().click();
    }


}