package StepDefinitions;

import Pages.GenericFeedbackPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GenericFeedbackSteps {

    GenericFeedbackPage genericFeedbackPage = new GenericFeedbackPage();

    @When("User is get back to homepage from article page")
    public void Navigatetohomepage()
    {
        genericFeedbackPage.BacktoHomepage();
    }

    @Then("I should get the generic feedback form")
    public void SubmitGenericFeedback() throws InterruptedException
    {
        genericFeedbackPage.Generic_Feedback();
    }

}
