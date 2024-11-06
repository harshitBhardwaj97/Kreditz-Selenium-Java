package com.harshitbhardwaj.tests;

import com.harshitbhardwaj.base.BaseTest;
import com.harshitbhardwaj.data.changeless.Constants;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UseCasesPageTests extends BaseTest {

    @BeforeMethod
    @Override
    public void setup() {
        super.setup();
        driver.get().get("https://www.kreditz.com/use-cases#consumer-lending");
    }

    @Test
    @Step("Verify that the 'Product Use Cases' heading is visible")
    public void productUseCasesHeadingIsDisplayed() {
        Assert.assertTrue(useCasesPage.productUseCasesHeadingIsVisible());
        Assert.assertEquals(driver.get().getCurrentUrl(), Constants.getConsumerLendingLink());
    }

    @Test
    @Step("Verify that the Consumer Lending link works correctly")
    public void consumerLendingLinkWorksFine() {
        Assert.assertTrue(useCasesPage.clickOnConsumerLendingLinkAndVerifyHeading());
    }

    @Test
    @Step("Verify that the Business Lending link works correctly")
    public void businessLendingLinkWorksFine() {
        Assert.assertTrue(useCasesPage.clickOnBusinessLendingLinkAndVerifyHeading());
    }

    @Test
    @Step("Verify that the Money Transfer link works correctly")
    public void moneyTransferLinkWorksFine() {
        Assert.assertTrue(useCasesPage.clickOnMoneyTransferLinkAndVerifyHeading());
    }

    @Test
    @Step("Verify that the Online Gambling link works correctly")
    public void onlineGamblingLinkWorksFine() {
        Assert.assertTrue(useCasesPage.clickOnOnlineGamblingLinkAndVerifyHeading());
    }

    @Test
    @Step("Verify that the Auditing link works correctly")
    public void auditingLinkWorksFine() {
        Assert.assertTrue(useCasesPage.clickOnAuditingLinkAndVerifyHeading());
    }

    @Test
    @Step("Verify that the Insurance link works correctly")
    public void insuranceLinkWorksFine() {
        Assert.assertTrue(useCasesPage.clickOnInsuranceLinkAndVerifyHeading());
    }
}
