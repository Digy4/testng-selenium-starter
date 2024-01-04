package com.digy4.testng.parallel.classes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Digy4ParallelClassesDemoTest1 extends BaseClass {

    @Test
    public void verifyTitleInSauceDemoHomePageSuccess() {
        driver.get("https://www.saucedemo.com/");
        Assert.assertEquals(driver.getTitle(), "Swag Labs");
    }

    @Test
    public void verifyTitleInSauceDemoHomePageFailure() {
        driver.get("https://www.saucedemo.com/");
        Assert.assertEquals(driver.getTitle(), "Not Swag Labs",
                "Incorrect title encountered in the page.");
    }

}
