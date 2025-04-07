package pages;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NO_screenshot {
	WebDriver driver;
	@FindBy(xpath="/html[1]/body[1]/div[1]/ul[1]/li[1]/a[1]/span[1]") WebElement mobile;
	@FindBy(xpath="/html[1]/body[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/ul[1]/li[1]/a[1]") WebElement moblclk;
	@FindBy(xpath="/html/body/div[2]/div/main/div/div/section[2]/div/div[2]/div/div[3]/div/div/div/section/div/div/div/section[1]/div/div/div/div/div/h6[7]") WebElement questn;

	
	public NO_screenshot(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void mousovr()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions mo=new Actions(driver);
		mo.moveToElement(mobile).perform();
		mo.moveToElement(moblclk).click().perform();
		
	}
	public void scrldwn()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)", "");
	}
	
	public void scrnsht() throws IOException
	{
		
		File tabss=questn.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(tabss,new File("./Screenshot//question1.png"));
		
		File scrn=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scrn,new File("C:\\sele ss//fullss.png"));
		
	}	

}
