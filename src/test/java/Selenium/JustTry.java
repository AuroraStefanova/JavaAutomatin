package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JustTry {
    public static void main(String[] args) {
//        WebDriver driver = null;
        WebDriverManager.chromedriver().setup();
//        System.setProperty("webdriver.chrome.driver", "E:\\JQALearn\\chromedriver_win32\\chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
       // System.setProperty("webdriver.chrome.driver","E:\\JQALearn\\chromedriver_win32\\chromedriver.exe");
        //create chrome instance
       ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        // Remove cookie warning
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.id("checkout")).click();


        driver.close();

       // driver.findElement(By.xpath("//button[@title='Only allow essential cookies']")).click();
       // WebElement element = driver.findElement(By.xpath("//input[@name='email']"));
       // element.sendKeys("abc@gmail.com");

    }
}
