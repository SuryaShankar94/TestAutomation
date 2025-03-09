package stepDefinition;

import base.TestSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.LoginPage;
import utility.UserActions;

public class LoginPageSD extends TestSetup {

    @Given("User launches xamplify Application URL")
    public void userLaunchesApplicationURL()
    {
       try {
        //   TestBase.setWebDriver();
           LoginPage.userLaunchesApplicationURL();
       }catch (Exception e){
           Assert.fail(e.toString());
       }
    }
    @When("User enters valid username and valid password")
    public void userEntersValidUserNameAndValidPassword()
    {
        userName = userInputProperties.getProperty("userName");
        password = userInputProperties.getProperty("password");
        LoginPage.enterUserNameAndPassword(userName,password);
    }
    @Then("Should display xamplify application home page")
    public void assertVerifyHomepage()
    {

        UserActions.wait_Sec();
        String expectedUrl = userInputProperties.getProperty("homePageURL");
        LoginPage.shouldDisplayExpectedPage(expectedUrl);
    }

    @And("User is able to logout the xamplify application")
    public void userIsAbleToLogoutTheXamplifyApplication() {
        LoginPage.logoutTheXamplifyApplication();
    }
}
