package tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import TestData.URL;

public class CreateValidAccount extends BaseTest
{
  @Before @Override
  public void before()
  {
	  super.before();
	  driver.get(URL.MainPage);	  
  }
  
  @Test
  public void test1() throws InterruptedException //create user after running test1
  {
	  mainPage.checkIconsOnPage();
	  mainPage.clickSignupLoginButton();
	  signupLoginPage.checkSignupVisibility();
	  signupLoginPage.enterSignupDetailsExisting(createUser);
	  enterAccountInformationPage.checkElementsOnPage();
	  enterAccountInformationPage.selectTitle("Mrs"); //values Mr || Mrs	  
	  enterAccountInformationPage.selectDate("4","September","1954"); //Enter : day,month,year
	  enterAccountInformationPage.selectCountry("United States"); //Options: India,United States,Canada,Australia,Israel,New Zealand,Singapore
	  enterAccountInformationPage.fillDetails(createAccount);
	  accountConfirmationPage.checkIconsOnPage();
	  accountConfirmationPage.checkAccountConfirmationMessage();
	  accountConfirmationPage.clickContinue();
	  mainPage.checkAccountCreation(createUser);		  
  }
}
