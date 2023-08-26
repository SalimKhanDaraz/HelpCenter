package StepDefinitions;

import Pages.AnnouncementsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AnnouncementsPageSteps {

    AnnouncementsPage announcementsPage = new AnnouncementsPage();


    @Given("Announcements are configured & enabled from workstation")
    public void AnnouncementEnabled()
    {
        //Added for scenario
    }

    @Then("I should see the announcements on homepage")
    public void Announcement() throws InterruptedException {
        announcementsPage.Announcements();
    }

}
