package tests;

import org.junit.Before;
import org.junit.Test;

import TestData.URL;

public class TestCase12 extends BaseTest
{
  @Before @Override
  public void before()
  {
	  super.before();
	  driver.get(URL.MainPage);
	  mainPage.checkIconsOnPage();
  }
  
  @Test
  public void test12() //Add Products in Cart
  {
	  mainPage.clickProducts();
	  productsPage.clickAddToCartFirstProduct();
	  productsPage.clickContinueShoppingModal();
	  //Thread.sleep(3000);
	  productsPage.clickAddToCartSecondProduct();
	  productsPage.clickContinueShoppingModal();
	  productsPage.clickCartIcon();
	  cartPage.checkFirstTwoProductsInCart();
	  cartPage.checkFirstTwoProductsDetails();
  }
}
