package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.NO_register;

public class Register_test {
	public WebDriver driver;
	@BeforeTest
	public void urlloading()
	{
		driver=new ChromeDriver();
		driver.get("https://nikshanonline.com/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void test()
	{
		NO_register nr=new NO_register(driver);
		nr.lognclk();
		nr.setvalues("teamp8939@gmail.com");
		nr.ckbx();
		nr.dropedown("date");
		nr.actioncls();
		nr.setup("Kamal", "Hasan","abc");
		
	}

}
