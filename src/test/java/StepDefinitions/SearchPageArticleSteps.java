package StepDefinitions;

import Pages.SearchPageArticle;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchPageArticleSteps {

    SearchPageArticle searchPageArticle = new SearchPageArticle();

    @When("I click on any KT on search suggestions")
    public void ClickOnArticleInSearchSuggestion()
    {
        searchPageArticle.ClickArticleSearchSuggestion();
    }

    @Then("I should be on the corresponding article page")
    public void GotoArticleLandingPage() throws InterruptedException {
        searchPageArticle.ArticleLandingPage();
    }
}
