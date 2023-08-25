package Pages;

import PageObjects.SearchPageObjects;
import Utils.ChromeSetup;
import Utils.Wait;
import io.qameta.allure.Allure;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.asserts.SoftAssert;


public class SearchNotFound extends ChromeSetup {

    SearchPageObjects searchpageobj = new SearchPageObjects(driver);

    public void Search_NotFound () throws InterruptedException {

        SoftAssert softAssert = new SoftAssert();

        Wait.WaitForWebElement().until(ExpectedConditions.visibilityOf(searchpageobj.SearchBar)).isDisplayed();
        Thread.sleep(1000);
        searchpageobj.SearchBar.sendKeys("vvvvv");

        Wait.WaitForWebElement().until(ExpectedConditions.visibilityOf(searchpageobj.NoResultFound));
        Thread.sleep(1000);

        boolean InvalidSearchResult;

        try{
            InvalidSearchResult = searchpageobj.NoResultFound.isDisplayed();
        }
        catch(Exception e)
        {
            InvalidSearchResult = false;
        }

        if (InvalidSearchResult)
        {
            System.out.println("****************************");
            System.out.println("Check 1: Invalid Search Case");
            Allure.step("Search Icon is available");
            System.out.println("Case 6: Passed");
            System.out.println("**************");
            System.out.println("");
        }
        else
        {
            System.out.println("");
            System.out.println("****************************");
            System.out.println("Check 2: Invalid Search Case");
            Allure.step("Search Icon not found");
            System.out.println("Case 6: Search Module Failed");
            System.out.println("****************************");
            System.out.println("");

            softAssert.assertFalse(true,"Invalid Search Case");
        }

        softAssert.assertAll();

    }

}
