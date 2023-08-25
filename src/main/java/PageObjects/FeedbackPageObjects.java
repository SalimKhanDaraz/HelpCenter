package PageObjects;

import Utils.ChromeSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FeedbackPageObjects extends ChromeSetup {

    public FeedbackPageObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);}

    @FindBy(xpath = "//*[@class=\"qA4kooDpxWnZ6uxeCiw9\" and @href=\"#/knowledge/1000034592\"]")
    public WebElement ArticlePage;

    @FindBy(xpath = "//*[@class=\"liDMsVvwRI22CepAEJ2Q\"]")
    public WebElement Feedback_Content;

    @FindBy(xpath = "//*[@class=\"rAzsDlinH3yKNHAGVE4w\"]")
    public WebElement Generic_Feedback_Content;

    @FindBy(xpath = "//*[@class=\"D8ZcaizHg9T4FJ9l11f9\" and text()=\"Yes\"]")
    public WebElement Feedback_Yes;

    @FindBy(xpath = "//*[@class=\"D8ZcaizHg9T4FJ9l11f9\" and text()=\"No\"]")
    public WebElement Feedback_No;


    @FindBy(xpath = "//*[@class=\"kI0knBH0Z_M0cFVBP0wL\"]")
    public WebElement CloseGenericFeedbackForm;

    @FindBy(xpath = "//*[@class=\"N9r71vPOltglWwu68MhS\"]")
    public WebElement Feedback_ThankYou;

    @FindBy(xpath = "//*[text()=\"Answers were not clear\"]")
    public WebElement Overall_HC_Feedback;

    @FindBy(xpath = "//*[text()=\"Article is fine but I need additional help\"]")
    public WebElement Feedback_Option1;

    @FindBy(xpath = "//*[@class=\"aKvm7IOvMy_qmuO1Oulw\"]")
    public WebElement GenericFeedbackSubmit_Btn;

    @FindBy(xpath = "//*[@class=\"WqNiDKT8Qjx0Ht60RZwq\"]")
    public WebElement Feedback_Submit_Button;

}
