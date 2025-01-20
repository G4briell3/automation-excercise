package pages;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import TestData.Messages;
import TestData.ProductsDetails;
import TestData.classes.DeliveryBillingInformation;
import TestData.classes.DeliveryInformation;
import TestData.classes.PaymentInformation;

public class CartPage 
{
 WebDriver driver;
 public CartPage(WebDriver driver)
 {
	 this.driver=driver;
 }
 
 //private By pageTitle=By.xpath("//h2[@class=\"title text-center\"]");
 private By homeIcon=By.xpath("//ul[@class=\"nav navbar-nav\"]/li/a/i[@class=\"fa fa-home\"]");
 private By productsIcon=By.xpath("//ul[@class=\"nav navbar-nav\"]/li/a[@href=\"/products\"]");
 private By cartIcon=By.xpath("//ul[@class=\"nav navbar-nav\"]/li/a[@href=\"/view_cart\"]");
 private By signupLoginIcon=By.xpath("//ul[@class=\"nav navbar-nav\"]/li/a[@href=\"/login\"]");
 private By testCasesIcon=By.xpath("//ul[@class=\"nav navbar-nav\"]/li/a[@href=\"/test_cases\"]");
 private By apiTestingIcon=By.xpath("//ul[@class=\"nav navbar-nav\"]/li/a[@href=\"/api_list\"]");
 private By videoTutorialsIcon=By.xpath("//ul[@class=\"nav navbar-nav\"]/li/a[@href=\"https://www.youtube.com/c/AutomationExercise\"]");
 private By contactUsIcon=By.xpath("//ul[@class=\"nav navbar-nav\"]/li/a[@href=\"/contact_us\"]");
 private By subscriptionText=By.xpath("//h2[contains(.,\"Subscription\")]");
 private By subscribeEmailInputField=By.xpath("//input[@id=\"susbscribe_email\"]");
 private By subscriptionButton=By.xpath("//button[@id=\"subscribe\"]");
 private By logoutButton=By.xpath("//a[@href=\"/logout\"]");
 private By subscriptionConfirmationMessage=By.xpath("//div[@class=\"alert-success alert\"]");
 private By descriptionOfProduct1=By.xpath("//tr[@id=\"product-1\"]/td[@class=\"cart_description\"]/h4");
 private By descriptionOfProduct2=By.xpath("//tr[@id=\"product-2\"]/td[@class=\"cart_description\"]/h4");
 private By priceOfProduct1=By.xpath("//tr[@id=\"product-1\"]/td[@class=\"cart_price\"]");
 private By priceOfProduct2=By.xpath("//tr[@id=\"product-2\"]/td[@class=\"cart_price\"]");
 private By quantityOfProduct1=By.xpath("//tr[@id=\"product-1\"]/td[@class=\"cart_quantity\"]");
 private By quantityOfProduct2=By.xpath("//tr[@id=\"product-2\"]/td[@class=\"cart_quantity\"]");
 private By totalPriceOfProduct1=By.xpath("//tr[@id=\"product-1\"]/td[@class=\"cart_total\"]");
 private By totalPriceOfProduct2=By.xpath("//tr[@id=\"product-2\"]/td[@class=\"cart_total\"]");
 private By proceedToCheckoutButton=By.xpath("//a[@class=\"btn btn-default check_out\"]");
 private By registerLoginFromModal=By.xpath("//a[@href=\"/login\"][contains(.,\"Register\")]");
 private By deliveryAddressInfo=By.xpath("//ul[@id=\"address_delivery\"]"); 
 private By deliveryTitleFirstLastName=By.xpath("//ul[@id=\"address_delivery\"]/li[@class=\"address_firstname address_lastname\"]");
 private By deliveryCityStateZipcode=By.xpath("//ul[@id=\"address_delivery\"]/li[@class=\"address_city address_state_name address_postcode\"]");
 private By deliveryCountry=By.xpath("//ul[@id=\"address_delivery\"]/li[@class=\"address_country_name\"]");
 private By deliveryMobile=By.xpath("//ul[@id=\"address_delivery\"]/li[@class=\"address_phone\"]");
 private By billingAddressInfo=By.xpath("//ul[@id=\"address_invoice\"]");
 private By billingAddressFirstLastName=By.xpath("//ul[@id=\"address_invoice\"]/li[@class=\"address_firstname address_lastname\"]");
 private By billingCityStateZipcode=By.xpath("//ul[@id=\"address_invoice\"]/li[@class=\"address_city address_state_name address_postcode\"]");
 private By billingCountry=By.xpath("//ul[@id=\"address_invoice\"]/li[@class=\"address_country_name\"]");
 private By billingMobile=By.xpath("//ul[@id=\"address_invoice\"]/li[@class=\"address_phone\"]");
 
