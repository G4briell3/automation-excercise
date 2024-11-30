package tests;

import org.junit.Before;
import org.junit.Test;

import TestData.URL;

public class TestCase20 extends BaseTest
{
  @Before @Override
  public void before()
  {
	  super.before();
	  driver.get(URL.MainPage);	  
	  mainPage.checkIconsOnPage();
  }
  
  @Test
  public void test20()
  {
	  mainPage.clickProducts();
	  productsPage.checkItemsOnPage();
	  productsPage.searchProduct("Blue");
	  productsPage.verifySearchedProductPageText();
	  productsPage.checkListItemsAfterSearch("Blue");
  }
}
