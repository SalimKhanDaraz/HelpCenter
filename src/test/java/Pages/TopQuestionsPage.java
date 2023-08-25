package Pages;

import PageObjects.TopQuestionsPageObjects;
import Utils.ChromeSetup;
import Utils.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;

public class TopQuestionsPage extends ChromeSetup {

    TopQuestionsPageObjects topQuestionsPageObjects = new TopQuestionsPageObjects(driver);

    public void ArticlesPage () throws InterruptedException
    {

        SoftAssert softAssert = new SoftAssert();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        int size = driver.findElements(By.xpath("//*[@class=\"aRLClMMX4At4DDn_6QPG\"]")).size();

        try {

            for (int i = 0; i < size; i++) {

                List<WebElement> TopQuestionsList;

               // TopQuestionsList = driver.findElements(By.xpath("//*[@class=\"aRLClMMX4At4DDn_6QPG\"]"));
                TopQuestionsList = topQuestionsPageObjects.TopQuestion_AllArticle;
               // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class=\"aRLClMMX4At4DDn_6QPG\"]")));
                Wait.WaitForWebElement().until(ExpectedConditions.visibilityOfAllElements(topQuestionsPageObjects.TopQuestion_AllArticle));

                System.out.println(i + " Clicked on: " + TopQuestionsList.get(i).getText() + "\" article\"");
                TopQuestionsList.get(i).click();
              //  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class=\"zOAodfFFSXYQxHntYUeh\"]")));
                Wait.WaitForWebElement().until(ExpectedConditions.visibilityOfAllElements(topQuestionsPageObjects.ArticlePage));


                Thread.sleep(2000);

                driver.navigate().back();

                Thread.sleep(1500);

            }

            System.out.println("");
            System.out.println("**************************************************************");
            System.out.println("Check 1: All the articles working fine in Top Question Section");
            System.out.println("Case 18: Passed");
            System.out.println("***************");

        }catch (Exception e) {

            System.out.println("");
            System.out.println("**************************************************************");
            System.out.println("Check 1: Articles are not working fine in Top Question Section");
            System.out.println("Case 18: Failed");
            System.out.println("***************");
            e.printStackTrace();
        }


        boolean TopQuestionSection, TopQuestionArticles;
        Thread.sleep(2000);

        try
        {
            TopQuestionSection = topQuestionsPageObjects.TopQuestion_Section.isDisplayed();
            TopQuestionArticles = topQuestionsPageObjects.TopQuestion_Articles.isDisplayed();

        }
        catch (Exception e)
        {
            TopQuestionSection = false;
            TopQuestionArticles = false;
        }

        if (TopQuestionSection && TopQuestionArticles)
        {
            System.out.println("************************************************************");
            System.out.println("Check 2: Top Question Section and its articles are available");
            System.out.println("Case 18: Passed");
            System.out.println("***************");

        }
        else
        {
            System.out.println("********************************************************");
            System.out.println("Check 2: Top Question Section and its articles not found");
            System.out.println("Case 18: Failed");
            System.out.println("***************");

            softAssert.assertFalse(true,"Top Question Section and its articles not found");

        }

        softAssert.assertAll();

    }

}
