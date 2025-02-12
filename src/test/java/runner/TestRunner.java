package runner;


import base.TestSetup;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)

@CucumberOptions(
        features = ("src\\Feature"),
        glue = {"stepDefinition", "base"},
        monochrome = true,

        plugin = {"html:target/Latest_Result_Report/Application_UI.html","pretty",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        dryRun = false,
        //tags = "@Test_OpportunitiesManageLeads"
        tags="@Test_OpportunitiesLeadsActions"
       // tags = "@Test_EmailToCamp001"
)



public class TestRunner extends TestSetup {
}
