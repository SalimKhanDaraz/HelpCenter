package Pages;

import PageObjects.CheckoutPageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import Utils.ChromeSetup;
import Utils.Wait;

public class CheckoutPage extends ChromeSetup {

    CheckoutPageObjects checkoutObj = new CheckoutPageObjects(driver);

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void HomepageLogo ()
    {
        Wait.WaitForWebElement().until(ExpectedConditions.visibilityOf(checkoutObj.HomepageLogo)).isDisplayed();

    }

    public void AddtoCartProduct()
    {
        Wait.WaitForWebElement().until(ExpectedConditions.visibilityOf(checkoutObj.AdditemtoCart)).click();
    }

    public void ClickonCartIcon()
    {
        Wait.WaitForWebElement().until(ExpectedConditions.visibilityOf(checkoutObj.ClickCartBtn)).click();
    }

    public void ClickCheckoutBtn()
    {
        Wait.WaitForWebElement().until(ExpectedConditions.visibilityOf(checkoutObj.ClickCheckoutBtn)).click();
    }

    public void EnterYourInfo()
    {
        Wait.WaitForWebElement().until(ExpectedConditions.visibilityOf(checkoutObj.EnterFirstName)).sendKeys("Salim");
        Wait.WaitForWebElement().until(ExpectedConditions.visibilityOf(checkoutObj.EnterLastName)).sendKeys("Khan");
        Wait.WaitForWebElement().until(ExpectedConditions.visibilityOf(checkoutObj.EnterAddress)).sendKeys("Karachi, Pakistan");

    }

    public void ClickonContinueBtn()
    {
        Wait.WaitForWebElement().until(ExpectedConditions.visibilityOf(checkoutObj.ClickContinueBtn)).click();
    }

    public void ClickonFinishBtn()
    {
        Wait.WaitForWebElement().until(ExpectedConditions.visibilityOf(checkoutObj.ClickFinishBtn)).click();
    }

    public void OrderSuccessMsg()
    {
        Assert.assertEquals((checkoutObj.OrderSuccessMsg).getText(),"Thank you for your order!");
    }

}