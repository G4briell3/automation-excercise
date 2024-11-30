package tests;

import org.junit.Before;
import org.junit.Test;

import TestData.URL;

public class TestCase19 extends BaseTest
{
 @Before @Override
 public void before()
 {
	  super.before();
	  driver.get(URL.MainPage);	  
	  mainPage.checkIconsOnPage();
 }
 
 @Test
 public void test19()
 {
	 mainPage.clickProducts();
	 productsPage.checkItemsOnPage();
	 productsPage.clickMadameCathegoryFromBrandsSidebar();
	 productsPage.verifyBrandMadamePageTitle();
	 productsPage.clickBibaCategoryFromBrandsSidebar();
	 productsPage.verifyBrandBibaPageTitle();
 }
 
}
