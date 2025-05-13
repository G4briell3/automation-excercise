package tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;

import TestData.URL;

public class TestCase23  extends BaseTest
{
  @Before @Override
  public void before()
  {
	  super.before();
	  driver.get(URL.MainPage);	  
	  mainPage.checkIconsOnPage();
  }
  
  @Test
  public void test23() throws InterruptedException //Verify address details in checkout page
  {
	  mainPage.clickSignupLoginButton();
	  signupLoginPage.checkIconsOnPage();
  	  signupLoginPage.enterSignupDetails(createUser);
  	  enterAccountInformationPage.selectTitle("Mrs");  	  	
  	  enterAccountInformationPage.selectCountry("United States");
  	  enterAccountInformationPage.selectDateOfBirth("20", "July", "1984"); 
  	  enterAccountInformationPage.fillDetails(accountInformation);   	
  	  enterAccountInformationPage.storringDataFromForm();  
  	  enterAccountInformationPage.clickCreateAccountButton();
  	  accountConfirmationPage.checkIconsOnPage();  	  
  	  accountConfirmationPage.checkAccountConfirmationMessage(); 
  	  accountConfirmationPage.clickContinue();
  	  mainPage.checkAccountCreation(createUser);
  	  mainPage.addProductsToCart();
  	  mainPage.clickCartIcon();
  	  cartPage.checkItemsOnPageLoggedUser();
  	  cartPage.clickProceedToCheckout();
  	  cartPage.readingDataAndCompareWithCheckoutData(); 
  	  cartPage.clickPlaceOrderButton();
	  cartPage.enterPaymentInformation(enterPaymentInformation);
	  cartPage.clickDeleteAccountIcon();
	  accountConfirmationPage.checkAccountDeletionMessage();
	  accountConfirmationPage.clickContinue();
  }
}
