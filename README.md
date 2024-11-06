# Kreditz Automation Suite

This project automates the testing of the [Kreditz](https://kreditz.com/) website using Selenium, TestNG, and Allure for
reporting. It contains tests for various pages on the Kreditz website, including the Home, About Us, Consumer Product,
Use Cases, and Contact Us pages.

## Project Setup

### Prerequisites

- **Java 21** or higher
- **Maven** for building and dependency management
- **Selenium 4.x** for browser automation
- **TestNG** for test execution
- **Allure** for test reports
- **Log4j** for logging

### Dependencies

You can find the required dependencies in the `pom.xml` file, which includes:

- Selenium WebDriver
- TestNG
- Allure TestNG integration
- Log4j
- AspectJ for method interception

## Running Tests

To run the tests:

1. **Clone the repository** to your local machine.
2. **Install dependencies** using Maven:

    ```bash
    mvn clean install
    ```

3. **Run tests** using Maven:

    ```bash
    mvn test
    ```

4. **Run the tests through `main()`** (as an alternative to running via Maven):

   In `src/test/java/com/harshitbhardwaj/TestRunner.java`, the following `main()` method is set up to run your TestNG
   suite programmatically.

    ```java
    public static void main(String[] args) {
        TestNG testng = new TestNG();
        testng.setTestSuites(Arrays.asList("src/test/resources/testng.xml"));
        testng.run();
    }
    ```

## Test Cases

Below is a list of all the test cases organized by pages:

### 1. **HomePageTests**

- **mainHeadingShouldBeVisible**: Verify that the main heading is visible on the home page.
- **linkedinLinkWorksFine**: Verify that the LinkedIn link works correctly.
- **instagramLinkWorksFine**: Verify that the Instagram link works correctly.
- **twitterLinkWorksFine**: Verify that the Twitter link works correctly.
- **productIncomeVerificationLinkWorksFine**: Verify that the Product Income Verification link works correctly.
- **productSpendingBehaviourLinkWorksFine**: Verify that the Product Spending Behaviour link works correctly.
- **productAssetAccumulationLinkWorksFine**: Verify that the Product Asset Accumulation link works correctly.
- **productDebtInvolvementLinkWorksFine**: Verify that the Product Debt Involvement link works correctly.
- **productCreditDecisioningLinkWorksFine**: Verify that the Product Credit Decisioning link works correctly.
- **productCustomProductsLinkWorksFine**: Verify that the Product Custom Products link works correctly.
- **productFraudDetectLinkWorksFine**: Verify that the Product Fraud Detect link works correctly.
- **corporateBusinessRevenueLinkWorksFine**: Verify that the Corporate Business Revenue link works correctly.
- **corporateBusinessSpendingLinkWorksFine**: Verify that the Corporate Business Spending link works correctly.
- **corporateBusinessAssetsLinkWorksFine**: Verify that the Corporate Business Assets link works correctly.
- **corporateBusinessDebtLinkWorksFine**: Verify that the Corporate Business Debt link works correctly.
- **corporateCreditDecisioningLinkWorksFine**: Verify that the Corporate Credit Decisioning link works correctly.
- **corporateCustomProductsLinkWorksFine**: Verify that the Corporate Custom Products link works correctly.
- **useCasesConsumerLendingLinkWorksFine**: Verify that the Use Cases Consumer Lending link works correctly.
- **useCasesBusinessLendingLinkWorksFine**: Verify that the Use Cases Business Lending link works correctly.
- **useCasesMoneyGamblingLinkWorksFine**: Verify that the Use Cases Money Gambling link works correctly.
- **useCasesOnlineGamblingLinkWorksFine**: Verify that the Use Cases Online Gambling link works correctly.
- **useCasesAuditingLinkWorksFine**: Verify that the Use Cases Auditing link works correctly.
- **useCasesInsuranceLinkWorksFine**: Verify that the Use Cases Insurance link works correctly.
- **aboutKreditzLinkWorksFine**: Verify that the About Kreditz link works correctly.
- **teamLinkWorksFine**: Verify that the Team link works correctly.
- **boardMembersLinkWorksFine**: Verify that the Board Members link works correctly.
- **investorsLinkWorksFine**: Verify that the Investors link works correctly.
- **careersLinkWorksFine**: Verify that the Careers link works correctly.

### 2. **AboutUsPageTests**

- **verifyMissionStatementHeadingIsVisible**: Verifying if the mission statement heading is visible on the About Us
  page.
- **verifyStaffMembersHeadingIsVisible**: Verifying if the staff members heading is visible on the About Us page.
- **verifyBoardMembersHeadingIsVisible**: Verifying if the board members heading is visible on the About Us page.
- **verifyInvestorsHeadingIsVisible**: Verifying if the investors heading is visible on the About Us page.

### 3. **ConsumerProductPageTests**

- **incomeVerificationLinkWorksFine**: Verify that the Income Verification link works correctly.
- **spendingBehaviorLinkWorksFine**: Verify that the Spending Behavior link works correctly.
- **assetAccumulationLinkWorksFine**: Verify that the Asset Accumulation link works correctly.
- **debtInvolvementLinkWorksFine**: Verify that the Debt Involvement link works correctly.
- **creditDecisioningLinkWorksFine**: Verify that the Credit Decisioning link works correctly.
- **customProductsLinkWorksFine**: Verify that the Custom Products link works correctly.
- **fraudDetectLinkWorksFine**: Verify that the Fraud Detect link works correctly.
- **getInTouchButtonWorksFine**: Verify that the "Get in Touch" button works correctly.

### 4. **ContactUsPageTests**

- **verifyContactUsHeadingIsVisible**: Verifying if the contact us heading is visible on the Contact Us page.
- **verifyErrorMessagesAreDisplayed**: Verifying if error messages are displayed when required fields are not filled.

### 5. **UseCasesPageTests**

- **productUseCasesHeadingIsDisplayed**: Verify that the 'Product Use Cases' heading is visible.
- **consumerLendingLinkWorksFine**: Verify that the Consumer Lending link works correctly.
- **businessLendingLinkWorksFine**: Verify that the Business Lending link works correctly.
- **moneyTransferLinkWorksFine**: Verify that the Money Transfer link works correctly.
- **onlineGamblingLinkWorksFine**: Verify that the Online Gambling link works correctly.
- **auditingLinkWorksFine**: Verify that the Auditing link works correctly.
- **insuranceLinkWorksFine**: Verify that the Insurance link works correctly.

---

## Reporting

- **Allure Reports**: After running the tests, Allure reports will be generated, providing detailed insights into the
  test execution. The reports can be found in the `/target/allure-results` directory.

To generate the report, run the following command:

```bash
mvn allure:serve
```