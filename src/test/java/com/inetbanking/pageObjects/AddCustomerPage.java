package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

	WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath="//a[normalize-space()='New Customer']")
	@CacheLookup
	WebElement lnkAddNewCustomer;
	
	@FindBy(name="name")
	@CacheLookup
	WebElement txtCustomerName;
	
	@FindBy(name="rad1")
	@CacheLookup
	WebElement rdGender;
	
	@FindBy(name="dob")
	@CacheLookup
	WebElement txtDob;
	
	@FindBy(name="addr")
	@CacheLookup
	WebElement txtAddress;
	
	@FindBy(name="city")
	@CacheLookup
	WebElement txtCity;
	
	@FindBy(name="state")
	@CacheLookup
	WebElement txtState;
	
	@FindBy(name="pinno")
	@CacheLookup
	WebElement txtPin;
	
	@FindBy(name="telephoneno")
	@CacheLookup
	WebElement txtMobNo;
	
	@FindBy(name="emailid")
	@CacheLookup
	WebElement txtEmailId;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPwd;
	
	@FindBy(name="sub")
	@CacheLookup
	WebElement btnSubmit;
	
	public void clickAddNewCustomer(){
		lnkAddNewCustomer.click();
	}
	
	public void setCustName(String cname){
		txtCustomerName.sendKeys(cname);
	}
	
	public void setCustGender(String cgender){
		rdGender.click();
	}
	public void custDob(String mm, String dd, String yy){
		txtDob.sendKeys(mm);
		txtDob.sendKeys(dd);
		txtDob.sendKeys(yy);
	}
	
	public void setCustAddress(String caddress){
		txtAddress.sendKeys(caddress);
	}
	
	public void setCustCity(String ccity){
		txtCity.sendKeys(ccity);
	}
	public void setCustState(String cstate){
		txtState.sendKeys(cstate);
	}
	public void setPin(String cpinno){
		txtPin.sendKeys(String.valueOf(cpinno));
	}
	public void setCustMobno(String cmobno){
		txtMobNo.sendKeys(cmobno);
	}
	public void setCustEmail(String cemail){
		txtEmailId.sendKeys(cemail);
	}
	public void setPwd(String cpwd){
		txtPwd.sendKeys(cpwd);
	}
	public void clickSubmit(){
		btnSubmit.click();
	}
}
