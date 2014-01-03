package com.gravitant.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;

import com.gravitant.utils.Util;

public class LoginPage {
	static Logger LOGS =  Logger.getLogger(Util.class);
	final WebDriver driver;
	@FindBy(how = How.XPATH, using = "//*[@id='fLogin']/div[2]/div/h3")
		private WebElement loginText;
	@FindBy(how = How.ID, using = "username")
		private WebElement usernameTextBox;	
	@FindBy(how = How.ID, using = "password")
		private WebElement passwordTextBox;	
	@FindBy(how = How.CSS, using = ".graExternalSmallButtonOn")
		private WebElement loginButton;
	@FindBy(how = How.XPATH, using = "//*[@id='fLogin']/div[2]/div/div/div[3]/span/a")
		private WebElement forgotPasswordLink;
	
	public LoginPage(WebDriver driver) {
		  this.driver = driver;
	}
	public void enterUsername(String username) {
		 usernameTextBox.clear();
		 LOGS.info("> Logging-in with username: " + username);
		 usernameTextBox.sendKeys(username);
	}
	public void enterPassword(String password) {
		 passwordTextBox.clear();
		 passwordTextBox.sendKeys(password);
	}
	public void clickLoginButton() {
		 loginButton.click();
	}
	public void verifyLoginPage(){
		
	}
}
