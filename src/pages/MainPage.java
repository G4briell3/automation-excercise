package pages;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fasterxml.jackson.databind.ObjectMapper;

import TestData.classes.LoginData;
import TestData.classes.SignupData;
import Utils.PageScrool;


public class MainPage 
{
 WebDriver driver;
 
 public void jsClick(WebElement element) {
     JavascriptExecutor js = (JavascriptExecutor) driver;
     js.executeScript("arguments[0].click();", element);}
 
 
 public MainPage(WebDriver driver)
 {
	 this.driver=driver;
 }
 private By homeIcon=By.xpath("//ul[@class=\"nav navbar-nav\"]/li/a/i[@class=\"fa fa-home\"]");
 private By productsIcon=By.xpath("//ul[@class=\"nav navbar-nav\"]/li/a[@href=\"/products\"]");
 private By cartIcon=By.xpath("//ul[@class=\"nav navbar-nav\"]/li/a[@href=\"/view_cart\"]");
 private By signupLoginIcon=By.xpath("//ul[@class=\"nav navbar-nav\"]/li/a[@href=\"/login\"]");
 private By testCasesIcon=By.xpath("//ul[@class=\"nav navbar-nav\"]/li/a[@href=\"/test_cases\"]");
 private By apiTestingIcon=By.xpath("//ul[@class=\"nav navbar-nav\"]/li/a[@href=\"/api_list\"]");
 private By videoTutorialsIcon=By.xpath("//ul[@class=\"nav navbar-nav\"]/li/a[@href=\"https://www.youtube.com/c/AutomationExercise\"]");
 private By contactUsIcon=By.xpath("//ul[@class=\"nav navbar-nav\"]/li/a[@href=\"/contact_us\"]");
 private By sliderCarousel=By.id("slider-carousel");
 private By categoryListTitle=By.xpath("//h2[contains(.,\"Category\")]");
 private By userAutentificationIcon=By.xpath("//ul[@class=\"nav navbar-nav\"]/li/a[contains(.,\" Logged in as\")]");
 private By deleteAccountButton=By.xpath("//ul[@class=\"nav navbar-nav\"]/li/a[@href=\"/delete_account\"]");
 //private By consentButton=By.xpath("//div[@class=fc-consent-root\"]/div[class=\"fc-dialog-container\"]/div[@class=\"fc-footer-buttons-container\"]/div[@class=\"fc-footer-buttons\"]/div[class=\"fc-button-background\"]");
 private By logoutIcon=By.xpath("//a[@href=\"/logout\"]");
 private By subscriptionText=By.xpath("//h2[contains(.,\"Subscription\")]");
 private By subscribeEmailInputField=By.xpath("//input[@id=\"susbscribe_email\"]");
 private By subscriptionButton=By.xpath("//button[@id=\"subscribe\"]");
 private By subscriptionConfirmationMessage=By.xpath("//div[@class=\"alert-success alert\"]");
 private By viewProduct1=By.xpath("//a[@href=\"/product_details/1\"]");
 private By addToCartProduct1=By.xpath("//div[@class=\"features_items\"]/descendant::div[@class=\"productinfo text-center\"]/a[@class=\"btn btn-default add-to-cart\"][@data-product-id=\"1\"]");
 private By addToCartProduct2=By.xpath("//div[@class=\"features_items\"]/descendant::div[@class=\"productinfo text-center\"]/a[@class=\"btn btn-default add-to-cart\"][@data-product-id=\"2\"]");
 private By addToCartProduct3=By.xpath("//div[@class=\"features_items\"]/descendant::div[@class=\"productinfo text-center\"]/a[@class=\"btn btn-default add-to-cart\"][@data-product-id=\"3\"]");
 private By leftSidebarCategory=By.xpath("//div[@class=\"left-sidebar\"][contains(.,\"Category\")]");
 private By womenCategoryFromPanel=By.xpath("//div[@class=\"panel panel-default\"]/descendant::a[@href=\"#Women\"]");
 private By topsSubcategoryFromWonenPanel=By.xpath("//div[@id=\"Women\"]/descendant::a[@href=\"/category_products/2\"]");
 private By recommendedItemsTitle=By.xpath("//h2[contains(.,\"recommended items\")]");
// private By addToCartRecommendedItem=By.xpath("//div[@id=\"recommended-item-carousel\"]/descendant::a[@class=\"btn btn-default add-to-cart\"][@data-product-id=\"1\"]");
 private By viewCartFromModal=By.xpath("//div[@class=\"modal-content\"]/descendant::a");
 
 
 public void checkIconsOnPage()
 {
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	 WebElement consentButton=driver.findElement(By.xpath("//p[@class=\"fc-button-label\"]")); 
	 WebElement consentButtonWait=wait.until(ExpectedConditions.visibilityOf(consentButton));
	 consentButtonWait.click();
	 driver.findElement(homeIcon).isDisplayed();
	 driver.findElement(productsIcon).isDisplayed();
	 driver.findElement(cartIcon).isDisplayed();
	 driver.findElement(signupLoginIcon).isDisplayed();
	 driver.findElement(testCasesIcon).isDisplayed();
	 driver.findElement(apiTestingIcon).isDisplayed();
	 driver.findElement(videoTutorialsIcon).isDisplayed();
	 driver.findElement(contactUsIcon).isDisplayed();
	 driver.findElement(sliderCarousel).isDisplayed();
	 driver.findElement(categoryListTitle).isDisplayed();
	 driver.findElement(subscriptionText).isDisplayed();
	 driver.findElement(subscribeEmailInputField).isDisplayed();
	 driver.findElement(subscriptionButton).isDisplayed();
	 driver.findElement(viewProduct1).isDisplayed();
	 driver.findElement(addToCartProduct1).isDisplayed();
	 driver.findElement(addToCartProduct2).isDisplayed();
	 driver.findElement(addToCartProduct3).isDisplayed();
	 driver.findElement(leftSidebarCategory).isDisplayed();
	 driver.findElement(womenCategoryFromPanel).isDisplayed();
	 driver.findElement(recommendedItemsTitle).isDisplayed();
 }
 
