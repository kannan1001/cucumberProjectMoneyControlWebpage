package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.Library;

public class MoneyCtrlLogin extends Library {
	
	WebDriver driver;
	@FindBy(xpath="//a[@href='javascript:;' and @class='link1 dropdown-toggle linkSignIn']")
	WebElement login;
	@FindBy(xpath="//input[@name='email' and @id='email' and @placeholder='Email or Mobile Number or User ID']")
	WebElement EmailIdorPhNo;
	@FindBy(xpath="//input[@placeholder='Password' and @error-id='error_login_pass']")
	WebElement Password;
	@FindBy(xpath="//*[@id=\"ACCT_GPLUS_LOGIN\"]")
	WebElement loginwthGoogle;
	@FindBy(xpath="//button[@id='ACCT_LOGIN_SUBMIT']")
	WebElement Loginbutton;
	@FindBy(xpath="//div//button[@type='button' and @class='close' and @data-dismiss='modal']")
	WebElement closeLoginButton;
	public MoneyCtrlLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void clickonlogin(String emailId,String pwd) {
		login.click();
 
		driver.switchTo().frame("myframe");
		EmailIdorPhNo.click();
		EmailIdorPhNo.sendKeys(emailId);
		
 		Password.sendKeys(pwd);
 		Loginbutton.click();
 		
 		
 		
 		
     }
	public void closeLoginFrame() {
		//to close login iframe
 		//since the control is in iFrame
 		driver.close();
	}
	
	
	

}
