//Implicit Wait:
// Pros: Readable, Concise code
// Cons: Hides performance issues,
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); //Initializes WebDriver variable driver and assigned new Instance of Chromedriver
        driver.manage().window().maximize();
        //Using Implicit waits:-
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Declaring array in a variable vegetablesCart
        String[] vegetablesCart = {"Cucumber", "Brocolli", "Brinjal", "Tomato"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/"); //URL
        addItems(driver, vegetablesCart); //calling static method in main
        driver.findElement(By.cssSelector("img[alt='Cart']")).click(); //clicks on add to cart option
        //Using Text as it is static now
        driver.findElement(By.xpath("//button[contains(text(), 'PROCEED TO CHECKOUT')]")).click(); // click on checkout button
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy"); // add promo code
        driver.findElement(By.cssSelector("button.promoBtn")).click(); //clicks on apply button

        //Implicit wait solves the promo code sync issue
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
        driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
    }

    public static void addItems(WebDriver driver, String[] vegetablesCart) {
        int j = 0;
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        for (int i = 0; i < products.size(); i++) // Iterates 30 items in product page
        {
            String[] name = products.get(i).getText().split("-"); // store all name of items in var name
            String formattedName = name[0].trim();
            //format it to Trim the name

            //Convert array to arrayList for easy search
            //Check whether extracted names is within the vegetablesCart array
            List<String> items = Arrays.asList(vegetablesCart);

            if (items.contains(formattedName)) {
                //driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click(); //This fails as ADD TO CART is dynamic post click. Not recommended to search with text field.
                driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
                j++;
                if (j == vegetablesCart.length)
                    break;
    }
}
    }

}

