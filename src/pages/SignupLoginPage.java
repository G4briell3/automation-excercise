package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import TestData.Messages;
import TestData.classes.LoginData;
import TestData.classes.SignupData;
import Utils.RandomGenerator;

public class SignupLoginPage 
{
 WebDriver driver;
 
 public SignupLoginPage(WebDriver driver)
 {
	 this.driver=driver;
 }
 
 private By signupHeaderText=By.xpath("//h2[contains(.,\"New User Signup!\")]");
 private By loginToAccountLogo=By.xpath("//h2[contains(.,\"Login to your account\")]");
 private By signupNameInput=By.xpath("//form[@action=\"/signup\"]/input[@type=\"text\"]");
 private By signupEmailInput=By.xpath("//form[@action=\"/signup\"]/input[@type=\"email\"]");
 private By signupButton=By.xpath("//button[@data-qa=\"signup-button\"]");
 private By loginEmailInput=By.xpath("//form[@action=\"/login\"]/input[@type=\"email\"]");
 private By loginPasswordInput=By.xpath("//form[@action=\"/login\"]/input[@type=\"password\"]");
 private By loginButton=By.xpath("//button[@data-qa=\"login-button\"]");
 private By loginHeaderText=By.xpath("//h2[contains(.,\"Login to your account\")]");
 private By loginErrorMessage=By.xpath("//p[contains(.,\"Your email or password is incorrect!\")]");
 private By signupErrorMessage=By.xpath("//p[contains(.,\"Email Address already exist!\")]");
 
 public void checkIconsOnPage()
 {
	 driver.findElement(signupHeaderText).isDisplayed();
	 driver.findElement(signupNameInput).isDisplayed();
	 driver.findElement(signupEmailInput).isDisplayed();
	 driver.findElement(signupButton).isDisplayed();
 }
 
 public void enterSignupDetails(SignupData data)
 {
	 driver.findElement(signupNameInput).sendKeys(data.getSignupName());
	 driver.findElement(signupEmailInput).sendKeys(RandomGenerator.stringValue(6)+"@gmail.com");
	 driver.findElement(signupButton).click();
 }
 
 public void enterSignupDetailsExisting(SignupData data)
 {
	 driver.findElement(signupNameInput).sendKeys(data.getSignupName());
	 driver.findElement(signupEmailInput).sendKeys(data.getSignupEmail());
	 driver.findElement(signupButton).click();
 }
 
 public void enterSignupDetailsForLogin(SignupData data)
 {
	 driver.findElement(signupNameInput).sendKeys(data.getSignupName());
	 driver.findElement(signupEmailInput).sendKeys(data.getSignupEmail());
	 driver.findElement(signupButton).click();
 }
 
 public void checkLoginVisibility()
 {
	 driver.findElement(loginToAccountLogo).isDisplayed();
	 driver.findElement(loginEmailInput).isDisplayed();
	 driver.findElement(loginPasswordInput).isDisplayed();
 }
 
 public void enterLoginDetails(LoginData data)
 {
	 driver.findElement(loginEmailInput).sendKeys(data.getLoginEmail());
	 driver.findElement(loginPasswordInput).sendKeys(data.getLoginPassword());
	 driver.findElement(loginButton).click();
 }
 
 public void checkLoginHeaderText()
 {
	 Assert.assertEquals(Messages.LoginText, driver.findElement(loginHeaderText).getText());
 }
 
 public void checkLoginErrorMessage()
 {
	 Assert.assertEquals(Messages.LoginError, driver.findElement(loginErrorMessage).getText());
 }
 
 public void checkSignupErrorMessage()
 {
	 Assert.assertEquals(Messages.SignUpError, driver.findElement(signupErrorMessage).getText());
 }
}
