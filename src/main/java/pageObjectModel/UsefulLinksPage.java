package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsefulLinksPage{
	WebDriver driver;

	public UsefulLinksPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//section[@class='content-header']/h1")
	WebElement text_usefulLinks;
	
	@FindBy(xpath="//div[@class='box-header']/h3")
	WebElement text_internetRequired;
	
	@FindBy(xpath="//footer/strong[1]")
	WebElement text_copyright;
	
	@FindBy(xpath="//footer[@class='main-footer']/div")
	WebElement text_designedForSelenium;
	
	public boolean isUsefulLinkTextValid()
	{
		if(text_usefulLinks.getText().equals("Useful Links")){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean isInternetRequiredTextValid()
	{
		if(text_internetRequired.getText().equals("* Internet Required")){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean isCopyRightTextValid()
	{
		if(text_copyright.getText().equals("Copyright © 2005-2019 JavaByKiran.")){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean isDesignForTextValid()
	{
		if(text_designedForSelenium.getText().equals("Design for Selenium Automation Test V 2.3.0")){
			return true;
		}
		else{
			return false;
		}
	}
	
	
}
