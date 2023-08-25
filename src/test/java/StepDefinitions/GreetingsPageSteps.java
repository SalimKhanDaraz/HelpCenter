package StepDefinitions;

import Pages.GreetingsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class GreetingsPageSteps {

    GreetingsPage greetingsPage = new GreetingsPage();

    @Given("User is on the home page and is logged in")
    public void GreetingSection()
    {
        System.out.println("Greeting is visible");
    }

    @Then("User should se the greetings")
    public void Greetings() throws InterruptedException
    {
        greetingsPage.Greetings();
    }
}
