package tests;

import org.junit.Before;
import org.junit.Test;

import TestData.URL;

public class TestCase6 extends BaseTest
{
	@Before @Override
  public void before()
  {
	  super.before();
	  driver.get(URL.MainPage);
	  mainPage.checkIconsOnPage();
  }
	
	@Test
	public void test6() throws InterruptedException
	{
		mainPage.clickContacUs();
		contactUsPage.checkGetInTouchVisibility();
		contactUsPage.fillInformation(enterInformation);
		contactUsPage.uploadFile();
		contactUsPage.clickSubmit();
		contactUsPage.checkSuccessMessageDisplay();
		contactUsPage.clickHomeButton();
		mainPage.checkIconsOnPage();
	}
}
