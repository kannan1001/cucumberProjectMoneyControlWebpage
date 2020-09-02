package com.baseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Library {
	public static WebDriver driver;
	public static Properties properties;
	public static Logger logger;

	public Library() {
		properties = new Properties();
		try {
			InputStream inputStream = new FileInputStream("src/test/resources/resources/ConfigProperties/config.properties");
			try {
				properties.load(inputStream);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		logger = Logger.getLogger("OrangeHRMApplication");
		PropertyConfigurator.configure("src/test/resources/resources/Log4jProperties/log4j.properties");

	}

	public static void browserSetUp() {
		logger.info("Starting with Browser Set Up");
		String browser = properties.getProperty("browser");
		String url = properties.getProperty("url");

	switch (browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			logger.info(String.format("Identified the browser as %s. Launching the browser", browser));
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			logger.info(String.format("Identified the browser as %s. Launching the browser", browser));
			break;

		case "ie":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			logger.info(String.format("Identified the browser as %s. Launching the browser", browser));
			break;

		case "headlessbrowser":
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.setHeadless(true);
			driver = new ChromeDriver(options);
			

		default:
			logger.info(String.format("Could not identify the browser as %s. Please specify correct browser", browser));
			break;
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		logger.info("Launched the Orange Application");
	}
	public void getTitle() {
		String title=driver.getTitle();
		System.out.println(driver.getTitle());
		
	}
	public void dropdown(String locator) {
		
		Select menu= new Select(driver.findElement(By.xpath(locator)));

	}
	
	public void screenshot(String path) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
	    File source=ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(source, new File(path));
	}

	public static void tearDown() {
		driver.quit();
		logger.info("Exiting the application and closing the browser");
	}
}
