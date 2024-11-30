package tests;

import org.junit.Before;
import org.junit.Test;

import TestData.URL;

public class TestCase21 extends BaseTest
{
 @Before @Override
 public void before()
 {
	  super.before();
	  driver.get(URL.MainPage);	  
	  mainPage.checkIconsOnPage();
 }
 
 @Test
 public void test21()
 {
	 mainPage.clickProducts();
	 productsPage.checkItemsOnPage();
	 productsPage.clickOnViewProduct();
	 product1Page.checkItemsOnPage();
	 product1Page.writeReview(writeReviewData);
	 product1Page.checkReviewSuccessMessage(); de facut si asertia
 }
}
