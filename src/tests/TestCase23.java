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
  public void test23() throws InterruptedException
  {
	  mainPage.clickSignupLoginButton();
	  signupLoginPage.checkIconsOnPage();
  	  signupLoginPage.enterSignupDetails(createUser);
  	  enterAccountInformationPage.selectTitle("Mrs");  	
  	
  	  enterAccountInformationPage.selectCountry("United States");
  	  enterAccountInformationPage.selectDateOfBirth("20", "July", "1984"); 
  	  enterAccountInformationPage.fillDetails(accountInformation); 
  	  //Thread.sleep(3000);
  	  enterAccountInformationPage.storringDataFromForm();
  	  
  	  //Alert alert=driver.switchTo().alert();
  	  //alert.accept();
  	  enterAccountInformationPage.clickCreateAccountButton();
  	  accountConfirmationPage.checkIconsOnPage();  	  
  	  accountConfirmationPage.checkAccountConfirmationMessage(); 	
  	  
  	  accountConfirmationPage.clickContinue();
  	  //Thread.sleep(3000);

  	  //Thread.sleep(10000);
  	  mainPage.checkAccountCreation(createUser);
  	  mainPage.addProductsToCart();
  	  mainPage.clickCartIcon();
  	  cartPage.checkItemsOnPageLoggedUser();
  	  cartPage.clickProceedToCheckout();
  	  enterAccountInformationPage.readingDataAndCompareWithCheckoutData(); //de mutat in cart page
  	  //cartPage.checkDeliveryBillingInformation(deliveryBillingInfo); //de facut aici altfel(poate schimbat jsonul cu cel de la inregistrare) 
  	 cartPage.clickPlaceOrderButton();
	 cartPage.enterPaymentInformation(enterPaymentInformation);
	 cartPage.clickDeleteAccountIcon();
	 accountConfirmationPage.checkAccountDeletionMessage();
	 accountConfirmationPage.clickContinue();
  }
}
