package pageObjects;

import base.TestSetup;
import org.openqa.selenium.By;
import utility.UserActions;

public class EmailToCampaignPage extends TestSetup {

    public static void mouseHoverOnCampaign() {
        UserActions.getMouserOverElement(By.xpath(emailCampLocatorsProperties.getProperty("campaignsXpath")));
    }

    public static void mouseHoverOnCreatingCampaign() {
        UserActions.getMouserOverElement(By.xpath(emailCampLocatorsProperties.getProperty("createCampaignXpath")));
        UserActions.click(By.xpath(emailCampLocatorsProperties.getProperty("createCampaignXpath")));
    }

    public static void mouseHoverOnEmailCampaign() {
        UserActions.getMouserOverElement(By.xpath(emailCampLocatorsProperties.getProperty("emailXpath")));
    }

    public static void createEmailCampaign() {
        UserActions.click(By.xpath(emailCampLocatorsProperties.getProperty("emailXpath")));
        System.out.println("");
    }

    public static void enterCampaignDetails() {
        String value = "ecampaignName"+"_"+System.currentTimeMillis();
        UserActions.setValue(By.id("campaignName"),value);
       // System.out.println("VALUE"+value);
        value = "toEmail campaign created::";
        UserActions.setValue(By.xpath(emailCampLocatorsProperties.getProperty("textAreaXpath")),value);
        //System.out.println("VALUE"+value);
        UserActions.getMouserOverElement(By.xpath(emailCampLocatorsProperties.getProperty("insertMergeTags")));
        //System.out.println("VALUE"+value);
        UserActions.click(By.xpath(emailCampLocatorsProperties.getProperty("insertMergeTags")));
        UserActions.click(By.xpath(emailCampLocatorsProperties.getProperty("fullNameXpath")));
     //   UserActions.click(By.xpath(emailCampLocatorsProperties.getProperty("closeBtnXpath")));
        value="toEmailCampaign";
        UserActions.setValue(By.xpath(emailCampLocatorsProperties.getProperty("epreheader")),value);
        UserActions.click(By.xpath(emailCampLocatorsProperties.getProperty("notifyEmailOpned")));

    }

    public static void sortTemplates() {
        UserActions.getDropDownSelectValue(By.xpath(emailCampLocatorsProperties.getProperty("dropDownTemplateSortXpath")),1);

    }

    public static void selectAnEmailTemplate() {
        UserActions.click(By.xpath(emailCampLocatorsProperties.getProperty("selectTemplate")));
    }

    public static void ManditoryFildCheck() {

    }

    public static void clickTheNextButton() {
        UserActions.click(By.xpath(emailCampLocatorsProperties.getProperty("nextButtonXpath")));
    }

    public static void sortPartnersList() {
        UserActions.getDropDownSelectValue(By.xpath(emailCampLocatorsProperties.getProperty("dropDownPartnerListSortXpath")),1);
    }

    public static void selectTheCampaignList() {
        UserActions.click(By.xpath(emailCampLocatorsProperties.getProperty("selectGroupofPartner")));
    }

    public static void clickTheLaunchRadioButton() {
        UserActions.click(By.xpath(emailCampLocatorsProperties.getProperty("launchNowXpath")));
    }

    public static void clickLaunchButton() {
        UserActions.click(By.xpath(emailCampLocatorsProperties.getProperty("launchButtonXpath")));
    }

}
