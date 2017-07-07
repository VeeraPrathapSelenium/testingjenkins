package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Runner {
	
	@Test
	
	public static void LaunchBrowser()
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.irctc.co.in");
		//driver.navigate().to("www.irctc.co.in");
		
		driver.manage().window().maximize();
		
		
	}
	
	
	
	

}
