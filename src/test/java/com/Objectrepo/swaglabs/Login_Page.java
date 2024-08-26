package com.Objectrepo.swaglabs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.generic_lib.swagLabs.Base_swaglabs;

public class Login_Page extends Base_swaglabs
{
	@FindBy
	(xpath = "//input [@placeholder='Username' or @id='user-name']")
	private WebElement userName;
	
	public WebElement getUserName()
	{
		return userName;
	}
	
	@FindBy
	(xpath = "//input [@placeholder='Password' or @id='password']  ")
	WebElement Password;
	
	public WebElement getPassword()
	{
		return Password;
	}

	@FindBy
	(xpath = "//input [@type=\"submit\"] ")
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}
	

}
