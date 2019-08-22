package com.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Main.BaseTest;

public class HomePage extends BaseTest {

	@FindBy(xpath="//p[text()=' Login or Create Account']")
	WebElement loginButton;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean checkloginButtonEnablity() throws InterruptedException {
		Thread.sleep(5000);
		if(loginButton.isEnabled()) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
