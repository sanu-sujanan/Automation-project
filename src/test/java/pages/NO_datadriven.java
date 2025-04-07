package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NO_datadriven  {
	WebDriver driver;
	@FindBy(xpath="/html/body/div[2]/header/div/div[2]/div/div/div[3]/div[1]/a/span[1]") WebElement prsnicon;
	@FindBy(id="username") WebElement usrnme;
	@FindBy(id="password") WebElement paswrd;
	@FindBy(name="login") WebElement logn;
	
	public NO_datadriven(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void datad() throws IOException
	{
		File f=new File("C:\\Users\\sanus\\OneDrive\\Documents\\AutmnBook.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook d=new XSSFWorkbook(fi);
		XSSFSheet sh=d.getSheet("Sheet1");
		System.out.println(sh.getLastRowNum());
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(username);
			String password=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println(password);
			
			prsnicon.click();
			usrnme.sendKeys(username);
			paswrd.sendKeys(password);
			logn.click();
			
	    }
    }
	
	public void respns(String baseurl) throws IOException
	{
		URL rs=new URL(baseurl);
		HttpURLConnection con=(HttpURLConnection)rs.openConnection();
		con.connect();
		if(con.getResponseCode()==200)
		{
			System.out.println("----Valid URl");
		}
		else
		{
			System.out.println("----Invalid URl");
		}
	}
	
	
}
