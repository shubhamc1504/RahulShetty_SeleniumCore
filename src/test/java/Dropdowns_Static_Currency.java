import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns_Static_Currency {
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //Static Dropdown -select tag are static -> select class is used
        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(staticDropdown); //object is passed as an argument to provide knowledge of WebElement
        dropdown.selectByIndex(2); //selects AED Currency
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByVisibleText("USD"); //selects USD Currency
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByValue("INR"); //selects INR Currency
        System.out.println(dropdown.getFirstSelectedOption().getText());
    }
}
