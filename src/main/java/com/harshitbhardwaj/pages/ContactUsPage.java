package com.harshitbhardwaj.pages;

import com.harshitbhardwaj.WaitStrategy;
import com.harshitbhardwaj.utils.ElementsUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage {

    private static final String ERROR_MESSAGE = "Please complete this required field.";

    private final WebDriver driver;
    private final ElementsUtil elementsUtil;

    private final By contactSalesHeading = By
            .xpath("//h1[contains(., 'Contact') and contains(., 'sales')]");
    private final By submitButton = By.xpath("//input[@value='Submit']");

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
        elementsUtil = new ElementsUtil(driver);
    }

    private By getErrorMessageLocator(String fieldName) {
        String xpath = "//div[contains(@class, 'hs_%s')]//label[normalize-space(text())='%s']";
        return By.xpath(String.format(xpath, fieldName, ERROR_MESSAGE));
    }

    public boolean isContactSalesHeadingDisplayed() {
        return elementsUtil.getElementVisibility(contactSalesHeading, WaitStrategy.PRESENCE);
    }

    public void clickSubmitButton() {
        elementsUtil.clickOnElement(submitButton, WaitStrategy.CLICKABLE);
    }

    public boolean isErrorMessageDisplayed(String fieldName) {
        return elementsUtil.getElementVisibility(getErrorMessageLocator(fieldName), WaitStrategy.PRESENCE);
    }

    public boolean isFirstNameErrorMessageIsDisplayed() {
        return isErrorMessageDisplayed("firstname");
    }

    public boolean isLastNameErrorMessageIsDisplayed() {
        return isErrorMessageDisplayed("lastname");
    }

    public boolean isEmailErrorMessageIsDisplayed() {
        return isErrorMessageDisplayed("email");
    }

    public boolean isCompanyErrorMessageIsDisplayed() {
        return isErrorMessageDisplayed("company");
    }
}
