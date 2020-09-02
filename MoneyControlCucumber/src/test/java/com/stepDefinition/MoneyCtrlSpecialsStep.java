package com.stepDefinition;

import com.baseClass.Library;
import com.pages.MoneyCtrlSpecials;
import com.seleniumUtils.SelUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MoneyCtrlSpecialsStep extends Library {
	MoneyCtrlSpecials mcs;
	
	

	@When("^page is opened$")
	public void page_is_opened() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		mcs=new MoneyCtrlSpecials(driver);
		
	    
	}
	@Then("^move and hover over specials$")
	public void move_and_hover_over_specials() throws Throwable {
	    
		mcs.HoverOnSpecial();
	}

	
	@Then("^click on grow your business image source and then comeback to original page$")
	public void click_on_grow_your_business_image_source_and_then_comeback_to_original_page() throws InterruptedException{
				//This method will verify the title of page using Assert.Equals method
				//Take Screenshot of Child Window 
				//come back to the original page(parentWindow)
				mcs.clickon_grow_your_business();
	}



	@Then("^close app$")
	public void close_app() throws Throwable {
	   
		
		tearDown();
	}

}
