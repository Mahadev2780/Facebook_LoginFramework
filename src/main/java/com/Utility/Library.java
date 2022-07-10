package com.Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {
	public static ExtentTest test;
	
 public static void custom_sendkeys(WebElement element, String feildname, String value)
 {
	 try
	 {
		 element.sendKeys(value);
		 test.log(Status.PASS,feildname +"=Value Successfully send="+value);
	 }catch(Exception e)
	 {
		 test.log(Status.FAIL,feildname +"=Unable to send value="+e);

	 }
	 
 }
 public static void custom_click(WebElement element, String feildname)
 {
	 try
	 {
		 element.click();
		 test.log(Status.PASS,feildname +" click Successfully= "+feildname);

	 }catch(Exception e)
	 {
		 test.log(Status.PASS,feildname +" Unable to click "+e);
	 }
 }
 public static void custom_HandleDropDown(WebElement element,String text, String feildname)
 {
	 try
	 {
		 Select s=new Select(element);
				 s.selectByVisibleText(text);
	 }catch(Exception e)
	 {
		 System.out.println("Unable to handle Dropdown "+feildname);
	 }
 }

}
