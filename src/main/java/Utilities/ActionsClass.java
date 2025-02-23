package Utilities;

import Pages.basePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import java.time.Duration;
import java.util.Arrays;


public class ActionsClass extends basePage {
    private Actions actions;
    public ActionsClass(WebDriver driver) {
        super(driver);
        this.actions = new Actions(driver);
    }
    // Click on an element
    public void clickElement(WebElement element) {
        actions.moveToElement(element).click().perform();
    }

    // Double-click on an element
    public void doubleClickElement(WebElement element) {
        actions.doubleClick(element).perform();
    }

    // Right-click (context click) on an element
    public void rightClickElement(WebElement element) {
        actions.contextClick(element).perform();
    }

    // Hover over an element
    public void hoverOverElement(WebElement element) {
        actions.moveToElement(element).perform();
    }

    // Drag and Drop from source to target
    public void dragAndDropElement(WebElement source, WebElement target) {
        actions.dragAndDrop(source, target).perform();
    }

    // Click and hold an element
    public void clickAndHoldElement(WebElement element) {
        actions.clickAndHold(element).perform();
    }

    // Release a held element
    public void releaseElement(WebElement element) {
        actions.release(element).perform();
    }

    // Move to an element and click at an offset
    public void moveToElementAndClick(WebElement element, int xOffset, int yOffset) {
        actions.moveToElement(element, xOffset, yOffset).click().perform();
    }

    // Send keys to an element (e.g., keyboard inputs)
    public void sendKeysToElement(WebElement element, String keys) {
        actions.moveToElement(element).click().sendKeys(keys).perform();
    }

    // Press and release a keyboard key
//    public void pressKey(Keys key) {
//        actions.sendKeys(key).perform();
//    }

    // Press multiple keys simultaneously
//    public void pressMultipleKeys(Keys... keys) {
//        actions.keyDown(keys[0]);
//        for (int i = 1; i < keys.length; i++) {
//            actions.sendKeys(keys[i]);
//        }
//        actions.keyUp(keys[0]).perform();
//    }

    // Scroll to an element
    public void scrollToElement(WebElement element) {
        actions.moveToElement(element).perform();
    }

    // Scroll by a specific amount
    public void scrollByAmount(int xOffset, int yOffset) {
        actions.scrollByAmount(xOffset, yOffset).perform();
    }

    // Perform a custom gesture (Advanced Pointer Input)
//    public void performCustomPointerGesture(int xStart, int yStart, int xEnd, int yEnd) {
//        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
//        Sequence sequence = new Sequence(finger, 1);
//        sequence.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), xStart, yStart));
//        sequence.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
//        sequence.addAction(finger.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), xEnd, yEnd));
//        sequence.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
//        driver.perform(Arrays.asList(sequence));
//    }
}
