package pages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.fasterxml.jackson.databind.ObjectMapper;

import TestData.classes.DeliveryBillingInformation;
import TestData.classes.EnterInformation;
import java.io.File;
import java.io.IOException;

public class EnterAccountInformationPage
{
 WebDriver driver;
 
 public EnterAccountInformationPage(WebDriver driver)
 {
	 this.driver=driver;			 
 }

private By nameField=By.id("name");
private By emailField=By.id("email");
private By passwordField=By.id("password");
private By selectTitleButton(String nume) {
    return By.xpath("//div[@class=\"radio-inline\"]/descendant::input[@value=\"" + nume + "\"]");}
private By dayOfBirth=By.id("days");
private By monthOfBirth=By.id("months");
private By yearOfBirth=By.id("years");
private By signUpForNewsletterCheckbox=By.xpath("//div[@class=\"checkbox\"]/label[@for=\"newsletter\"]");
private By receiveSpecialOffersCheckboc=By.xpath("//div[@class=\"checkbox\"]/label[@for=\"optin\"]");
private By firstNameInput=By.id("first_name");
private By lastNameInput=By.id("last_name");
private By companyInput=By.id("company");
private By mandatorryAddressInput=By.id("address1");
private By address2Input=By.id("address2");
private By countrySelect=By.id("country");
private By stateInput=By.id("state");
private By cityInput=By.id("city");
private By zipCodeInput=By.id("zipcode");
private By mobileNumberInput=By.id("mobile_number");
private By createAccountButton=By.xpath("//button[contains(.,\"Create Account\")]");
String titleFromForm = "";

public void checkElementsOnPage()
{
	driver.findElement(nameField).isDisplayed();
	driver.findElement(emailField).isDisplayed();
	driver.findElement(passwordField).isDisplayed();
	driver.findElement(dayOfBirth).isDisplayed();
	driver.findElement(monthOfBirth).isDisplayed();
	driver.findElement(yearOfBirth).isDisplayed();
	driver.findElement(signUpForNewsletterCheckbox).isDisplayed();
	driver.findElement(receiveSpecialOffersCheckboc).isDisplayed();
	driver.findElement(firstNameInput).isDisplayed();
	driver.findElement(lastNameInput).isDisplayed();
	driver.findElement(companyInput).isDisplayed();
	driver.findElement(mandatorryAddressInput).isDisplayed();
	driver.findElement(address2Input).isDisplayed();
	driver.findElement(countrySelect).isDisplayed();
	driver.findElement(stateInput).isDisplayed();
	driver.findElement(cityInput).isDisplayed();
	driver.findElement(zipCodeInput).isDisplayed();
	driver.findElement(mobileNumberInput).isDisplayed();
	driver.findElement(createAccountButton).isDisplayed();	
}

public void selectTitle(String nume)
{
	WebElement select=driver.findElement(selectTitleButton(nume));
	select.click();
	titleFromForm=select.getAttribute("value");
}

public void fillDetails(EnterInformation user) 
{
	driver.findElement(passwordField).sendKeys(user.getPassword());
	driver.findElement(firstNameInput).sendKeys(user.getFirstName());
	driver.findElement(lastNameInput).sendKeys(user.getLastName());
	driver.findElement(companyInput).sendKeys(user.getCompany());
	driver.findElement(mandatorryAddressInput).sendKeys(user.getAddress());
	driver.findElement(address2Input).sendKeys(user.getAddress2());
	driver.findElement(stateInput).sendKeys(user.getState());
	driver.findElement(cityInput).sendKeys(user.getCity());
	driver.findElement(zipCodeInput).sendKeys(user.getZipCode());
	driver.findElement(mobileNumberInput).sendKeys(user.getMobileNumber());
	driver.findElement(receiveSpecialOffersCheckboc).click();
	driver.findElement(signUpForNewsletterCheckbox).click();	
}

public void clickCreateAccountButton()
{
	driver.findElement(createAccountButton).click();
}

public void selectDateOfBirth(String day,String month,String year)
{
	Select selectDate= new Select(driver.findElement(dayOfBirth));
	Select selectMonth=new Select(driver.findElement(monthOfBirth));
	Select selectYear=new Select(driver.findElement(yearOfBirth));
	selectDate.selectByValue(day);
	selectMonth.selectByVisibleText(month);
	selectYear.selectByValue(year);	
}

public void selectCountry(String country)
{
	Select selectCountry=new Select(driver.findElement(countrySelect));
	selectCountry.selectByValue(country);
}

public void storringDataFromForm()
{
	String title=titleFromForm;
	String firstName=driver.findElement(firstNameInput).getAttribute("value");
	String lastName=driver.findElement(lastNameInput).getAttribute("value");
	String company=driver.findElement(companyInput).getAttribute("value");
	String addr1=driver.findElement(mandatorryAddressInput).getAttribute("value");
	String addr2=driver.findElement(address2Input).getAttribute("value");
	String city=driver.findElement(cityInput).getAttribute("value");
	String state=driver.findElement(stateInput).getAttribute("value");
	String zip=driver.findElement(zipCodeInput).getAttribute("value");
	String country=driver.findElement(countrySelect).getAttribute("value");
	String mobile=driver.findElement(mobileNumberInput).getAttribute("value");
	Map<String,String> data=new HashMap<>();
	data.put("title", title+". "+firstName+" "+lastName);
	data.put("company",company);
	data.put("addr1",addr1);
	data.put("addr2",addr2);
	data.put("cityStateZipcode",city+" "+state+" "+zip);
	data.put("country",country);
	data.put("mobile",mobile);
	ObjectMapper objectMapper= new ObjectMapper();
	try
	{
		objectMapper.writeValue(new File("data.json"), data);
		System.out.println("Data written to JSON file.");
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	File file = new File("data.json");
	System.out.println("File path: " + file.getAbsolutePath());
	
}

}
