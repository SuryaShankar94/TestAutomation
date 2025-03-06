package pageObjects;

import base.TestSetup;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.UserActions;

public class LoginPage extends TestSetup {

    public static final By userFieldName = By.id("username");
    public static final By userFieldPassword = By.id("password");
    public static final By loginBtn = By.id("submitBitton");
    public static final By homePage = By.xpath("//span[contains(text(),'Account Dashboard')]");
    public static final By myProfile = By.xpath("//i[@class='fa fa-angle-down']");
    public static final By logoutBtn = By.xpath("//i[@class='icon-key']");


    public static void userLaunchesApplicationURL()
    {
        env = userInputProperties.getProperty("environment");
        //System.out.println("Env is selected is :" + env);
        if(env.equals("Dev"))
        {
            url = userInputProperties.getProperty("appDevURL");
            ExtentCucumberAdapter.addTestStepLog("URL read from properties file :"+ url);
            driver.get(url);
            driver.manage().window().maximize();
        } else if (env.equals("Stage")) {
            url = userInputProperties.getProperty("appStageURL");
            ExtentCucumberAdapter.addTestStepLog("URL read from properties file :"+ url);
            driver.get(url);
            driver.manage().window().maximize();

        }
    }
    public static void enterUserNameAndPassword(String Un, String pw)
    {
        if(Un !=null)
        {
            ExtentCucumberAdapter.addTestStepLog(Un);
            UserActions.setValue(userFieldName,Un);
            UserActions.setValue(userFieldPassword,pw);
            UserActions.click(loginBtn);
        }
    }
    public static void shouldDisplayExpectedPage(String expectedUrl)
    {
        String currentUrl = driver.getCurrentUrl();
        //System.out.println("Current URL ==>>"+currentUrl);
        //System.out.println("Expected URL ===> "+expectedUrl);
        Assert.assertEquals(currentUrl,expectedUrl);
    }

    public static void logoutTheXamplifyApplication() {
        UserActions.click(myProfile);
        //UserActions.waitForElementVisible(logoutBtn);
        //System.out.println("Logout menu Displayed");
        UserActions.click(logoutBtn);
    }
}
