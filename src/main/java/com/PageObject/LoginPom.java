package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	private WebElement EmailId;
	
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	private WebElement password;
	
	@FindBy(how=How.XPATH,using="//button[@name='login']")
	private WebElement Loginbtn;
	
	public LoginPom(WebDriver driver)
	{
		this.driver=driver;	
	}

	public WebElement getEmailId() {
		return EmailId;
	}

	public WebElement getPassword() {
		return password;
	}

	

	public WebElement getLoginbtn() {
		return Loginbtn;
	}

	

}
