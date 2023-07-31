package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static Utils.ChromeSetup.driver;

public class Wait {

    public static WebDriver driver;


    public static WebDriverWait WaitForWebElement()
    {
        return new WebDriverWait(driver, Duration.ofSeconds(30));
    }
}
