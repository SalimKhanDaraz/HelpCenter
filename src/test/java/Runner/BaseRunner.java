package Runner;

import org.testng.annotations.*;
import Utils.*;

import java.io.IOException;

public class BaseRunner extends ChromeSetup {

    @BeforeSuite
    public void initializeDriver() throws IOException {
        openBrowser();
    }

    @AfterSuite
    public static void tearDown() {

        driver.close();
        driver.quit();
    }
}