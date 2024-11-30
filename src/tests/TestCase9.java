package tests;

import org.junit.Before;
import org.junit.Test;

import TestData.URL;

public class TestCase9 extends BaseTest
{
 @Before @Override
 public void before()
 {
	 super.before();
	 driver.get(URL.MainPage);	 
	 mainPage.checkIconsOnPage();
 }
 
 @Test
 public void test9()
 {
	 mainPage.clickProducts();
	 productsPage.checkItemsOnPage();
	 productsPage.searchProduct("Top");
	 productsPage.verifySearchedProductPageText();
	 productsPage.checkSearchResult();
	 
 }
}
