package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MoneyCtrlEnglish {
	WebDriver driver;
	Actions action;
	
	@FindBy(xpath="//a[@href='https://www.moneycontrol.com/']")
	WebElement English;
	@FindBy(partialLinkText="Gujara")
	WebElement Gujarati;
	public MoneyCtrlEnglish(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void hover_over_English(){
		action=new Actions(driver);
		action.moveToElement(English).perform();
		
	}
	public void click_on_Gujarati(){
		//action.moveToElement(Gujarati);
		
		Gujarati.click();
	}
	
	

}
