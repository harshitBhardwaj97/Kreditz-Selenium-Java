package com.harshitbhardwaj.pages;

import com.harshitbhardwaj.WaitStrategy;
import com.harshitbhardwaj.utils.ElementsUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage {

    private final WebDriver driver;
    private final ElementsUtil elementsUtil;

    private final By contactSalesHeading = By
            .xpath("//h1[contains(., 'Contact') and contains(., 'sales')]");

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
        elementsUtil = new ElementsUtil(driver);
    }

    public boolean isContactSalesHeadingDisplayed() {
        return elementsUtil.getElementVisibility(contactSalesHeading, WaitStrategy.PRESENCE);
    }
}
