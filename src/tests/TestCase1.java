package tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import TestData.URL;

public class TestCase1 extends BaseTest
{
  @Before @Override
  public void before()
  {
	  super.before();
	  driver.get(URL.MainPage);	  
	  mainPage.checkIconsOnPage();
  }
  
  @Test
  public void test1()  // Register User
  {	  
	  mainPage.clickSignupLoginButton();
	  signupLoginPage.checkIconsOnPage();
	  signupLoginPage.enterSignupDetails(newUser);
	  enterAccountInformationPage.checkElementsOnPage();
	  enterAccountInformationPage.selectTitle("Mrs"); //values Mr || Mrs	  
	  enterAccountInformationPage.selectDateOfBirth("4","September","1954"); //Enter : day,month,year
	  enterAccountInformationPage.selectCountry("United States"); //Options: India,United States,Canada,Australia,Israel,New Zealand,Singapore
	  enterAccountInformationPage.fillDetails(accountInformation);
	  enterAccountInformationPage.clickCreateAccountButton();
	  accountConfirmationPage.checkIconsOnPage();
	  accountConfirmationPage.checkAccountConfirmationMessage();
	  accountConfirmationPage.clickContinue();
	  mainPage.checkAccountCreation(newUser);	
	  mainPage.clickDeleteAccount();
	  accountConfirmationPage.checkAccountDeletionMessage();
	  accountConfirmationPage.clickContinue();
  }
}
