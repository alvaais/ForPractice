package com.newproject.test;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.newproject.base.TestBase;
import com.newproject.pageobject.HomePage;
import com.newproject.pageobject.SeeMore;
import com.newproject.pageobject.Toys;

public class HomePageTest extends TestBase{
	
	HomePage homepage;
	SeeMore seemore;
	Toys toys;
	
	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		homepage = new HomePage();
		seemore = new SeeMore();
		toys = new Toys();		
	}
	
	//@Test(priority=1)
	public void validatePageTitle()
	{
		String title = homepage.pageTitle();
		Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
	
//made a change for git	
	@Test(priority=2)
	public void validateseeMore()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		seemore = homepage.seeMore();
	}
	
	//@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	

}
