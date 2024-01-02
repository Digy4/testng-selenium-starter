package com.digy4.testng.parallel.classes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Digy4ParallelClassesDemoTest extends BaseClass {

    @Test
    public void verifyTitleInHomePageSuccess() {
        driver.get("https://www.saucedemo.com/");
        Assert.assertEquals(driver.getTitle(), "Swag Labs");
    }

    @Test
    public void verifyTitleInHomePageFailure() {
        driver.get("https://www.saucedemo.com/");
        Assert.assertEquals(driver.getTitle(), "Not Swag Labs",
                "Incorrect title encountered in the page.");
    }

    @Test
    public void verifyTitleInGoogleHomePage() {
        driver.get("https://www.google.com");
        driver.get("https://www.google.com/search?q=digy4");
        driver.get("https://www.google.com/search?q=tricentis");
        driver.get("https://news.google.com/home?hl=en-GB&gl=GB&ceid=GB:en");
        Assert.assertEquals(driver.getTitle(), "Before you continue");
    }

}
