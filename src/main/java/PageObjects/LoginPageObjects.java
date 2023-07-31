package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utils.ChromeSetup;

public class LoginPageObjects extends ChromeSetup {

    public LoginPageObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user-name") public WebElement UserName;
    @FindBy(id = "password") public WebElement Password;
    @FindBy(id = "login-button") public WebElement LoginButton;
}