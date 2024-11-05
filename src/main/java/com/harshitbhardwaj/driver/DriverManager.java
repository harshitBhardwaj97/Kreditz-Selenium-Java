package com.harshitbhardwaj.driver;

import org.openqa.selenium.WebDriver;

public class DriverManager {

    private static final ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

    private DriverManager() {
    }

    public static WebDriver getDriver() {
        return tlDriver.get();
    }

    public static void setDriver(WebDriver driver) {
        tlDriver.set(driver);
    }

    public static void quit() {
        tlDriver.get().quit();
        tlDriver.remove();
    }
}
