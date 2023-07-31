package StepDefinitions;

import Pages.CheckoutPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import Utils.ChromeSetup;

public class CheckoutSteps extends ChromeSetup {

    CheckoutPage checkoutpageobj = new CheckoutPage(driver);

    @Given("I am on the Sauce website")
    public void VerifyHomepageLogo()
    {
        checkoutpageobj.HomepageLogo();
    }

    @When("I add a product to my cart")
    public void AddtoCartProduct()
    {
        checkoutpageobj.AddtoCartProduct();
    }

    @And("I go to the cart page")
    public void ClickCartIcon()
    {
        checkoutpageobj.ClickonCartIcon();
    }

    @And("I click the checkout button")
    public void ClickCheckoutBtn()
    {
        checkoutpageobj.ClickCheckoutBtn();
    }

    @And("I enter my information")
    public void EnterInformation()
    {
        checkoutpageobj.EnterYourInfo();
    }

    @And("I click on the continue button")
    public void ClickContinueBtn()
    {
        checkoutpageobj.ClickonContinueBtn();
    }

    @And("I click on the finish button")
    public void ClickFinishBtn()
    {
        checkoutpageobj.ClickonFinishBtn();
    }

    @Then("a success message should be displayed")
    public void CheckSuccessMsg()
    {
        checkoutpageobj.OrderSuccessMsg();
    }

}