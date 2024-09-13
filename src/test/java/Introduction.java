
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Introduction {
    public static void main(String[] args)
    {
        //Invoking browser
        //Chrome -> ChromeDriver ->Methods get close
        //Firefox -> FirefoxDriver ->Methods get close
        //Safari -> SafariDriver ->Methods get close
        //MicrosoftEdge -> EdgeDriver ->Methods get close
        //WebDriver close get
        //WebDriver methods + class methods

        //chromedriver.exe -> chrome browser
        //Step to invoke chromedriver//
        //System.setProperty("key","value");
        //System.setProperty("webdriver.chrome.driver", "/C/SELENIUM/chromedriver.exe");
        //webdriver.chrome.driver -> value of path

        //ChromeDriver driver = new ChromeDriver(); ->Chromedriver Interface -> webdriver methods + chromedriver class methods
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();
    }
}