package utility;

import base.EmailtoCampaignLocators;
import base.OpportunitiesLocators;
import base.TestSetup;
import base.VideoCampaignLocators;
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
        //.wait_Sec();
        //System.out.println("eMail Address 1"+input);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
       // System.out.println("eMail Address 2"+input);
        waitForElementVisible(locator);
        driver.findElement(locator).click();
        //System.out.println("eMail Address 3"+input);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(input);
        //driver.findElement(locator).sendKeys(keys.enter);

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
          //  System.out.println("About to zoom in");
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
            //System.out.println("About to zoom out");
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
        //System.out.println("VALUE 2");
        waitForElementVisible(closeDate);
        click(closeDate);
        //System.out.println("VALUE 3");
        //wait_Sec();wait_Sec();wait_Sec();wait_Sec();wait_Sec();
        //System.out.println("COUNT==>"+getListOfElements(dealCloseDate).stream().count());
        waitForElementVisible(dealCloseDate);
        List<WebElement> getCloseDates = getListOfElements(dealCloseDate);
        //System.out.println("CLOSE DATEEEEE---->"+getCloseDates.size());
        wait_Sec();
        //if(!getCloseDates.isEmpty()) {
        if(!getCloseDates.isEmpty()) {
            wait_Sec();
          //  System.out.println("Select CLOSE DATEEEEE---->"+getCloseDates.get(0));
            getCloseDates.get(0).click();
           // waitForElementVisible(locator);
        } else {
            By locator = OpportunitiesLocators.selectDealNextMonth;
            waitForElementVisible(locator);
            click(locator);
            List<WebElement> getCloseDates1 = getListOfElements(dealCloseDate);
            //System.out.println("Next Month CLOSE DATEEEEE---->"+getCloseDates1.size());
            wait_Sec();
            if(!getCloseDates1.isEmpty()) {
                wait_Sec();
                // System.out.println("Select CLOSE DATEEEEE---->"+getCloseDates1.get(1));
                getCloseDates1.get(0).click();
                //waitForElementVisible(locator);
            }
        }
    }

    public static void searchLeadOrDeal(By searchDeals, By clickSearchDealIcon, String searchValue) {
        //wait_Sec();wait_Sec();wait_Sec();
        System.out.println("Step 0");
        waitForElementVisible(searchDeals);
        setValue(searchDeals,searchValue);
        System.out.println("Step 1");
        wait_Sec();//wait_Sec();
        click(clickSearchDealIcon);
        System.out.println("Step 2");
    }

    public static void searchValue(By searchBox, By clickSearchIcon, String searchValue) {
        System.out.println("Search KEY==>STEP111"+searchValue+"Search Box"+searchBox);
        waitForElementVisible(searchBox);
        wait_Sec();wait_Sec();
        setValue(searchBox,searchValue);
        System.out.println("Search KEY==>STEP2");
        click(clickSearchIcon);
    }
    public static void closeSearch(By clickCloseSearchButton) {
        waitForElementVisible(clickCloseSearchButton);
        click(clickCloseSearchButton);
    }
    public static boolean isClicked(By locator)
    {
        try {
            waitForElementVisible(locator);
            click(locator);
            return true;
        } catch(Exception e){
            return false;
        }
    }

    public static void performPagination(By nextPg, By previousPg, By lastPg, By firstPg) {
        Boolean val = isElementDisplayed(nextPg);
        waitForElementVisible(nextPg);
        System.out.println("VALUE=>"+val);
        if(val) {

            System.out.println("Start");
            click(nextPg);
            System.out.println("Next");
            wait_Sec();wait_Sec();
            click(previousPg);
            System.out.println("Previous");
            wait_Sec();wait_Sec();
            click(lastPg);
            System.out.println("Last");
            wait_Sec();wait_Sec();
            click(firstPg);
            System.out.println("First");
            wait_Sec();wait_Sec();
        }
    }

    public static void selectDate(By fromDate, By selectDate, By selectPreviousMonth, int index) {
        waitForElementVisible(fromDate);
        click(fromDate);
        System.out.println("VALUE 3");
        //wait_Sec();wait_Sec();//wait_Sec();wait_Sec();wait_Sec();
        System.out.println("COUNT==>"+getListOfElements(selectDate).stream().count());
        waitForElementVisible(selectDate);
        List<WebElement> getCloseDates = getListOfElements(selectDate);
        int count = getCloseDates.size();
        System.out.println("CLOSE DATEEEEE---->"+count);
        //wait_Sec();
        if(index>0){
            index = count-1;
        }
        if(count>15 || index>0) {
            getCloseDates.get(index).click();
        } else {
            By locator = OpportunitiesLocators.selectPreviousMonth;
            waitForElementVisible(locator);
            click(locator);
            getCloseDates = getListOfElements(selectDate);
            count = getCloseDates.size();
            System.out.println("CLOSE DATEEEEE---->"+count);
            //wait_Sec();
            if(index>0){
                index = count-1;
            }
            if(!getCloseDates.isEmpty()) {
                wait_Sec();
                // System.out.println("Select CLOSE DATEEEEE---->"+getCloseDates1.get(1));
                getCloseDates.get(index).click();
                //waitForElementVisible(locator);
            }
        }

    }


    public static void sheduleDate(By sheduleLaunchTime, By sheduleDate, By sheduleTime) {
        waitForElementVisible(sheduleLaunchTime);
        System.out.println("Launch 1");
        //wait_Sec();wait_Sec();wait_Sec();wait_Sec();
        click(sheduleLaunchTime);
        waitForElementVisible(sheduleDate);
        System.out.println("Shedule Date");
        //wait_Sec();
        click(sheduleDate);
        int i=6;
        while(i>0) {
            click(sheduleTime);
            i--;
        }
        System.out.println("Launch Time");
    }

    public static void performSorting(By sortEmailTemplate) {
        waitForElementVisible(sortEmailTemplate);
        //scrolling(sortEmailTemplate);
        Select dropdown = new Select(driver.findElement(sortEmailTemplate));
        List<WebElement> drpdwn = dropdown.getOptions();
        System.out.println(drpdwn.size());
        int count = drpdwn.size();
        int i = 0;
        while(i<count) {
            System.out.println(i);wait_Sec();
            getDropDownSelectIndex(sortEmailTemplate,i);
            wait_Sec();//
            i++;
        }
    }

    public static void handlingeMailTemplateiFrame(By frameId, By saveTemplate, By closeTemplate) {
        driver.switchTo().frame(driver.findElement(frameId));
        System.out.println("Entered in to Frame");
        waitForElementVisible(saveTemplate);
        click(saveTemplate);
        System.out.println("Template Saved");
        driver.switchTo().defaultContent();
        waitForElementVisible(closeTemplate);
        wait_Sec();
        click(closeTemplate);
        System.out.println("Steplate Closed");
    }

    public static void performFilterAction(By filterIcon, By selectFolder, By filterApplyButton, By filterClearButton, String folderName) {
        click(filterIcon);
        waitForElementVisible(selectFolder);
        setValue(selectFolder,folderName);
        wait_Sec();
        driver.findElement(selectFolder).sendKeys(Keys.ENTER);
        //wait_Sec();
        click(filterApplyButton);
        //wait_Sec();
        //click(filterClearButton);
        //wait_Sec();
    }
}
