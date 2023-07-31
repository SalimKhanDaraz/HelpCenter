package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utils.ChromeSetup;

public class CheckoutPageObjects extends ChromeSetup {

    public CheckoutPageObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(className = "app_logo") public WebElement HomepageLogo;
    @FindBy(id = "add-to-cart-sauce-labs-bike-light") public WebElement AdditemtoCart;
    @FindBy(id = "shopping_cart_container") public WebElement ClickCartBtn;
    @FindBy(id = "checkout") public WebElement ClickCheckoutBtn;
    @FindBy(id = "first-name") public WebElement EnterFirstName;
    @FindBy(id = "last-name") public WebElement EnterLastName;
    @FindBy(id = "postal-code") public WebElement EnterAddress;
    @FindBy(id = "continue") public WebElement ClickContinueBtn;
    @FindBy(id = "finish") public WebElement ClickFinishBtn;
    @FindBy(className = "complete-header") public WebElement OrderSuccessMsg;

}