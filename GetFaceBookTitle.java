package TestSuite;

import Utilities.WebdriverManager;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class GetFaceBookTitle {
    @Test
    private void getTitle() throws MalformedURLException {
        WebdriverManager.RemoteDriver();
    }
}
