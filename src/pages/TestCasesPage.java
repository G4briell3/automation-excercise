package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import TestData.Messages;

public class TestCasesPage 
{
  WebDriver driver;
  
  public TestCasesPage(WebDriver driver)
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
  
  public void checkIconsAndPage()
  {
		 driver.findElement(homeIcon).isDisplayed();
		 driver.findElement(productsIcon).isDisplayed();
		 driver.findElement(cartIcon).isDisplayed();
		 driver.findElement(signupLoginIcon).isDisplayed();
		 driver.findElement(testCasesIcon).isDisplayed();
		 driver.findElement(apiTestingIcon).isDisplayed();
		 driver.findElement(videoTutorialsIcon).isDisplayed();
		 driver.findElement(contactUsIcon).isDisplayed();
         Assert.assertEquals(Messages.TestCasesText, driver.findElement(pageTitle).getText());
  }
}
