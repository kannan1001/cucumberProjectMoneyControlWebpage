package com.stepDefinition;

import com.baseClass.Library;

import cucumber.api.java.en.Given;

public class MoneyCtrlBackroundStep extends Library {
	
	@Given("^the user is in the home page of money controls and get the title of page$")
	public void the_user_is_in_the_home_page_of_money_controls_and_get_the_title_of_page() throws Throwable {
		browserSetUp();
		
		System.out.println("title of page is " + driver.getTitle());
		
	}
}
