package com.Testscrips.swaglabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Objectrepo.swaglabs.HomePage;
import com.Objectrepo.swaglabs.Login_Page;
import com.generic_lib.swagLabs.Base_swaglabs;

public class Login_swaglabs extends Base_swaglabs
{

	
	@Test
	public void login()
	{
		Login_Page lp = PageFactory.initElements(driver, Login_Page.class);
		lp.getUserName().sendKeys("standard_user");
		lp.getPassword().sendKeys("secret_sauce");
		lp.getSubmit().click();
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		boolean dispaly =hp.getHambergerMenu().isDisplayed();
	
		System.out.println(dispaly);
	}

}
