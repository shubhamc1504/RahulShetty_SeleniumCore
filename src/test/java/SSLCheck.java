import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck {
    public static void main(String[] args)
    {
        ChromeOptions options = new ChromeOptions(); //ChromeOptions is a class
        options.setAcceptInsecureCerts(true); //bypass the certifications automatically
        //Set up the proxy
        Proxy pr = new Proxy();
        pr.setHttpProxy("ipaddress:8080");
        options.setCapability("proxy",pr);
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://expired.badssl.com/");
        System.out.println(driver.getTitle());
    }
}
