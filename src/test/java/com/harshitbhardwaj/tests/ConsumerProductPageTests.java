package com.harshitbhardwaj.tests;

import com.harshitbhardwaj.base.BaseTest;
import com.harshitbhardwaj.data.changeless.Constants;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ConsumerProductPageTests extends BaseTest {

    @BeforeMethod
    @Override
    public void setup() {
        super.setup();
        driver.get().get("https://www.kreditz.com/consumer-product?tab=1");
    }

    @Test
    @Step("Verify that the Income Verification link works correctly")
    public void incomeVerificationLinkWorksFine() {
        consumerProductsPage.clickOnIncomeVerificationLink();
        Assert.assertTrue(consumerProductsPage.incomeVerificationHeadingIsVisible());
        Assert.assertEquals(driver.get().getCurrentUrl(), Constants.getIncomeVerificationLink());
    }

    @Test
    @Step("Verify that the Spending Behavior link works correctly")
    public void spendingBehaviorLinkWorksFine() {
        consumerProductsPage.clickOnSpendingBehaviorLink();
        Assert.assertTrue(consumerProductsPage.spendingBehaviorHeadingIsVisible());
        Assert.assertEquals(driver.get().getCurrentUrl(), Constants.getSpendingBehaviourLink());
    }

    @Test
    @Step("Verify that the Asset Accumulation link works correctly")
    public void assetAccumulationLinkWorksFine() {
        consumerProductsPage.clickOnAssetAccumulationLink();
        Assert.assertTrue(consumerProductsPage.assetAccumulationHeadingIsVisible());
        Assert.assertEquals(driver.get().getCurrentUrl(), Constants.getAssetAccumulationLink());
    }

    @Test
    @Step("Verify that the Debt Involvement link works correctly")
    public void debtInvolvementLinkWorksFine() {
        consumerProductsPage.clickOnDebtInvolvementLink();
        Assert.assertTrue(consumerProductsPage.debtInvolvementHeadingIsVisible());
        Assert.assertEquals(driver.get().getCurrentUrl(), Constants.getDebtInvolvementLink());
    }

    @Test
    @Step("Verify that the Credit Decisioning link works correctly")
    public void creditDecisioningLinkWorksFine() {
        consumerProductsPage.clickOnCreditDecisioningLink();
        Assert.assertTrue(consumerProductsPage.creditDecisioningHeadingIsVisible());
        Assert.assertEquals(driver.get().getCurrentUrl(), Constants.getCreditDecisioningLink());
    }

    @Test
    @Step("Verify that the Custom Products link works correctly")
    public void customProductsLinkWorksFine() {
        consumerProductsPage.clickOnCustomProductsLink();
        Assert.assertTrue(consumerProductsPage.customProductsHeadingIsVisible());
        Assert.assertEquals(driver.get().getCurrentUrl(), Constants.getCustomProductsLink());
    }

    @Test
    @Step("Verify that the Fraud Detect link works correctly")
    public void fraudDetectLinkWorksFine() {
        consumerProductsPage.clickOnFraudDetectLink();
        Assert.assertTrue(consumerProductsPage.fraudDetectHeadingIsVisible());
        Assert.assertEquals(driver.get().getCurrentUrl(), Constants.getFraudDetectLink());
    }

    @Test
    @Step("Verify that the 'Get in Touch' button works correctly")
    public void getInTouchButtonWorksFine() {
        consumerProductsPage.clickOnGetInTouchButton();
        Assert.assertEquals(driver.get().getCurrentUrl(), Constants.getContactUsLink());
    }
}
