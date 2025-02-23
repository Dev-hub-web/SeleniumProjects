package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class basePage {
    protected WebDriver driver;

    protected basePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }


}