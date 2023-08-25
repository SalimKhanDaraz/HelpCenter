package StepDefinitions;

import Pages.SelfServicePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class SelfServiceSteps {

    SelfServicePage selfservicepageobj = new SelfServicePage();

    @When("I click on self service tool")
    public void GotoSelfServiceSection() throws IOException, InterruptedException {
        selfservicepageobj.SelfServiceSection();
        Thread.sleep(2000);

    }

    @Then("I should be redirected to the self serivce tool")
    public void SelfServiceToolPage() throws InterruptedException {
        selfservicepageobj.SelfServiceTool();
        Thread.sleep(2000);

    }

}
