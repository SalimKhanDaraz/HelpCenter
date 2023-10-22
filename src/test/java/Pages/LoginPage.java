package Pages;

import PageObjects.LoginPageObjects;
import io.qameta.allure.Allure;
import org.openqa.selenium.support.ui.ExpectedConditions;
import Utils.ChromeSetup;
import Utils.ReadConfig;
import Utils.Wait;


import java.io.IOException;


public class LoginPage extends ChromeSetup {

    //public static String Venture = "NP";

   public static String Venture = System.getenv("Venture_Jenkins");


    LoginPageObjects loginPageObjects = new LoginPageObjects(driver);

    ReadConfig readConfig = new ReadConfig();

    public void openURL() throws IOException
    {

        switch (Venture) {
            case "PK":

                ChromeSetup.driver.get(readConfig.getPKUrl());

                break;

            case "LK":

                ChromeSetup.driver.get(readConfig.getLKUrl());


                break;


            case "BD":

                ChromeSetup.driver.get(readConfig.getBDUrl());

                break;

            case "NP":

                ChromeSetup.driver.get(readConfig.getNPUrl());

                break;
        }

    }

    public void enterUserName() throws IOException
    {

        Wait.WaitForWebElement().until(ExpectedConditions.visibilityOf(loginPageObjects.UserName)).sendKeys(readConfig.getUsername());

    }

    public void enterPassword() throws IOException
    {
        Wait.WaitForWebElement().until(ExpectedConditions.visibilityOf(loginPageObjects.Password)).sendKeys(readConfig.getPassword());

    }

    public void clickLoginButton()
    {
        Wait.WaitForWebElement().until(ExpectedConditions.visibilityOf(loginPageObjects.LoginButton)).click();
    }

    public void NavigateAccountPage() throws IOException {

       Wait.WaitForWebElement().until(ExpectedConditions.visibilityOf(loginPageObjects.AccountPage)).isDisplayed();

    }

/*
    public String getHomePageUrl()
    {

        return driver.getCurrentUrl();
    }

 */

    public void NavigateHelpCenter() throws IOException
    {

        switch (Venture) {
            case "PK":

                ChromeSetup.driver.get("https://m-helpcenter.daraz.pk/web/home.htm?hybrid=1");

                break;

            case "LK":

                ChromeSetup.driver.get("https://m-helpcenter.daraz.lk/web/home.htm?hybrid=1");


                break;


            case "BD":

                ChromeSetup.driver.get("https://m-helpcenter.daraz.com.bd/web/home.htm?hybrid=1");

                break;

            case "NP":

                ChromeSetup.driver.get("https://m-helpcenter.daraz.com.np/web/home.htm?hybrid=1");

                break;
        }

    }


}