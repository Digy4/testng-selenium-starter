package com.digy4.testng;

import com.digy4.java.testng.Digy4TestNGSupport;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Digy4DemoTest {

    @Test
    public void verifyTitleInHomePageSuccess() {
        final WebDriver webDriver = Digy4TestNGSupport.getWebDriver();
        webDriver.get("https://www.saucedemo.com/");
        Assert.assertEquals(webDriver.getTitle(), "Swag Labs");
    }

    @Test
    public void verifyTitleInHomePageFailure() {
        final WebDriver webDriver = Digy4TestNGSupport.getWebDriver();
        webDriver.get("https://www.saucedemo.com/");
        Assert.assertEquals(webDriver.getTitle(), "Not Swag Labs",
                "Incorrect title encountered in the page.");
    }

    @Test
    public void verifyTitleInDigy4HomePage2() {
        final WebDriver webDriver = Digy4TestNGSupport.getWebDriver();
        webDriver.get("https://www.digy4.com/");
        Assert.assertEquals(webDriver.get().getTitle(), "Home - Digy4",
                "Incorrect title encountered in the page.");
    }

    @Test
    public void verifyTitleInGoogleHomePage1() {
        final WebDriver webDriver = Digy4TestNGSupport.getWebDriver();
        webDriver.get("https://www.google.com");
        webDriver.get("https://www.google.com/search?q=digy4");
        webDriver.get("https://www.google.com/search?q=tricentis");
        webDriver.get("https://news.google.com/home?hl=en-GB&gl=GB&ceid=GB:en");
        Assert.assertEquals(webDriver.get().getTitle(), "Google");
    }

    @Test
    public void verifyTitleInGoogleHomePageFail2() {
        final WebDriver webDriver = Digy4TestNGSupport.getWebDriver();
        webDriver.get("https://www.google.com/search?q=digy4");
        webDriver.get("https://www.google.com/search?q=tricentis");
        webDriver.get("https://news.google.com/home?hl=en-GB&gl=GB&ceid=GB:en");
        Assert.assertEquals(webDriver.getTitle(), "Google1");
    }

    @Test
    public void verifyTitleInGoogleHomePage3() {
        final WebDriver webDriver = Digy4TestNGSupport.getWebDriver();
        webDriver.get("https://www.google.com/search?q=digy4");
        webDriver.get("https://www.google.com/search?q=tricentis");
        webDriver.get("https://news.google.com/home?hl=en-GB&gl=GB&ceid=GB:en");
        Assert.assertEquals(webDriver.getTitle(), "Google");
    }
}
