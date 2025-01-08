package tests;

import org.junit.Before;
import org.junit.Test;

import TestData.URL;

public class TestCase5 extends BaseTest
{
  @Before @Override
  public void before()
  {
	  super.before();
	  driver.get(URL.MainPage);
	  mainPage.checkIconsOnPage();
	  mainPage.clickSignupLoginButton();

  }
  
  @Test
  public void Test5() //Register User with existing email
  {
	  signupLoginPage.checkIconsOnPage();
	  signupLoginPage.enterSignupDetailsExisting(createUser);
	  signupLoginPage.checkSignupErrorMessage(); 
  }
}
