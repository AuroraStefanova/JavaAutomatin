package SeleniumWebDrive;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeworkEight {
    public static void main(String[] args) {

        //shows driver path
        System.setProperty("webdriver.chrome.driver","E:\\JQALearn\\chromedriver_win32\\chromedriver.exe");

        //create chrome instance
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        //find elements

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.id("checkout")).click();

        //close browser
        driver.close();
    }
}
/*
Homework 8

Задача 1

Направете кратък тест по показаните в картите примери с помоща на web driver.
 Изпълнете теста за сайта по избор от Homework 7, използвайте методите findBy на driver на инспектираните 3 web elements от сайта по избор.
 Извършете някакво действие с тези елементи с помоща на driver commands (sendKeys, click и т.н.т).
 Example:
   // Click on the Custom Search text box and send value
driver.findElement(By.id("gsc-i-id1")).sendKeys("Java");
  // Click on the Search button
driver.findElement(By.className("gsc-search-button gsc-search-buttonv2")).click();
 */
