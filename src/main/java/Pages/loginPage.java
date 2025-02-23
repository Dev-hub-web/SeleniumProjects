package Pages;

import TestListeners.TestListeners;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import Utilities.ActionsClass;

public class loginPage extends basePage{
    @FindBy(xpath = "//input[@name='firstname']")
    private WebElement firstName;
    @FindBy(xpath = "//input[@name='lastname']")
    private WebElement surName;
    @FindBy(xpath = "//input[@name='reg_email__']")
    private WebElement Email;
    @FindBy(xpath = "//input[@name='reg_passwd__']")
    private WebElement psW;
    @FindBy(xpath = "//div[@class='_6ltg']/a")
    private WebElement createNewAccButton;



    public loginPage(WebDriver driver){
        super(driver);
    }
    public void setFirstNameNsurName(String firstname, String surname, String email, String psw){
        firstName.sendKeys(firstname);
        surName.sendKeys(surname);
        Email.sendKeys(email);
        psW.sendKeys(psw);

    }
    public void clickButton(){
        ActionsClass actionsClass = new ActionsClass(driver);
        actionsClass.clickElement(createNewAccButton);
        TestListeners listeners = new TestListeners();
        listeners.afterClick(createNewAccButton);

    }
    public interface page {
        void test();
    }
    public void test () {

    }


























}
