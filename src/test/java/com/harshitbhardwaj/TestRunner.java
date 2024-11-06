package com.harshitbhardwaj;

import org.testng.TestNG;

public class TestRunner {

    public static void main(String[] args) {
        TestNG testng = new TestNG();
        String[] suiteFiles = {"src/test/resources/testng.xml"};
        testng.setTestSuites(java.util.Arrays.asList(suiteFiles));
        testng.run();
    }
}

