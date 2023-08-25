package StepDefinitions;

import Pages.SearchSuggestionPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchSuggestionPageSteps {

    SearchSuggestionPage searchSuggestionPage = new SearchSuggestionPage();

    @When("I enter valid keyword")
    public void EnterkeywordInSearchbox()
    {
        searchSuggestionPage.EnterKeywordInSearch();
    }

    @Then("I should see the search suggestions")
    public void VerifySearchSuggestions()
    {
        searchSuggestionPage.SearchSuggestion();
    }

}
