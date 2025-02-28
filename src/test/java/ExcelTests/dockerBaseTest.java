package ExcelTests;

import TestListeners.TestListeners;
import Utilities.WebdriverManager;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
@Listeners(TestListeners.class)
public class dockerBaseTest {

    @Test
    public void Test() throws MalformedURLException {
        WebdriverManager.remoteDriver();
    }
}
