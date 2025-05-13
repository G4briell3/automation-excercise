package tests;

import org.junit.Before;
import org.junit.Test;

import TestData.URL;

public class TestCase7 extends BaseTest
{
 @Before @Override
 public void before()
 {
	 super.before();
	  driver.get(URL.MainPage);
	  mainPage.checkIconsOnPage();
 }
 
 @Test
 public void test7() //Verify Test Cases Page
 {
	 mainPage.clickTestCases();
	 testCasesPage.checkIconsAndPage();
 }
}
