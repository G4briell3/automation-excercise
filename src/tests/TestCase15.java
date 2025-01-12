package tests;

import org.junit.Before;
import org.junit.Test;

import TestData.URL;

public class TestCase15 extends BaseTest
{
  @Before @Override
  public void before()
  {
	  super.before();
	  driver.get(URL.MainPage);
	  mainPage.checkIconsOnPage();
  }
  
  @Test
  public void test15() throws InterruptedException //Place Order: Register before Checkout
  {
	  mainPage.clickSignupLoginButton();
	  signupLoginPage.checkIconsOnPage();
	  signupLoginPage.enterSignupDetails(newUser);
	  enterAccountInformationPage.checkElementsOnPage();
	  enterAccountInformationPage.selectTitle("Mrs"); //values Mr || Mrs	  
	  enterAccountInformationPage.selectDateOfBirth("4","September","1954"); //Enter : day,month,year
	  enterAccountInformationPage.selectCountry("United States"); //Options: India,United States,Canada,Australia,Israel,New Zealand,Singapore
	  enterAccountInformationPage.fillDetails(accountInformation);
	  enterAccountInformationPage.clickCreateAccountButton();
	  accountConfirmationPage.checkIconsOnPage();
	  accountConfirmationPage.checkAccountConfirmationMessage();
	  accountConfirmationPage.clickContinue();
	  mainPage.checkAccountCreation(newUser);
	  mainPage.addProductsToCart();
	  mainPage.clickCartIcon();
	  cartPage.checkItemsOnPageLoggedUser();
	  cartPage.clickProceedToCheckout();
	  cartPage.checkDeliveryBillingInformation(deliveryBillingInfo); 
	  cartPage.addCommentInTextarea();
	  cartPage.clickPlaceOrderButton();
	  cartPage.enterPaymentInformation(enterPaymentInformation);
	  cartPage.clickDeleteAccountIcon();
	  accountConfirmationPage.checkAccountDeletionMessage();
	  accountConfirmationPage.clickContinue();
  }
}
