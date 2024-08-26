package com.generic_lib.swagLabs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base_swaglabs 
{
	public static WebDriver driver ;
	
	@BeforeTest
	public void Config()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://www.saucedemo.com/");
		
	}
	
	@AfterTest
	public void close()
	{
		driver.quit();
	}

}
