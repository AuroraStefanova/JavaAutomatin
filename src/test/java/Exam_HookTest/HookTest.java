package Exam_HookTest;

import Exam_Helper.BrowserFactoryHelper;
import Exam_PageObject.CartPageExam;
import Exam_PageObject.LoginPageExam;
import Exam_PageObject.ProductsPageExam;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class HookTest {
      static WebDriver driver;
    LoginPageExam loginPage;
    ProductsPageExam pageWithProducts;
    CartPageExam thirdPageCart;

    @Before
    public  void beforeScenario(){
        driver = BrowserFactoryHelper.getBrowserForExam("Chrome");
        loginPage = new LoginPageExam(driver);
        pageWithProducts = new ProductsPageExam(driver);
        thirdPageCart  = new CartPageExam(driver);
    }
    @After
    public  void afterScenario(){
        BrowserFactoryHelper.closeBrowserForExam();
    }
    @Given("Open the Chrome and launch the application")
    public void openToLoginPage(){
        driver.get("https://www.saucedemo.com/");
    }
    @When("Enter the Username and Password")
    public void enterUserNameAndPass(){
        loginPage.addUserNameAndPassword("standard_user", "secret_sauce");
    }
    @And("Click in login button")
    public void clickInLoginButton(){
        loginPage.clickLoginButton();
    }
    @And("Add one of the items to cart")
    public void addItemToCart(){

      //Validate expected and actual with Assert
        pageWithProducts.validateActualUrl("https://www.saucedemo.com/inventory.html");

        //Validate and check header title
        pageWithProducts.validateTitle();

        // Validate and check element of the page are more than one
        pageWithProducts.validateElementsOfThePage();

        pageWithProducts.addElementFromProductPageToCart();
    }
    @And("Click on the Cart button")
    public void clickOnCartButton(){
        thirdPageCart.checkAddToCart();
    }
    @Then("There is item is added to the cart successfully")
    public void verifiedAddingItemToCart(){
        thirdPageCart.validateActualUrl();
        thirdPageCart.validateRemoveButtonVisibility();
    }
}
