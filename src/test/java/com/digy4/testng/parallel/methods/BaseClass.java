package com.digy4.testng.parallel.methods;

import com.digy4.java.testng.Digy4TestNGSupport;
import org.openqa.selenium.WebDriver;

public class BaseClass {

    protected WebDriver driver() {
        return Digy4TestNGSupport.getWebDriver();
    }

}