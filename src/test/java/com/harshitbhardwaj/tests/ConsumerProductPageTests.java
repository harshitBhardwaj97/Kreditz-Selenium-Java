package com.harshitbhardwaj.tests;

import com.harshitbhardwaj.base.BaseTest;
import com.harshitbhardwaj.data.changeless.Constants;
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
    public void incomeVerificationLinkWorksFine() {
        consumerProductsPage.clickOnIncomeVerificationLink();
        Assert.assertTrue(consumerProductsPage.incomeVerificationHeadingIsVisible());
        Assert.assertEquals(driver.get().getCurrentUrl(), Constants.getIncomeVerificationLink());
    }

    @Test
    public void spendingBehaviorLinkWorksFine() {
        consumerProductsPage.clickOnSpendingBehaviorLink();
        Assert.assertTrue(consumerProductsPage.spendingBehaviorHeadingIsVisible());
        Assert.assertEquals(driver.get().getCurrentUrl(), Constants.getSpendingBehaviourLink());
    }

    @Test
    public void assetAccumulationLinkWorksFine() {
        consumerProductsPage.clickOnAssetAccumulationLink();
        Assert.assertTrue(consumerProductsPage.assetAccumulationHeadingIsVisible());
        Assert.assertEquals(driver.get().getCurrentUrl(), Constants.getAssetAccumulationLink());
    }

    @Test
    public void debtInvolvementLinkWorksFine() {
        consumerProductsPage.clickOnDebtInvolvementLink();
        Assert.assertTrue(consumerProductsPage.debtInvolvementHeadingIsVisible());
        Assert.assertEquals(driver.get().getCurrentUrl(), Constants.getDebtInvolvementLink());
    }

    @Test
    public void creditDecisioningLinkWorksFine() {
        consumerProductsPage.clickOnCreditDecisioningLink();
        Assert.assertTrue(consumerProductsPage.creditDecisioningHeadingIsVisible());
        Assert.assertEquals(driver.get().getCurrentUrl(), Constants.getCreditDecisioningLink());
    }

    @Test
    public void customProductsLinkWorksFine() {
        consumerProductsPage.clickOnCustomProductsLink();
        Assert.assertTrue(consumerProductsPage.customProductsHeadingIsVisible());
        Assert.assertEquals(driver.get().getCurrentUrl(), Constants.getCustomProductsLink());
    }

    @Test
    public void fraudDetectLinkWorksFine() {
        consumerProductsPage.clickOnFraudDetectLink();
        Assert.assertTrue(consumerProductsPage.fraudDetectHeadingIsVisible());
        Assert.assertEquals(driver.get().getCurrentUrl(), Constants.getFraudDetectLink());
    }

    @Test
    public void getInTouchButtonWorksFine() {
        consumerProductsPage.clickOnGetInTouchButton();
        Assert.assertEquals(driver.get().getCurrentUrl(), Constants.getContactUsLink());
    }
}
