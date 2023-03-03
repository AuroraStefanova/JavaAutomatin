package Exam_PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class ProductsPageExam {
    WebDriver driver;
    WebDriverWait wait;
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCart;
    public ProductsPageExam(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
        wait = new WebDriverWait(this.driver,3);
    }
    public void addElementFromProductPageToCart(){

        this.wait.until(ExpectedConditions.visibilityOfElementLocated (By.id("shopping_cart_container")));
        this.addToCart.click();
        this.wait.until(ExpectedConditions.visibilityOfElementLocated (By.className("shopping_cart_badge")));
    }
    public void validateActualUrl(String url){
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(url,actualUrl);
    }
    public void validateTitle(){
          String actualTitle = driver.findElement(By.className("title")).getText();
          System.out.println(actualTitle);
          Assert.assertEquals("Products", actualTitle);
    }
    public void validateElementsOfThePage(){
        List<WebElement> elements = driver.findElements(By.className("inventory_item"));
        int elementCount = elements.size();
        System.out.println(elementCount);
        Assert.assertTrue("All element are more then 1", elementCount > 1);
    }
}
