package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utils.ChromeSetup;

public class LoginPageObjects extends ChromeSetup {

    public LoginPageObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);}


   @FindBy(xpath = "//*[@data-meta=\"Field\" and @type=\"text\"]") public WebElement UserName;
   @FindBy(xpath = "//*[@data-meta=\"Field\" and @type=\"password\"]") public WebElement Password;
    @FindBy(xpath = "//*[@data-spm=\"dlogin\" and @class=\"mod-button\"]") public WebElement LoginButton;
    @FindBy(id = "page-title") public  WebElement AccountPage;
}