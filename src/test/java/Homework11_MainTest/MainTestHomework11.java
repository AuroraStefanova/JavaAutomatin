package Homework11_MainTest;

import Homework10_Helpers.BrowserFactory;
import Homework10_PageObjectModels.Cart;
import Homework10_PageObjectModels.LoginPage;
import Homework10_PageObjectModels.ProductsPage;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainTestHomework11 {
    static WebDriver driver;

    @BeforeClass
    public static void beforeClass(){

        System.out.println("This @BeforeClass will be executed once before the starts of all class");
        driver = BrowserFactory.getBrowser("Chrome");
    }
    @AfterClass
    public static void afterClass(){

        System.out.println("This @AfterClass will be executed once after all test have been completed");
        BrowserFactory.closeBrowser();
    }
    @Test
    public void callingMainTest(){

        System.out.println("This is the @Test");

        driver.get("https://www.saucedemo.com/");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginUser("standard_user", "secret_sauce");

        //Validate expected and actual with Assert. vvvvvvvv
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals("https://www.saucedemo.com/inventory.html",actualUrl);

        ProductsPage pageAfterLogin = new ProductsPage(driver);
        pageAfterLogin.addElementToCart();

        Cart thirdPageCart = new Cart(driver);
        thirdPageCart.checkAddToCartPage();

        //Waits try methods
        //Thread sleep just for testing
        try {
            Thread.sleep(5000
            );
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        WebDriverWait wait1 = new WebDriverWait(driver,3);
        wait1.until(ExpectedConditions.visibilityOfElementLocated (By.className("shopping_cart_badge")));

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
}
