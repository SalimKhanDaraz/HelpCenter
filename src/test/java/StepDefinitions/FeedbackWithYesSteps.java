package StepDefinitions;

import Pages.FeedbackWithYesPage;
import Utils.ChromeSetup;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FeedbackWithYesSteps extends ChromeSetup {

    FeedbackWithYesPage feedbackWithYesPage = new FeedbackWithYesPage();

    @Given("I am on the Article Page")
    public void ArticlePage()
    {
        feedbackWithYesPage.ArticlePage();
    }

    @Then("I should be able to submit feedback with Yes button")
    public void SubmitFeedback() throws InterruptedException
    {
        feedbackWithYesPage.Submit_Feedback_Yes();
    }

}
