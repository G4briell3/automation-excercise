package tests;

import org.junit.Before;
import org.junit.Test;

import TestData.URL;

public class TestCase17 extends BaseTest
{
  @Before @Override
  public void before()
  {
	  super.before();
	  driver.get(URL.MainPage);	  
	  mainPage.checkIconsOnPage();
  }
  
  @Test
  public void test17() throws InterruptedException //Remove Products From Cart
  {
	  mainPage.addProductsToCart();
	  mainPage.clickCartIcon();
	  cartPage.checkItemsOnPage();
	  cartPage.removeProductsFromCart();
	  cartPage.checkRemoveConfirmationMessage();
  }
}
