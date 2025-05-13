package pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestData.Messages;
import TestData.ProductsDetails;
import Utils.PageScrool;

public class ProductsPage
{
 WebDriver driver;
 public ProductsPage(WebDriver driver)
 {
	 this.driver=driver;
 }
 private By pageTitle=By.xpath("//h2[@class=\"title text-center\"]");
 private By homeIcon=By.xpath("//ul[@class=\"nav navbar-nav\"]/li/a/i[@class=\"fa fa-home\"]");
 private By productsIcon=By.xpath("//ul[@class=\"nav navbar-nav\"]/li/a[@href=\"/products\"]");
 private By cartIcon=By.xpath("//ul[@class=\"nav navbar-nav\"]/li/a[@href=\"/view_cart\"]");
 private By signupLoginIcon=By.xpath("//ul[@class=\"nav navbar-nav\"]/li/a[@href=\"/login\"]");
 private By testCasesIcon=By.xpath("//ul[@class=\"nav navbar-nav\"]/li/a[@href=\"/test_cases\"]");
 private By apiTestingIcon=By.xpath("//ul[@class=\"nav navbar-nav\"]/li/a[@href=\"/api_list\"]");
 private By videoTutorialsIcon=By.xpath("//ul[@class=\"nav navbar-nav\"]/li/a[@href=\"https://www.youtube.com/c/AutomationExercise\"]");
 private By contactUsIcon=By.xpath("//ul[@class=\"nav navbar-nav\"]/li/a[@href=\"/contact_us\"]");
 private By productsItemsList=By.xpath("//div[@class=\"single-products\"]");
 private By viewProduct1=By.xpath("//div[@class=\"choose\"]/descendant::a[@href=\"/product_details/1\"]");
 private By searchProductField=By.xpath("//input[@id=\"search_product\"]");
 private By searchButton=By.xpath("//button[@id=\"submit_search\"]");
 private By searchedProductsPageText=By.xpath("//h2[@class=\"title text-center\"]");
 private By continueShoppingButtonModal=By.xpath("//button[@class=\"btn btn-success close-modal btn-block\"]");
 private By titleWomenProducts=By.xpath("//h2[@class=\"title text-center\"]");
 private By titleMenProducts=By.xpath("//h2[@class=\"title text-center\"]");
 private By titleBrandMadameProducts=By.xpath("//h2[@class=\"title text-center\"]");
 private By titleBrandBibaProducts=By.xpath("//h2[@class=\"title text-center\"]");
 private By menCategoryFromSidebar=By.xpath("//a[@href=\"#Men\"]");
 private By thsirtsSubcategoryFromMenCategory=By.xpath("//a[@href=\"/category_products/3\"]");
 private By brandsCategoryLeftSidebar=By.xpath("//div[@class=\"brands_products\"]");
 private By madameCategoryFromBrandsSidebar=By.xpath("//a[@href=\"/brand_products/Madame\"]");
 private By bibaCategoryFromBrandsSidebar=By.xpath("//a[@href=\"/brand_products/Biba\"]");
 private By productFromPage=By.xpath("//div[@class=\"col-sm-4\"]");
 private By logoutButton=By.xpath("//div[@class="shop-menu pull-right"]/descendant::a[@href="/logout"]");
 
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
	 driver.findElement(pageTitle).isDisplayed();
	 driver.findElement(productsItemsList).isDisplayed();
	 driver.findElement(viewProduct1).isDisplayed();
	 driver.findElement(searchProductField).isDisplayed();
	 driver.findElement(searchButton).isDisplayed();
	 driver.findElement(brandsCategoryLeftSidebar).isDisplayed();
 }
 
 public void clickOnViewProduct()
 {
	 driver.findElement(viewProduct1).click();
 }
 
 public void searchProduct(String product)
 {
	 driver.findElement(searchProductField).sendKeys(product);
	 driver.findElement(searchButton).click();
 }
 
 public void verifySearchedProductPageText()
 {
	 String actualTitle=driver.findElement(searchedProductsPageText).getText();
	 String expectedTitle=Messages.SearchedProductsText;
	 if (!actualTitle.contains(expectedTitle)) 
	 {
		    throw new AssertionError("Title mismatch: " + actualTitle);  //to avoid the pop-ups that appears near "searched products"text
		    
	 }	 
 }
 
 public void checkSearchResult()
 {
	 driver.findElement(productsItemsList).isDisplayed();
 }
 public void clickAddToCartFirstProduct()
 {	 
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	 Actions actions = new Actions(driver);
	 WebElement product1Location=driver.findElement(By.xpath("//div[@class=\"productinfo text-center\"]/a[@class=\"btn btn-default add-to-cart\"][@data-product-id=\"1\"]"));
	 //PageScrool.ScrrolToElement(product1Location);
	 actions.moveToElement(product1Location).perform();
	 WebElement addToCartButton=driver.findElement(By.xpath("//div[@class=\"overlay-content\"]/a[@class=\"btn btn-default add-to-cart\"][@data-product-id=\"1\"]"));
	 WebElement addToCartButtonWait=wait.until(ExpectedConditions.visibilityOf(addToCartButton));
	 addToCartButtonWait.click();
 }
 public void clickContinueShoppingModal()
 {
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	 WebElement continueButton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class=\"btn btn-success close-modal btn-block\"]")));
	 continueButton.click();
 }
 public void clickAddToCartSecondProduct()
 {
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	 Actions actions = new Actions(driver);
	 WebElement product1Location=driver.findElement(By.xpath("//div[@class=\"productinfo text-center\"]/a[@class=\"btn btn-default add-to-cart\"][@data-product-id=\"2\"]"));
	 actions.moveToElement(product1Location).perform();
	 WebElement addToCartButton=driver.findElement(By.xpath("//div[@class=\"overlay-content\"]/a[@class=\"btn btn-default add-to-cart\"][@data-product-id=\"2\"]"));
	 WebElement addToCartButtonWait=wait.until(ExpectedConditions.visibilityOf(addToCartButton));
	 addToCartButtonWait.click();
 }
 public void clickCartIcon()
 {
	 driver.findElement(cartIcon).click();
 }
 
 public void verifyWomenCategoryPageTitle()
 {
	 Assert.assertEquals(ProductsDetails.CategoryWomanTops, driver.findElement(titleWomenProducts).getText());
 }
 
 public void selectTshirtsSubcategoryFromMenCategory()
 {
	 driver.findElement(menCategoryFromSidebar).click();
	 driver.findElement(thsirtsSubcategoryFromMenCategory).click();
 }
 
 public void verifyMenCategoryPageTitle()
 {
	 Assert.assertEquals(ProductsDetails.CategoryMenTshirts, driver.findElement(titleMenProducts).getText());
 }
 
 public void clickMadameCathegoryFromBrandsSidebar()
 {
	 driver.findElement(madameCategoryFromBrandsSidebar).click();
 }
 
 public void verifyBrandMadamePageTitle()
 {
	 Assert.assertEquals(ProductsDetails.BrandMadame, driver.findElement(titleBrandMadameProducts).getText());
	 driver.findElement(productFromPage).isDisplayed();
 }
 
 public void clickBibaCategoryFromBrandsSidebar()
 {
	 driver.findElement(bibaCategoryFromBrandsSidebar).click();
 }
 
 public void verifyBrandBibaPageTitle()
 {
	 Assert.assertEquals(ProductsDetails.BrandBiba, driver.findElement(titleBrandBibaProducts).getText());
	 driver.findElement(productFromPage).isDisplayed();
 }
 
 public void checkListItemsAfterSearch(String keyWord)
 {
	 List<WebElement> listaProduse= driver.findElements(By.xpath("//div[@class=\"features_items\"]/div[@class=\"col-sm-4\"]/descendant::p"));
	  List<String> valoriListaProduse =new ArrayList<String>();
	  for (WebElement element:listaProduse)
	  {		 
		  valoriListaProduse.add(element.getText());		  
	  }
	  //System.out.println(valoriListaProduse);
	  boolean isKeywordPresent = false;
	  for (String element:valoriListaProduse)
	  {
		  if (element != null && element.toLowerCase().contains(keyWord)) {
		        isKeywordPresent = true;
		        break;
		    }	 
	  }
	  Assert.assertTrue(isKeywordPresent); 
 } 
 
 
 public void addItemsToCartAfterSearch() 
 {
	List<WebElement> listaProduse=driver.findElements(By.xpath("//div[@class=\"features_items\"]/div[@class=\"col-sm-4\"]/div[@class=\"product-image-wrapper\"]/div[@class=\"single-products\"]/div[@class=\"productinfo text-center\"]/a"));
    //List<String> valoriListaProduse= new ArrayList<String>();
    for(WebElement element:listaProduse)
    {
    	element.click();
    	clickContinueShoppingModal();    	
    }
 }
public void clickLogout()
	{
		driver.findElement(logoutButton).click;
	}
		
}
