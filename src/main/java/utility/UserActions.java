package utility;

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
 //public void String eMailCapmLocat =
 public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(l));






    public static void setValue(By locator, String input)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        driver.findElement(locator).click();
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
            //System.out.println("Exception 123");
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
        //System.out.println("CURRENT URL::::>"+driver.getCurrentUrl());
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        WebElement hoverElement = driver.findElement(locator);
        builder.moveToElement(hoverElement).perform();
    }
    public static void getDropDownSelectValue(By locator, int index) {
       // wait_Sec();
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        Select dropdown = new Select(driver.findElement(locator));
        System.out.println("DROPDOWN>>>>>>>>");
        dropdown.selectByIndex(index);
    }

    public static void highLighterMethod(WebDriver driver, By  element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
    }





}
