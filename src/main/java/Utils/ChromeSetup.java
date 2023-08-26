package Utils;


import io.qameta.allure.Allure;
import io.qameta.allure.model.ExecutableItem;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeSetup extends Wait {

    public WebDriver openBrowser() throws IOException
    {

        WebDriverManager.chromedriver().setup();
        ChromeDriverService service = ChromeDriverService.createDefaultService();
        ChromeOptions options = new ChromeOptions();
        Map<String, String> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceName", "Galaxy S5");
        options.setExperimentalOption("mobileEmulation", mobileEmulation);
        //options.addArguments("--headless","--remote-allow-origins=*");
        driver = new ChromeDriver(service, options);
//        Dimension size = new Dimension(2560, 1600); // Change these values as needed
  //      driver.manage().window().setSize(size);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


        return driver;
    }

}
