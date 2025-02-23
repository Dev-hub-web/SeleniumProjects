package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class WebdriverManager {
    public static WebDriver driver;
    public static WebDriver getDriver() throws MalformedURLException {
        if (driver == null)
            driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }
    public void remoteDriver() throws MalformedURLException {
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
        driver.get("https://www.facebook.com/");

    }
    public static void setUrl(){
        driver.get("https://www.facebook.com/");
    }
    public static void quit(){
        if (driver != null) {
                driver.quit();
            }
    }
}
