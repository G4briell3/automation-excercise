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
  	  enterAccountInformationPage.fillDetails(accountInformation); //de scos click pe create account afara
  	  
  	  accountConfirmationPage.checkIconsOnPage();  	  
  	  accountConfirmationPage.checkAccountConfirmationMessage(); 	  
  	  accountConfirmationPage.clickContinue();
  	  Thread.sleep(3000); de vazut de ce nu merge
  	  Alert alert=driver.switchTo().alert();
  	  alert.accept();
  	  //Thread.sleep(10000);
  	  mainPage.checkAccountCreation(createUser);
  	  mainPage.addProductsToCart();
  	  mainPage.clickCartIcon();
  	  cartPage.checkItemsOnPageLoggedUser();
  	  cartPage.clickProceedToCheckout();
  	  cartPage.checkDeliveryBillingInformation(deliveryBillingInfo); //de facut aici altfel(poate schimbat jsonul cu cel de la inregistrare) 
  	  
  }
}
