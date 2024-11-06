package com.harshitbhardwaj.tests;

import com.harshitbhardwaj.base.BaseTest;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AboutUsPageTests extends BaseTest {

    @BeforeMethod
    @Override
    public void setup() {
        super.setup();
        driver.get().get("https://kreditz.com/about");
    }

    @Test
    @Step("Verifying if the mission statement heading is visible on the About Us page")
    public void verifyMissionStatementHeadingIsVisible() {
        Assert.assertTrue(aboutUsPage.isMissionStatementHeadingVisible());
    }

    @Test
    @Step("Verifying if the staff members heading is visible on the About Us page")
    public void verifyStaffMembersHeadingIsVisible() {
        Assert.assertTrue(aboutUsPage.isStaffMembersHeadingVisible());
    }

    @Test
    @Step("Verifying if the board members heading is visible on the About Us page")
    public void verifyBoardMembersHeadingIsVisible() {
        Assert.assertTrue(aboutUsPage.isBoardMembersHeadingVisible());
    }

    @Test
    @Step("Verifying if the investors heading is visible on the About Us page")
    public void verifyInvestorsHeadingIsVisible() {
        Assert.assertTrue(aboutUsPage.isInvestorsHeadingVisible());
    }
}
