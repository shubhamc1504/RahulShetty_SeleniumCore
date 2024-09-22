import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Elements_Enabled_Disabled {
    public static void main(String[] args)
    {

        WebDriver driver = new ChromeDriver(); //Initializes WebDriver variable driver and assigned new Instance of Chromedriver
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.spicejet.com/"); //URL in browser
        System.out.println(driver.findElement(By.cssSelector("div[class='css-1dbjc4n r-19h5ruw r-136ojw6'] div:nth-child(2) div:nth-child(2) div:nth-child(2)")).isEnabled());
//        user selects round trip dropdown
//        driver.findElement(By.cssSelector("body div[id='react-root'] div[id='main-container'] div[class='css-1dbjc4n r-1niwhzg r-1jgb5lz r-r0h9e2 r-13qz1uu'] div[class='css-1dbjc4n r-14lw9ot'] div[class='css-1dbjc4n r-14lw9ot r-z2wwpe r-vgw6uq r-156q2ks r-11ict49 r-8uuktl r-136ojw6'] div[class='css-1dbjc4n r-1pcd2l5 r-1uwte3a r-m611by r-bnwqim'] div[class='css-1dbjc4n'] div[class='css-1dbjc4n'] div[class='css-1dbjc4n r-1d09ksm r-1inuy60 r-1qxgc49'] div[class='css-1dbjc4n'] div[class='css-1dbjc4n r-18u37iz r-1w6e6rj'] div:nth-child(2) div:nth-child(1) svg circle")).click();
//        Check if Return date element is enabled or not
//        System.out.println(driver.findElement(By.id("div")).getAttribute("style"));
//        if(driver.findElement(By.id("Div")).getAttribute("style").contains(""))
    }
}
