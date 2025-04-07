package test;

import org.testng.annotations.Test;

import pages.NO_verifications;
import pages.NO_windowhandling;

public class Verification_test extends Register_test {
	@Test
	public void test()
	{
		NO_verifications vr= new NO_verifications(driver);
		vr.title();
		vr.text();
		vr.logo();
		
	}
	@Test
	public void windwhandle()
	{
		NO_windowhandling wh=new NO_windowhandling(driver);
		wh.windowhndle();
	}

}
