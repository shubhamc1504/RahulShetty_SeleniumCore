import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //Sibling to Sibling - Parent to Child Traverse
        //header/div/button[1]/following-sibling::button[1]
        //Go to Login button
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
        //Sibling to Sibling - Child to Parent Traverse not possible with css to move back
        //Click on Free access link
        driver.findElement(By.xpath("//header/div/button[1]/parent::div/parent::header/a[2]")).click();


    }
}
