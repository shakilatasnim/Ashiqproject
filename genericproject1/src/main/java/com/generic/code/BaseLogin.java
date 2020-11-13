package com.generic.code;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.PageObjectModel.LoginPage;
import com.utility.Highlight;

public class BaseLogin{
public static WebDriver driver;
	
public static WebDriver setup() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\alshakailin\\git\\repository\\Brismtech\\src\\Driver\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		LoginPage lp=new LoginPage(driver);
		driver.get(lp.getUrl());
		return driver;
	}
	 
	/*public void loging() {
	//driver.findElement(By.xpath("//div[@class='ui-cookie-consent-choose-wrap']/div/div/button[2]")).click();
		pf.getCookies().click();

		//driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		
		pf.getSignin().click();
		//WebElement emailtext= driver.findElement(By.id("signin_email"));
		 pf.getEmail();
		
		 Highlight h1= new Highlight();
		pf.getEmail().sendKeys("s.tasnimusa@gmail.com");

		
		h1.getColor(driver, pf.getEmail());

		//WebElement pw=driver.findElement(By.id("signin_password"));
		
		pf.getPassword();
		h1.getColor(driver,pf.getPassword());

		pf.getPassword().sendKeys("aiman2018");
		
		pf.getSubmit().click();
		
	}
	
	 
	public void validatelogin() {
		String actual= driver.getTitle();
		if(actual.equalsIgnoreCase("Zoopla >Search Property to Buy, Rent, House Prices, Estate Agents")){
		
		System.out.println("loged in successfully");
		}
		
		else {
			
				
			System.out.println("log in failed");
		}
	}     //Zoopla > Search Property to Buy, Rent, House Prices, Estate Agents

	
	public void tearDown() {
		 driver.close();
	
		}	
	

*/
}
