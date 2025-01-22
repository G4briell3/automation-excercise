package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import TestData.Messages;



public class AccountConfirmationPage 
{
  WebDriver driver;
  
  public AccountConfirmationPage(WebDriver driver)
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
  private By creationConfirmationMessage=By.xpath("//h2");  
  private By continueButton=By.xpath("//div[@class=\"pull-right\"]");
  private By deletionConfirmationMessage=By.xpath("//h2");
  
  public void checkIconsOnPage()
  { 
 	 driver.findElement(homeIcon).isDisplayed();
 	 driver.findElement(productsIcon).isDisplayed();
 	 driver.findElement(cartIcon).isDisplayed();
 	 driver.findElement(signupLoginIcon).isDisplayed();
 	 driver.findElement(testCasesIcon).isDisplayed();
 	 driver.findElement(apiTestingIcon).isDisplayed();
 	 driver.findElement(videoTutorialsIcon).isDisplayed();
 	 driver.findElement(contactUsIcon).isDisplayed();
  }
  
  public void checkAccountConfirmationMessage()
  {
	  Assert.assertEquals( Messages.AccountCreated, driver.findElement(creationConfirmationMessage).getText());
  }
  
  public void clickContinue()
  {
	  driver.findElement(continueButton).click();
  }
  
  public void checkAccountDeletionMessage()
  {
	  Assert.assertEquals(Messages.AccountDeleted, driver.findElement(deletionConfirmationMessage).getText());
  }
}