 private By addComentTextbox=By.xpath("//textarea");
 private By placeOrderButton=By.xpath("//a[@class=\"btn btn-default check_out\"]");
 private By removeProduct1Button=By.xpath("//a[@class=\"cart_quantity_delete\"][@data-product-id=\"1\"]");
 private By removeProduct2Button=By.xpath("//a[@class=\"cart_quantity_delete\"][@data-product-id=\"2\"]");
 private By removeProduct3Button=By.xpath("//a[@class=\"cart_quantity_delete\"][@data-product-id=\"3\"]");
 private By emptyCartMessage=By.xpath("//span[@id=\"empty_cart\"]/p[@class=\"text-center\"]");
 private By deleteAccountButton=By.xpath("//a[@href=\"/delete_account\"]");
 private By reviewOrderHeaader=By.xpath("//div[@class=\"step-one\"]/h2[contains(.,\"Review Your Order\")]");
 private By downloadInvoiceButton=By.xpath("//a[@class=\"btn btn-default check_out\"]");
 private By continueButton=By.xpath("//a[@class=\"btn btn-primary\"]");
 
 //payment page (de mutat daca e cazul)
 private By nameOnCardTextbox=By.xpath("//input[@name=\"name_on_card\"]");
 private By cardNumberTextbox=By.xpath("//input[@name=\"card_number\"]");
 private By cvcTextbox=By.xpath("//input[@name=\"cvc\"]");
 private By expirationMonthTextbox=By.xpath("//input[@name=\"expiry_month\"]");
 private By expirationYearTextbox=By.xpath("//input[@name=\"expiry_year\"]");
 private By payAndConfirmOrderButton=By.xpath("//button[@id=\"submit\"]");
 private By successAlertMessage=By.xpath("//div[@class=\"alert-success alert\"][contains(.,\"order\")]");
 //end of payment page
 
 private By product1FromRecommended=By.xpath("//a[@href=\"/product_details/1\"]");
 
 public void checkItemsOnPage()
 {
	 driver.findElement(homeIcon).isDisplayed();
	 driver.findElement(productsIcon).isDisplayed();
	 driver.findElement(cartIcon).isDisplayed();
	 driver.findElement(signupLoginIcon).isDisplayed();
	 driver.findElement(testCasesIcon).isDisplayed();
	 driver.findElement(apiTestingIcon).isDisplayed();
	 driver.findElement(videoTutorialsIcon).isDisplayed();
	 driver.findElement(contactUsIcon).isDisplayed(); 
	 driver.findElement(subscriptionText).isDisplayed();
	 driver.findElement(subscribeEmailInputField).isDisplayed();
	 driver.findElement(subscriptionButton).isDisplayed();
 }
 
