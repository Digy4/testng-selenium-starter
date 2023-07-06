package com.digy4.testng;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import java.time.Duration;

import com.digy4.java.testng.Digy4TestNGSupport;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;
	public static String otp;
	public static Properties loc;
	public static String mobile;
	public static String usrm;

    @BeforeMethod
    public void commonSetup(ITestResult testResult) throws IOException {
        //System.out.println("BaseClass:commonSetup: value of browser property: " + browser);
            new Digy4TestNGSupport().onTestStart(testResult);
            driver = Digy4TestNGSupport.getWebDriver();
			driver.get("https://www.google.com");
            System.out.println("BaseClass:commonSetup: value of digy4 driver: " + driver);
    
        System.out.println("BaseClass:commonSetup: value of driver: " + driver);
    }
	

}