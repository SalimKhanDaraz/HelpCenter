package StepDefinitions;

import Pages.SearchRemoveIcon;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchRemoveIconSteps {

    SearchRemoveIcon searchRemoveIcon = new SearchRemoveIcon();

    @When("I click on remove icon")
    public void SearchRemoveIconClick() throws InterruptedException {
        searchRemoveIcon.SearchRemoveBtnCheck();
    }

    @Then("Keywords should be removed from searchbox")
    public void ClickSearchRemoveIcon()
    {
        searchRemoveIcon.SearchboxisEmpty();
    }

}
