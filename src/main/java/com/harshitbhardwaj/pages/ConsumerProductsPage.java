package com.harshitbhardwaj.pages;

import com.harshitbhardwaj.WaitStrategy;
import com.harshitbhardwaj.data.changeless.Constants;
import com.harshitbhardwaj.utils.ElementsUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConsumerProductsPage {

    private final WebDriver driver;
    private final ElementsUtil elementsUtil;

    private final By getInTouchButton = By.xpath("//button[.='Get in touch']");

    private final By incomeVerificationHeading = By
            .xpath("//h1[contains(., 'Income') and contains(., 'verification')]");
    private final By spendingBehaviorHeading = By
            .xpath("//h1[contains(., 'Spending') and contains(., 'behavior')]");
    private final By assetAccumulationHeading = By
            .xpath("//h1[contains(., 'Asset') and contains(., 'accumulation')]");
    private final By debtInvolvementHeading = By
            .xpath("//h1[contains(., 'Debt') and contains(., 'involvement')]");
    private final By creditDecisioningHeading = By
            .xpath("//h1[contains(., 'Credit') and contains(., 'decisioning')]");
    private final By customProductsHeading = By
            .xpath("//h1[contains(., 'Custom') and contains(., 'products')]");
    private final By fraudDetectHeading = By
            .xpath("//h1[contains(., 'Fraud') and contains(., 'Detect')]");

    private final By incomeVerificationLink = By.linkText("Income verification");
    private final By spendingBehaviorLink = By.linkText("Spending behavior");
    private final By assetAccumulationLink = By.linkText("Asset accumulation");
    private final By debtInvolvementLink = By.linkText("Debt involvement");
    private final By creditDecisioningLink = By.linkText("Credit decisioning");
    private final By customProductsLink = By.linkText("Custom products");
    private final By fraudDetectLink = By.linkText("Fraud detect");

    public ConsumerProductsPage(WebDriver driver) {
        this.driver = driver;
        this.elementsUtil = new ElementsUtil(driver);
    }

    public boolean incomeVerificationHeadingIsVisible() {
        return elementsUtil.getElementVisibility(incomeVerificationHeading, WaitStrategy.PRESENCE);
    }

    public boolean spendingBehaviorHeadingIsVisible() {
        return elementsUtil.getElementVisibility(spendingBehaviorHeading, WaitStrategy.PRESENCE);
    }

    public boolean assetAccumulationHeadingIsVisible() {
        return elementsUtil.getElementVisibility(assetAccumulationHeading, WaitStrategy.PRESENCE);
    }

    public boolean debtInvolvementHeadingIsVisible() {
        return elementsUtil.getElementVisibility(debtInvolvementHeading, WaitStrategy.PRESENCE);
    }

    public boolean creditDecisioningHeadingIsVisible() {
        return elementsUtil.getElementVisibility(creditDecisioningHeading, WaitStrategy.PRESENCE);
    }

    public boolean customProductsHeadingIsVisible() {
        return elementsUtil.getElementVisibility(customProductsHeading, WaitStrategy.PRESENCE);
    }

    public boolean fraudDetectHeadingIsVisible() {
        return elementsUtil.getElementVisibility(fraudDetectHeading, WaitStrategy.PRESENCE);
    }

    public void clickOnIncomeVerificationLink() {
        elementsUtil.clickOnElement(incomeVerificationLink, WaitStrategy.CLICKABLE);
    }

    public void clickOnSpendingBehaviorLink() {
        elementsUtil.clickOnElement(spendingBehaviorLink, WaitStrategy.CLICKABLE);
    }

    public void clickOnAssetAccumulationLink() {
        elementsUtil.clickOnElement(assetAccumulationLink, WaitStrategy.CLICKABLE);
    }

    public void clickOnDebtInvolvementLink() {
        elementsUtil.clickOnElement(debtInvolvementLink, WaitStrategy.CLICKABLE);
    }

    public void clickOnCreditDecisioningLink() {
        elementsUtil.clickOnElement(creditDecisioningLink, WaitStrategy.CLICKABLE);
    }

    public void clickOnCustomProductsLink() {
        elementsUtil.clickOnElement(customProductsLink, WaitStrategy.CLICKABLE);
    }

    public void clickOnFraudDetectLink() {
        elementsUtil.clickOnElement(fraudDetectLink, WaitStrategy.CLICKABLE);
    }

    public void clickOnGetInTouchButton() {
        elementsUtil.clickOnElement(getInTouchButton, WaitStrategy.CLICKABLE);
        elementsUtil.waitUrlToBe(Constants.getContactUsLink());
    }
}
