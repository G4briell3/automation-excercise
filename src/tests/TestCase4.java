package tests;

import org.junit.Before;
import org.junit.Test;

import TestData.URL;

public class TestCase4 extends BaseTest
{
  @Before @Override
  public void before()
  {
	  super.before();
	  driver.get(URL.MainPage);
  }
  
  @Test
  public void test4() //Logout User
  {
	  mainPage.checkIconsOnPage();
	  mainPage.clickSignupLoginButton();
	  signupLoginPage.checkLoginHeaderText();
	  signupLoginPage.enterLoginDetails(loginInformation);
	  mainPage.checkAccountLogin(loginInformation);
	  mainPage.clickLogoutButton();
	  signupLoginPage.checkLoginVisibility();
  }
}
