import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class Items_Cart {
    public static void main(String [] args)
    {
        WebDriver driver = new ChromeDriver(); //Initializes WebDriver variable driver and assigned new Instance of Chromedriver
        driver.manage().window().maximize();
        int j = 0;
        //Declaring array in a variable vegetablesCart
        String[] vegetablesCart = {"Cucumber", "Brocolli", "Brinjal", "Tomato"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        List<WebElement> products =  driver.findElements(By.cssSelector("h4.product-name"));

        for(int i=0; i<products.size();i++) // Iterates 30 items in product page
        {
            String[] name =products.get(i).getText().split("-"); // store all name of items in var name
            String formattedName = name[0].trim();
            //format it to Trim the name

            //Convert array to arrayList for easy search
            //Check whether extracted names is within the vegetablesCart array
            List<String> items = Arrays.asList(vegetablesCart);

            if (items.contains(formattedName))
            {
                //driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click(); //This fails as ADD TO CART is dynamic post click. Not recommended to search with text field.
                driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
                j++;
                if (j==4)
                    break;
            }
        }
    }
}
