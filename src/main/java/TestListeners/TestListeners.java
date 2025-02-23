package TestListeners;

import Utilities.CommonActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestListeners implements ITestListener {
    private static final DateTimeFormatter TIMESTAMP_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private static String GetTimestamp() {
        return LocalDateTime.now().format(TIMESTAMP_FORMATTER);
    }
    @Override
    public void onTestStart(ITestResult result) {
        CommonActions.logBlue(
                GetTimestamp() + " [INFO]: ---- Test Execution Started: " + result.getMethod().getMethodName() + " ----");
    }
    @Override
    public void onTestSuccess(ITestResult result) {
        CommonActions.logSuccess(
                GetTimestamp() + " [INFO]: ---- Test Passed Successfully: " + result.getMethod().getMethodName() + " ----");
    }
    @Override
    public void onTestSkipped(ITestResult result) {
        CommonActions.logYellow(
                GetTimestamp() + " [INFO]: ---- Test Skipped: " + result.getMethod().getMethodName() + " ----");
    }


    /*@Override
    public void onTestFailure(ITestResult testResult){

        System.out.println("Test Failed: " + testResult.getName());

        if (ITestResult.FAILURE == testResult.getStatus()) {
            TakesScreenshot screenShot = (TakesScreenshot) driver;
            File source = screenShot.getScreenshotAs(OutputType.FILE);
            String destinationPath = System.getProperty("user.dir") + "" +
                    "/resources/screenShot/" + testResult.getName() + "_" + System.currentTimeMillis() + ".png";
            File destination = new File(destinationPath);

            try {
                FileHandler.copy(source, destination);
                System.out.println("Screenshot saved at: " + destinationPath);
            } catch (IOException e) {
                System.err.println("Failed to save screenshot: " + e.getMessage());
            }
        }
    }
    */
    public void afterQuit(WebDriver driver) {
        CommonActions.logYellow(
                GetTimestamp() + " [INFO]: WebDriver session has been terminated.");
    }
    public void onAlertAccepted() {
        System.out.println("Alert was accepted.");
    }

    public void onAlertDismissed() {
        System.out.println("Alert was dismissed.");
    }

    public void beforeClick(WebElement element) {
        CommonActions.logYellow(
                GetTimestamp() + " [ACTION]: Preparing to click on the element: " + element.toString());
    }
    public void afterClick(WebElement element) {
        CommonActions.logSuccess(
                GetTimestamp() + " [SUCCESS]: Successfully clicked on the element: " + element.toString());
    }
    public void beforeSendKeys(WebElement element, CharSequence... keysToSend) {
        CommonActions.logYellow(
                GetTimestamp() + " [ACTION]: Preparing to send keys: 'Hamza" + String.join(", ", keysToSend)
                        + "' to element: " + element.toString());
    }

    public void afterInput(WebElement element) {
        CommonActions.logSuccess(
                GetTimestamp() + " [SUCCESS]: Successfully set the input: " + element.getText());
    }
    public void beforeInput(WebElement element) {
        CommonActions.logYellow(
                GetTimestamp() + " [ACTION]: Preparing to set the input: " + element.getText());
    }
    public void beforeSelectDay(WebElement element) {
        CommonActions.logYellow(
                GetTimestamp() + " [ACTION]: Preparing to select the day: " + element);
    }
    public void afterSelectDay(WebElement element) {
        CommonActions.logSuccess(
                GetTimestamp() + " [SUCCESS]: Successfully selected the day: " + element);
    }
    public void beforeSelectMonth(WebElement element) {
        CommonActions.logYellow(
                GetTimestamp() + " [ACTION]: Preparing to select the month: " + element);
    }
    public void afterSelectMonth(WebElement element) {
        CommonActions.logSuccess(
                GetTimestamp() + " [SUCCESS]: Successfully selected the month: " + element);
    }
    public void beforeSelectYear(WebElement element) {
        CommonActions.logYellow(
                GetTimestamp() + " [ACTION]: Preparing to select the year: " + element);
    }
    public void afterSelectYear(WebElement element) {
        CommonActions.logSuccess(
                GetTimestamp() + " [SUCCESS]: Successfully selected the year: " + element);
    }
    public void beforeClickingRadioButton(WebElement element) {
        CommonActions.logYellow(
                GetTimestamp() + " [ACTION]: Preparing to click on the radio button: " + element);
    }
    public void afterClickingRadioButton(WebElement element) {
        CommonActions.logSuccess(
                GetTimestamp() + " [SUCCESS]: Successfully clicked on the radio button: " + element);
    }
    public void afterDragAndDrop(WebElement element) {
        CommonActions.logSuccess(
                GetTimestamp() + " [SUCCESS]: Successfully dragged and dropped the element: " + element.getText());
    }
    public void beforeGet(WebDriver driver, String url) {
        CommonActions.logYellow(
                GetTimestamp() + " [ACTION]: Navigating to URL: " + url);
    }

    public void afterGet(WebDriver driver, String url) {
        CommonActions.logSuccess(
                GetTimestamp() + " [SUCCESS]: Successfully navigated to URL: " + url);
    }
    /**
     * Retrieves the WebDriver instance from the test class.
     *
     * @param result The TestNG ITestResult instance.
     * @return The WebDriver instance from the test class.
     */
//    private WebDriver getDriver(ITestResult result) {
//        Object currentClass = result.getInstance();
//        return ((POM) currentClass).getDriver(driver);
//    }
}
