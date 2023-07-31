package StepDefinitions;

import Pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import Utils.ChromeSetup;
import Utils.ReadConfig;
import java.io.IOException;


public class LoginSteps extends ChromeSetup {

    LoginPage loginPage = new LoginPage();

    ReadConfig readConfig = new ReadConfig();

    @Given("I am on the Saucedemo login page")
    public void openURL() throws IOException
    {
        loginPage.openURL();
    }

    @When("I enter a valid username")
    public void EnterUsername() throws IOException, InterruptedException
    {
        loginPage.enterUserName();
    }

    @And("I enter a valid password")
    public void Enter_Password() throws IOException, InterruptedException
    {
        loginPage.enterPassword();
    }

    @And("I click the login button")
    public void Enter_LoginButton()
    {
        loginPage.clickLoginButton();
    }

    //Test


    @Then("I should be redirected to the homepage")
    public void GotoHomepage() throws IOException
    {
        Assert.assertEquals(loginPage.getHomePageUrl(), readConfig.getHomepageUrl());
    }

}