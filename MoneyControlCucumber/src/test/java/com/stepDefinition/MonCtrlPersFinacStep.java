package com.stepDefinition;

import com.baseClass.Library;
import com.pages.MoneyCtrlPersonalFinance;
import com.seleniumUtils.SelUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MonCtrlPersFinacStep extends Library{
	MoneyCtrlPersonalFinance mcplf;
	SelUtils su;
	
	@When("^home page is ready$")
	public void home_page_is_ready() {
		 mcplf=new  MoneyCtrlPersonalFinance(driver);
		 su= new SelUtils(driver);
	    
	}

	@Then("^click on PersonalFinance and scroll down to Incometax calculator$")
	public void click_on_PersonalFinance_and_scroll_down_to_Incometax_calculator()  {
	    mcplf.clickon_personalFinance();
	    
	}

	@Then("^click on IncomeTax calculator$")
	public void click_on_IncomeTax_calculator() throws InterruptedException  {
		mcplf.clickon_incomeTaxCalc();
		
	    
	}


}
