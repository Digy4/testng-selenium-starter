package com.digy4.testng;

import com.digy4.java.testng.Digy4TestNGSupport;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Digy4DemoTest {

    @Test
    public void verifyTitleInDigy4HomePage() {
        final WebDriver webDriver= Digy4TestNGSupport.getWebDriver();
        webDriver.get("https://www.digy4.com");
        Assert.assertEquals(webDriver.getTitle(), "Home - Digy4",
                "Incorrect title encountered in the page.");
    }

}
