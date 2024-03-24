package testng;
import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.digy4.java.testng.Digy4TestNGSupport;
import pages.AmazonPages;
public class AmazonTest {
	String url="https://www.amazon.in/";
	@Test(enabled=true)
	  public void AmazonNavigationtestcase() throws MalformedURLException, InterruptedException {
        WebDriver driver=Digy4TestNGSupport.getWebDriver();
		driver.get(url);
		driver.manage().window().maximize();
		AmazonPages.setFresh(driver);
		AmazonPages.setSell(driver);
		AmazonPages.setBestSellers(driver);
		AmazonPages.setMobiles(driver);
		AmazonPages.setTodaysDeal(driver);
		AmazonPages.setCustomerService(driver);
		AmazonPages.setElectronics(driver);
		AmazonPages.setNewReleases(driver);
}
}
