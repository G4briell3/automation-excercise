package tests;

import org.junit.Before;
import org.junit.Test;

import TestData.URL;
import Utils.PageScrool;

public class TestCase25 extends BaseTest
{
 @Before @Override
 public void before()
 {
	  super.before();
	  driver.get(URL.MainPage);
	  mainPage.checkIconsOnPage();
 }
 
 @Test
 public void test25() //Verify Scroll Up using 'Arrow' button and Scroll Down functionality
 {
	 PageScrool.ScroolDown(driver);
	 mainPage.checkSubscriptionText();
	 mainPage.clickScroolUpButton();
	 mainPage.checkPageTextFromCarousel();
 }
}
