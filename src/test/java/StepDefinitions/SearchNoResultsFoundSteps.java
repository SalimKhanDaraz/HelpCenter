package StepDefinitions;

import Pages.SearchNotFound;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchNoResultsFoundSteps {

    SearchNotFound searchNotFound = new SearchNotFound();

    @When("I enter invalid keword in the Searchbox")
    public void SearchInvalidKeyword() throws InterruptedException
    {
        System.out.println("I am on search icon");
    }


    @Then("I should see the No Results Found Message")
    public void SearchNoResultMessageCheck() throws InterruptedException {
        searchNotFound.Search_NotFound();
    }
}
