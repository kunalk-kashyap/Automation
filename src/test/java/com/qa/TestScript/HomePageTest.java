package com.qa.TestScript;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Main.BaseTest;
import com.qa.Pages.HomePage;

public class HomePageTest extends BaseTest {

	HomePage home;
	
	public HomePageTest() {
		super();
		System.out.println("----loading properties file----");
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		home=new HomePage();
		System.out.println("----launching chrome browser and getting url----");
	}
	
	@Test
	public void loginButtonEnableTest() throws InterruptedException {
		System.out.println("----checking login button clickability------");
		boolean actual=home.checkloginButtonEnablity();
		boolean expected=true;
		Assert.assertEquals(actual, expected,"login button is not clickable----");
		System.out.println("-----login button is clickable----");
		System.out.println("testcase 1 completed");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
