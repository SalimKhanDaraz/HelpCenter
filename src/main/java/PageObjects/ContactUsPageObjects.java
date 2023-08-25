package PageObjects;

import Utils.ChromeSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPageObjects extends ChromeSetup {

    public ContactUsPageObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class=\"YRmVKFISBkI5nWVXbpNQ\"]")
    public WebElement StillNeedHelp_Section;

    @FindBy(xpath = "//*[@class=\"sa_vcQOm9lgfJvdVQnOp\"]")
    public WebElement StillNeedHelp_Options;

}
