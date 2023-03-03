package Exam_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPageExam {
    WebDriver driver;
    @FindBy(css = "#user-name")
    WebElement userName;
    @FindBy(css = "#password")
    WebElement password;
    @FindBy(css = "#login-button")
    WebElement loginButton;

    public LoginPageExam(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    public void addUserNameAndPassword(String userName, String pass){
        System.out.println("Login user method");
        this.userName.sendKeys(userName);
        this.password.sendKeys(pass);
    }
    public void clickLoginButton(){
        this.loginButton.click();
    }
}

