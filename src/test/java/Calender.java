import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class Calender {
    public static void main(String[] args)
    {
        String monthNumber ="10";
        String date = "11";
        String year ="2025";
        String[] expectedList = {monthNumber,date,year};

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.cssSelector(".react-date-picker__inputGroup__year")).click(); //clicks on year
        driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click(); //clicks on year field
        driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
        driver.findElement(By.xpath("//button[text()='"+year+"']")).click(); //clicks on year which is provided above
        driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(monthNumber)-1).click(); //clicks on month which is provided above
        driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click(); //clicks on date which is provided above
        List<WebElement> actualList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup_input"));
        for(int i=0; i <actualList.size();i++) {
            System.out.println(actualList.get(i).getAttribute("value"));
            Assert.assertEquals(actualList.get(i).getAttribute("value"), expectedList[i]);
        }
        driver.close();
    }
}
