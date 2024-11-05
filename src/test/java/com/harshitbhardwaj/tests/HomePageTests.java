package com.harshitbhardwaj.tests;

import com.harshitbhardwaj.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends BaseTest {

    @Test
    public void mainHeadingShouldBeVisible() {
        Assert.assertTrue(homePage.isMainHeadingAvailable());
    }

    @Test
    public void linkedinLinkWorksFine() {
        Assert.assertTrue(homePage.linkedinLinkWorksFine());
    }

    @Test
    public void instagramLinkWorksFine() {
        Assert.assertTrue(homePage.instagramLinkWorksFine());
    }

    @Test
    public void twitterLinkWorksFine() {
        Assert.assertTrue(homePage.twitterLinkWorksFine());
    }

    @Test
    public void productIncomeVerificationLinkWorksFine() {
        Assert.assertTrue(homePage.productsIncomeVerificationLinkWorksFine());
    }

    @Test
    public void productSpendingBehaviourLinkWorksFine() {
        Assert.assertTrue(homePage.productsSpendingBehaviourLinkWorksFine());
    }

    @Test
    public void productAssetAccumulationLinkWorksFine() {
        Assert.assertTrue(homePage.productsAssetAccumulationLinkWorksFine());
    }

    @Test
    public void productDebtInvolvementLinkWorksFine() {
        Assert.assertTrue(homePage.productsDebtInvolvementLinkWorksFine());
    }

    @Test
    public void productCreditDecisioningLinkWorksFine() {
        Assert.assertTrue(homePage.productsCreditDecisioningLinkWorksFine());
    }

    @Test
    public void productCustomProductsLinkWorksFine() {
        Assert.assertTrue(homePage.productsCustomProductsLinkWorksFine());
    }

    @Test
    public void productFraudDetectLinkWorksFine() {
        Assert.assertTrue(homePage.productsFraudDetectLinkWorksFine());
    }

    @Test
    public void corporateBusinessRevenueLinkWorksFine() {
        Assert.assertTrue(homePage.corporateBusinessRevenueLinkWorksFine());
    }

    @Test
    public void corporateBusinessSpendingLinkWorksFine() {
        Assert.assertTrue(homePage.corporateBusinessSpendingLinkWorksFine());
    }

    @Test
    public void corporateBusinessAssetsLinkWorksFine() {
        Assert.assertTrue(homePage.corporateBusinessAssetsLinkWorksFine());
    }

    @Test
    public void corporateBusinessDebtLinkWorksFine() {
        Assert.assertTrue(homePage.corporateBusinessDebtLinkWorksFine());
    }

    @Test
    public void corporateCreditDecisioningLinkWorksFine() {
        Assert.assertTrue(homePage.corporateCreditDecisioningLinkWorksFine());
    }

    @Test
    public void corporateCustomProductsLinkWorksFine() {
        Assert.assertTrue(homePage.corporateCustomProductsLinkWorksFine());
    }
}
