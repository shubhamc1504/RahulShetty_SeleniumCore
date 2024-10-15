import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class WebTableSorting {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        //click on the column
        driver.findElement(By.xpath("//tr/th[1]")).click();

        //capture all the web elements into the list
        List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));

        //capture text of all elements into new list
        List<String> originalVeggiesList = veggies.stream().map(s -> s.getText()).collect(Collectors.toList());

        //apply sorting of list ->sorted original list
        List<String> sortedList = originalVeggiesList.stream().sorted().collect(Collectors.toList());

        //compare original list with sorted list
        Assert.assertEquals(sortedList, originalVeggiesList);

        //scan the name column with getText ->Beans and print the price of it
        List<String> price = veggies.stream()
                .filter(s -> s.getText().contains("Beans"))
                .map(s -> getPriceVeggies(s))
                .collect(Collectors.toList());
        price.forEach(a->System.out.println(a));
    }

    private static String getPriceVeggies(WebElement s) {
        String priceval = s.findElement(By.xpath("following-sibling::td[1]")).getText();
        return priceval;
    }

}
