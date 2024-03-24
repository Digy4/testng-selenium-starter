package pages;
import static utils.CommonStepDefinitions.clickElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
public class AmazonLeftNavigation {
	static WebDriver driver;
	static By allelement=By.xpath("//*[@id=\"nav-hamburger-menu\"]");
	static By bestsellerelement=By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[2]/a");
	static By amazonlaunchpadselement=By.xpath("//div[@role='treeitem']//a[contains(text(),'Amazon Launchpad')]");
	static By amazonrenewedelement=By.xpath("//a[normalize-space()='Amazon Renewed']");
	static By appsforandroidelement=By.xpath("//a[normalize-space()='Apps for Android']");
	static By babyproductselement=By.xpath("//a[normalize-space()='Baby Products']");
	static By beautyelement=By.xpath("//a[normalize-space()='Beauty']");
	static By bookselement=By.xpath("//div[@role='treeitem']//a[contains(text(),'Books')]");
	static By anydepartmentelement=By.xpath("//a[normalize-space()='Any Department']");
	public AmazonLeftNavigation(WebDriver driver) {
		AmazonLeftNavigation.driver = driver;
	}
	public static void setAll(WebDriver driver) throws InterruptedException {
		clickElement(driver, allelement, 3000);
		Thread.sleep(3000);
	}
	public static void setBestSeller(WebDriver driver) throws InterruptedException {
		clickElement(driver, bestsellerelement, 3000);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Long targetHeight = (Long) js.executeScript("return document.body.scrollHeight");
		for(int i = 0; i < targetHeight; i+=100) {
			Thread.sleep(100);
			js.executeScript("window.scrollTo(0, " + i + ")");
		}
		Thread.sleep(2000);
		//driver.navigate().back();
		//clickElement(driver, anydepartmentelement, 3000);
		js.executeScript("window.scrollBy(0,-20000)");
		Thread.sleep(3000);
	}
	public static void setAmazonLaunchpads(WebDriver driver) throws InterruptedException {
		clickElement(driver, amazonlaunchpadselement, 3000);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Long targetHeight = (Long) js.executeScript("return document.body.scrollHeight");
		for(int i = 0; i < targetHeight; i+=100) {
			Thread.sleep(100);
			js.executeScript("window.scrollTo(0, " + i + ")");
		}
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-20000)");
		clickElement(driver, anydepartmentelement, 3000);
		Thread.sleep(3000);
	}
	public static void setAmazonRenewed(WebDriver driver) throws InterruptedException {
		clickElement(driver, amazonrenewedelement,3000);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Long targetHeight = (Long) js.executeScript("return document.body.scrollHeight");
		for(int i = 0; i < targetHeight; i+=100) {
			Thread.sleep(100);
			js.executeScript("window.scrollTo(0, " + i + ")");
		}
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-20000)");
		clickElement(driver, anydepartmentelement, 3000);
		Thread.sleep(3000);
	}
	public static void setAppsForAndroid(WebDriver driver) throws InterruptedException {
		clickElement(driver, appsforandroidelement, 3000);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Long targetHeight = (Long) js.executeScript("return document.body.scrollHeight");
		for(int i = 0; i < targetHeight; i+=100) {
			Thread.sleep(100);
			js.executeScript("window.scrollTo(0, " + i + ")");
		}
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-20000)");
		clickElement(driver, anydepartmentelement, 3000);
		Thread.sleep(3000);
	}
	public static void setBabyProducts(WebDriver driver) throws InterruptedException {
		clickElement(driver, babyproductselement, 3000);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Long targetHeight = (Long) js.executeScript("return document.body.scrollHeight");
		for(int i = 0; i < targetHeight; i+=100) {
			Thread.sleep(100);
			js.executeScript("window.scrollTo(0, " + i + ")");
		}
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-20000)");
		clickElement(driver, anydepartmentelement, 3000);
		Thread.sleep(3000);
	}
	public static void setBeauty(WebDriver driver) throws InterruptedException {
		clickElement(driver, beautyelement, 3000);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Long targetHeight = (Long) js.executeScript("return document.body.scrollHeight");
		for(int i = 0; i < targetHeight; i+=100) {
			Thread.sleep(100);
			js.executeScript("window.scrollTo(0, " + i + ")");
		}
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-20000)");
		clickElement(driver, anydepartmentelement, 3000);
		Thread.sleep(3000);
	}
	public static void setBooks(WebDriver driver) throws InterruptedException {
		clickElement(driver, bookselement, 3000);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Long targetHeight = (Long) js.executeScript("return document.body.scrollHeight");
		for(int i = 0; i < targetHeight; i+=100) {
			Thread.sleep(100);
			js.executeScript("window.scrollTo(0, " + i + ")");
		}
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-20000)");
		clickElement(driver, anydepartmentelement, 3000);
		Thread.sleep(3000);
	}
}
