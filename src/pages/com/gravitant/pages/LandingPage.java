package com.gravitant.pages;

import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;

import com.gravitant.utils.Reporter;
import com.gravitant.tests.RunTests;

public class LandingPage{
	Reporter resultReporter = new Reporter();
	RunTests runTest = new RunTests();
	final WebDriver driver;
	@FindBy(how = How.XPATH, using = "html/body/div[1]/div[2]/a")
	private WebElement loginButton;
	 
	@FindBy(how = How.CSS, using = ".transparentColor>img")
	private WebElement whiteLabelLogo;
	 
	public LandingPage(WebDriver driver) {
	  this.driver = driver;
	}
	 
	public void verifyLandingPage() {
		if(whiteLabelLogo.isDisplayed()==false){
			System.out.println("not displayed");
		}
		driver.getTitle();
	 }

	 public void clickSigninButton() throws IOException {
		 loginButton.click();
	 }
}
