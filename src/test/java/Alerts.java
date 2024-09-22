import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Alerts {
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver(); //Initializes WebDriver variable driver and assigned new Instance of Chromedriver
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //OK JS Alert
        driver.findElement(By.id("name")).sendKeys("Shubham"); // Send text in alert textbox
        driver.findElement(By.cssSelector("[id='alertbtn']")).click(); //Click on alert button
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept(); // Accept alert by Providing alert knowledge to driver as alert is not html based but window based.

        //OK and Cancel option JS Alert
        driver.findElement(By.id("confirmbtn")).click(); //Clicks on confirm button
        System.out.println(driver.switchTo().alert().getText()); // Get the alert text
        driver.switchTo().alert().dismiss(); // Clicks on Cancel alert option
    }
}
