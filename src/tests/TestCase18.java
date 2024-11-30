package tests;

import org.junit.Before;
import org.junit.Test;

import TestData.URL;

public class TestCase18 extends BaseTest
{
 @Before @Override
 public void before()
 {
	 super.before();
	 driver.get(URL.MainPage);
	 mainPage.checkIconsOnPage();
 }
 
 @Test
 public void test18() //View Category Products
 {
	 mainPage.clickWomenCategory();
	 mainPage.clickTopsFromWomenCategory();
	 productsPage.verifyWomenCategoryPageTitle();
	 productsPage.selectTshirtsSubcategoryFromMenCategory();
	 productsPage.verifyMenCategoryPageTitle();
 }
}
