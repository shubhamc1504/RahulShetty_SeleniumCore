import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.Arrays;

import static org.openqa.selenium.By.*;

public class Locators2 {
    public static void main(String[] args) throws InterruptedException {
        String name = "Shubham";
        WebDriver driver = new ChromeDriver(); //Webdriver Interface creates driver object using new keyword and Chromedriver constructor
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        String password = Arrays.toString(getPassword(driver));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(id("inputUsername")).sendKeys(name);
        driver.findElement(name("inputPassword")).sendKeys(password);
        driver.findElement(className("signInBtn")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.tagName("p")).getText());
        //Compare actual value with expected result using Assert Class
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello " + name + ",");
        driver.findElement(By.xpath("//button[text()='Log Out']")).click();
        driver.close();
    }

    public static String[] getPassword(WebDriver driver) throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        String passwordText = driver.findElement(By.cssSelector("form p")).getText();
        //Please use temporary password 'rahulshettyacademy' to Login.
        String[] passwordArray = passwordText.split("'"); //rahulshettyacademy' to Login.
        //String[] passwordArray2 = passwordArray[1].split("'");
        //passwordArray2[0];
        return passwordArray[1].split("'");
    }
}
