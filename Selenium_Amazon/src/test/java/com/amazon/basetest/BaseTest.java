package com.amazon.basetest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import com.amazon.base.BasePage;
import com.amazon.pages.BusinessPage;
import com.amazon.pages.HomePage;
import com.amazon.pages.RegistrationPage;
import com.amazon.pages.SignInPage;

public class BaseTest {
	public BasePage basePage;
	public HomePage homePage;
	public RegistrationPage registrationPage;
	public SignInPage signInPage;
	public BusinessPage businessPage;
	
	public WebDriver driver;
	
	@BeforeMethod
	public void baseSetUp( ) {
		basePage = new BasePage();
		driver = basePage.getDriver("chrome");
		driver.get("https://www.amazon.in");
		
		registrationPage = new RegistrationPage();
		signInPage = new SignInPage();
		
	}
	
}