 public void checkItemsOnPageLoggedUser()
 {
	 driver.findElement(homeIcon).isDisplayed();
	 driver.findElement(productsIcon).isDisplayed();
	 driver.findElement(cartIcon).isDisplayed();
	 driver.findElement(logoutButton).isDisplayed();
	 driver.findElement(testCasesIcon).isDisplayed();
	 driver.findElement(apiTestingIcon).isDisplayed();
	 driver.findElement(videoTutorialsIcon).isDisplayed();
	 driver.findElement(contactUsIcon).isDisplayed(); 
	 driver.findElement(subscriptionText).isDisplayed();
	 driver.findElement(subscribeEmailInputField).isDisplayed();
	 driver.findElement(subscriptionButton).isDisplayed();
 } 
 
 public void checkSubscriptionText()
 {
 	Assert.assertEquals(Messages.subscriptionText, driver.findElement(subscriptionText).getText());
 }
 
 public void enterSubscriptionEmail(String email)
 {
 	driver.findElement(subscribeEmailInputField).sendKeys(email);
 	driver.findElement(subscriptionButton).click();
 }
 
 public void checkSubscriptionMessage()
 {
 	driver.findElement(subscriptionConfirmationMessage).isDisplayed();
 	Assert.assertEquals(Messages.subscriptionConfirmationMessage, driver.findElement(subscriptionConfirmationMessage).getText());
 }
 public void checkFirstTwoProductsInCart()
 {
	 Assert.assertEquals(ProductsDetails.descriptionOfProduct1,driver.findElement(descriptionOfProduct1).getText());
	 Assert.assertEquals(ProductsDetails.descriptionOfProduct2,driver.findElement(descriptionOfProduct2).getText());
 }
 public void checkFirstTwoProductsDetails()
 {
	 Assert.assertEquals(ProductsDetails.priceOfProduct1,driver.findElement(priceOfProduct1).getText());
	 Assert.assertEquals(ProductsDetails.priceOfProduct2,driver.findElement(priceOfProduct2).getText());
	 Assert.assertEquals(ProductsDetails.quantityOfProduct1, driver.findElement(quantityOfProduct1).getText());
	 Assert.assertEquals(ProductsDetails.quantityOfProduct2, driver.findElement(quantityOfProduct2).getText());
	 Assert.assertEquals(ProductsDetails.totalPriceOfProduct1, driver.findElement(totalPriceOfProduct1).getText());
	 Assert.assertEquals(ProductsDetails.totalPriceOfProduct2, driver.findElement(totalPriceOfProduct2).getText());
 }
 public void checkProduct1InCart()
 {
	 Assert.assertEquals(ProductsDetails.descriptionOfProduct1,driver.findElement(descriptionOfProduct1).getText());
	 Assert.assertEquals(ProductsDetails.priceOfProduct1,driver.findElement(priceOfProduct1).getText());
	 Assert.assertEquals(ProductsDetails.quantityOf4Product1, driver.findElement(quantityOfProduct1).getText());
	 Assert.assertEquals(ProductsDetails.totalPriceOf4Product1, driver.findElement(totalPriceOfProduct1).getText());
 }
 public void clickProceedToCheckout()
 {
	 driver.findElement(proceedToCheckoutButton).click();
 }
 public void clickRegisterLoginFromModal()
 {
	 driver.findElement(registerLoginFromModal).click();
 }
 public void checkDeliveryBillingInformation(DeliveryInformation details)
 {
	 String actualAddress=driver.findElement(deliveryAddressInfo).getText();
	 String expectedAddress=details.getDeliveryAddress();
	 actualAddress = actualAddress.replaceAll("\\s+", " ");
	 expectedAddress = expectedAddress.replaceAll("\\s+", " ");
	 Assert.assertEquals(expectedAddress, actualAddress);	 
	 
	 String actualBilling=driver.findElement(billingAddressInfo).getText();
	 String expectedBilling=details.getBillingAddress();
	 actualBilling=actualBilling.replaceAll("\\s+", " ");
	 expectedBilling=expectedBilling.replaceAll("\\s+", " ");
	 Assert.assertEquals(expectedBilling, actualBilling);
 } 

 public void addCommentInTextarea() //throws InterruptedException
 {
	 driver.findElement(addComentTextbox).sendKeys("description");
	 //Thread.sleep(3000);
 }
 
