package com.harshitbhardwaj.pages;

import com.harshitbhardwaj.WaitStrategy;
import com.harshitbhardwaj.utils.ElementsUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UseCasesPage {

    private final WebDriver driver;
    private final ElementsUtil elementsUtil;

    private final By productUseCasesHeading = By.xpath("//h1[.='Product use cases']");

    private final By consumerLendingLink = By.xpath("//h4[.='Consumer Lending']");
    private final By consumerLendingParagraph = By
            .xpath("//p[contains(text(), 'Verify current income, spending, assets & debts')]");

    private final By businessLendingLink = By.xpath("//h4[.='Business Lending']");
    private final By businessLendingParagraph = By
            .xpath("//p[contains(text(), 'Gain full insight of incoming & outgoing payments')]");

    private final By moneyTransferLink = By.xpath("//h4[.='Money transfer']");
    private final By moneyTransferParagraph = By
            .xpath("//p[contains(text(), 'KYC & AML assessments have never been easier than now')]");

    private final By onlineGamblingLink = By.xpath("//h4[.='Online gambling']");
    private final By onlineGamblingParagraph = By
            .xpath("//p[contains(text(), 'Get to know the source of income')]");

    private final By auditingLink = By.xpath("//h4[.='Auditing']");
    private final By auditingParagraph = By
            .xpath("//p[contains(text(), 'Corporate governance will be done more efficiently')]");

    private final By insuranceLink = By.xpath("//h4[.='Insurance']");
    private final By insuranceParagraph = By
            .xpath("//p[contains(text(), 'Take your proof-of-purchase and claims settlement')]");

    public UseCasesPage(WebDriver driver) {
        this.driver = driver;
        this.elementsUtil = new ElementsUtil(driver);
    }

    public boolean productUseCasesHeadingIsVisible() {
        return elementsUtil.getElementVisibility(productUseCasesHeading, WaitStrategy.PRESENCE);
    }

    public boolean clickOnConsumerLendingLinkAndVerifyHeading() {
        elementsUtil.clickOnElement(consumerLendingLink, WaitStrategy.CLICKABLE);
        return elementsUtil.getElementVisibility(consumerLendingParagraph, WaitStrategy.VISIBLE);
    }

    public boolean clickOnBusinessLendingLinkAndVerifyHeading() {
        elementsUtil.clickOnElement(businessLendingLink, WaitStrategy.CLICKABLE);
        return elementsUtil.getElementVisibility(businessLendingParagraph, WaitStrategy.VISIBLE);
    }

    public boolean clickOnMoneyTransferLinkAndVerifyHeading() {
        elementsUtil.clickOnElement(moneyTransferLink, WaitStrategy.CLICKABLE);
        return elementsUtil.getElementVisibility(moneyTransferParagraph, WaitStrategy.VISIBLE);
    }

    public boolean clickOnOnlineGamblingLinkAndVerifyHeading() {
        elementsUtil.clickOnElement(onlineGamblingLink, WaitStrategy.CLICKABLE);
        return elementsUtil.getElementVisibility(onlineGamblingParagraph, WaitStrategy.VISIBLE);
    }

    public boolean clickOnAuditingLinkAndVerifyHeading() {
        elementsUtil.clickOnElement(auditingLink, WaitStrategy.CLICKABLE);
        return elementsUtil.getElementVisibility(auditingParagraph, WaitStrategy.VISIBLE);
    }

    public boolean clickOnInsuranceLinkAndVerifyHeading() {
        elementsUtil.clickOnElement(insuranceLink, WaitStrategy.CLICKABLE);
        return elementsUtil.getElementVisibility(insuranceParagraph, WaitStrategy.VISIBLE);
    }
}
