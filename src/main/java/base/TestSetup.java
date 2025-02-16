package base;

import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Properties;

public class TestSetup {
    public static Properties configProperties;
    public static Properties userInputProperties;
    public static Properties emailCampLocatorsProperties;
    public static Properties OpportunitiesProperties;
    public static ChromeOptions co;
    public static String url;
    public static WebDriver driver;
    public static Scenario scenario;
    public static String    env;
    public static Exception e;
    public static String chromeDownloadsDirectory = "config\\Downloads\\Chrome Downloads";
    public static String userName;
    public static String password;
}
