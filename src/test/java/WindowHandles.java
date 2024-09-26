import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandles {
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.cssSelector(".blinkingText")).click();

        //Managing window
        Set<String> windows = driver.getWindowHandles(); //[parentId, childId]
        Iterator<String> it = windows.iterator(); //Iterates through the window handle IDs
        String parentId=it.next(); //goes to the 0th element i.e. parentId
        String childId=it.next(); //1st element of window handle
        driver.switchTo().window(childId); //switches to child window
        System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());

        //EmailId from the para
        String emailId = (driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0]);
        driver.switchTo().window(parentId);
        driver.findElement(By.id("username")).sendKeys(emailId);
    }
}
