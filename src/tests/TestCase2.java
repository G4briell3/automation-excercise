package tests;

import org.junit.Before;
import org.junit.Test;

import TestData.URL;

public class TestCase2 extends BaseTest
{
 @Before @Override
 public void before()
 {
	 super.before();
	 driver.get(URL.MainPage);
	 mainPage.checkIconsOnPage();
 }
 
 @Test
 public void test2() throws InterruptedException //Login User with correct email and password
 {	 
	 mainPage.clickSignupLoginButton();
	 signupLoginPage.checkLoginVisibility();
	 signupLoginPage.enterLoginDetails(loginInformation);	
	 mainPage.checkAccountLogin(loginInformation);
	 mainPage.clickDeleteAccount();
	 accountConfirmationPage.checkAccountDeletionMessage();
	 accountConfirmationPage.clickContinue();	 
 }
}
