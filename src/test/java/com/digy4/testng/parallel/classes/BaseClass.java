package com.digy4.testng.parallel.classes;

import com.digy4.java.testng.Digy4TestNGSupport;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class BaseClass {

    protected WebDriver driver;

    @BeforeMethod
    public void commonSetup(ITestResult testResult) throws IOException {
        new Digy4TestNGSupport().onTestStart(testResult);
        driver = Digy4TestNGSupport.getWebDriver();
        System.out.println("BaseClass:commonSetup: value of digy4 driver: " + driver);
    }

}