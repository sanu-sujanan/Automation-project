package pages;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class NO_windowhandling {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"ht-ctc-chat\"]/div") WebElement whatsapp;
	public NO_windowhandling(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void windowhndle()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		whatsapp.click();
		String parentwindow=driver.getWindowHandle();
		Set<String> allwindowhandles=driver.getWindowHandles();
		for(String handle:allwindowhandles)
		{
			if(!handle.equalsIgnoreCase(parentwindow));
			{
				driver.switchTo().window(handle);
			}
		}
	}
}
