package com.spg.qa.testcases;

import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.spg.qa.base.TestBase;
import com.spg.qa.pages.HomePage;

public class HomePageTest extends TestBase{
	HomePage homePage;
	
	public HomePageTest(){
		super();
	}
	
	@BeforeMethod()
	public void setUp() {
		initialization();
		homePage = new HomePage();	
	}
	
	
	@Test()
	public void consoleOutputTextTest() throws InterruptedException{
		String outputText = homePage.validateConsoleOutputText();
		Assert.assertEquals(outputText, "Hello World");
	}
	
	@Test()
	public void validateLoginWindowAppeared() throws InterruptedException{
		String loginText = homePage.validateLoginWindowText();
		Assert.assertEquals(loginText, "Log in"); 
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}

