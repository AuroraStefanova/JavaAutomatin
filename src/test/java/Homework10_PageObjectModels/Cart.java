package Homework10_PageObjectModels;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {
    WebDriver driver;
    @FindBy(className = "shopping_cart_link")
    WebElement shoppingCart; //. click
    @FindBy(css = ".cart_button")
    WebElement removeButton;// find and assert is equal

    @FindBy(css = "#continue-shopping")
    WebElement continueShoppingButton;

    public Cart(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }
    public void checkAddToCartPage(){
        System.out.println("This is third page Add To Cart");

        this.shoppingCart.click();

        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals("https://www.saucedemo.com/cart.html", actualUrl);

        boolean isRemoveButtonIsVisible = this.removeButton.isDisplayed();
        System.out.println("Remove button is visible! " + isRemoveButtonIsVisible);

        this.continueShoppingButton.click();
    }


}
