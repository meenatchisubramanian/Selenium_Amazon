package com.amazon.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.basetest.BaseTest;

public class RegistrationPageTest extends BaseTest{
	@BeforeMethod
	public void setUpPage() {
		homePage.openRegistrationPage();
	}
	
	@Test
	public void isLogoPresentTest() {
		Assert.assertTrue(registrationPage.verifyLogo(), "ERROR: Logo is not present in the page");
	}
	
	@Test
	public void pageTitleTest() {
		Assert.assertEquals(registrationPage.getTitleOfThePage(), "Amazon Registartion", "ERROR - Page title does not match");
	}
	
	@Test
	public void verifyMobileNumberTest() {
		registrationPage.verifyMobileNumberFunctionality();
	}
	
	@Test
	public void clickOnSignInLink() {
		Assert.assertEquals(signInPage.getTitleOfThePage(), "Amazon Sign In", "ERROR - Sign in page is not opened after clicing on sign in link");
	}
	
	@Test
	public void createBusinessAccountTest() {
		registrationPage.clickOnCreateBusinessAccountLink();
		Assert.assertEquals(businessPage.getTitleOfThePage(), "Amazon Business", "ERROR - Amazon Business page is not opened after clicing on sign in link");
	}
}
