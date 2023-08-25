package StepDefinitions;

import Pages.FeedbackWithNoPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FeedbackWithNoSteps {

    FeedbackWithNoPage feedbackWithNoPage = new FeedbackWithNoPage();

    @Given("I am on Article Page")
    public void ArticlePage() throws InterruptedException
    {
        feedbackWithNoPage.ArticlePage();
    }

    @Then("I should be able to submit feedback with No button")
    public void FeedbackWithNoBtn() throws InterruptedException
    {
        feedbackWithNoPage.Submit_Feedback_No();
    }

}
