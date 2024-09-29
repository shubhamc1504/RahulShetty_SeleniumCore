import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Sama {
    public static void main(String [] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver(); //Instantiating WebDriver by creating driver ref variable
        driver.manage().window().maximize(); // Maximizing the browser window
        driver.get("https://vikalp.development.sama.live/"); //URL of tha application
        for(int i =1; i<3;i++) {
            driver.findElement(By.xpath("//button[normalize-space()='Next']")).click(); //Clicks on next option twice
        }
        driver.findElement(By.xpath("//button[normalize-space()='Get Started']")).click(); //Clicks on Get started button
        Thread.sleep(3000);
        //Clicks on New Case button
        driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]/*[1]")).click();
        driver.findElement(By.cssSelector("textarea[placeholder='Write down details of your complaint here. The more details the better!']")).sendKeys("Lodging new case complaint related to payment");
        driver.findElement(By.cssSelector("button[value='Payment Related']")).click();
        //File upload using sendkeys()
        WebElement browse =(driver.findElement(By.tagName("img")));
        browse.click();
        browse.sendKeys("C:/Users/dell/OneDrive/Desktop/Evidence.txt");
        driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();

        //My details fill
        driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]")).sendKeys("Shubham");
        driver.findElement(By.cssSelector("input[fdprocessedid='hkrbn']")).sendKeys("shubhamc@gmail.com");
        driver.findElement(By.xpath("//div[3]//input[1]")).sendKeys("8286484862");
        driver.findElement(By.cssSelector("label[class='text-textMainColor text-sm font-semibold ml-2 flex items-center'] svg path")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@class='bg-mainBackgroundLightColor text-textMainColor font-semibold rounded-2xl p-4 w-full border outline-none'])[1]")).sendKeys("Thane");
        driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();

        //Other Party details fill
        driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]")).sendKeys("Mayur");
        driver.findElement(By.cssSelector("input[fdprocessedid='hkrbn']")).sendKeys("mayurg@gmail.com");
        driver.findElement(By.xpath("//div[3]//input[1]")).sendKeys("9876545662");
        driver.findElement(By.cssSelector("label[class='text-textMainColor text-sm font-semibold ml-2 flex items-center'] svg path")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@class='bg-mainBackgroundLightColor text-textMainColor font-semibold rounded-2xl p-4 w-full border outline-none'])[1]")).sendKeys("Dombivli");
        driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();

        // User clicks on submit button but the API call is getting failed (error code: 500 Internal server error)
    }
}

