package tests;

import org.junit.Before;
import org.junit.Test;

import TestData.URL;

public class TestCase8 extends BaseTest
{
  @Before @Override
  public void before()
  {
	  super.before();
	  driver.get(URL.MainPage);
	  mainPage.checkIconsOnPage();
  }
  
  @Test
  public void test8()
  {
	  mainPage.clickProducts();
	  productsPage.checkItemsOnPage();
	  productsPage.clickOnViewProduct();
	  product1Page.checkItemsOnPage();
	  product1Page.checkProductDetails(product1Details);
  }
}
