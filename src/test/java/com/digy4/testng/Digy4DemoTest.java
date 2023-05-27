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

}
