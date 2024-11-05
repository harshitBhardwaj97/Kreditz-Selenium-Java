package com.harshitbhardwaj.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Objects;

public class Driver {

    private Driver() {
    }

    public static WebDriver initDriver(String browser) {
        System.out.println("Launching browser ::::  " + browser);
        if (Objects.isNull(DriverManager.getDriver())) {
            switch (browser) {
                case "chrome":
                    DriverManager.setDriver(new ChromeDriver());
                    break;
                case "edge":
                    DriverManager.setDriver(new EdgeDriver());
                    break;
                case "firefox":
                    DriverManager.setDriver(new FirefoxDriver());
                    break;
                default:
                    throw new IllegalArgumentException("Please enter a valid browser name !");
            }
        }
        DriverManager.getDriver().manage().window().maximize();
        return DriverManager.getDriver();
    }

    public static void quitDriver() {
        if (Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.quit();
        }
    }

}
