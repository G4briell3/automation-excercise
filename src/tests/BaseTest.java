package tests;

import java.time.Duration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import TestData.classes.ContactUs;
import TestData.classes.DeliveryBillingInformation;
import TestData.classes.DeliveryInformation;
import TestData.classes.EnterInformation;
import TestData.classes.LoginData;
import TestData.classes.PaymentInformation;
import TestData.classes.ProductDetails;
import TestData.classes.SignupData;
import TestData.classes.WriteReview;
import pages.AccountConfirmationPage;
import pages.CartPage;
import pages.ContactUsPage;
import pages.EnterAccountInformationPage;
import pages.MainPage;
import pages.Product1Page;
import pages.ProductsPage;
import pages.SignupLoginPage;
import pages.TestCasesPage;

public class BaseTest 
{
	
 
  static WebDriver driver;

  public static MainPage mainPage;
  public static SignupLoginPage signupLoginPage ;
  public static EnterAccountInformationPage enterAccountInformationPage;
  public static AccountConfirmationPage accountConfirmationPage;
  public static ContactUsPage contactUsPage;
  public static TestCasesPage testCasesPage;
  public static ProductsPage productsPage;
  public static Product1Page product1Page;
  public static CartPage cartPage;
  //public static SignupData newUserSignup=new SignupData("signupUser");
  public static SignupData newUser = new SignupData("accountInformation");
  //public static LoginData loginInformation=new LoginData("loginInformation");
  public static LoginData loginInformation=new LoginData("createUser");
  public static SignupData createUser=new SignupData("createUser");
  public static LoginData incorrectCredentials=new LoginData("incorrectCredentialsForLogin");
  public static EnterInformation accountInformation=new EnterInformation("accountInformation");
  public static EnterInformation createAccount=new EnterInformation("createUser");
  public static ContactUs enterInformation=new ContactUs("contactUsInformation");  
  public static ProductDetails product1Details=new ProductDetails("product1Details");
  public static DeliveryInformation deliveryBillingInfo=new DeliveryInformation("deliveryBillingDetails");
  public static PaymentInformation enterPaymentInformation=new PaymentInformation("paymentInformation");
  public static WriteReview writeReviewData=new WriteReview("writeReviewInformation");
  //public static DeliveryBillingInformation deliveryAndBillingInfoDivided=new DeliveryBillingInformation("data");
  
  @BeforeClass
  public static void setup()
  {
	  
  }
  
  @AfterClass
  public static void teardown()
  {
	  
  }
  
  @Before
  public void before()
  {
		ChromeOptions chromeOption=new ChromeOptions();
		chromeOption.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		chromeOption.addArguments("--disable-notifications"); // Disable notifications
		chromeOption.addArguments("--disable-popup-blocking"); // Disable popup blocking
		System.setProperty("webdriver.chrome.driver","src/resource/chromedriver.exe");
		chromeOption.addArguments("--disable-infobars"); // Disable infobars
		
		chromeOption.addArguments("--disable-default-apps"); // Disable default apps
		chromeOption.addArguments("--no-first-run"); // Skip first run wizards
		chromeOption.addArguments("--no-default-browser-check"); // Skip default browser check
		chromeOption.addArguments("--disable-search-engine-choice-screen");//skip search engine options
		chromeOption.addArguments("--start-maximized"); // Open browser in maximized mode
		
		chromeOption.addArguments("--disable-extensions"); // Disable extensions
		//chromeOption.addArguments("--headless");  // Run in headless mode
		//chromeOption.addArguments("--window-size=1920,1080");  // Set browser window size
		
		
		
		driver=new ChromeDriver(chromeOption);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		mainPage=new MainPage(driver);
		signupLoginPage=new SignupLoginPage(driver);
		enterAccountInformationPage=new EnterAccountInformationPage(driver);
		accountConfirmationPage=new AccountConfirmationPage(driver);
		contactUsPage=new ContactUsPage(driver);
		testCasesPage=new TestCasesPage(driver);
		productsPage=new ProductsPage(driver);
		product1Page=new Product1Page(driver);
		cartPage=new CartPage(driver);
  }
  
  @After
  public void after()
  {
	  driver.close();
  }
  
}
