package com.newproject.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase()
	{
		try {
			prop= new Properties();
			FileInputStream fip = new FileInputStream("C:\\Users\\aisha\\eclipse-workspace\\NEWPROJECT\\src\\test\\java\\com\\newproject\\config\\config.properties");
	prop.load(fip);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static void initialization()
	{
		String browsername = prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\aisha\\eclipse-workspace\\NEWPROJECT\\Driver\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get(prop.getProperty("url"));
		
	}
	

}
