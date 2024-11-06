package com.harshitbhardwaj.tests;

import com.harshitbhardwaj.base.BaseTest;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends BaseTest {

    @Test
    @Step("Verify that the main heading is visible on the home page")
    public void mainHeadingShouldBeVisible() {
        Assert.assertTrue(homePage.isMainHeadingAvailable());
    }

    @Test
    @Step("Verify that the LinkedIn link works correctly")
    public void linkedinLinkWorksFine() {
        Assert.assertTrue(homePage.linkedinLinkWorksFine());
    }

    @Test
    @Step("Verify that the Instagram link works correctly")
    public void instagramLinkWorksFine() {
        Assert.assertTrue(homePage.instagramLinkWorksFine());
    }

    @Test
    @Step("Verify that the Twitter link works correctly")
    public void twitterLinkWorksFine() {
        Assert.assertTrue(homePage.twitterLinkWorksFine());
    }

    @Test
    @Step("Verify that the Product Income Verification link works correctly")
    public void productIncomeVerificationLinkWorksFine() {
        Assert.assertTrue(homePage.productsIncomeVerificationLinkWorksFine());
    }

    @Test
    @Step("Verify that the Product Spending Behaviour link works correctly")
    public void productSpendingBehaviourLinkWorksFine() {
        Assert.assertTrue(homePage.productsSpendingBehaviourLinkWorksFine());
    }

    @Test
    @Step("Verify that the Product Asset Accumulation link works correctly")
    public void productAssetAccumulationLinkWorksFine() {
        Assert.assertTrue(homePage.productsAssetAccumulationLinkWorksFine());
    }

    @Test
    @Step("Verify that the Product Debt Involvement link works correctly")
    public void productDebtInvolvementLinkWorksFine() {
        Assert.assertTrue(homePage.productsDebtInvolvementLinkWorksFine());
    }

    @Test
    @Step("Verify that the Product Credit Decisioning link works correctly")
    public void productCreditDecisioningLinkWorksFine() {
        Assert.assertTrue(homePage.productsCreditDecisioningLinkWorksFine());
    }

    @Test
    @Step("Verify that the Product Custom Products link works correctly")
    public void productCustomProductsLinkWorksFine() {
        Assert.assertTrue(homePage.productsCustomProductsLinkWorksFine());
    }

    @Test
    @Step("Verify that the Product Fraud Detect link works correctly")
    public void productFraudDetectLinkWorksFine() {
        Assert.assertTrue(homePage.productsFraudDetectLinkWorksFine());
    }

    @Test
    @Step("Verify that the Corporate Business Revenue link works correctly")
    public void corporateBusinessRevenueLinkWorksFine() {
        Assert.assertTrue(homePage.corporateBusinessRevenueLinkWorksFine());
    }

    @Test
    @Step("Verify that the Corporate Business Spending link works correctly")
    public void corporateBusinessSpendingLinkWorksFine() {
        Assert.assertTrue(homePage.corporateBusinessSpendingLinkWorksFine());
    }

    @Test
    @Step("Verify that the Corporate Business Assets link works correctly")
    public void corporateBusinessAssetsLinkWorksFine() {
        Assert.assertTrue(homePage.corporateBusinessAssetsLinkWorksFine());
    }

    @Test
    @Step("Verify that the Corporate Business Debt link works correctly")
    public void corporateBusinessDebtLinkWorksFine() {
        Assert.assertTrue(homePage.corporateBusinessDebtLinkWorksFine());
    }

    @Test
    @Step("Verify that the Corporate Credit Decisioning link works correctly")
    public void corporateCreditDecisioningLinkWorksFine() {
        Assert.assertTrue(homePage.corporateCreditDecisioningLinkWorksFine());
    }

    @Test
    @Step("Verify that the Corporate Custom Products link works correctly")
    public void corporateCustomProductsLinkWorksFine() {
        Assert.assertTrue(homePage.corporateCustomProductsLinkWorksFine());
    }

    @Test
    @Step("Verify that the Use Cases Consumer Lending link works correctly")
    public void useCasesConsumerLendingLinkWorksFine() {
        Assert.assertTrue(homePage.useCasesConsumerLendingLinkWorksFine());
    }

    @Test
    @Step("Verify that the Use Cases Business Lending link works correctly")
    public void useCasesBusinessLendingLinkWorksFine() {
        Assert.assertTrue(homePage.useCasesBusinessLendingLinkWorksFine());
    }

    @Test
    @Step("Verify that the Use Cases Money Gambling link works correctly")
    public void useCasesMoneyGamblingLinkWorksFine() {
        Assert.assertTrue(homePage.useCasesMoneyGamblingLinkWorksFine());
    }

    @Test
    @Step("Verify that the Use Cases Online Gambling link works correctly")
    public void useCasesOnlineGamblingLinkWorksFine() {
        Assert.assertTrue(homePage.useCasesOnlineGamblingLinkWorksFine());
    }

    @Test
    @Step("Verify that the Use Cases Auditing link works correctly")
    public void useCasesAuditingLinkWorksFine() {
        Assert.assertTrue(homePage.useCasesAuditingLinkWorksFine());
    }

    @Test
    @Step("Verify that the Use Cases Insurance link works correctly")
    public void useCasesInsuranceLinkWorksFine() {
        Assert.assertTrue(homePage.useCasesInsuranceLinkWorksFine());
    }

    @Test
    @Step("Verify that the About Kreditz link works correctly")
    public void aboutKreditzLinkWorksFine() {
        Assert.assertTrue(homePage.aboutKreditzLinkWorksFine());
    }

    @Test
    @Step("Verify that the Team link works correctly")
    public void teamLinkWorksFine() {
        Assert.assertTrue(homePage.teamLinkWorksFine());
    }

    @Test
    @Step("Verify that the Board Members link works correctly")
    public void boardMembersLinkWorksFine() {
        Assert.assertTrue(homePage.boardMembersLinkWorksFine());
    }

    @Test
    @Step("Verify that the Investors link works correctly")
    public void investorsLinkWorksFine() {
        Assert.assertTrue(homePage.investorsLinkWorksFine());
    }

    @Test
    @Step("Verify that the Careers link works correctly")
    public void careersLinkWorksFine() {
        Assert.assertTrue(homePage.careersLinkWorksFine());
    }
}
