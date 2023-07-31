package Pages;

import PageObjects.LoginPageObjects;
import org.openqa.selenium.support.ui.ExpectedConditions;
import Utils.ChromeSetup;
import Utils.ReadConfig;
import Utils.Wait;


import java.io.IOException;


public class LoginPage extends ChromeSetup {

    LoginPageObjects loginPageObjects = new LoginPageObjects(driver);

    ReadConfig readConfig = new ReadConfig();

    public void openURL() throws IOException
    {
        driver.get(readConfig.getUrl());
    }

    public void enterUserName() throws IOException, InterruptedException
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


    public String getHomePageUrl()
    {
        //System.out.println(driver.getCurrentUrl());
        return driver.getCurrentUrl();
    }


}