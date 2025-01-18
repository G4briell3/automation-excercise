package tests;

import org.junit.Before;
import org.junit.Test;

import TestData.URL;

public class TestCase16 extends BaseTest
{
  @Before @Override
  public void before()
  {
		 super.before();
		 driver.get(URL.MainPage);
		 mainPage.checkIconsOnPage();
  }
  
  @Test
  public void test16() throws InterruptedException
  {
		 mainPage.clickSignupLoginButton();
		 signupLoginPage.checkLoginVisibility();
		 signupLoginPage.enterLoginDetails(loginInformation);	
		 mainPage.checkAccountLogin(loginInformation);
		 mainPage.addProductsToCart();
		 mainPage.clickCartIcon();
		 cartPage.checkItemsOnPageLoggedUser();
		 cartPage.clickProceedToCheckout();		 
		 cartPage.checkDeliveryBillingInformation(deliveryBillingInfo); 
		 cartPage.addCommentInTextarea();
		 cartPage.clickPlaceOrderButton();
		 cartPage.enterPaymentInformation(enterPaymentInformation);
		 cartPage.clickPayAndConfirmOrder();
		 cartPage.verifyOrderPlacementSuccessMessage();
		 //mainPage.clickDeleteAccount(); - de facut cu cart page
		 //accountConfirmationPage.checkAccountDeletionMessage();
		 //accountConfirmationPage.clickContinue();	
  }
}
