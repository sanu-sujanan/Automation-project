,kpackage pages;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NO_register {
	public WebDriver driver;
	@FindBy(xpath="/html/body/div[2]/header/div/div[2]/div/div/div[3]/div[1]/a/span[1]") WebElement picon;
	@FindBy(xpath="/html/body/div[6]/div[3]/a") WebElement createacound;
	@FindBy(name="email") WebElement nkemail;
	@FindBy(name="privacy_policy_reg") WebElement chekbx;
	@FindBy(xpath="//button[@id='onesignal-slidedown-cancel-button']") WebElement slder;
	@FindBy(name="register") WebElement regbutn;
	@FindBy(xpath="/html[1]/body[1]/div[2]/header[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]") WebElement shop;
	@FindBy(name="orderby") WebElement drpdwn;
	@FindBy(xpath="/html[1]/body[1]/div[2]/header[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/a[1]/span[1]") WebElement persn;
	@FindBy(xpath="//div[@class='edit-address-link']//a[normalize-space()='Addresses']") WebElement adres;
	@FindBy(xpath="/html/body/div[2]/div/main/div/article/div/div/div[2]/div[2]/div[2]/header/a") WebElement adship;
	@FindBy(name="shipping_first_name") WebElement fname;
	@FindBy(id="shipping_last_name") WebElement lname;
	@FindBy(name="shipping_address_1") WebElement addresss;
	@FindBy(name="shipping_address_2") WebElement caddres;

	
	public NO_register(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void lognclk()
	{
		picon.click();
		createacound.click();
		
	}
	
	public void setvalues(String iaemail)
	{
		nkemail.sendKeys(iaemail);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	public void ckbx()
	{
		chekbx.click();
		slder.click();
		regbutn.click();
		shop.click();
		
	}
	public void dropedown(String option)
	{
		Select dpdw=new Select(drpdwn);
		dpdw.selectByValue(option);
		List<WebElement> count = dpdw.getOptions();
		System.out.println("---Count---"+count.size());
		String tile=driver.getTitle();
		System.out.println("----Title---"+tile);

	}
	public void actioncls()
	{
		persn.click();
		adres.click();
		adship.click();
	}
	public void setup(String frstname,String lstname,String shpaddrs)
	{
		fname.sendKeys(frstname);
		lname.sendKeys(lstname);
		addresss.sendKeys(shpaddrs);
		Actions add=new Actions(driver);
		add.keyDown(addresss, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		add.keyDown(addresss, Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		add.keyDown(caddres, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		add.perform();
		for(int i=0;i<5;i++)
		{
			driver.navigate().back();
		}
		driver.navigate().forward();
	}
}
