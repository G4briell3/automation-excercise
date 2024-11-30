package tests;

import org.junit.Before;
import org.junit.Test;

import TestData.URL;
import Utils.PageScrool;

public class TestCase11 extends BaseTest
{
 @Before @Override
 public void before()
 {
	 super.before();
	 driver.get(URL.MainPage);
	 mainPage.checkIconsOnPage();
 }
 
 @Test
 public void test11() //Verify Subscription in Cart page
 {
	 mainPage.clickCartIcon();
	 cartPage.checkItemsOnPage();
	 PageScrool.ScroolDown(driver);
	 cartPage.checkSubscriptionText();
	 cartPage.enterSubscriptionEmail("gabriela@ganriela.ro");
	 cartPage.checkSubscriptionMessage();
	 
 }
}
