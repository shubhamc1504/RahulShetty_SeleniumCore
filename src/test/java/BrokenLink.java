import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLink {
    public static void main(String[] args) throws IOException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //Step 1: Get all URLs tied up to the links using selenium
        //Java methods will call the URL and get the status codes. If status code > 400 then consider as broken link.
        List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
        SoftAssert a = new SoftAssert();

        for(WebElement link: links)
        {
            String url = link.getAttribute("href");
            //open Connection method calling using HttpURLConnection class
            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setRequestMethod("HEAD");
            conn.connect();
            int respCode = conn.getResponseCode(); //to get the response code
            System.out.println(respCode);
            if(respCode>400)
            {
                System.out.println("The link with Text " + link.getText()+" is broken with code "+respCode);
                a.assertTrue(respCode<400, "The link with linkText " + link.getText()+" is broken with code "+respCode);
            }
            a.assertAll();
        }
    }
}
