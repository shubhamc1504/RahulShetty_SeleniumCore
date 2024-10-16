import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class InvokingMultipleWindows {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        //switch to new tab
        //driver.switchTo().newWindow(WindowType.TAB);
        //switch to new window
        driver.switchTo().newWindow(WindowType.WINDOW);
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> it = handles.iterator();
        String parentWindow = it.next(); //parent Window ID
        String childWindow = it.next(); //Child Window ID
        driver.switchTo().window(childWindow);
        driver.get("https://rahulshettyacademy.com/");

        //a[href*='https://courses.rahulshettyacademy.com/p']
        String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
        driver.switchTo().window(parentWindow);
        WebElement name = driver.findElement(By.cssSelector("[name='name']"));
        name.sendKeys(courseName);
        //Screenshot
        File file = name.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("logo.png"));
        //driver.quit();
        //Get height and width of name text box
        System.out.println(name.getRect().getDimension().getHeight());
        System.out.println(name.getRect().getDimension().getWidth());
    }
}
