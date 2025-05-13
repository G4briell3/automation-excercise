package tests;

import org.junit.Before;
import org.junit.Test;

import TestData.URL;
import Utils.PageScrool;

public class TestCase26 extends BaseTest
{
  @Before @Override
  public void before()
  {
	  super.before();
	  driver.get(URL.MainPage);
	  mainPage.checkIconsOnPage();
  }
  
  @Test
  public void test26() // Verify Scroll Up without 'Arrow' button and Scroll Down functionality
  {
	  PageScrool.ScroolDown(driver);	
	  mainPage.checkSubscriptionText();
	  PageScrool.ScroolUp(driver);
	  mainPage.checkPageTextFromCarousel();
  }
}
