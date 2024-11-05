package com.harshitbhardwaj.tests;

import com.harshitbhardwaj.base.BaseTest;
import com.harshitbhardwaj.data.changeless.Constants;
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
    public void productUseCasesHeadingIsDisplayed() {
        Assert.assertTrue(useCasesPage.productUseCasesHeadingIsVisible());
        Assert.assertEquals(driver.get().getCurrentUrl(), Constants.getConsumerLendingLink());
    }

    @Test
    public void consumerLendingLinkWorksFine() {
        Assert.assertTrue(useCasesPage.clickOnConsumerLendingLinkAndVerifyHeading());
    }

    @Test
    public void businessLendingLinkWorksFine() {
        Assert.assertTrue(useCasesPage.clickOnBusinessLendingLinkAndVerifyHeading());
    }

    @Test
    public void moneyTransferLinkWorksFine() {
        Assert.assertTrue(useCasesPage.clickOnMoneyTransferLinkAndVerifyHeading());
    }

    @Test
    public void onlineGamblingLinkWorksFine() {
        Assert.assertTrue(useCasesPage.clickOnOnlineGamblingLinkAndVerifyHeading());
    }

    @Test
    public void auditingLinkWorksFine() {
        Assert.assertTrue(useCasesPage.clickOnAuditingLinkAndVerifyHeading());
    }

    @Test
    public void insuranceLinkWorksFine() {
        Assert.assertTrue(useCasesPage.clickOnInsuranceLinkAndVerifyHeading());
    }
}
