package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class NO_verifications {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"post-143941\"]/div/section[5]/div/div/div/div/div/div/div/h4") WebElement tests;
	@FindBy(xpath="/html/body/div[2]/header/div/div[1]/div/div/div[1]/div/a/img") WebElement logo;
	public NO_verifications(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void title()
	{
		String expected="Top Air Purifiers Online - Exclusive Discounts At Nikshan Online";
		String actual=driver.getTitle();
		Assert.assertEquals(expected, actual);
		System.out.println("---PASS---");
	}
	
	public void text()
	{
		String expected="Popular Categories";
		String Actual=tests.getText();
		if(expected.equals(Actual))
		{
			System.out.println("---PASS---");
		}
		else
		{
			System.out.println("---FAIL---");
		}
		
	}
	public void logo()
	{
		Boolean display=logo.isDisplayed();
		if(display)
		{
			System.out.println("---Logo is displayed---");
		}
		else
		{
			System.out.println("---Logo is not displayed---");
		}
	}
}
