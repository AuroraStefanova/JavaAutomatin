package HomeworkNine;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class JunitAssertionsClass {
    static WebDriver driver;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("This @BeforeClass will be executed once before the starts of all class");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Test
    public void verifiedFields(){

        System.out.println("This is the @Test");

        driver.get("https://www.saucedemo.com/");

        // find elements
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();

        //Validate expected and actual with Assert.
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals("https://www.saucedemo.com/inventory.html",actualUrl);

        // Validate and check element of the page are more than one
        List<WebElement> elements = driver.findElements(By.className("inventory_item"));
        int elementCount = elements.size();

        //Validate and check header title
        String actualTitle = driver.findElement(By.className("title")).getText();
        System.out.println(actualTitle);
        Assert.assertEquals("PRODUCTS", actualTitle);

        System.out.println(elementCount);

        Assert.assertTrue("All element are more then 1", elementCount > 1);

        //inventory_container is visible  isDispalyed()
        boolean isElementVisible = driver.findElement(By.id("inventory_container")).isDisplayed();
        System.out.println("I thing I find it - "  + isElementVisible);

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.className("shopping_cart_link")).click();

        driver.findElement(By.className("shopping_cart_badge"));

    }
    @AfterClass
    public static void afterClass(){

        System.out.println("This @AfterClass will be executed once after all test have been completed");
        driver.close();
    }
}
