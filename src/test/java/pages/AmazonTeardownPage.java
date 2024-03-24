package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

//
//Copyright (c) 2021 Digy4 Inc. and its affiliates. All rights reserved.
//Unauthorized copying of this file, via any medium is strictly prohibited
//Proprietary and confidential
//Any illegal or unauthorised usage or violations will result in immediate legal action.
//

public class AmazonTeardownPage {
	static WebDriver driver;

	static By deleteItemsElement = By.xpath("//span[contains(@class, 'a-size-small sc-action-delete')]/span/input");
	
	public AmazonTeardownPage(WebDriver driver) {
		AmazonTeardownPage.driver = driver;
	}
	
	/*
	 * clickElement is a helper function that takes 
	 * driver to find the xpath *element*
	 * to click and sleep for pauseTime milliseconds
	 */
	private static void clickElement(WebDriver driver, By element, long pauseTime) throws InterruptedException {
		WebElement e = driver.findElement(element);
		e.click();
		Thread.sleep(pauseTime);
	}
	
	/*
	 * click the delete link from the deleteItemsElement xpath until there's no more
	 */
	public static void setDeleteCart(WebDriver driver) throws InterruptedException {
		// waits until the page has been fully rendered
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(deleteItemsElement));
		
		while(true) {
			try {
				clickElement(driver, deleteItemsElement, 3000);
			} catch (Exception e) {
				break;
			}
		}
	}
}
