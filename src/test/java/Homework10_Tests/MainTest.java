package Homework10_Tests;

import Homework10_Helpers.BrowserFactory;
import Homework10_PageObjectModels.LoginPage;
import Homework10_PageObjectModels.ProductsPage;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainTest {
    static WebDriver driver;
    @BeforeClass
    public static void beforeClass(){
        System.out.println("This @BeforeClass will be executed once before the starts of all class");

        driver =  BrowserFactory.getBrowser("Chrome");

    }

    @Test
    public void callBrowsers(){
        System.out.println("This is the @Test");

        driver.get("https://www.saucedemo.com/");

        LoginPage homePage = new LoginPage(driver);

        homePage.loginUser("standard_user", "secret_sauce");

        //Validate expected and actual with Assert.
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals("https://www.saucedemo.com/inventory.html",actualUrl);

        ProductsPage secondPage = new ProductsPage(driver);
        secondPage.addElementToCart();

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

    }
    @AfterClass
    public static void afterClass(){

        System.out.println("This @AfterClass will be executed once after all test have been completed");

        BrowserFactory.closeBrowser();
    }
}
