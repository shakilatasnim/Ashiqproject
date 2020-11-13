package com.Runtest;

import org.openqa.selenium.WebDriver;

import com.PageObjectModel.DressesPage;
import com.generic.code.BaseLogin;

public class Logintest {
 static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		 driver=BaseLogin.setup();
		 		 
		DressesPage drs= new DressesPage();
		drs.Dresses(driver);
		
		 
	 
 
	}

}
