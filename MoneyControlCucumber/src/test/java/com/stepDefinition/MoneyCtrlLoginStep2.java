package com.stepDefinition;

import java.util.List;

import com.baseClass.Library;
import com.pages.MoneyCtrlLogin;
import com.seleniumUtils.SelUtils;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MoneyCtrlLoginStep2 extends Library{
	MoneyCtrlLogin mcl;
	SelUtils su;
	@When("^money ctrl page is opened click on login button$")
	public void money_ctrl_page_is_opened_click_on_login_button() {
		mcl= new MoneyCtrlLogin(driver);
		su= new SelUtils(driver);
		
		
	    
	}

	@Then("^user enters details of emailId and password$")
	public void user_enters_details_of_emailId_and_password(DataTable table)  {
		
		List<List<String>> userdata = table.raw();
		System.out.println(userdata.size());
		for(int i=1; i<userdata.size();i++) {
//			int j=i-1;
			System.out.println(userdata.get(i).toString());
//			String emailI = table.raw().get(i).get(j);
//			String pw=table.raw().get(i).get(i);
//			System.out.println(emailI);
//			System.out.println(pw);
			
		}
		
		
		String emailId = table.raw().get(1).get(0);
		String pwd=table.raw().get(1).get(1);
		mcl.clickonlogin(emailId, pwd);
		su.to_take_screenshot("src/test/resources/resources/Screenshots/datatable1.png");
		
	    
	}
	@Then("^close the login frame$")
	public void close_the_login_frame()  {
	    mcl.closeLoginFrame();
	}

	@Then("^close the application$")
	public void close_the_application()  {
		tearDown();
	    
	}





}
