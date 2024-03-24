package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import static utils.CommonStepDefinitions.clickElement;
import static utils.CommonStepDefinitions.waitElement;
import static utils.CommonStepDefinitions.clickWebElement;
import static utils.CommonStepDefinitions.sendKeyElement;

//
//Copyright (c) 2021 Digy4 Inc. and its affiliates. All rights reserved.
//Unauthorized copying of this file, via any medium is strictly prohibited
//Proprietary and confidential
//Any illegal or unauthorised usage or violations will result in immediate legal action.
//

public class AmazonIndiaPurchasePage {
	static WebDriver driver;
	
	static By signinButtonElement = By.xpath("//a[@id='nav-link-accountList']");
	static By emailElement = By.xpath("//input[@id='ap_email']");
	static By continueElement = By.xpath("//input[@id='continue']");
	static By passwordElement = By.xpath("//input[@name='password']");
	static By submitElement = By.xpath("//input[@id='signInSubmit']");
	
	static By searchBarElement = By.xpath("//input[@id='twotabsearchtextbox']");
	static By searchBarButtonElement = By.xpath("//input[@id='nav-search-submit-button']");
	//static By resultHeaderElement = By.xpath("//span[text()='RESULTS']");
	static By firstResultElement = By.xpath("//div[contains(@class, 's-product-image-container')]/span/a");
	static By addToCartElement = By.xpath("//input[@id='add-to-cart-button']");
	static By cartIconElement = By.xpath("//a[@id='nav-cart']");
	static By proceedToBuyElement = By.xpath("//input[@name='proceedToRetailCheckout']");
	
	static By fullNameElement = By.xpath("//input[@id='address-ui-widgets-enterAddressFullName']");
	static By phoneNumberElement = By.xpath("//input[@id='address-ui-widgets-enterAddressPhoneNumber']");
	static By pincodeElement = By.xpath("//input[@id='address-ui-widgets-enterAddressPostalCode']"); 
	static By addressElement1 = By.xpath("//input[@id='address-ui-widgets-enterAddressLine1']");
	static By addressElement2 = By.xpath("//input[@id='address-ui-widgets-enterAddressLine2']");
	static By landmarkElement = By.xpath("//input[@id='address-ui-widgets-landmark']");
	static By cityElement = By.xpath("//input[@id='address-ui-widgets-enterAddressCity']");
	static By stateElement = By.xpath("//select[@id='address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId']");
	static By addressTypeElement = By.xpath("//select[@name='address-ui-widgets-addr-details-address-type-and-business-hours']");
	
	static By deleteElement = By.xpath("//input[@data-action='delete']");
	
	public AmazonIndiaPurchasePage(WebDriver driver) {
		AmazonIndiaPurchasePage.driver = driver;
	}
	
	public static void navigateToSignIn(WebDriver driver) throws InterruptedException {
		clickElement(driver, signinButtonElement, 3000);
	}
	
	public static void setEmail(WebDriver driver) throws InterruptedException {
		sendKeyElement(driver, emailElement, "firsttomatolasttomato@gmail.com", 3000);
	}
	
	public static void clickContinue(WebDriver driver) throws InterruptedException {
		clickElement(driver, continueElement, 3000);
	}
	
	public static void setPassword(WebDriver driver) throws InterruptedException {
		sendKeyElement(driver, passwordElement, "FirstTom@t0123", 3000);
	}
	
	public static void clickSubmit(WebDriver driver) throws InterruptedException {
		clickElement(driver, submitElement, 3000);
	}
	
	public static void setSearchBar(WebDriver driver, String key) throws InterruptedException {
		sendKeyElement(driver, searchBarElement, key, 3000);
	}
	
	public static void clickSearchBarButton(WebDriver driver) throws InterruptedException {
		clickElement(driver, searchBarButtonElement, 3000);
	}
	
	/*public static void arriveAtResultPage(WebDriver driver) throws InterruptedException {
		waitElement(driver, resultHeaderElement, 3000);
	}*/
	
	public static void clickFirstResult(WebDriver driver) throws InterruptedException {
		clickElement(driver, firstResultElement, 3000);
	}
	
	public static void addFirstResultToCart(WebDriver driver) throws InterruptedException {
		clickElement(driver, addToCartElement, 3000);
	}
	
	public static void navigateToCart(WebDriver driver) throws InterruptedException {
		clickElement(driver, cartIconElement, 3000);
	}
	
	public static void proceedToBuy(WebDriver driver) throws InterruptedException {
		clickElement(driver, proceedToBuyElement, 3000);
	}
	
	public static void setFullName(WebDriver driver) throws InterruptedException {
		sendKeyElement(driver, fullNameElement, "John Smith", 3000);
	}
	
	public static void setMobileNumber(WebDriver driver) throws InterruptedException {
		sendKeyElement(driver, phoneNumberElement, "74428193344", 3000);
	}
	
	public static void setPinCode(WebDriver driver) throws InterruptedException {
		sendKeyElement(driver, pincodeElement, "400097", 3000);
	}
	
	public static void setAddress1(WebDriver driver) throws InterruptedException {
		sendKeyElement(driver, addressElement1, "125 Park Lane", 3000);
	}
	
	public static void setAddress2(WebDriver driver) throws InterruptedException {
		sendKeyElement(driver, addressElement2, "New Apollo Estate, Mogra Lane, Andheri (east)", 3000);
	}
	
	public static void setLandmark(WebDriver driver) throws InterruptedException {
		sendKeyElement(driver, landmarkElement, "Andheri", 3000);
	}
	
	public static void setCity(WebDriver driver) throws InterruptedException {
		sendKeyElement(driver, cityElement, "Mumbai", 3000);
	}
	
	public static void setState(WebDriver driver) throws InterruptedException {
		waitElement(driver, stateElement, 3000);
		
		WebElement state = driver.findElement(stateElement);
		Select stateDropdown = new Select(state);
		stateDropdown.selectByValue("MAHARASHTRA");
	}
	
	public static void setAddressType(WebDriver driver) throws InterruptedException {
		waitElement(driver, addressTypeElement, 3000);
		
		WebElement addressType = driver.findElement(addressTypeElement);
		Select addressTypeDropdown = new Select(addressType);
		addressTypeDropdown.selectByValue("RES");
	}
	
	public static void arriveAtCartPage(WebDriver driver) throws InterruptedException {
		waitElement(driver, deleteElement, 3000);
	}
	
	public static void deleteItem(WebDriver driver) throws InterruptedException {
		clickElement(driver, deleteElement, 3000);
	}
}
