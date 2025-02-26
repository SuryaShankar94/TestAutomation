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

    @Then("User is able to click the leads tile")
    public void userIsAbleToClickTheLeadsTile() {
        OpportunitiesPage.clickTheLeadsTile();
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

    @And("User is able to click manage leads pagination")
    public void userIsAbleToClickManageLeadsPagination(){
        OpportunitiesPage.manageLeadsPagination();
    }

    @And("User is able to click page drop down")
    public void userIsAbleToClickPageDropDown() {
        OpportunitiesPage.clickPageDropDown();
        UserActions.wait_Sec();
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

    @And("User is able to add lead or contact to deal")
    public void userIsAbleToAddLeadOrContactToDeal() {
        OpportunitiesPage.addLeadOrContactToDeal();
    }

    @And("User is able to fill the add deal details")
    public void userIsAbleToFillTheAddDealDetails() {
        OpportunitiesPage.fillDealDetails();
    }

    @And("User is able to see list view to campaign view in deals")
    public void userIsAbleToSeeListViewToCampaignViewInDeals() {
        OpportunitiesPage.listViewToCampaignViewInDeals();
    }

    @And("User is able to click the deals tile")
    public void userIsAbleToClickTheDealsTile() {
        OpportunitiesPage.clickTheDealsTile();
    }

    @And("User is able to select the lost deals tile")
    public void userIsAbleToSelectTheLostDealsTile() {
        OpportunitiesPage.clickTheLostDealsTile();
    }

    @And("User is able to see campaign view to list view in deals")
    public void userIsAbleToSeeCampaignViewToListViewInDeals() {
        OpportunitiesPage.clickCampaignViewToListViewInDeals();
    }

    @And("User is able to click the total deals tile")
    public void userIsAbleToClickTheTotalDealsTile() {
        OpportunitiesPage.clickTheTotalDealsTile();
    }

    @And("User is able to click here to email the report")
    public void userIsAbleToClickHereToEmailTheReport() {
        OpportunitiesPage.clickHereToEmailTheReport();
    }

    @And("User is able to click view deal icon")
    public void userIsAbleToClickViewDealIcon() {
        OpportunitiesPage.clickViewDealIcon();
    }

    @And("User is able to click edit deal icon")
    public void userIsAbleToClickEditDealIcon() {
        OpportunitiesPage.clickEditDealIcon();
    }

    @And("User is able to click comment deal icon")
    public void userIsAbleToClickCommentDealIcon() {
        OpportunitiesPage.clickCommentDealIcon();
    }

    @And("User is able to click delete deal icon")
    public void userIsAbleToClickDeleteDealIcon() {
        OpportunitiesPage.clickDeleteDealIcon();
    }

    @And("User ia able to click pagination on deals")
    public void userIaAbleToClickPaginationOnDeals() {
        OpportunitiesPage.clickPaginationOnDeals();
    }

    @And("User is able to select pagination drop down value in deal page")
    public void userIsAbleToSelectPaginationDropDownValueInDealPage() {
        OpportunitiesPage.selectPaginationDropDownValueInDealPage();
    }
}
