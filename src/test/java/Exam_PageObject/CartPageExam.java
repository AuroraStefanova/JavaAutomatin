package Exam_PageObject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class CartPageExam { 
    WebDriver driver;
    @FindBy(className = "shopping_cart_link")
    WebElement shoppingCart;
    @FindBy(css = ".cart_button")
    WebElement removeButton;
    @FindBy(css = "#continue-shopping")
    WebElement continueShoppingButton;
    public CartPageExam(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }
    public void checkAddToCart() {
        this.shoppingCart.click();
        validateActualUrl();
    }
    public void validateActualUrl(){
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals("https://www.saucedemo.com/cart.html", actualUrl);
    }
    public void validateRemoveButtonVisibility(){
        boolean isRemoveButtonIsVisible = this.removeButton.isDisplayed();
        System.out.println("Remove button is visible! " + isRemoveButtonIsVisible);
    }
}