 public void clickPlaceOrderButton()
 {
	 driver.findElement(placeOrderButton).click();
 }
 
 public void enterPaymentInformation(PaymentInformation info) 
 {
	 driver.findElement(nameOnCardTextbox).sendKeys(info.getEnterNameOnCard());
	 driver.findElement(cardNumberTextbox).sendKeys(info.getEnterCardNumber());
	 driver.findElement(cvcTextbox).sendKeys(info.getEnterCvc());
	 driver.findElement(expirationMonthTextbox).sendKeys(info.getEnterExpirationMonth());
	 driver.findElement(expirationYearTextbox).sendKeys(info.getEnterExpirationYear());	 
}
 public void clickPayAndConfirmOrder() 
 {
	 driver.findElement(payAndConfirmOrderButton).click();
 }
 
 public void verifyOrderPlacementSuccessMessage()
 {
		driver.navigate().back();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement successElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'alert-success') and contains(@class, 'alert')]")));

		String successMessage = successElement.getText();
		//System.out.println("Success Message: " + successMessage);
		Assert.assertEquals(Messages.orderPlaceSuccessMessage, successMessage );
		driver.navigate().forward();
 }
 
 public void removeProductsFromCart() //throws InterruptedException
 {
	 driver.findElement(removeProduct1Button).click();
	 driver.findElement(removeProduct2Button).click();
	 driver.findElement(removeProduct3Button).click();
	 //Thread.sleep(3000);
 }
 
 public void checkRemoveConfirmationMessage()
 {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	 WebElement successElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id=\"empty_cart\"]")));
	 Assert.assertTrue(successElement.getText().contains("Cart is empty!"));
 }
 
 public void clickDeleteAccountIcon()
 {
	 driver.findElement(deleteAccountButton).click();
 }
 
 public void checkItemFromRecommendedItems() //if other product is selected in addToCart must be modified here too
 {
	 Assert.assertEquals(ProductsDetails.descriptionOfProduct1, driver.findElement(product1FromRecommended).getText());
 }
 
 public void readingDataAndCompareWithCheckoutData()
 {
 	ObjectMapper objectMapper= new ObjectMapper();
 	try
 	{
 		//this part is for delivery address 		
 		Map<String,String> data=objectMapper.readValue(new File("data.json"),new TypeReference<Map<String, String>>() {});
 		String titleFromJson=data.get("title");  		
 		List<WebElement> deliveryCompanyAndAddresses = driver.findElements(By.xpath("//ul[@id=\"address_delivery\"]/li[@class=\"address_address1 address_address2\"]"));
 		String deliveryCompanyText="";
 		String deliveryMainAddressText="";
 		String deliverySecondAddressText=""; 
 		for (int i=0;i<deliveryCompanyAndAddresses.size();i++) //because all 3 hsve the same xpath ^ I have to go through them all with a loop
 		{
 			deliveryCompanyText=deliveryCompanyAndAddresses.get(0).getText();
 			deliveryMainAddressText=deliveryCompanyAndAddresses.get(1).getText();
 			deliverySecondAddressText=deliveryCompanyAndAddresses.get(2).getText();
 		}
 		String companyFromJson=data.get("company");
 		String mainAddressFromJson=data.get("addr1");
 		String secondAddress=data.get("addr2");
 		String cityStateZipcodeFromJson=data.get("cityStateZipcode");
 		String countryFromJson=data.get("country");
 		String mobileFromJson=data.get("mobile");
 		Assert.assertEquals(titleFromJson, driver.findElement(deliveryTitleFirstLastName).getText());
 		Assert.assertEquals(companyFromJson, deliveryCompanyText);	 		
 		Assert.assertEquals(mainAddressFromJson, deliveryMainAddressText); 		
 		Assert.assertEquals(secondAddress, deliverySecondAddressText); 		 		
 		Assert.assertEquals(cityStateZipcodeFromJson, driver.findElement(deliveryCityStateZipcode).getText()); 		
 		Assert.assertEquals(countryFromJson, driver.findElement(deliveryCountry).getText()); 		
 		Assert.assertEquals(mobileFromJson, driver.findElement(deliveryMobile).getText());
 		
 		//this part is for billing address 		
 		List<WebElement> billingCompanyAddresses=driver.findElements(By.xpath("//ul[@id=\"address_invoice\"]/li[@class=\"address_address1 address_address2\"]"));
 		String billingCompanyText="";
 		String billingMainAddressText="";
 		String billingSecondAddressText="";
 		for(int i=0;i<billingCompanyAddresses.size();i++)
 		{
 			billingCompanyText=billingCompanyAddresses.get(0).getText();
 			billingMainAddressText=billingCompanyAddresses.get(1).getText();
 			billingSecondAddressText=billingCompanyAddresses.get(2).getText();
 		}
 		Assert.assertEquals(titleFromJson, driver.findElement(billingAddressFirstLastName).getText());
 		Assert.assertEquals(companyFromJson, billingCompanyText) ;
 		Assert.assertEquals(mainAddressFromJson, billingMainAddressText);
 		Assert.assertEquals(secondAddress, billingSecondAddressText);
 		Assert.assertEquals(cityStateZipcodeFromJson, driver.findElement(billingCityStateZipcode).getText());
 		Assert.assertEquals(countryFromJson, driver.findElement(billingCountry).getText());
 		Assert.assertEquals(mobileFromJson, driver.findElement(billingMobile).getText());
 		}
 	catch (IOException e)
 	{
 		e.printStackTrace();
 	} 	
 }
 
 public void checkItemsAddedFromSearch(String produs)
 {
	 List<WebElement> listaDinCos=driver.findElements(By.xpath("//div[@id=\"cart_info\"]/descendant::td[@class=\"cart_description\"]"));
	 List<String> valoriListaDinCos= new ArrayList<String>();
	 for(WebElement element:listaDinCos)
	 {
		 valoriListaDinCos.add(element.getText());
	 }
	 for(String element:valoriListaDinCos)
	 {
		 Assert.assertTrue(element.toLowerCase().contains(produs));
	 }
 }
 
 public void clickSignupLoginButton()
 {
	 driver.findElement(signupLoginIcon).click();
 }
 
 public void reviewOrder()
 {	 
	 driver.findElement(reviewOrderHeaader).isDisplayed();
	 Assert.assertTrue(driver.findElement(reviewOrderHeaader).getText().contains("Review Your Order"));
	 List<String> valoriListaProduse=new ArrayList<String>();
	 ObjectMapper objectMapper=new ObjectMapper();
	 try
	 {
		 valoriListaProduse =objectMapper.readValue(new File("produse.json"), new TypeReference<List<String>>() {});
	 }
	 catch(IOException e)
	 {
		 e.printStackTrace();
	 }	 
	 List<WebElement> productsFromCart=driver.findElements(By.xpath("//td[@class=\"cart_description\"]/h4/a"));
	 List<String> valueproductsFromCart=new ArrayList<String>();
	 for(WebElement element:productsFromCart)
	 {
		 valueproductsFromCart.add(element.getText()); 
	 }	 
	 System.out.println("valueproductsFromCart ="+valueproductsFromCart);
	 for(String element:valueproductsFromCart)
	 {	
		 System.out.println("produs  = "+element);
		 Assert.assertTrue(valoriListaProduse.contains(element));		 
	 }	 
 }
 
 public void clickContinueAfterOrder() 
 {
	 driver.findElement(continueButton).isDisplayed();
	 driver.findElement(continueButton).click();
 }
 
 public void clickDownloadInvoice()
 {
	 driver.findElement(downloadInvoiceButton).isDisplayed();
	 driver.findElement(downloadInvoiceButton).click();
 }
}
