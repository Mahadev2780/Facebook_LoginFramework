package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class LoginTest extends BaseClass {
  
	@Test
	public void verifylogin()
	{
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		//login.getEmailId().sendKeys("Maddy45");
		//login.getPassword().sendKeys("Maddy");
		//login.getLoginbtn().click();
		Library.custom_sendkeys(login.getEmailId(), "Emailid", excel.getStringData("Sheet1", 0, 0));
		Library.custom_sendkeys(login.getPassword(), "Password", excel.getStringData("Sheet1", 0, 1));
		Library.custom_click(login.getLoginbtn(), "Login Button");
		Assert.assertTrue(false);
	}
}
