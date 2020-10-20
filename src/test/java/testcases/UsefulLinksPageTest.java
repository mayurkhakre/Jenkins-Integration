package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import basepackage.BaseClass;
import pageObjectModel.UsefulLinksPage;

public class UsefulLinksPageTest extends BaseClass  {
	

	@BeforeMethod
	public void initialise() throws Exception{
		driver = initialization();
		driver.get(prop.getProperty("url"));
	}
	
	@Test(priority = 0)
	public void text_usefulLinks() {
		UsefulLinksPage object=new UsefulLinksPage(driver);
		Assert.assertTrue(object.isUsefulLinkTextValid());
	    }
         	
	@Test(priority = 1)
	public void text_internetRequired() {
		UsefulLinksPage object=new UsefulLinksPage(driver);
		Assert.assertTrue(object.isInternetRequiredTextValid());
	    }
	
	@Test(priority = 2)
	public void text_copyright() {
		UsefulLinksPage object=new UsefulLinksPage(driver);
		Assert.assertTrue(object.isCopyRightTextValid());
	    }
	
	@Test(priority = 3)
	public void text_designedForSelenium() {
		UsefulLinksPage object=new UsefulLinksPage(driver);
		Assert.assertTrue(object.isDesignForTextValid());
	    }
	
	
	
	
	
	
	@AfterMethod
	public void terardown() {
		driver.close();
		
	}
	
}
