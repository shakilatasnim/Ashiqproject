package com.utility;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popupbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\alshakailin\\eclipse-workspace\\Brismtech\\src\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://popuptest.com/");
		driver.findElement(By.xpath("(//a[contains(text(),'Multi-PopUp Test')])[1]")).click();
		
		Set<String> cw = driver.getWindowHandles();
		
		 Iterator<String> it= cw.iterator();
		 
		 String pw= it.next();
		 
		   while(it.hasNext()) {
			   String tcw=it.next();
			   if(tcw!=pw) {
				driver.switchTo().window(tcw);
				System.out.println(driver.getTitle());
				driver.close();
				System.out.println("close the current window");
				   
			   }
			   }
			   
			  driver.switchTo().window(pw);
			  
		   }
		   
            		
	
	}


