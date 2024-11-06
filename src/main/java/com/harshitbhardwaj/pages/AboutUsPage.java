package com.harshitbhardwaj.pages;

import com.harshitbhardwaj.WaitStrategy;
import com.harshitbhardwaj.utils.ElementsUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutUsPage {

    private final WebDriver driver;
    private final ElementsUtil elementsUtil;

    private final By missionStatementHeading = By
            .xpath("//h1[contains(text(),'Our mission statement')]");
    private final By staffMembersHeading = By
            .xpath("//p[.='Staff members']");
    private final By boardMembersHeading = By
            .xpath("//p[.='Board members']");
    private final By investorsHeading = By
            .xpath("//p[.='Some of our investors']");

    public AboutUsPage(WebDriver driver) {
        this.driver = driver;
        elementsUtil = new ElementsUtil(driver);
    }

    public boolean isMissionStatementHeadingVisible() {
        return elementsUtil.getElementVisibility(missionStatementHeading, WaitStrategy.PRESENCE);
    }

    public boolean isStaffMembersHeadingVisible() {
        return elementsUtil.getElementVisibility(staffMembersHeading, WaitStrategy.PRESENCE);
    }

    public boolean isBoardMembersHeadingVisible() {
        return elementsUtil.getElementVisibility(boardMembersHeading, WaitStrategy.PRESENCE);
    }

    public boolean isInvestorsHeadingVisible() {
        return elementsUtil.getElementVisibility(investorsHeading, WaitStrategy.PRESENCE);
    }
}
