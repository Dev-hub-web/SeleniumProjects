package ExcelTests;

import Pages.loginPage;
import Utilities.ExcelBasePage;
import Utilities.WebdriverManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.net.MalformedURLException;

import static Utilities.WebdriverManager.driver;

public class ExcelTest {
    @BeforeTest
    public void setUp() throws MalformedURLException {
        WebdriverManager.getDriver();
    }

    @AfterTest
    public void tearDown() {
        WebdriverManager.quit();
    }

    @Test
    public void avdTest() {
        loginPage loginPage = new loginPage(driver);
        loginPage.clickButton();

    }
}