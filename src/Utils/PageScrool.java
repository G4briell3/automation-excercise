package Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScrool 
{
	 /*WebDriver driver;
	
	public  PageScrool()
	{
		this.driver=driver;
	}*/
	
  public static void ScroolDown(WebDriver driver)
  {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
  }
  
  public static void ScroolUp(WebDriver driver)
  {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(0, 0);");	  
  }
  
  public static void ScrrolToElement(WebElement element) //nu merge , deschide pagina noua. Vezi productsPage.clickAddToCartFirstProduct() pentru varianta
  {
	  WebDriver driver = new ChromeDriver();
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("arguments[0].scrollIntoView(true);", element);
  }
}
