package com.harshitbhardwaj.base;

import com.harshitbhardwaj.data.changeless.Constants;
import com.harshitbhardwaj.driver.Driver;
import com.harshitbhardwaj.pages.ConsumerProductsPage;
import com.harshitbhardwaj.pages.HomePage;
import com.harshitbhardwaj.pages.UseCasesPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    protected HomePage homePage;
    protected ConsumerProductsPage consumerProductsPage;
    protected UseCasesPage useCasesPage;

    protected BaseTest() {
    }

    @BeforeMethod
    public void setup() {
        driver.set(Driver.initDriver("chrome"));
        homePage = new HomePage(driver.get());
        consumerProductsPage = new ConsumerProductsPage(driver.get());
        useCasesPage = new UseCasesPage(driver.get());
        driver.get().get(Constants.getBaseUrl());
    }

    @AfterMethod
    public void tearDown() {
        Driver.quitDriver();
    }
}
