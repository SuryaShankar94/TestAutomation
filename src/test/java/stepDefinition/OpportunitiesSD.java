package stepDefinition;

import base.TestSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import pageObjects.OpportunitiesPage;
import utility.UserActions;

public class OpportunitiesSD extends TestSetup
{
    @When("Verify user is able to mouserHover on Opportunities")
    public void mouserOverOnOpportunities()
    {
        OpportunitiesPage.userMouseOverOnOpportunities();
    }
    @Then("User is able to mouseHover on Manage Leads")
    public void userIsAbleToMouseHoverOnManageLeads()
    {
        OpportunitiesPage.userMouseOverOnManageLeads();
    }

    @And("Should display application manage leads page")
    public void shouldDisplayApplicationManageLeadsPage()
    {
        UserActions.wait_Sec();
        String expectedUrl = userInputProperties.getProperty("manageLeads");
        LoginPage.shouldDisplayExpectedPage(expectedUrl);
    }

    @And("User wants to click on the add lead button")
    public void userWantsToClickOnTheAddLeadButton() {
        OpportunitiesPage.clickAddLead();
    }

    @And("User is able to select the values of company and pipeline stages")
    public void userIsAbleToSelectTheValuesOfCompanyAndPipelineStages() {
        OpportunitiesPage.selectTheValuesOfCompanyPipelineandStages();
    }

    @And("User is able to fill the add lead details")
    public void userIsAbleToFillTheAddLeadDetails() {
        OpportunitiesPage.fillTheAddLeadDetails();
    }

    @And("User is able to save lead details")
    public void userIsAbleToSaveLeadDetails() {
        OpportunitiesPage.SaveLeadButton();
    }

    @Then("User is able to see list view to campaign view")
    public void userIsAbleToSeeListViewToCampaignView() {
        OpportunitiesPage.listViewToCampaignView();
    }

    @Then("User is able to click the won leads tile")
    public void userIsAbleToClickTheWonLeadsTile() {
        OpportunitiesPage.clickTheWonLeadsTile();
    }

    @And("User is able to see campaign view to list view")
    public void userIsAbleToSeeCampaignViewToListView() {
        OpportunitiesPage.campaignViewToListView();
    }

    @And("User is able to click view lead icon")
    public void userIsAbleToClickViewLeadIcon() {
        OpportunitiesPage.clickViewLeadIcon();
    }

    @And("User is able to click edit lead icon")
    public void userIsAbleToClickEditLeadIcon() {
        OpportunitiesPage.clickEditLeadIcon();
    }

    @And("User is able to click comment lead icon")
    public void userIsAbleToClickCommentLeadIcon() {
        OpportunitiesPage.clickCommentLeadIcon();

    }

    @And("User is able to click delete lead icon")
    public void userIsAbleToClickDeleteLeadIcon() {
        OpportunitiesPage.clickDeleteLeadIcon();
    }

    @And("User is able to click next last first and previous page lead icon")
    public void userIsAbleToClickNextLastFirstAndPreviousPageLeadIcon() {
        OpportunitiesPage.pageNavigations();
    }

    @And("User is able to click page drop down")
    public void userIsAbleToClickPageDropDown() {
        OpportunitiesPage.clickPageDropDown();
    }


    @And("User is able to click lead to deal register button")
    public void userIsAbleToClickLeadToDealRegisterButton() {
        OpportunitiesPage.clickLeadToDealRegisterButton();
    }

    @Then("User is able to mouseHover on Manage Deals")
    public void userIsAbleToMouseHoverOnManageDeals() {
        OpportunitiesPage.clickmouseHoverOnManageDeals();
    }

    @And("User wants to click on the add Deal button")
    public void userWantsToClickOnTheAddDealButton() {
        OpportunitiesPage.clickAddaDealButton();
    }

    @And("User is able to select company pipeline and stages")
    public void userIsAbleToSelectCompanyPipelineAndStages() {
        OpportunitiesPage.selectCompanyPipelineAndStages();
    }

    @And("User is able to fill the add deal details")
    public void userIsAbleToFillTheAddDealDetails() {
        OpportunitiesPage.fillDealDetails();
    }
}
