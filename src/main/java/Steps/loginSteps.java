package Steps;

import Utilities.ExcelBasePage;
import Utilities.WebdriverManager;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import java.net.MalformedURLException;

import static Utilities.WebdriverManager.driver;

public class loginSteps {



        @When("I am in the loginPage")
        public void GetdataFromExcel() throws MalformedURLException {
        WebdriverManager.getDriver();
        WebdriverManager.setUrl();
    }
        @And("I could register to faceBook using Excel Data")
        public void IcouldRegisterTofaceBook ()throws InterruptedException {
        ExcelBasePage ex = new ExcelBasePage(driver);
        ex.readExceldata();

    }
        @Then("the driver shutsDown")
         public void TearDown () {
          WebdriverManager.quit();
    }


}
