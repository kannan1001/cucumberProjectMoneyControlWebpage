package com.stepDefinition;

import com.baseClass.Library;
import com.pages.MoneyCtrlLogin;
import com.seleniumUtils.SelUtils;

import cucumber.api.java.en.Then;

public class MoneyCtrlLoginStep extends Library{
	MoneyCtrlLogin mcl;
	SelUtils su;
	
	@Then("^click on login button using \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_on_login_button_using_and(String emailId,String pwd) throws Throwable {
		mcl=new MoneyCtrlLogin(driver);
	    mcl.clickonlogin(emailId, pwd);
	}
	
	
	@Then("^take screenshot$")
	public void take_screenshot() throws Throwable {
		su=new SelUtils(driver);
 		su.to_take_screenshot("src/test/resources/resources/Screenshots/g2.png");
	}

	@Then("^close moneyctrl$")
	public void close_moneyctrl()  {
		
		tearDown();
	    
	}

}
