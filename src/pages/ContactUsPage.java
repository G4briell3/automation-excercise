package pages;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestData.classes.ContactUs;

public class ContactUsPage 
{
  WebDriver driver;
  
  public ContactUsPage(WebDriver driver)
  {
	  this.driver=driver;
  }
  
  private By getInTouchText=By.xpath("//h2[contains(.,\"Get In Touch\")]");
  private By nameFieldInput=By.xpath("//input[@name=\"name\"]");
  private By emailFieldInput=By.xpath("//input[@name=\"email\"]");
  private By subjectFieldInput=By.xpath("//input[@name=\"subject\"]");
  private By messageFieldInput=By.xpath("//textarea[@name=\"message\"]");
  private By uploadFileButton=By.xpath("//input[@name=\"upload_file\"]");
  private By submitButton=By.xpath("//input[@name=\"submit\"]");
  private By alertaSuccessMessage=By.xpath("//div[@class=\"status alert alert-success\"]");
  private By homeButton=By.xpath("//div[@id=\"form-section\"]/a/span");
  
  public void checkGetInTouchVisibility()
  {
	  Assert.assertEquals("GET IN TOUCH", driver.findElement(getInTouchText).getText());
  }
  
  public void fillInformation(ContactUs information)
  {
	  driver.findElement(nameFieldInput).sendKeys(information.getNameInput());
	  driver.findElement(emailFieldInput).sendKeys(information.getEmailInput());
	  driver.findElement(subjectFieldInput).sendKeys(information.getSubjectInput());
	  driver.findElement(messageFieldInput).sendKeys(information.getMessageInput());
  }
  
  public void uploadFile() throws InterruptedException
  {
	  driver.findElement(uploadFileButton).sendKeys("C:\\Users\\Gabi\\Downloads\\chromedriver-win64(2)\\chromedriver-win64");
	 
  }
  
  public void clickSubmit()
  {
	  driver.findElement(submitButton).click();
	  Alert alert = driver.switchTo().alert();
	  alert.accept();
  }
  
  public void checkSuccessMessageDisplay()
  {
	  Assert.assertEquals("Success! Your details have been submitted successfully.", driver.findElement(alertaSuccessMessage).getText());
  }
  
  public void clickHomeButton()
  {
	  driver.findElement(homeButton).click();
  }
}
