package tests;

import org.junit.Before;
import org.junit.Test;

import TestData.URL;

public class TestCase13 extends BaseTest
{
  @Before @Override
  public void before()
  {
	  super.before();
	  driver.get(URL.MainPage);
	  mainPage.checkIconsOnPage();
  }
  
  @Test
  public void test13() //Verify Product quantity in Cart
  {
	  mainPage.clickViewProduct1();
	  product1Page.checkItemsOnPage();
	  product1Page.checkProductDetails(product1Details);
	  product1Page.modifyProductquantity("4");
	  product1Page.addToCartProduct();
	  product1Page.clickViewCart();
	  cartPage.checkProduct1InCart();
	  
  }
}
