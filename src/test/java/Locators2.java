import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

import static org.openqa.selenium.By.*;

public class Locators2 {
    public static void main(String[] args) throws InterruptedException {
        String name= "Shubham";
        WebDriver driver = new ChromeDriver(); //Webdriver Interface creates driver object using new keyword and Chromedriver constructor
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(id("inputUsername")).sendKeys(name);
        driver.findElement(name("inputPassword")).sendKeys("rahulshettyacademy");
        driver.findElement(className("signInBtn")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.tagName("p")).getText());
        //Compare actual value with expected result using Assert Class
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
        driver.findElement(By.xpath("//button[text()='Log Out']")).click();
        driver.close();
    }
}
