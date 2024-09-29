import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

    public static void main(String [] args)
    {
        WebDriver driver = new ChromeDriver(); //Initializes WebDriver variable driver and assigned new Instance of Chromedriver
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");
        //Click on draggable using iframes
        //driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame"))); OR the below line item
        driver.switchTo().frame(0);
        driver.findElement(By.id("draggable")).click();

        //Drag and drop object into box using Actions class
        Actions act = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement destination = driver.findElement(By.id("droppable"));
        act.dragAndDrop(source,destination).build().perform();
    }
}
