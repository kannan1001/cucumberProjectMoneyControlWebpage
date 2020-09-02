package com.pages;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.seleniumUtils.SelUtils;

public class MoneyCtrlSpecials {
	WebDriver driver;
	

	@FindBy(xpath="//div[@class=\"toplinks toptab3\"]")
	WebElement Specials;
	@FindBy(xpath="//*[@id=\"mc_mainWrapper\"]/header/div[1]/div/div[2]/div[1]/div[3]/div/div/div/div[1]/ul/li[10]/a/img")
	WebElement GrowYourBusiness;
	@FindBy(xpath="//a[@title=\"How TransUnion CIBIL is bridging the gap between the MSME sector and lenders\" and @class=\"common_btn hide_mob\"]")
	WebElement ShowMore;
	
	SelUtils su;
	
	
	public MoneyCtrlSpecials(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void HoverOnSpecial() {
		//Subscription.click();
		
		Actions action=new Actions(driver);
		action.moveToElement(Specials).build().perform();
		
	}
	public void clickon_grow_your_business() throws InterruptedException {
		
		//getting the title of home page
		
		String title_of_page = driver.getTitle();
		
		GrowYourBusiness.click();
		String MainWindow=driver.getWindowHandle();		
		
        // To handle all new opened window.				
        Set<String> s1=driver.getWindowHandles();		
        Iterator<String> i1=s1.iterator();	
        System.out.println("MainWindow handle is ->"+MainWindow);
        System.out.println("Window handles in set s1 is"+s1);
        
        
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 	System.out.println("The child window is ->"+ChildWindow);
                 	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
                    
                 	// Switching to Child window
                    driver.switchTo().window(ChildWindow);
                    
                    //Taking Screenshot in child window
                    su=new SelUtils(driver);
            		su.to_take_screenshot("src/test/resources/resources/Screenshots/growyourbusiness2.png");
                    
            		JavascriptExecutor js = (JavascriptExecutor) driver;
            		
            		//Scrolling down to the page until we see ShowMore button(WebElement) in child Window 
            		
            		js.executeScript("arguments[0].scrollIntoView();",ShowMore );
            		Thread.sleep(3000);
                    
            		// Closing the Child Window.
                    driver.close();		
            }		
        }		
        // Switching to Parent window i.e Main Window.
            driver.switchTo().window(MainWindow);	
            
        Assert.assertEquals(driver.getTitle(),title_of_page);
    }
		 
}


