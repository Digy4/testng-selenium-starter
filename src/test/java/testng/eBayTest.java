package testng;
import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.digy4.java.testng.Digy4TestNGSupport;
import pages.eBayPages;

public class eBayTest {
	String url="https://www.ebay.com/";
	@Test
	  public void eBaytestcase() throws MalformedURLException, InterruptedException {
        WebDriver driver=Digy4TestNGSupport.getWebDriver();
		driver.get(url);
		eBayPages.setElectronics(driver);
	    eBayPages.setFashion(driver);
	   /* eBayPages.setCollectibleandArts(driver);
	    eBayPages.setSports(driver);
	    eBayPages.setHealthandBeauty(driver);
	    eBayPages.setIndustrialquipment(driver);
	    eBayPages.setHomeandGarden(driver);
	    eBayPages.setDeals(driver);
	    eBayPages.setSell(driver);
	    eBayPages.setShopbycategory(driver);
	    eBayPages.setSearch(driver);
	    eBayPages.setSearchicon(driver);
	    eBayPages.setSort(driver);*/
}

	@Test(enabled=false)
	  public void eBaytestcaseeBaytestcaseeBaytestcaseeBaytestcaseRagavanHiTestcase() throws MalformedURLException, InterruptedException {
        WebDriver driver=Digy4TestNGSupport.getWebDriver();
		driver.get(url);
		eBayPages.setElectronics(driver);
	    eBayPages.setFashion(driver);
	    eBayPages.setCollectibleandArts(driver);
	    eBayPages.setSports(driver);
	    eBayPages.setHealthandBeauty(driver);
	    eBayPages.setIndustrialquipment(driver);
	    eBayPages.setHomeandGarden(driver);
	    eBayPages.setDeals(driver);
	    eBayPages.setSell(driver);
	    eBayPages.setShopbycategory(driver);
	    eBayPages.setSearch(driver);
	    eBayPages.setSearchicon(driver);
	    eBayPages.setSort(driver);
}

	@Test(enabled=false)
	  public void eBaytestcase3() throws MalformedURLException, InterruptedException {
        WebDriver driver=Digy4TestNGSupport.getWebDriver();
		driver.get(url);
		eBayPages.setElectronics(driver);
	    eBayPages.setFashion(driver);
	    eBayPages.setCollectibleandArts(driver);
	    eBayPages.setSports(driver);
	    eBayPages.setHealthandBeauty(driver);
	    eBayPages.setIndustrialquipment(driver);
	    eBayPages.setHomeandGarden(driver);
	    eBayPages.setDeals(driver);
	    eBayPages.setSell(driver);
	    eBayPages.setShopbycategory(driver);
	    eBayPages.setSearch(driver);
	    eBayPages.setSearchicon(driver);
	    eBayPages.setSort(driver);
}


}