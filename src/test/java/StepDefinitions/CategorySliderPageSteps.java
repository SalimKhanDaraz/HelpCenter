package StepDefinitions;

import Pages.CategorySliderPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CategorySliderPageSteps {

    CategorySliderPage categorySliderPage = new CategorySliderPage();

    @Given("I am on the Category slider page")
    public void CategorySliderPage()
    {
        categorySliderPage.CategoryPage();
    }

    @Then("All L1 Categories should have L2 Categories")
    public void CategorySliderVerification() throws InterruptedException
    {
        categorySliderPage.CategorySlide();
    }

    @And("Selected Category should be on 1st spot")
    public void CategorySpot() throws InterruptedException
    {
        categorySliderPage.CategorySliderSpot();
    }

}
