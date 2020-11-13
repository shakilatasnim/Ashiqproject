package com.PageObjectModel;

import org.openqa.selenium.WebDriver;

public class DressesPage {
public void Dresses(WebDriver driver) {
	

	LoginPage dress= new LoginPage(driver);
	dress.getDresses().click();
	

}
}//(//a[@title='Dresses'])[2] dresses