package tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

import TestData.URL;
import Utils.PageScrool;

public class TestCase10 extends BaseTest
{
 @Before @Override
 public void before()
 {
	 super.before();
	 driver.get(URL.MainPage);
	 mainPage.checkIconsOnPage();
 }
 
 @Test
 public void test10() 
 {
	 PageScrool.ScroolDown(driver);	
     mainPage.checkSubscriptionText();
     mainPage.enterSubscriptionEmail("gabriela@ganriela.ro");
     mainPage.checkSubscriptionMessage();
 }
}
