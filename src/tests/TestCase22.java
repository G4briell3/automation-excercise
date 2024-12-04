package tests;

import org.junit.Before;
import org.junit.Test;

import TestData.URL;
import Utils.PageScrool;

public class TestCase22 extends BaseTest
{
@Before @Override
public void before()
{
	  super.before();
	  driver.get(URL.MainPage);	  
	  mainPage.checkIconsOnPage();
}

@Test
public void test22() //Add to cart from Recommended items
{
	mainPage.scroolToBottom();
	mainPage.checkRecommendedItemsTitle();
	mainPage.addToCartRecommendedItem();
	mainPage.clickViewCartFromModal();
	cartPage.checkItemFromRecommendedItems();	
}
}
