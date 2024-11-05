package com.harshitbhardwaj.data.changeless;

public class Constants {

    private static final String BASE_URL = "https://www.kreditz.com/";
    private static final int EXPLICIT_WAIT_SHORT = 10;
    private static final int EXPLICIT_WAIT_LONG = 20;
    private static final String LINKEDIN_URL = "https://www.linkedin.com/company/kreditz/";
    private static final String INSTAGRAM_URL = "https://www.instagram.com/getkreditz/";
    private static final String TWITTER_URL = "https://x.com/getkreditz";
    private static final String CONTACT_US_LINK = BASE_URL + "contact-us";
    private static final String BOOKINGS_LINK = BASE_URL + "bookings";

    /*
    CONSUMER-PRODUCT PAGE LINKS
    */
    private static final String CONSUMER_PRODUCT_LINK = BASE_URL + "consumer-product";
    private static final String INCOME_VERIFICATION_LINK = CONSUMER_PRODUCT_LINK + "?tab=1";
    private static final String SPENDING_BEHAVIOUR_LINK = CONSUMER_PRODUCT_LINK + "?tab=2";
    private static final String ASSET_ACCUMULATION_LINK = CONSUMER_PRODUCT_LINK + "?tab=3";
    private static final String DEBT_INVOLVEMENT_LINK = CONSUMER_PRODUCT_LINK + "?tab=4";
    private static final String CREDIT_DECISIONING_LINK = CONSUMER_PRODUCT_LINK + "?tab=5";
    private static final String CUSTOM_PRODUCTS_LINK = CONSUMER_PRODUCT_LINK + "?tab=6";
    private static final String FRAUD_DETECT_LINK = CONSUMER_PRODUCT_LINK + "?tab=7";

    /*
    CORPORATE-PRODUCT PAGE LINKS
    */
    private static final String CORPORATE_PRODUCT_LINK = BASE_URL + "corporate-product";
    private static final String BUSINESS_REVENUE_LINK = CORPORATE_PRODUCT_LINK + "?tab=1";
    private static final String BUSINESS_SPENDING_LINK = CORPORATE_PRODUCT_LINK + "?tab=2";
    private static final String BUSINESS_ASSETS_LINK = CORPORATE_PRODUCT_LINK + "?tab=3";
    private static final String BUSINESS_DEBT_LINK = CORPORATE_PRODUCT_LINK + "?tab=4";
    private static final String CORPORATE_CREDIT_DECISIONING_LINK = CORPORATE_PRODUCT_LINK + "?tab=5";
    private static final String CORPORATE_CUSTOM_PRODUCTS_LINK = CORPORATE_PRODUCT_LINK + "?tab=6";

    /*
    USE-CASES PAGE LINKS
    */
    private static final String USE_CASES_LINK = BASE_URL + "use-cases";
    private static final String CONSUMER_LENDING_LINK = USE_CASES_LINK + "#consumer-lending";
    private static final String BUSINESS_LENDING_LINK = USE_CASES_LINK + "#business-landing";
    private static final String MONEY_GAMBLING_LINK = USE_CASES_LINK + "#money-transfer";
    private static final String ONLINE_GAMBLING_LINK = USE_CASES_LINK + "#online-gambling";
    private static final String AUDITING_LINK = USE_CASES_LINK + "#auditing";
    private static final String INSURANCE_LINK = USE_CASES_LINK + "#insurance";

    /*
    ABOUT-US PAGE LINKS
    */
    private static final String ABOUT_US_LINK = BASE_URL + "about";
    private static final String ABOUT_KREDITZ_LINK = ABOUT_US_LINK + "#about-kreditz";
    private static final String TEAM_LINK = ABOUT_US_LINK + "#team-members";
    private static final String BOARD_MEMBERS_LINK = ABOUT_US_LINK + "#board-members";
    private static final String INVESTORS_LINK = ABOUT_US_LINK + "#investors";

    private static final String CAREERS_LINK = "https://careers.kreditz.com/";

    private Constants() {
    }

    public static String getBaseUrl() {
        return BASE_URL;
    }

    public static int getExplicitWaitShort() {
        return EXPLICIT_WAIT_SHORT;
    }

    public static int getExplicitWaitLong() {
        return EXPLICIT_WAIT_LONG;
    }

    public static String getLinkedinUrl() {
        return LINKEDIN_URL;
    }

    public static String getInstagramUrl() {
        return INSTAGRAM_URL;
    }

    public static String getTwitterUrl() {
        return TWITTER_URL;
    }

    public static String getBookingsLink() {
        return BOOKINGS_LINK;
    }

    public static String getContactUsLink() {
        return CONTACT_US_LINK;
    }

    public static String getConsumerProductLink() {
        return CONSUMER_PRODUCT_LINK;
    }

    public static String getIncomeVerificationLink() {
        return INCOME_VERIFICATION_LINK;
    }

    public static String getSpendingBehaviourLink() {
        return SPENDING_BEHAVIOUR_LINK;
    }

    public static String getAssetAccumulationLink() {
        return ASSET_ACCUMULATION_LINK;
    }

    public static String getDebtInvolvementLink() {
        return DEBT_INVOLVEMENT_LINK;
    }

    public static String getCreditDecisioningLink() {
        return CREDIT_DECISIONING_LINK;
    }

    public static String getCustomProductsLink() {
        return CUSTOM_PRODUCTS_LINK;
    }

    public static String getFraudDetectLink() {
        return FRAUD_DETECT_LINK;
    }

    public static String getCorporateProductLink() {
        return CORPORATE_PRODUCT_LINK;
    }

    public static String getBusinessRevenueLink() {
        return BUSINESS_REVENUE_LINK;
    }

    public static String getBusinessSpendingLink() {
        return BUSINESS_SPENDING_LINK;
    }

    public static String getBusinessAssetsLink() {
        return BUSINESS_ASSETS_LINK;
    }

    public static String getBusinessDebtLink() {
        return BUSINESS_DEBT_LINK;
    }

    public static String getCorporateCreditDecisioningLink() {
        return CORPORATE_CREDIT_DECISIONING_LINK;
    }

    public static String getCorporateCustomProductsLink() {
        return CORPORATE_CUSTOM_PRODUCTS_LINK;
    }

    public static String getUseCasesLink() {
        return USE_CASES_LINK;
    }

    public static String getConsumerLendingLink() {
        return CONSUMER_LENDING_LINK;
    }

    public static String getBusinessLendingLink() {
        return BUSINESS_LENDING_LINK;
    }

    public static String getMoneyGamblingLink() {
        return MONEY_GAMBLING_LINK;
    }

    public static String getOnlineGamblingLink() {
        return ONLINE_GAMBLING_LINK;
    }

    public static String getAuditingLink() {
        return AUDITING_LINK;
    }

    public static String getInsuranceLink() {
        return INSURANCE_LINK;
    }

    public static String getAboutUsLink() {
        return ABOUT_US_LINK;
    }

    public static String getAboutKreditzLink() {
        return ABOUT_KREDITZ_LINK;
    }

    public static String getTeamLink() {
        return TEAM_LINK;
    }

    public static String getBoardMembersLink() {
        return BOARD_MEMBERS_LINK;
    }

    public static String getInvestorsLink() {
        return INVESTORS_LINK;
    }

    public static String getCareersLink() {
        return CAREERS_LINK;
    }
}
