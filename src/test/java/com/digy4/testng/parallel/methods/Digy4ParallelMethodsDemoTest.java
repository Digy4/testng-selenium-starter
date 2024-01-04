package com.digy4.testng.parallel.methods;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Digy4ParallelMethodsDemoTest extends BaseClass {

    @Test
    public void verifyTitleInSauceDemoHomePageSuccess() {
        driver().get("https://www.saucedemo.com/");
        Assert.assertEquals(driver().getTitle(), "Swag Labs");
    }

    @Test
    public void verifyTitleInSauceDemoHomePageFailure() {
        driver().get("https://www.saucedemo.com/");
        Assert.assertEquals(driver().getTitle(), "Not Swag Labs",
                "Incorrect title encountered in the page.");
    }

    @Test
    public void verifyTitleInDigy4HomePageSuccess() {
        driver().get("https://www.digy4.com/");
        Assert.assertEquals(driver().getTitle(), "[Best Continuous Software Testing Tool | QA Automation Testing Services - Digy4]",
                "Incorrect title encountered in the page.");
    }

    @Test
    public void verifyTitleInDigy4HomePageFailure() {
        driver().get("https://www.digy4.com/");
        Assert.assertEquals(driver().getTitle(), "[Digy4 - Home]",
                "Incorrect title encountered in the page.");
    }

    @Test
    public void verifyTitleInGoogleHomePageSuccess() {
        driver().get("https://www.google.com");
        driver().get("https://www.google.com/search?q=digy4");
        driver().get("https://www.google.com/search?q=tricentis");
        driver().get("https://news.google.com/home?hl=en-GB&gl=GB&ceid=GB:en");
        Assert.assertEquals(driver().getTitle(), "Before you continue");
    }

    @Test
    public void verifyTitleInGoogleHomePageFailure() {
        driver().get("https://www.google.com/search?q=digy4");
        driver().get("https://www.google.com/search?q=tricentis");
        driver().get("https://news.google.com/home?hl=en-GB&gl=GB&ceid=GB:en");
        Assert.assertEquals(driver().getTitle(), "Google");
    }

}
