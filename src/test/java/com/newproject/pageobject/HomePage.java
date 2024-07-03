package com.newproject.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.newproject.base.TestBase;

public class HomePage extends TestBase{
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//*[@id='CardInstancesfZkktERZzU9DYHf6Fu0qA']/div[3]/a/span/span[2]")	
	WebElement seemore;
	
	@FindBy(xpath="//*[@id='CardInstanceK7HhXagadYONChc_wj11jA\']/div[3]/a/span/span[2]")
	WebElement toys;
	
	public String pageTitle()
	{
		return driver.getTitle();
	}
	
	public SeeMore seeMore()
	{
		seemore.click();
		return new SeeMore();
	}
	
	public Toys toyspage()
	{
		toys.click();
		return new Toys();
	}

}
