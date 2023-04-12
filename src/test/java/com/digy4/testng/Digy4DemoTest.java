package com.digy4.testng;

import com.digy4.java.testng.Digy4TestNGSupport;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Digy4DemoTest {

    private ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();

    @BeforeMethod
    public void setup(ITestResult testResult) {
        new Digy4TestNGSupport().onTestStart(testResult);
        webDriver.set(Digy4TestNGSupport.getWebDriver());
    }

    @Test
    public void verifyTitleInDigy4HomePage() {
        webDriver.get().get("https://www.booking.com/?auth_success=1");
        Assert.assertEquals(webDriver.get().getTitle(), "Home - Digy4",
                "Incorrect title encountered in the page.");
    }

    @Test
    public void verifyTitleInDigy4HomePage2() {
        webDriver.get().get("https://www.digy4.com/");
        Assert.assertEquals(webDriver.get().getTitle(), "Home - Digy4",
                "Incorrect title encountered in the page.");
    }

    @Test
    public void verifyTitleInGoogleHomePage1() {
        webDriver.get().get("https://www.google.com");
        webDriver.get().get("https://www.google.com/search?q=digy4");
        webDriver.get().get("https://www.google.com/search?q=tricentis");
        webDriver.get().get("https://news.google.com/home?hl=en-GB&gl=GB&ceid=GB:en");
        Assert.assertEquals(webDriver.get().getTitle(), "Google");
    }

    @Test
    public void verifyTitleInGoogleHomePageFail2() {
        webDriver.get().get("https://www.google.com/search?q=digy4");
        webDriver.get().get("https://www.google.com/search?q=tricentis");
        webDriver.get().get("https://news.google.com/home?hl=en-GB&gl=GB&ceid=GB:en");
        Assert.assertEquals(webDriver.get().getTitle(), "Google1");
    }

    @Test
    public void verifyTitleInGoogleHomePage3() {
        webDriver.get().get("https://www.google.com/search?q=digy4");
        webDriver.get().get("https://www.google.com/search?q=tricentis");
        webDriver.get().get("https://news.google.com/home?hl=en-GB&gl=GB&ceid=GB:en");
        Assert.assertEquals(webDriver.get().getTitle(), "Google");
    }
}
