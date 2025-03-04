package utility;

import base.OpportunitiesLocators;
import base.TestSetup;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

public class UserActions extends TestSetup {
 public static String destDirectory = userInputProperties.getProperty("destDirectoryDownload");
 public static long l = Long.parseLong(configProperties.getProperty("ExplicitWait"));
 public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(l));






    public static void setValue(By locator, String input)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        UserActions.wait_Sec();
        System.out.println("eMail Address 1"+input);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        System.out.println("eMail Address 2"+input);
        UserActions.waitForElementVisible(locator);
        driver.findElement(locator).click();
        System.out.println("eMail Address 3"+input);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(input);
    }
    public static void click(By locator)
    {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            wait.until(ExpectedConditions.elementToBeClickable(locator));
            driver.findElement(locator).click();

        }catch (TimeoutException t){
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            driver.findElement(locator).click();
        }
    }
    public static void enterValueInTextBox(By locator, String value)
    {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            WebElement element = driver.findElement(locator);
            element.sendKeys(value);
        }catch (Exception e){
            System.out.println(e);
        }

    }
    public static String getText(By locator)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return driver.findElement(locator).getText();
    }
    public static void wait_Sec()
    {
        try{
            long time = Long.parseLong(configProperties.getProperty("wait"));
            Thread.sleep(time);
        }catch (Exception ex){
            ex.getMessage();
        }
    }
    public static void zoomIn(int zoomTimes)
    {
        try{
            Robot robot = new Robot();
            System.out.println("About to zoom in");
            for(int i = 0; i < zoomTimes;i++)
            {
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_SUBTRACT);
                robot.keyRelease(KeyEvent.VK_SUBTRACT);
                robot.keyRelease(KeyEvent.VK_CONTROL);
            }
        }catch (AWTException at){
            at.getMessage();
        }
    }
    public static void zoomOut(int zoomTimes)
    {
        try{
            Robot robot = new Robot();
            System.out.println("About to zoom out");
            for(int i = 0; i < zoomTimes;i++)
            {
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_ADD);
                robot.keyRelease(KeyEvent.VK_ADD);
                robot.keyRelease(KeyEvent.VK_CONTROL);
            }
        }catch (AWTException at){
            at.getMessage();
        }
    }

    public static void scrolling(By locator)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",driver.findElement(locator));
    }
    public static List<WebElement> getListOfElements(By locator){
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            wait.until(ExpectedConditions.elementToBeClickable(locator));
            List<WebElement>  elementList = driver.findElements(locator);
            return elementList;
        }catch (StaleElementReferenceException e){
            wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
            List<WebElement> elementList = driver.findElements(locator);
            return elementList;
        }
    }
    public static String getAttributeValuesOfList(By locator, String attributeName, int i)
    {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            wait.until(ExpectedConditions.elementToBeClickable(locator));
            String storeValue = driver.findElements(locator).get(i).getAttribute(attributeName);
            return storeValue;
        }catch (StaleElementReferenceException e){
            wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
            String storeValue = driver.findElements(locator).get(i).getAttribute(attributeName);
            return storeValue;
        }
    }
    public static void clickOnElement(By locator, int i)
    {
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            wait.until(ExpectedConditions.elementToBeClickable(locator));
            driver.findElements(locator).get(i).click();
        }catch (StaleElementReferenceException e){
            wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
            driver.findElements(locator).get(i).click();
        }catch (TimeoutException t){
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            driver.findElements(locator).get(i).click();
        }
    }
    public static String getAttributeValue(By locator, String attributeName)
    {
        WebElement element = driver.findElement(locator);
        String storeValue = element.getAttribute(attributeName);
        return storeValue;
    }
    public static void doubleClickOnElement(By locator)
    {
        try{
            Actions act = new Actions(driver);
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            WebElement elementLocator = driver.findElement(locator);
            act.doubleClick(elementLocator).perform();
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static Boolean isElementDisplayed(By locator)
    {
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            WebElement element = driver.findElement(locator);
            return element.isDisplayed();
        }catch (Exception e){
            System.out.println(e);
            return false;
        }
    }
    public static void getMouserOverElement(By locator)
    {
        Actions builder = new Actions(driver);
        //highLighterMethod(driver,locator);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        WebElement hoverElement = driver.findElement(locator);
        builder.moveToElement(hoverElement).perform();
    }
    public static void getDropDownSelectValue(By locator, String value) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        Select dropdown = new Select(driver.findElement(locator));
        dropdown.selectByValue(value);
    }

    public static void getDropDownSelectIndex(By locator, int index) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
       // System.out.println("SDSDSD");

        Select dropdown = new Select(driver.findElement(locator));
        //System.out.println("SDSDSDDGGTTR");
        dropdown.selectByIndex(index);
    }

    public static void highLighterMethod(WebDriver driver, By  element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
    }


    public static void waitForElementVisible(By locator) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            //return true;
        }catch (Exception e){
            System.out.println(e);
            //return false;
        }
    }

    public static void selectDate(By closeDate,By dealCloseDate) {
        System.out.println("VALUE 2");
        UserActions.click(closeDate);
        System.out.println("VALUE 3");
        //UserActions.wait_Sec();UserActions.wait_Sec();UserActions.wait_Sec();UserActions.wait_Sec();UserActions.wait_Sec();
        System.out.println("COUNT==>"+UserActions.getListOfElements(dealCloseDate).stream().count());

        List<WebElement> getCloseDates = UserActions.getListOfElements(dealCloseDate);
        System.out.println("CLOSE DATEEEEE---->"+getCloseDates);
        UserActions.wait_Sec();
        if(!getCloseDates.isEmpty()) {
            UserActions.wait_Sec();
           // System.out.println("Select CLOSE DATEEEEE---->"+getCloseDates.get(1));
            getCloseDates.get(0).click();
            //UserActions.waitForElementVisible(locator);
        }
        /// /////////////////////////////////////////////////////////////////////////////////

//        for (WebElement element : getCloseDates){
//            System.out.println("Element Value:::"+element.getAccessibleName());
//            System.out.println("Element Value:::"+element.toString());
//        }
//        getCloseDates.get(0).click();
    }

    public static void searchLeadOrDeal(By searchDeals, By clickSearchDealIcon, String searchValue) {
        //UserActions.wait_Sec();UserActions.wait_Sec();UserActions.wait_Sec();
        System.out.println("Step 0");
        UserActions.waitForElementVisible(searchDeals);
        UserActions.setValue(searchDeals,searchValue);
        System.out.println("Step 1");
        //UserActions.wait_Sec();UserActions.wait_Sec();
        UserActions.click(clickSearchDealIcon);
        System.out.println("Step 2");
    }

    public static void searchValue(By searchBox, By clickSearchIcon, String searchValue) {
       // System.out.println("Search KEY==>STEP111"+searchValue+"Search Box"+searchBox);
        UserActions.waitForElementVisible(searchBox);
        //UserActions.wait_Sec();
        UserActions.setValue(searchBox,searchValue);
       // System.out.println("Search KEY==>STEP2");
        UserActions.click(clickSearchIcon);
    }
    public static void closeSearch(By clickCloseSearchButton) {
        UserActions.waitForElementVisible(clickCloseSearchButton);
        UserActions.click(clickCloseSearchButton);
    }
    public static boolean isClicked(By locator)
    {
        try {
            UserActions.waitForElementVisible(locator);
            UserActions.click(locator);
            return true;
        } catch(Exception e){
            return false;
        }
    }

    public static void performPagination(By nextPg, By previousPg, By lastPg, By firstPg) {
        Boolean val = UserActions.isElementDisplayed(nextPg);
        UserActions.waitForElementVisible(nextPg);
        System.out.println("VALUE=>"+val);
        if(val) {

            System.out.println("Start");
            UserActions.click(nextPg);
            System.out.println("Next");
            UserActions.wait_Sec();UserActions.wait_Sec();
            UserActions.click(previousPg);
            System.out.println("Previous");
            UserActions.wait_Sec();UserActions.wait_Sec();
            UserActions.click(lastPg);
            System.out.println("Last");
            UserActions.wait_Sec();UserActions.wait_Sec();
            UserActions.click(firstPg);
            System.out.println("First");
           // UserActions.wait_Sec();UserActions.wait_Sec();
        }
    }
}
