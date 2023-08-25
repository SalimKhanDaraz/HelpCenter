package StepDefinitions;


import Pages.SearchIconPage;
import Utils.ChromeSetup;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class SearchPageIconSteps extends ChromeSetup {

    SearchIconPage searchIconPage = new SearchIconPage();


    @When("I go to Searchbox")
    public void GotoSearchIcon() throws InterruptedException
    {
            System.out.println("I am on search icon");
    }

    @Then("Searchbar should have the search icon")
    public void SearchbarPlaceholderCheck() throws InterruptedException
    {

        searchIconPage.SearchIconVerification();
    }

    }

