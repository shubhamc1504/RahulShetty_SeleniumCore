import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActivities {
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/"); //driver waits for the components on the webpage to load and then perform actions
        driver.navigate().to("https://rahulshettyacademy.com"); //driver doesn't wait for its components
        driver.navigate().back(); // back to google page
        driver.navigate().forward(); //again to rahul shetty page
    }
}
