package testng;
import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.digy4.java.testng.Digy4TestNGSupport;
import pages.AmazonLeftNavigation;
import pages.AmazonPages;
public class AmazonLeftNavigationTest {
	String url="https://www.amazon.in/";
	@Test(enabled=true)
	  public void AmazonLeftNavigationtestcase() throws MalformedURLException, InterruptedException {
        WebDriver driver=Digy4TestNGSupport.getWebDriver();
		driver.get(url);
		driver.manage().window().maximize();
		AmazonLeftNavigation.setAll(driver);
		AmazonLeftNavigation.setBestSeller(driver);
		AmazonLeftNavigation.setAmazonLaunchpads(driver);
		AmazonLeftNavigation.setAmazonRenewed(driver);
		AmazonLeftNavigation.setAppsForAndroid(driver);
		AmazonLeftNavigation.setBabyProducts(driver);
		AmazonLeftNavigation.setBeauty(driver);
		AmazonLeftNavigation.setBooks(driver);		
}
}
