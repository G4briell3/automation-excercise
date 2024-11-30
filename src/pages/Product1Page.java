package pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestData.classes.ProductDetails;
import TestData.classes.WriteReview;


public class Product1Page 
{
  WebDriver driver;
  public Product1Page(WebDriver driver)
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
  private By productName=By.xpath("//h2[contains(.,\"Blue Top\")]");
  private By productCategory=By.xpath("//p[contains(.,\"Women\")]");
  private By productPrice=By.xpath("//span/span[contains(.,\"Rs\")]");
  private By productAvailability=By.xpath("//p[contains(.,\"Availability\")]");
  private By productCondition=By.xpath("//p[contains(.,\"Condition\")]");
  private By productBrand=By.xpath("//p[contains(.,\"Brand\")]");
  private By productQuantityButton=By.xpath("//input[@id=\"quantity\"]");
  private By addToCartProduct=By.xpath("//button[@class=\"btn btn-default cart\"]");
  private By viewCartFromModal=By.xpath("//div[@class=\"modal-content\"]/descendant::a");
  private By writeReviewNameField=By.xpath("//input[@id=\"name\"]");
  private By writeReviewEmailField=By.xpath("//input[@id=\"email\"]");
  private By writeReviewCommentField=By.xpath("//textarea[@id=\"review\"]");
  private By submitReviewButton=By.xpath("//button[@id=\"button-review\"]");
  private By writeReviewSuccessAlert=By.xpath("//div[@class=\"alert-success alert\"]/span");
  
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
		 driver.findElement(productName).isDisplayed();
		 driver.findElement(productCategory).isDisplayed();
		 driver.findElement(productPrice).isDisplayed();
		 driver.findElement(productAvailability).isDisplayed();
		 driver.findElement(productCondition).isDisplayed();
		 driver.findElement(productBrand).isDisplayed();
		 driver.findElement(productQuantityButton).isDisplayed();
		 driver.findElement(addToCartProduct).isDisplayed();
		 driver.findElement(writeReviewNameField).isDisplayed();
		 driver.findElement(writeReviewEmailField).isDisplayed();
		 driver.findElement(writeReviewCommentField).isDisplayed();
		 driver.findElement(submitReviewButton).isDisplayed();
  }
  
  public void checkProductDetails(ProductDetails details) 
  {
	  //String fullText=driver.findElement(productAvailability).getText()  ;
	  //String availabilityText = fullText.split("Availability:")[1].trim();
	  Assert.assertEquals(details.getProductName(), driver.findElement(productName).getText());
	  Assert.assertEquals(details.getProductCategory(), driver.findElement(productCategory).getText());
	  Assert.assertEquals(details.getProductPrice(), driver.findElement(productPrice).getText());
	  Assert.assertEquals(details.getProductAvailability(), driver.findElement(productAvailability).getText());
	  Assert.assertEquals(details.getProductCondition(), driver.findElement(productCondition).getText());
	  Assert.assertEquals(details.getProductBrand(), driver.findElement(productBrand).getText());
	  //Thread.sleep(3000);
  }
  public void modifyProductquantity(String nr)
  {
	  driver.findElement(productQuantityButton).click();
	  driver.findElement(productQuantityButton).sendKeys(Keys.CONTROL+"a");
	  driver.findElement(productQuantityButton).sendKeys(Keys.DELETE);
	  driver.findElement(productQuantityButton).sendKeys(nr);
  }
  public void addToCartProduct()
  {
	  driver.findElement(addToCartProduct).click();
  }
  public void clickViewCart()
  {
	  driver.findElement(viewCartFromModal).click();
  }
  
  public void writeReview(WriteReview information)
  {
	  driver.findElement(writeReviewNameField).sendKeys(information.getNameField());
	  driver.findElement(writeReviewEmailField).sendKeys(information.getEmailField());
	  driver.findElement(writeReviewCommentField).sendKeys(information.getReviewField());
	  driver.findElement(submitReviewButton).click();
  }
  
  public void checkReviewSuccessMessage()
  {
	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	  WebElement successMessage=wait.until(ExpectedConditions.presenceOfElementLocated(writeReviewSuccessAlert));
  }
} 
