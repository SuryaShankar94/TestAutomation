package base;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Properties;

public class TestBase extends TestSetup{

    @BeforeAll(order = 1)
    public static void loadProperty() {

        configProperties = new Properties();
        FileInputStream f = null;
        try {
            File ff = new File(System.getProperty("user.dir") + "\\src\\Config\\PropertiesFiles\\config.properties");
            f = new FileInputStream(ff);
            configProperties.load(f);
        } catch (Exception e) {
            e.printStackTrace();

        }finally {
            try {
                f.close();
            } catch (IOException ex) {
                ExtentCucumberAdapter.addTestStepLog("WARNING. Failed to take screenshot with following exception: " + ex.getMessage());
            }
        }
    }
    @BeforeAll(order = 2)
    public static void loadInputUser() {

        userInputProperties = new Properties();
        FileInputStream input =null;
        try {
            File file = new File(System.getProperty("user.dir") + "\\src\\Config\\PropertiesFiles\\userInput.properties");
            input = new FileInputStream(file);
            userInputProperties.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                input.close();
            } catch (IOException ex) {
                ExtentCucumberAdapter.addTestStepLog("WARNING. Failed to take screenshot with following exception: " + ex.getMessage());
            }
        }
    }
    @BeforeAll (order = 3)
    public static void setWebDriver()
    {
        //System.setProperty("webdriver.chrome.driver", userInputProperties.getProperty("chromePath"));
        //String downloadFilePath = System.getProperty("user.dir")+ "\\" +chromeDownloadsDirectory;
        //System.out.println("FILE PATH:::::>"+downloadFilePath);
        HashMap<String, Object> chromePrefs = new HashMap();
        chromePrefs.put("profile.default content settings.popups", 3);
        //chromePrefs.put("download.default directory", downloadFilePath);
        co = new ChromeOptions();
        co.setExperimentalOption("prefs", chromePrefs);
        co.addArguments("--test-type");
        co.addArguments("--disable-extensions");
        co.addArguments("--disable-extensions");
        co.addArguments("--start-maximized");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(co);
    }

    @Before(order = 4)
    public void keepScenario(Scenario scenario)
    {
        TestSetup.scenario =scenario;
    }

  /*  @BeforeAll(order = 5)
    public static void loadEmailCampLocatorsProperties()
    {
        emailCampLocatorsProperties = new Properties();
        FileInputStream input = null;
        try {
            File file = new File(System.getProperty("user.dir") + "\\src\\Config\\PropertiesFiles\\emailCampLocators.properties");
            input = new FileInputStream(file);
            emailCampLocatorsProperties.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                input.close();
            } catch (IOException ex) {
                ExtentCucumberAdapter.addTestStepLog("WARNING. Failed to take screenshot with following exception: " + ex.getMessage());
            }
        }
    }*/
   /* @BeforeAll(order = 6)
    public static void loadOpportunitiesProperties()
    {
        OpportunitiesProperties = new Properties();
        FileInputStream input = null;
        try {
            File file = new File(System.getProperty("user.dir") + "\\src\\Config\\PropertiesFiles\\opportunities.properties");
            input = new FileInputStream(file);
            OpportunitiesProperties.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                input.close();
            } catch (IOException ex) {
                ExtentCucumberAdapter.addTestStepLog("WARNING. Failed to take screenshot with following exception: " + ex.getMessage());
            }
        }
    }
*/
    public String getCurrentDateAndTime()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd//MM//yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String CurrentDate = dtf.format(now);
        return CurrentDate;
    }

    @AfterStep
    public void afterScenario (Scenario scenario) {
        try {
            if (scenario.isFailed()) {
                TakesScreenshot ts = (TakesScreenshot) driver;

                byte[] src = ts.getScreenshotAs(OutputType.BYTES);

//            String fileSuffix new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(new Date());
                String scenarioName = scenario.getName() + "_Fail";
                scenario.attach(src, "image/png", getCurrentDateAndTime() + "_" + scenarioName);
            } else {
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                String scenarioName = scenario.getName() + "_Pass";
                scenario.attach(screenshot, "image/png", getCurrentDateAndTime() + "_" + scenarioName);
            }
        } catch (Exception e) {
            ExtentCucumberAdapter.addTestStepLog("WARNING. Failed to take screenshot with following exception: " + e.getMessage());
        }
    }

}
