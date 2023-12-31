package StepDefinitions;

import Pages.LoginPage;
import Utils.Wait;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.qameta.allure.Allure;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import Utils.ChromeSetup;
import Utils.ReadConfig;
import java.io.IOException;


public class LoginSteps extends ChromeSetup {


    LoginPage loginPage = new LoginPage();

    ReadConfig readConfig = new ReadConfig();

    @Given("I am on the daraz login page")
    public void openURL() throws IOException {

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
    public void Enter_LoginButton() throws InterruptedException {

        loginPage.clickLoginButton();
    }

    @Then("I should be redirected to the homepage")
    public void GotoHomepage() throws IOException, InterruptedException {
        loginPage.NavigateAccountPage();
        Thread.sleep(2000);
//        driver.get("https://m-helpcenter.daraz.pk/web/home.htm?hybrid=1");
//        Thread.sleep(2000);

    }

    @And("I should be navigated to the help center")
    public void GotoHelpCenter() throws IOException, InterruptedException {
        loginPage.NavigateHelpCenter();
        Thread.sleep(2000);
    }

}