package Pages;

import PageObjects.FeedbackPageObjects;
import Utils.ChromeSetup;
import Utils.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class FeedbackWithYesPage extends ChromeSetup {

    FeedbackPageObjects feedbackPageObjects = new FeedbackPageObjects(driver);

    public void ArticlePage()
    {
        Wait.WaitForWebElement().until(ExpectedConditions.visibilityOf(feedbackPageObjects.ArticlePage)).click();

    }

    public void Submit_Feedback_Yes() throws InterruptedException {

        SoftAssert softAssert = new SoftAssert();

        boolean HC_Feedback;
        boolean HC_FeedbackThankYou;


        Wait.WaitForWebElement().until(ExpectedConditions.visibilityOf(feedbackPageObjects.Feedback_Yes));
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", feedbackPageObjects.Feedback_Yes);

        try {
            HC_Feedback = feedbackPageObjects.Feedback_Content.isDisplayed();
            HC_FeedbackThankYou = feedbackPageObjects.Feedback_ThankYou.isDisplayed();
        } catch (Exception e) {
            HC_Feedback = false;
            HC_FeedbackThankYou = false;
        }

        if (HC_Feedback) {

            System.out.println("**************************************");
            System.out.println("Check 1: Feedback Section is Available");
            System.out.println("Case 16: Passed");
            System.out.println("***************");

            Thread.sleep(1000);
            Wait.WaitForWebElement().until(ExpectedConditions.visibilityOf(feedbackPageObjects.Feedback_Yes)).click();

            Wait.WaitForWebElement().until(ExpectedConditions.visibilityOf(feedbackPageObjects.Feedback_ThankYou));
            Thread.sleep(1000);

            if (HC_FeedbackThankYou) {
                System.out.println("****************************************");
                System.out.println("Check 2: Feedback Submitted Successfully");
                System.out.println("Case 16: Passed");
                System.out.println("***************");
            } else {
                System.out.println("***********************************");
                System.out.println("Check 3: Feedback Submittion Failed");
                System.out.println("Case 16: Failed");
                System.out.println("***************");

                softAssert.assertFalse(true, "Feedback Submittion Failed");

            }

        } else {
            System.out.println("******************************************");
            System.out.println("Check 4: Feedback Section is not Available");
            System.out.println("Case 16: Failed");
            System.out.println("**************");

            softAssert.assertFalse(true, "Feedback Section is not Available");

        }

        Thread.sleep(4000);

        softAssert.assertAll();

    }
}
