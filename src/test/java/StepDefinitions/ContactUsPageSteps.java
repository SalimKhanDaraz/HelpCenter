package StepDefinitions;

import Pages.ContactUsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ContactUsPageSteps {

    ContactUsPage contactUsPage = new ContactUsPage();

    @Given("I am on the Home Page")
    public void ContactUsSection()
    {

    }

    @Then("I should see the Still Need Help section")
    public void StillNeedHelpSection() throws InterruptedException
    {
        contactUsPage.StillNeedHelp();
    }

}
