package PageObjects;

import Utils.ChromeSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnnouncementPageObjects extends ChromeSetup {

    public AnnouncementPageObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);}

    @FindBy(xpath = "//*[@class=\"V4v2vDQOLFLezsAGpf15\"]")
    public WebElement Announcement_Section;

    @FindBy(xpath = "//*[@class=\"j1ebxOWjKqttNP4NmfRG\"]")
    public WebElement Announcement_Content;

    @FindBy(xpath = "//*[@class=\"j1ebxOWjKqttNP4NmfRG\"]")
    public WebElement Announcement_Type;

}
