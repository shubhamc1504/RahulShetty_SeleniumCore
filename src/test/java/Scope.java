import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Scope {
    public static void main(String[] args) throws InterruptedException {
//      System.setProperty("webdriver.chrome.driver", "C://SELENIUM\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //Initializes WebDriver variable driver and assigned new Instance of Chromedriver
        driver.manage().window().maximize();

        //1. Give me the count of links on the page :-
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElements(By.tagName("a")).size());

        //2. Limiting web driver scope to footer section :-
        WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
        System.out.println(footerdriver.findElements(By.tagName("a")).size());

        //3. Limiting to 1st column
        WebElement columndriver= footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(columndriver.findElements(By.tagName("a")).size());

        //4. Check on each link in column and check if the pages are opening :-
        for(int i=1; i<columndriver.findElements(By.tagName("a")).size(); i++) {
            //Ctrl+click to open links on new tab
            String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
            columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab); //passed keyboard event in send keys
            Thread.sleep(3000);
        }
            //5. Go to each child tabs and get the title of each tab.
            Set<String> abc = driver.getWindowHandles();
            Iterator<String> it = abc.iterator(); // move to each window and save it in it variable
            while(it.hasNext()) //hasNext tells us whether next index is present or not
            {
                driver.switchTo().window(it.next()); //actually moves to next index
                System.out.println(driver.getTitle()); //prints title of each page present in tab
            }

    }
}
