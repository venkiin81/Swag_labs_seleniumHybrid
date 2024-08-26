package com.Objectrepo.swaglabs;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.generic_lib.swagLabs.Base_swaglabs;

public class HomePage extends Base_swaglabs
{
	@FindBy
	(xpath="//div [@class=\"bm-burger-button\"]/button")
	private WebElement HambergerMenu;

	public WebElement getHambergerMenu() {
		return HambergerMenu;
	}
	
	
	

}
