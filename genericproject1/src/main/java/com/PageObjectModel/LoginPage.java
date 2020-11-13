package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	private String url ="http://automationpractice.com/index.php";

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	@FindBy(xpath="//button[@class='ui-button-primary ui-cookie-accept-all-medium-large']")
     private WebElement cookies;
	
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	private WebElement signIn;
	
	@FindBy(id="signin_email")
	private WebElement email;
	
	@FindBy(id="signin_password")
      private WebElement password;
	
	@FindBy(id="signin_submit")
	 private WebElement submit;
	
	@FindBy(xpath="//a[@title='Dresses'])[2]")
	private WebElement dresses;
	
    public WebElement getDresses() {
		return dresses;
	}

	public WebElement getSignIn() {
		return signIn;
	}

	public void setSignIn(WebElement signIn) {
		this.signIn = signIn;
	}

	public void setCookies(WebElement cookies) {
		this.cookies = cookies;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}

	public void setDresses(WebElement dresses) {
		this.dresses = dresses;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getCookies() {
		return cookies;
	}

	public WebElement getSignin() {
		return signIn;
	}

	public WebElement getEmail() {
		return email;
	}
	
	
}
