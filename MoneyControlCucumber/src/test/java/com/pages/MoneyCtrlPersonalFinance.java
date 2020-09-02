package com.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.Library;

public class MoneyCtrlPersonalFinance extends Library {

	WebDriver driver;
	
	@FindBy(linkText="Personal Finance")
	WebElement personalFinance;
//	@FindBy(xpath="//a[@title=\"Financial planning\"]")
//	WebElement financialPlanning;
	@FindBy(xpath="//a[@href='https://www.moneycontrol.com/personal-finance/tools/tax-calculator' and @title='Income Tax Calculator']")
	WebElement incomeTaxCalc;
	
	public MoneyCtrlPersonalFinance(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickon_personalFinance() {
		Actions action=new Actions(driver);
		action.moveToElement(personalFinance).click().build().perform();
		
		
	}
	
	public void clickon_incomeTaxCalc() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		//Thread.sleep(3000);
		incomeTaxCalc.click();
	}
	
}
