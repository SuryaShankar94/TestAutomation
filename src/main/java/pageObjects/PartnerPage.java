package pageObjects;

import org.openqa.selenium.By;
import utility.UserActions;

public class PartnerPage {

    public static final By  partnerPath = By.xpath("//a[contains(@href,'javascript')]//span[contains(text(),'Partner')]");
    public static final By  onboardingPartnerPath = By.xpath("//*[starts-with(text(),'Onboarding Partner')]");
    public static final By  managePartnerPath = By.xpath("//*[starts-with(text(),'Manage Partner')]");


    public static void userMouseOverOnPartner()
    {
        UserActions.getMouserOverElement(partnerPath);
    }

    public static void userMouseOverOnboardingPartner()
    {
        UserActions.getMouserOverElement(onboardingPartnerPath);
        UserActions.click(onboardingPartnerPath);
    }

    public static void userMouseOverManagePartner()
    {
        UserActions.getMouserOverElement(managePartnerPath);
        UserActions.click(managePartnerPath);
        //System.out.println("Jai MAtha Om namasiva yaa");
    }
}
