package test;

import java.io.IOException;
import org.testng.annotations.Test;

import pages.NO_screenshot;

public class Screenshot_test extends Register_test{
	@Test
	public void test()
	{
		NO_screenshot ss=new NO_screenshot(driver);
		ss.mousovr();
		ss.scrldwn();
			
	}
	@Test
	public void test2() throws IOException
	{
		NO_screenshot sse=new NO_screenshot(driver);
		sse.scrnsht();	}

	
}

