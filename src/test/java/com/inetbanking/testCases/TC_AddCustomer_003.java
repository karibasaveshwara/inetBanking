package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

import junit.framework.Assert;

public class TC_AddCustomer_003 extends BaseClass{

	@Test
	public void addNewCustomer() throws InterruptedException, IOException{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username is entered");
		
		lp.setPassword(password);
		logger.info("Password is entered");
		
		lp.clickLogin();
		logger.info("Clicked on Login");
		
		Thread.sleep(3000);
		
		AddCustomerPage addCust=new AddCustomerPage(driver);
		
		addCust.clickAddNewCustomer();
		logger.info("Clicked on Add New Customer link");
		
		addCust.setCustName("Test");
		logger.info("Customer Name is entered");
		
		addCust.setCustGender("male");
		logger.info("Gender is selected");
		
		addCust.custDob("02", "21", "1992");
		logger.info("DOB is entered");
		Thread.sleep(3000);
		
		addCust.setCustAddress("India");
		logger.info("Customer Address is entered");
		
		addCust.setCustCity("BLR");
		logger.info("Customer City is entered");
		
		addCust.setCustState("KA");
		logger.info("Customer State is entered");
		
		addCust.setPin("123456");
		logger.info("Customer PIN is entered");
		
		addCust.setCustMobno("1234567890");
		logger.info("Customer Mobile Number is entered");
		
		String email=randomString()+"@gmail.com";
		addCust.setCustEmail(email);
		logger.info("Customer email is entered");
		
		addCust.setPwd("aswewe");
		logger.info("Customer password is entered");
		
		addCust.clickSubmit();
		logger.info("Clicked on Submit button");
		Thread.sleep(3000);
		
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true){
			Assert.assertTrue(true);
			logger.info("Test case passed");
		}else{
			captureScreen(driver, "AddNewCustomer");
			Assert.assertTrue(false);
		}
	}
	
}
