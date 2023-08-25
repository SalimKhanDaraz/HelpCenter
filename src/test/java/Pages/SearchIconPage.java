package Pages;

import PageObjects.SearchPageObjects;
import Utils.ChromeSetup;
import Utils.Wait;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class SearchIconPage extends ChromeSetup {

    SearchPageObjects searchpageobj = new SearchPageObjects(driver);

    // Validating the searchbar icon in this method
    public void SearchIconVerification () throws InterruptedException {

        SoftAssert softAssert = new SoftAssert();

        Wait.WaitForWebElement().until(ExpectedConditions.visibilityOf(searchpageobj.SearchBar)).isDisplayed();
        Thread.sleep(1500);

        boolean Icon;

        try{
            Icon = searchpageobj.SearchIcon.isDisplayed();
        }
        catch(Exception e)
        {
            Icon = false;
        }

        if (Icon)
        {
            System.out.println("*********************************");
            System.out.println("Check 1: Search Icon is available");
            Allure.step("Search Icon is available");
            System.out.println("Case 5: Passed");
            System.out.println("**************");
            System.out.println("");
        }
        else
        {
            System.out.println("");
            System.out.println("******************************");
            System.out.println("Check 2: Search Icon not found");
            Allure.step("Search Icon not found");
            System.out.println("Case 5: Search Module Failed");
            System.out.println("****************************");
            System.out.println("");

            softAssert.assertFalse(true,"Search Icon not found");
        }

        softAssert.assertAll();

    }

}

