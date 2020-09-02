package com.stepDefinition;

import com.baseClass.Library;
import com.pages.MoneyCtrlEnglish;
import com.seleniumUtils.SelUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MoneyCtrlEnglishStep extends Library {
	MoneyCtrlEnglish mce;
	SelUtils su;
//	@Given("^setup background$")
//	public void setup_background() throws Throwable {
//		browserSetUp();
//	   
//	}

	@When("^page is ready$")
	public void page_is_ready() throws Throwable {
	    mce=new MoneyCtrlEnglish(driver);
	    
	}

	@Then("^hover on English and click on Gujarati$")
	public void hover_on_English_and_click_on_Gujarati() throws Throwable {
	  mce.hover_over_English();
	  mce.click_on_Gujarati();
	  su=new SelUtils(driver);
	  su.to_take_screenshot("src\\test\\resources\\Screenshots\\thirdnow.png");
	  tearDown();
	}


}
