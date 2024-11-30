package pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
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
 private By billingAddressInfo=By.xpath("//ul[@id=\"address_invoice\"]");
 private By addComentTextbox=By.xpath("//textarea");
 private By placeOrderButton=By.xpath("//a[@class=\"btn btn-default check_out\"]");
 private By removeProduct1Button=By.xpath("//a[@class=\"cart_quantity_delete\"][@data-product-id=\"1\"]");
 private By removeProduct2Button=By.xpath("//a[@class=\"cart_quantity_delete\"][@data-product-id=\"2\"]");
 private By removeProduct3Button=By.xpath("//a[@class=\"cart_quantity_delete\"][@data-product-id=\"3\"]");
 private By emptyCartMessage=By.xpath("//span[@id=\"empty_cart\"]/p[@class=\"text-center\"]");
 
 //payment page (de mutat daca e cazul)
 private By nameOnCardTextbox=By.xpath("//input[@name=\"name_on_card\"]");
 private By cardNumberTextbox=By.xpath("//input[@name=\"card_number\"]");
 private By cvcTextbox=By.xpath("//input[@name=\"cvc\"]");
 private By expirationMonthTextbox=By.xpath("//input[@name=\"expiry_month\"]");
 private By expirationYearTextbox=By.xpath("//input[@name=\"expiry_year\"]");
 private By payAndConfirmOrderButton=By.xpath("//button[@id=\"submit\"]");
 private By successAlertMessage=By.xpath("//div[@class=\"alert-success alert\"][contains(.,\"order\")]");
 
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
 	Assert.assertEquals("SUBSCRIPTION", driver.findElement(subscriptionText).getText());
 }
 
 public void enterSubscriptionEmail(String email)
 {
 	driver.findElement(subscribeEmailInputField).sendKeys(email);
 	driver.findElement(subscriptionButton).click();
 }
 
 public void checkSubscriptionMessage()
 {
 	driver.findElement(subscriptionConfirmationMessage).isDisplayed();
 	Assert.assertEquals("You have been successfully subscribed!", driver.findElement(subscriptionConfirmationMessage).getText());
 }
 public void checkFirstTwoProductsInCart()
 {
	 Assert.assertEquals("Blue Top",driver.findElement(descriptionOfProduct1).getText());
	 Assert.assertEquals("Men Tshirt",driver.findElement(descriptionOfProduct2).getText());
 }
 public void checkFirstTwoProductsDetails()
 {
	 Assert.assertEquals("Rs. 500",driver.findElement(priceOfProduct1).getText());
	 Assert.assertEquals("Rs. 400",driver.findElement(priceOfProduct2).getText());
	 Assert.assertEquals("1", driver.findElement(quantityOfProduct1).getText());
	 Assert.assertEquals("1", driver.findElement(quantityOfProduct2).getText());
	 Assert.assertEquals("Rs. 500", driver.findElement(totalPriceOfProduct1).getText());
	 Assert.assertEquals("Rs. 400", driver.findElement(totalPriceOfProduct2).getText());
 }
 public void checkProduct1InCart()
 {
	 Assert.assertEquals("Blue Top",driver.findElement(descriptionOfProduct1).getText());
	 Assert.assertEquals("Rs. 500",driver.findElement(priceOfProduct1).getText());
	 Assert.assertEquals("4", driver.findElement(quantityOfProduct1).getText());
	 Assert.assertEquals("Rs. 2000", driver.findElement(totalPriceOfProduct1).getText());
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
 
 public void enterPaymentInformation(PaymentInformation info) throws InterruptedException
 {
	 driver.findElement(nameOnCardTextbox).sendKeys(info.getEnterNameOnCard());
	 driver.findElement(cardNumberTextbox).sendKeys(info.getEnterCardNumber());
	 driver.findElement(cvcTextbox).sendKeys(info.getEnterCvc());
	 driver.findElement(expirationMonthTextbox).sendKeys(info.getEnterExpirationMonth());
	 driver.findElement(expirationYearTextbox).sendKeys(info.getEnterExpirationYear());	 
}
 public void clickPayAndConfirmOrder() throws InterruptedException
 {
	 driver.findElement(payAndConfirmOrderButton).click();
 }
 
 public void verifySuccessMessage()
 {
		driver.navigate().back();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement successElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'alert-success') and contains(@class, 'alert')]")));

		String successMessage = successElement.getText();
		//System.out.println("Success Message: " + successMessage);
		Assert.assertEquals("Your order has been placed successfully!", successMessage );
		driver.navigate().forward();
 }
 
 public void removeProductsFromCart() throws InterruptedException
 {
	 driver.findElement(removeProduct1Button).click();
	 driver.findElement(removeProduct2Button).click();
	 driver.findElement(removeProduct3Button).click();
	 Thread.sleep(3000);
 }
 
 public void checkRemoveConfirmationMessage()
 {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	 WebElement successElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id=\"empty_cart\"]")));
	 Assert.assertTrue(successElement.getText().contains("Cart is empty!"));
 }
}
