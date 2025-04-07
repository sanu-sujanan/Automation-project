package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser_test {
	WebDriver driver;
	@Parameters("browser")
	
	@BeforeTest
	public void setup(String browser)
	{
		if(browser.equalsIgnoreCase("edge"))
		{
			System.out.println("---Running on Edge---");
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.out.println("---Running on Chrome---");
			driver=new ChromeDriver();
		}
		
	}
	@Test
	public void url()
	{
		driver.get("https://nikshanonline.com/");
	}
}
