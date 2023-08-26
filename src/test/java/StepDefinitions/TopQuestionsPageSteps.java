package StepDefinitions;

import Pages.TopQuestionsPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TopQuestionsPageSteps {

    TopQuestionsPage topQuestionsPage = new TopQuestionsPage();

    @When("I click on the available top questions")
    public void TopQuestions() throws InterruptedException {
        topQuestionsPage.TopQuestionsSection();
    }

    @Then("I should be navigated to the relevant article page")
    public void ArticlePage() throws InterruptedException
    {
        topQuestionsPage.ArticlesPage();
    }
}
