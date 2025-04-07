package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.NO_datadriven;

public class Datadriven_test 
{
	public WebDriver driver;
	@BeforeTest
	public void urlloading()
	{
		driver=new ChromeDriver();
		driver.get("https://nikshanonline.com/");
		driver.manage().window().maximize();
		
		
	}
	@Test
	public void test() throws IOException 
	{
		NO_datadriven ddr=new NO_datadriven(driver);
		ddr.datad();
		ddr.respns("https://nikshanonline.com/");
	}

}