 public void recheckIconsOnPage()
 {
	 driver.findElement(homeIcon).isDisplayed();
	 driver.findElement(productsIcon).isDisplayed();
	 driver.findElement(cartIcon).isDisplayed();
	 driver.findElement(signupLoginIcon).isDisplayed();
	 driver.findElement(testCasesIcon).isDisplayed();
	 driver.findElement(apiTestingIcon).isDisplayed();
	 driver.findElement(videoTutorialsIcon).isDisplayed();
	 driver.findElement(contactUsIcon).isDisplayed();
	 driver.findElement(sliderCarousel).isDisplayed();
	 driver.findElement(categoryListTitle).isDisplayed();
	 driver.findElement(subscriptionText).isDisplayed();
	 driver.findElement(subscribeEmailInputField).isDisplayed();
	 driver.findElement(subscriptionButton).isDisplayed();
	 driver.findElement(viewProduct1).isDisplayed();
	 driver.findElement(addToCartProduct1).isDisplayed();
	 driver.findElement(addToCartProduct2).isDisplayed();
	 driver.findElement(addToCartProduct3).isDisplayed();
	 driver.findElement(leftSidebarCategory).isDisplayed();
	 driver.findElement(womenCategoryFromPanel).isDisplayed();
	 driver.findElement(recommendedItemsTitle).isDisplayed();
 }
 public void clickSignupLoginButton()
 {
	 driver.findElement(signupLoginIcon).click();
 }
 
 public void checkAccountCreation(SignupData name)
 {
	 String confirmationMessage="Logged in as "+name.getSignupName();
	 Assert.assertEquals(confirmationMessage, driver.findElement(userAutentificationIcon).getText());
 }
 
 public void clickDeleteAccount()
 {
	 driver.findElement(deleteAccountButton).click();
 }
 
 public void clickLogoutButton()
 {
	 driver.findElement(logoutIcon).click();
 }
 
 public void checkAccountLogin(LoginData name)
 {
	 String confirmationMessage="Logged in as "+name.getLoginName();
	 Assert.assertEquals(confirmationMessage, driver.findElement(userAutentificationIcon).getText());
 }
 
public void clickContacUs()
{
	driver.findElement(contactUsIcon).click();
}

public void clickTestCases()
{
	driver.findElement(testCasesIcon).click();
}

public void clickProducts()
{
	driver.findElement(productsIcon).click();
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

public void clickCartIcon()
{
	driver.findElement(cartIcon).click();
}

public void clickViewProduct1()
{
	driver.findElement(viewProduct1).click();
}
public void clickContinueShoppingModal()
{
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	 WebElement continueButton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class=\"btn btn-success close-modal btn-block\"]")));
	 continueButton.click();
}

public void addProductsToCart()
{
	driver.findElement(addToCartProduct1).click();
	clickContinueShoppingModal();
	driver.findElement(addToCartProduct2).click();
	clickContinueShoppingModal();
	driver.findElement(addToCartProduct3).click();
	clickContinueShoppingModal();
	addTojson();
}

public void addTojson()
{
	List<String> indexProduse=new ArrayList<String>();
	List<WebElement> listaProduse=driver.findElements(By.xpath("//div[@class=\"productinfo text-center\"]/p"));
	List<String> valorilistaProduse= new ArrayList<String>();
	for(WebElement element:listaProduse)
	{
		valorilistaProduse.add(element.getText());
	}
	for(int i=0;i<valorilistaProduse.size();i++)
	{
		indexProduse.add("produs"+i);
	}
	ObjectMapper objectMapper= new ObjectMapper();
	try
	{		
		objectMapper.writeValue(new File("produse.json"), valorilistaProduse);
		System.out.println("Data written to JSON file.");
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	File file = new File("produse.json");
	System.out.println("File path: " + file.getAbsolutePath());
}
public void clickWomenCategory()
{
	driver.findElement(womenCategoryFromPanel).click();
}
public void clickTopsFromWomenCategory()
{
	driver.findElement(topsSubcategoryFromWonenPanel).click();
}
public void checkRecommendedItemsTitle()
{
	Assert.assertEquals("RECOMMENDED ITEMS", driver.findElement(recommendedItemsTitle).getText());
}

public void scroolToBottom()
{
	WebElement recommendedItemsTitle=driver.findElement(By.xpath("//h2[contains(.,\"recommended items\")]"));
	Actions actions = new Actions(driver);
	actions.moveToElement(recommendedItemsTitle).perform();
	//PageScrool.ScrrolToElement(driver.findElement(recommendedItemsTitle));
}
public void addToCartRecommendedItem() //any product can be selected from the carusel if you change data-product-id in the xpath 
{
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	WebElement addToCartProduct1=driver.findElement(By.xpath("//div[@id=\"recommended-item-carousel\"]/descendant::a[@class=\"btn btn-default add-to-cart\"][@data-product-id=\"1\"]"));
	WebElement addToCartWait=wait.until(ExpectedConditions.visibilityOf(addToCartProduct1));
	addToCartWait.click();
}

public void clickViewCartFromModal()
{
	  driver.findElement(viewCartFromModal).click();
}
}