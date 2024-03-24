package pages;
import static utils.CommonStepDefinitions.clickElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class AmazonPages {
	static WebDriver driver;
	static By freshelement=By.xpath("//a[normalize-space()='Fresh']");
	static By sellelement=By.xpath("//a[normalize-space()='Sell']");
	static By bestsellerselement=By.xpath("//a[normalize-space()='Best Sellers']");
	static By mobileselement=By.xpath("//a[normalize-space()='Mobiles']");
	static By todaysdealelement=By.xpath("//*[@id=\"nav-xshop\"]/a[6]");
	static By customerserviceelement=By.xpath("//a[normalize-space()='Customer Service']");
	static By electronicselement=By.xpath("//*[@id=\"nav-xshop\"]/a[9]");
	static By newreleaseselement=By.xpath("//a[normalize-space()='New Releases']");
	
	public AmazonPages(WebDriver driver) {
		AmazonPages.driver = driver;
	}
	public static void setFresh(WebDriver driver) throws InterruptedException {
		clickElement(driver, freshelement, 3000);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Long targetHeight = (Long) js.executeScript("return document.body.scrollHeight");
		for(int i = 0; i < targetHeight; i+=100) {
			Thread.sleep(100);
			js.executeScript("window.scrollTo(0, " + i + ")");
		}
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	public static void setSell(WebDriver driver) throws InterruptedException {
		clickElement(driver, sellelement, 3000);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Long targetHeight = (Long) js.executeScript("return document.body.scrollHeight");
		for(int i = 0; i < targetHeight; i+=100) {
			Thread.sleep(100);
			js.executeScript("window.scrollTo(0, " + i + ")");
		}
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	public static void setBestSellers(WebDriver driver) throws InterruptedException {
		clickElement(driver, bestsellerselement, 3000);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Long targetHeight = (Long) js.executeScript("return document.body.scrollHeight");
		for(int i = 0; i < targetHeight; i+=100) {
			Thread.sleep(100);
			js.executeScript("window.scrollTo(0, " + i + ")");
		}
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	public static void setMobiles(WebDriver driver) throws InterruptedException {
		clickElement(driver, mobileselement,3000);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Long targetHeight = (Long) js.executeScript("return document.body.scrollHeight");
		for(int i = 0; i < targetHeight; i+=100) {
			Thread.sleep(100);
			js.executeScript("window.scrollTo(0, " + i + ")");
		}
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	public static void setTodaysDeal(WebDriver driver) throws InterruptedException {
		clickElement(driver, todaysdealelement, 3000);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Long targetHeight = (Long) js.executeScript("return document.body.scrollHeight");
		for(int i = 0; i < targetHeight; i+=100) {
			Thread.sleep(100);
			js.executeScript("window.scrollTo(0, " + i + ")");
		}
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	public static void setCustomerService(WebDriver driver) throws InterruptedException {
		clickElement(driver, customerserviceelement, 3000);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Long targetHeight = (Long) js.executeScript("return document.body.scrollHeight");
		for(int i = 0; i < targetHeight; i+=100) {
			Thread.sleep(100);
			js.executeScript("window.scrollTo(0, " + i + ")");
		}
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	public static void setElectronics(WebDriver driver) throws InterruptedException {
		clickElement(driver, electronicselement, 3000);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Long targetHeight = (Long) js.executeScript("return document.body.scrollHeight");
		for(int i = 0; i < targetHeight; i+=100) {
			Thread.sleep(100);
			js.executeScript("window.scrollTo(0, " + i + ")");
		}
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	public static void setNewReleases(WebDriver driver) throws InterruptedException {
		clickElement(driver, newreleaseselement, 3000);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Long targetHeight = (Long) js.executeScript("return document.body.scrollHeight");
		for(int i = 0; i < targetHeight; i+=100) {
			Thread.sleep(100);
			js.executeScript("window.scrollTo(0, " + i + ")");
		}
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
}

