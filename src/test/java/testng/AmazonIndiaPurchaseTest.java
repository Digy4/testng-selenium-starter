package testng;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.AmazonIndiaPurchasePage;
import com.digy4.java.testng.Digy4TestNGSupport;

//
//Copyright (c) 2021 Digy4 Inc. and its affiliates. All rights reserved.
//Unauthorized copying of this file, via any medium is strictly prohibited
//Proprietary and confidential
//Any illegal or unauthorised usage or violations will result in immediate legal action.
//

public class AmazonIndiaPurchaseTest {
	WebDriver driver;
	String url = "https://www.amazon.in";
	String teardownUrl = "https://www.amazon.in/gp/cart/view.html?ref_=nav_cart";
	
	@Test
	public void VerifyAmazonIndiaPurchasePassed() throws InterruptedException {
        driver=Digy4TestNGSupport.getWebDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		
		AmazonIndiaPurchasePage amazonPage = new AmazonIndiaPurchasePage(driver);
		/*amazonPage.navigateToSignIn(driver);
		amazonPage.setEmail(driver);
		amazonPage.clickContinue(driver);
		amazonPage.setPassword(driver);
		amazonPage.clickSubmit(driver);*/
		amazonPage.setSearchBar(driver, "repro");
		amazonPage.clickSearchBarButton(driver);
		//amazonPage.arriveAtResultPage(driver);
		amazonPage.clickFirstResult(driver);
		Thread.sleep(3000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		amazonPage.addFirstResultToCart(driver);
		amazonPage.navigateToCart(driver);
		amazonPage.arriveAtCartPage(driver);
		amazonPage.proceedToBuy(driver);
		
		/*amazonPage.setFullName(driver);
		amazonPage.setMobileNumber(driver);
		amazonPage.setPinCode(driver);
		amazonPage.setAddress1(driver);
		amazonPage.setAddress2(driver);
		amazonPage.setLandmark(driver);
		amazonPage.setCity(driver);
		amazonPage.setState(driver);
		amazonPage.setAddressType(driver);
		
		Thread.sleep(3000);
	    driver.get(teardownUrl);
	    amazonPage.arriveAtCartPage(driver);
	    amazonPage.deleteItem(driver);*/
	}
}
