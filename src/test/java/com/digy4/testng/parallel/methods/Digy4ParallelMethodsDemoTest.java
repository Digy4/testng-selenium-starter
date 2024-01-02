package com.digy4.testng;

import com.digy4.java.testng.Digy4TestNGSupport;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Digy4ParallelMethodsDemoTest {

    @Test
    public void verifyTitleInHomePageSuccess() {
        final WebDriver driver = Digy4TestNGSupport.getWebDriver();
        driver.get("https://www.saucedemo.com/");
        Assert.assertEquals(driver.getTitle(), "Swag Labs");
    }

    @Test
    public void verifyTitleInHomePageFailure() {
        final WebDriver driver = Digy4TestNGSupport.getWebDriver();
        driver.get("https://www.saucedemo.com/");
        Assert.assertEquals(driver.getTitle(), "Not Swag Labs",
                "Incorrect title encountered in the page.");
    }

    @Test
    public void verifyTitleInDigy4HomePage2() {
        final WebDriver driver = Digy4TestNGSupport.getWebDriver();
        driver.get("https://www.digy4.com/");
        Assert.assertEquals(driver.getTitle(), "Home - Digy4",
                "Incorrect title encountered in the page.");
    }

    @Test
    public void verifyTitleInGoogleHomePage1() {
        final WebDriver driver = Digy4TestNGSupport.getWebDriver();
        driver.get("https://www.google.com");
        driver.get("https://www.google.com/search?q=digy4");
        driver.get("https://www.google.com/search?q=tricentis");
        driver.get("https://news.google.com/home?hl=en-GB&gl=GB&ceid=GB:en");
        Assert.assertEquals(driver.getTitle(), "Before you continue");
    }

    @Test
    public void verifyTitleInGoogleHomePageFail2() {
        final WebDriver driver = Digy4TestNGSupport.getWebDriver();
        driver.get("https://www.google.com/search?q=digy4");
        driver.get("https://www.google.com/search?q=tricentis");
        driver.get("https://news.google.com/home?hl=en-GB&gl=GB&ceid=GB:en");
        Assert.assertEquals(driver.getTitle(), "Before you continue");
    }

    @Test
    public void verifyTitleInGoogleHomePage3() {
        final WebDriver driver = Digy4TestNGSupport.getWebDriver();
        driver.get("https://www.google.com/search?q=digy4");
        driver.get("https://www.google.com/search?q=tricentis");
        driver.get("https://news.google.com/home?hl=en-GB&gl=GB&ceid=GB:en");
        Assert.assertEquals(driver.getTitle(), "Google");
    }

}
