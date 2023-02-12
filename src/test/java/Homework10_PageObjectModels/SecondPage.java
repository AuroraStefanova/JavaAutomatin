package Homework10_PageObjectModels;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondPage {

    WebDriver driver;
    @FindBy(id = "add-to-cart-sauce-labs-backpack") WebElement addToCart;

    public SecondPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }

  // public WebElement getAddToCart(){
  //     return addToCart;
  // }
  // public WebElement getShoppingCart(){
  //     return shoppingCart;
  // }
    public void addElementToCart(){
        System.out.println("Add element method");
        this.addToCart.click();
    }

}
