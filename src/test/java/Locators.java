import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Locators {



public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

//implicit wait - 2 seconds time out
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://rahulshettyacademy.com/locatorspractice/");
driver.findElement(By.id("inputUsername")).sendKeys("Shubham");
driver.findElement(By.name("inputPassword")).sendKeys("hello123");
driver.findElement(By.className("signInBtn")).click();
System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
driver.findElement(By.linkText("Forgot your password?")).click();
Thread.sleep(1000);//
driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Shubham");
driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("shubham@gmail.com");
driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("shubham@gmail.com");
driver.findElement(By.xpath("//form/input[3]")).sendKeys("8286448862");
driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
System.out.println(driver.findElement(By.cssSelector("form p")).getText());
driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
Thread.sleep(1000);
driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Shubham");
driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
driver.findElement(By.id("chkboxOne")).click();
driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
}
}

