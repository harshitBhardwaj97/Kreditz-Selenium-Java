package com.harshitbhardwaj.utils;

import com.harshitbhardwaj.WaitStrategy;
import com.harshitbhardwaj.data.changeless.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementsUtil {

    private final WebDriver driver;

    public ElementsUtil(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public String getPageURL() {
        return driver.getCurrentUrl();
    }

    public String getElementAttributeValue(By locator, String attribute) {
        return driver.findElement(locator).getAttribute(attribute);
    }

    public void elementSendKeys(By locator, String value, WaitStrategy waitStrategy) {
        waitForElement(locator, waitStrategy).sendKeys(value);
    }

    public String getElementText(By locator, WaitStrategy waitStrategy) {
        return waitForElement(locator, waitStrategy).getText();
    }

    public void clickOnElement(By locator, WaitStrategy waitStrategy) {
        try {
            WebElement element = waitForElement(locator, waitStrategy);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            element.click();
        } catch (Exception e) {
            new Actions(driver).moveToElement(driver.findElement(locator)).click().perform();
        }
    }

    public void clickUsingJavaScript(By locator, WaitStrategy waitStrategy) {
        WebElement element = waitForElement(locator, waitStrategy);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }


    public void hoverOnElement(By locator, WaitStrategy waitStrategy) {
        WebElement element = waitForElement(locator, waitStrategy);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    public void waitUrlToBe(String url) {
        new WebDriverWait(driver, Duration.ofSeconds(Constants.getExplicitWaitLong()))
                .until(ExpectedConditions.urlToBe(url));
    }

    public void waitForUrlContains(String partialUrl) {
        new WebDriverWait(driver, Duration.ofSeconds(Constants.getExplicitWaitLong()))
                .until(ExpectedConditions.urlContains(partialUrl));
    }

    public boolean getElementVisibility(By locator, WaitStrategy waitStrategy) {
        WebElement element = waitForElement(locator, waitStrategy);
        return element.isDisplayed();
    }

    public WebElement waitForElement(By locator, WaitStrategy waitStrategy) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.getExplicitWaitLong()));
        return switch (waitStrategy) {
            case PRESENCE -> wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            case CLICKABLE -> wait.until(ExpectedConditions.elementToBeClickable(locator));
            default -> throw new UnsupportedOperationException("Unsupported wait strategy");
        };
    }
}
