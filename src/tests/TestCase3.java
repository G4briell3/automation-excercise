package tests;

import org.junit.Before;
import org.junit.Test;

import TestData.URL;

public class TestCase3 extends BaseTest
{
  @Before @Override
  public void before()
  {
	  super.before();
	  driver.get(URL.MainPage);
  }
  
  @Test
  public void Test3() //Login User with incorrect email and password
  {
	  mainPage.checkIconsOnPage();
	  mainPage.clickSignupLoginButton();
	  signupLoginPage.checkLoginHeaderText();
	  signupLoginPage.enterLoginDetails(incorrectCredentials);
	  signupLoginPage.checkLoginErrorMessage();
  }
}
