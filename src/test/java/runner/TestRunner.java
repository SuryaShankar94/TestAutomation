package runner;


import base.TestSetup;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)

@CucumberOptions(
        //features = {"src\\Feature\\EmailToCampaign.feature","src\\Feature\\VideoToCampaign.feature"},
        features = "src\\Feature\\",
        glue = {"stepDefinition", "base"},
        monochrome = true,

        plugin = {"html:target/Latest_Result_Report/Application_UI.html","pretty",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        dryRun = false,
        //tags = "@Functional",
        tags = "@Test_OpportunitiesManageLeads"
        //tags = "@Test_VideotoCampaign"
        //tags = "@Test_EmailToCampaign or @SaveEmailCampaign or @ScheduleEmailCampaign"
        //tags = "@Test_EmailToCampaign"

)



public class TestRunner extends TestSetup {
}
