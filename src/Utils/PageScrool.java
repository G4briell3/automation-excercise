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
  
  public static void ScrrolToElement(WebElement element)
  {
	  WebDriver driver = new ChromeDriver();
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("arguments[0].scrollIntoView(true);", element);
  }
}
