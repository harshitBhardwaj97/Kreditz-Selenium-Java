package com.harshitbhardwaj.pages;

import com.harshitbhardwaj.WaitStrategy;
import com.harshitbhardwaj.data.changeless.Constants;
import com.harshitbhardwaj.utils.ElementsUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver driver;
    private final ElementsUtil elementsUtil;

    private final By mainHeading = By.xpath("//h1[.='Intelligent credit- & risk decisions made easy']");
    private final By linkedInLink = By.cssSelector(".socialIcons ul li:nth-child(1) a");
    private final By instagramLink = By.cssSelector(".socialIcons ul li:nth-child(2) a");
    private final By twitterLink = By.cssSelector(".socialIcons ul li:nth-child(3) a");
    private final By bookADemoButton = By
            .xpath("//*[@class='contactButton']//button[.='Book a demo']");
    private final By contactSalesButton = By
            .xpath("//*[@class='contactButton']//button[.='Contact sales']");

    private final By productsLink = By.linkText("Products");
    private final By productsIncomeVerificationLink = By
            .xpath("//a[@href='/consumer-product?tab=1' and contains(., 'Income verification')]");
    private final By productsSpendingBehaviourLink = By
            .xpath("//a[@href='/consumer-product?tab=2' and contains(., 'Spending behavior')]");
    private final By productsAssetAccumulationLink = By
            .xpath("//a[@href='/consumer-product?tab=3' and contains(., 'Asset accumulation')]");
    private final By productsDebtInvolvementLink = By
            .xpath("//a[@href='/consumer-product?tab=4' and contains(., 'Debt involvement')]");
    private final By productsCreditDecisioningLink = By
            .xpath("//a[@href='/consumer-product?tab=5' and contains(., 'Credit decisioning')]");
    private final By productsCustomProductsLink = By
            .xpath("//a[@href='/consumer-product?tab=6' and contains(., 'Custom products')]");
    private final By productsFraudDetectLink = By
            .xpath("//a[@href='/consumer-product?tab=7' and contains(., 'Fraud detect')]");

    private final By corporateBusinessRevenueLink = By
            .xpath("//a[@href='/corporate-product?tab=1' and contains(., 'Business revenue')]");
    private final By corporateBusinessSpendingLink = By
            .xpath("//a[@href='/corporate-product?tab=2' and contains(., 'Business spending')]");
    private final By corporateBusinessAssetsLink = By
            .xpath("//a[@href='/corporate-product?tab=3' and contains(., 'Business assets')]");
    private final By corporateBusinessDebtLink = By
            .xpath("//a[@href='/corporate-product?tab=4' and contains(., 'Business debt')]");
    private final By corporateCreditDecisioningLink = By
            .xpath("//a[@href='/corporate-product?tab=5' and contains(., 'Credit decisioning')]");
    private final By corporateCustomProductsLink = By
            .xpath("//a[@href='/corporate-product?tab=6' and contains(., 'Custom products')]");

    private final By useCasesLink = By.linkText("Use Cases");
    private final By useCasesConsumerLendingLink = By
            .xpath("//a[@href='/use-cases#consumer-lending' and contains(., 'Consumer lending')]");
    private final By useCasesBusinessLendingLink = By
            .xpath("//a[@href='/use-cases#business-landing' and contains(., 'Business lending')]");
    private final By useCasesMoneyGamblingLink = By
            .xpath("//a[@href='/use-cases#money-transfer' and contains(., 'Money transfer')]");
    private final By useCasesOnlineGamblingLink = By
            .xpath("//a[@href='/use-cases#online-gambling' and contains(., 'Online gambling')]");
    private final By useCasesAuditingLink = By
            .xpath("//a[@href='/use-cases#auditing' and contains(., 'Auditing')]");
    private final By useCasesInsuranceLink = By
            .xpath("//a[@href='/use-cases#insurance' and contains(., 'Insurance')]");

    private final By aboutUsLink = By.linkText("About us");
    private final By aboutKreditzLink = By
            .xpath("//a[@href='/about#about-kreditz' and contains(., 'About Kreditz')]");
    private final By teamLink = By
            .xpath("//a[@href='/about#team-members' and contains(., 'The team')]");
    private final By boardMembersLink = By
            .xpath("//a[@href='/about#board-members' and contains(., 'The board')]");
    private final By investorsLink = By
            .xpath("//a[@href='/about#investors' and contains(., 'The investors')]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.elementsUtil = new ElementsUtil(driver);
    }

    public boolean isMainHeadingAvailable() {
        return elementsUtil.getElementVisibility(mainHeading, WaitStrategy.PRESENCE);
    }

    public boolean linkedinLinkWorksFine() {
        elementsUtil.clickOnElement(linkedInLink, WaitStrategy.CLICKABLE);
        elementsUtil.waitUrlToBe(Constants.getLinkedinUrl());
        return elementsUtil.getPageURL().equals(Constants.getLinkedinUrl());
    }

    public void clickOnDemo() {
        elementsUtil.clickOnElement(bookADemoButton, WaitStrategy.CLICKABLE);
    }

    public boolean instagramLinkWorksFine() {
        elementsUtil.clickOnElement(instagramLink, WaitStrategy.CLICKABLE);
        elementsUtil.waitUrlToBe(Constants.getInstagramUrl());
        return elementsUtil.getPageURL().equals(Constants.getInstagramUrl());
    }

    public boolean twitterLinkWorksFine() {
        elementsUtil.clickOnElement(twitterLink, WaitStrategy.CLICKABLE);
        elementsUtil.waitUrlToBe(Constants.getTwitterUrl());
        return elementsUtil.getPageURL().equals(Constants.getTwitterUrl());
    }

    public boolean productsIncomeVerificationLinkWorksFine() {
        elementsUtil.hoverOnElement(productsLink, WaitStrategy.PRESENCE);
        elementsUtil.clickUsingJavaScript(productsIncomeVerificationLink, WaitStrategy.PRESENCE);
        elementsUtil.waitForUrlContains(Constants.getConsumerProductLink());
        return elementsUtil.getPageURL().equals(Constants.getIncomeVerificationLink());
    }

    public boolean productsSpendingBehaviourLinkWorksFine() {
        elementsUtil.hoverOnElement(productsLink, WaitStrategy.PRESENCE);
        elementsUtil.clickUsingJavaScript(productsSpendingBehaviourLink, WaitStrategy.PRESENCE);
        elementsUtil.waitForUrlContains(Constants.getConsumerProductLink());
        return elementsUtil.getPageURL().equals(Constants.getSpendingBehaviourLink());
    }

    public boolean productsAssetAccumulationLinkWorksFine() {
        elementsUtil.hoverOnElement(productsLink, WaitStrategy.PRESENCE);
        elementsUtil.clickUsingJavaScript(productsAssetAccumulationLink, WaitStrategy.PRESENCE);
        elementsUtil.waitForUrlContains(Constants.getConsumerProductLink());
        return elementsUtil.getPageURL().equals(Constants.getAssetAccumulationLink());
    }

    public boolean productsDebtInvolvementLinkWorksFine() {
        elementsUtil.hoverOnElement(productsLink, WaitStrategy.PRESENCE);
        elementsUtil.clickUsingJavaScript(productsDebtInvolvementLink, WaitStrategy.PRESENCE);
        elementsUtil.waitForUrlContains(Constants.getConsumerProductLink());
        return elementsUtil.getPageURL().equals(Constants.getDebtInvolvementLink());
    }

    public boolean productsCreditDecisioningLinkWorksFine() {
        elementsUtil.hoverOnElement(productsLink, WaitStrategy.PRESENCE);
        elementsUtil.clickUsingJavaScript(productsCreditDecisioningLink, WaitStrategy.PRESENCE);
        elementsUtil.waitForUrlContains(Constants.getConsumerProductLink());
        return elementsUtil.getPageURL().equals(Constants.getCreditDecisioningLink());
    }

    public boolean productsCustomProductsLinkWorksFine() {
        elementsUtil.hoverOnElement(productsLink, WaitStrategy.PRESENCE);
        elementsUtil.clickUsingJavaScript(productsCustomProductsLink, WaitStrategy.PRESENCE);
        elementsUtil.waitForUrlContains(Constants.getConsumerProductLink());
        return elementsUtil.getPageURL().equals(Constants.getCustomProductsLink());
    }

    public boolean productsFraudDetectLinkWorksFine() {
        elementsUtil.hoverOnElement(productsLink, WaitStrategy.PRESENCE);
        elementsUtil.clickUsingJavaScript(productsFraudDetectLink, WaitStrategy.PRESENCE);
        elementsUtil.waitForUrlContains(Constants.getConsumerProductLink());
        return elementsUtil.getPageURL().equals(Constants.getFraudDetectLink());
    }

    public boolean corporateBusinessRevenueLinkWorksFine() {
        elementsUtil.hoverOnElement(productsLink, WaitStrategy.PRESENCE);
        elementsUtil.clickUsingJavaScript(corporateBusinessRevenueLink, WaitStrategy.PRESENCE);
        elementsUtil.waitForUrlContains(Constants.getCorporateProductLink());
        return elementsUtil.getPageURL().equals(Constants.getBusinessRevenueLink());
    }

    public boolean corporateBusinessSpendingLinkWorksFine() {
        elementsUtil.hoverOnElement(productsLink, WaitStrategy.PRESENCE);
        elementsUtil.clickUsingJavaScript(corporateBusinessSpendingLink, WaitStrategy.PRESENCE);
        elementsUtil.waitForUrlContains(Constants.getCorporateProductLink());
        return elementsUtil.getPageURL().equals(Constants.getBusinessSpendingLink());
    }

    public boolean corporateBusinessAssetsLinkWorksFine() {
        elementsUtil.hoverOnElement(productsLink, WaitStrategy.PRESENCE);
        elementsUtil.clickUsingJavaScript(corporateBusinessAssetsLink, WaitStrategy.PRESENCE);
        elementsUtil.waitForUrlContains(Constants.getCorporateProductLink());
        return elementsUtil.getPageURL().equals(Constants.getBusinessAssetsLink());
    }

    public boolean corporateBusinessDebtLinkWorksFine() {
        elementsUtil.hoverOnElement(productsLink, WaitStrategy.PRESENCE);
        elementsUtil.clickUsingJavaScript(corporateBusinessDebtLink, WaitStrategy.PRESENCE);
        elementsUtil.waitForUrlContains(Constants.getCorporateProductLink());
        return elementsUtil.getPageURL().equals(Constants.getBusinessDebtLink());
    }

    public boolean corporateCreditDecisioningLinkWorksFine() {
        elementsUtil.hoverOnElement(productsLink, WaitStrategy.PRESENCE);
        elementsUtil.clickUsingJavaScript(corporateCreditDecisioningLink, WaitStrategy.PRESENCE);
        elementsUtil.waitForUrlContains(Constants.getCorporateProductLink());
        return elementsUtil.getPageURL().equals(Constants.getCorporateCreditDecisioningLink());
    }

    public boolean corporateCustomProductsLinkWorksFine() {
        elementsUtil.hoverOnElement(productsLink, WaitStrategy.PRESENCE);
        elementsUtil.clickUsingJavaScript(corporateCustomProductsLink, WaitStrategy.PRESENCE);
        elementsUtil.waitForUrlContains(Constants.getCorporateProductLink());
        return elementsUtil.getPageURL().equals(Constants.getCorporateCustomProductsLink());
    }

    public boolean useCasesConsumerLendingLinkWorksFine() {
        elementsUtil.hoverOnElement(useCasesLink, WaitStrategy.PRESENCE);
        elementsUtil.clickUsingJavaScript(useCasesConsumerLendingLink, WaitStrategy.PRESENCE);
        elementsUtil.waitForUrlContains(Constants.getUseCasesLink());
        return elementsUtil.getPageURL().equals(Constants.getConsumerLendingLink());
    }

    public boolean useCasesBusinessLendingLinkWorksFine() {
        elementsUtil.hoverOnElement(useCasesLink, WaitStrategy.PRESENCE);
        elementsUtil.clickUsingJavaScript(useCasesBusinessLendingLink, WaitStrategy.PRESENCE);
        elementsUtil.waitForUrlContains(Constants.getUseCasesLink());
        return elementsUtil.getPageURL().equals(Constants.getBusinessLendingLink());
    }

    public boolean useCasesMoneyGamblingLinkWorksFine() {
        elementsUtil.hoverOnElement(useCasesLink, WaitStrategy.PRESENCE);
        elementsUtil.clickUsingJavaScript(useCasesMoneyGamblingLink, WaitStrategy.PRESENCE);
        elementsUtil.waitForUrlContains(Constants.getUseCasesLink());
        return elementsUtil.getPageURL().equals(Constants.getMoneyGamblingLink());
    }

    public boolean useCasesOnlineGamblingLinkWorksFine() {
        elementsUtil.hoverOnElement(useCasesLink, WaitStrategy.PRESENCE);
        elementsUtil.clickUsingJavaScript(useCasesOnlineGamblingLink, WaitStrategy.PRESENCE);
        elementsUtil.waitForUrlContains(Constants.getUseCasesLink());
        return elementsUtil.getPageURL().equals(Constants.getOnlineGamblingLink());
    }

    public boolean useCasesAuditingLinkWorksFine() {
        elementsUtil.hoverOnElement(useCasesLink, WaitStrategy.PRESENCE);
        elementsUtil.clickUsingJavaScript(useCasesAuditingLink, WaitStrategy.PRESENCE);
        elementsUtil.waitForUrlContains(Constants.getUseCasesLink());
        return elementsUtil.getPageURL().equals(Constants.getAuditingLink());
    }

    public boolean useCasesInsuranceLinkWorksFine() {
        elementsUtil.hoverOnElement(useCasesLink, WaitStrategy.PRESENCE);
        elementsUtil.clickUsingJavaScript(useCasesInsuranceLink, WaitStrategy.PRESENCE);
        elementsUtil.waitForUrlContains(Constants.getUseCasesLink());
        return elementsUtil.getPageURL().equals(Constants.getInsuranceLink());
    }

    public boolean aboutKreditzLinkWorksFine() {
        elementsUtil.hoverOnElement(aboutUsLink, WaitStrategy.PRESENCE);
        elementsUtil.clickUsingJavaScript(aboutKreditzLink, WaitStrategy.PRESENCE);
        elementsUtil.waitForUrlContains(Constants.getAboutKreditzLink());
        return elementsUtil.getPageURL().equals(Constants.getAboutKreditzLink());
    }

    public boolean teamLinkWorksFine() {
        elementsUtil.hoverOnElement(aboutUsLink, WaitStrategy.PRESENCE);
        elementsUtil.clickUsingJavaScript(teamLink, WaitStrategy.PRESENCE);
        elementsUtil.waitForUrlContains(Constants.getAboutUsLink());
        return elementsUtil.getPageURL().equals(Constants.getTeamLink());
    }

    public boolean boardMembersLinkWorksFine() {
        elementsUtil.hoverOnElement(aboutUsLink, WaitStrategy.PRESENCE);
        elementsUtil.clickUsingJavaScript(boardMembersLink, WaitStrategy.PRESENCE);
        elementsUtil.waitForUrlContains(Constants.getAboutUsLink());
        return elementsUtil.getPageURL().equals(Constants.getBoardMembersLink());
    }

    public boolean investorsLinkWorksFine() {
        elementsUtil.hoverOnElement(aboutUsLink, WaitStrategy.PRESENCE);
        elementsUtil.clickUsingJavaScript(investorsLink, WaitStrategy.PRESENCE);
        elementsUtil.waitForUrlContains(Constants.getAboutUsLink());
        return elementsUtil.getPageURL().equals(Constants.getInvestorsLink());
    }
}
