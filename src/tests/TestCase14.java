package tests;

import org.junit.Before;
import org.junit.Test;

import TestData.URL;

public class TestCase14 extends BaseTest
{
 @Before @Override
 public void before()
 {
	  super.before();
	  driver.get(URL.MainPage);
	  mainPage.checkIconsOnPage();
 }
 
 @Test
 public void test14() throws InterruptedException  //Place Order: Register while Checkout
 {
	 mainPage.addProductsToCart();
	 mainPage.clickCartIcon();
	 cartPage.checkItemsOnPage();
	 cartPage.clickProceedToCheckout();
	 cartPage.clickRegisterLoginFromModal();
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
	 mainPage.clickCartIcon();
	 cartPage.clickProceedToCheckout(); 
	 cartPage.reviewOrder();
	 cartPage.checkDeliveryBillingInformation(deliveryBillingInfo);
	 cartPage.addCommentInTextarea();
	 cartPage.clickPlaceOrderButton();
	 cartPage.enterPaymentInformation(enterPaymentInformation);
	 cartPage.clickPayAndConfirmOrder();
	 cartPage.verifyOrderPlacementSuccessMessage();
	 cartPage.clickContinueAfterOrder();
	 cartPage.clickDeleteAccountIcon();
	 accountConfirmationPage.checkAccountDeletionMessage();
	 accountConfirmationPage.clickContinue();
	 
 }
}
