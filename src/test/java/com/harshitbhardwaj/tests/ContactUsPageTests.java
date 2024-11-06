package com.harshitbhardwaj.tests;

import com.harshitbhardwaj.base.BaseTest;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContactUsPageTests extends BaseTest {

    @BeforeMethod
    @Override
    public void setup() {
        super.setup();
        driver.get().get("https://kreditz.com/contact-us");
    }

    @Test
    @Step("Verifying if contact us heading is visible on the Contact Us page")
    public void verifyContactUsHeadingIsVisible() {
        Assert.assertTrue(contactUsPage.isContactSalesHeadingDisplayed());
    }

    @Test
    @Step("Verifying contact form shows error messages if details are not filled")
    public void verifyErrorMessagesAreDisplayed() {
        contactUsPage.clickSubmitButton();
        Assert.assertTrue(contactUsPage.isFirstNameErrorMessageIsDisplayed());
        Assert.assertTrue(contactUsPage.isLastNameErrorMessageIsDisplayed());
        Assert.assertTrue(contactUsPage.isEmailErrorMessageIsDisplayed());
        Assert.assertTrue(contactUsPage.isCompanyErrorMessageIsDisplayed());
    }
}
