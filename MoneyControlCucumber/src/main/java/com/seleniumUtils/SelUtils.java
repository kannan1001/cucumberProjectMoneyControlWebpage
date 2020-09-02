package com.seleniumUtils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseClass.Library;

public class SelUtils extends Library {
	WebDriver driver;
	public SelUtils(WebDriver driver) {
		
		this.driver=driver;
	}
	public void to_take_screenshot(String path) {
		TakesScreenshot ts=(TakesScreenshot)driver;
	    File source=ts.getScreenshotAs(OutputType.FILE);
	    
		try 
		{
			FileUtils.copyFile(source, new File(path));
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
		
	}
	public void getTitle() {
		String title=driver.getTitle();
		System.out.println(driver.getTitle());
		//Assert.assertEquals(title, "Expected");
		
	}
	public void actions(String locator)
	{
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(locator))).click().build().perform();
	}
	public void Explicitwait(WebElement locator1) {
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(locator1));
	}
	

}
