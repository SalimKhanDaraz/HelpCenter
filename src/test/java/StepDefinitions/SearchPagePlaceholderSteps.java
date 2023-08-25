package StepDefinitions;

import Pages.SearchPage;
import Utils.ChromeSetup;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.IOException;

public class SearchPagePlaceholderSteps extends ChromeSetup {

    SearchPage searchPage0bj = new SearchPage();

    @When("I go to Searchbar")
    public void GotoSearchbar()
    {
        System.out.println("I am on search bar");
    }

    @Then("Searchbar should have the placeholder")
    public void SearchbarPlaceholderCheck() throws InterruptedException
    {
        searchPage0bj.SearchBoxPlaceholderCheck();
    }

}
