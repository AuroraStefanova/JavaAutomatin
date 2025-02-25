package Exam_Helper;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

public class BrowserFactoryHelper {
    private static Map<String, WebDriver> drivers = new HashMap<String, WebDriver>();

    public static WebDriver getBrowserForExam(String browserName){
        WebDriver driver = null;

        switch (browserName){
            case "Firefox":
                driver = drivers.get("Firefox");
                if(driver == null){
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    drivers.put("Firefox", driver);
                }
                break;
            case "Chrome":
                driver = drivers.get("Chrome");
                if(driver == null){
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    drivers.put("Chrome", driver);
                }
                break;
        }
        return driver;
    }
    public static void closeBrowserForExam(){
        for(String key : drivers.keySet() ){
            drivers.get(key).close();
            drivers.get(key).quit();
        }
    }
}
