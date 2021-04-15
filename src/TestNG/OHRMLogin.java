package TestNG;

import org.testng.annotations.Test;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class OHRMLogin {
	static WebDriver driver= null;
	static Properties or = null;
	
	@BeforeTest
	public void BeforeMethod(){
		
		String browser="chrome";
			if(browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "D:\\Swara\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
			
			 driver = new ChromeDriver();
			
			}else if(browser.equalsIgnoreCase("firfox")) {
				
				System.setProperty("webdriver.gecko.driver", "D:\\Swara\\DreamEra\\Automation\\14.  2-11-20\\Selenium files\\geckodriver-v0.28.0-win64\\geckodriver.exe");
				driver = new FirefoxDriver();
				}	
			driver.get("https://www.orangehrm.com/");
	}
  @Test()
  public void Login() {
	  
	  driver.findElement(By.partialLinkText("Get a ")).click();
  }
  
  @Test()
  public void orangehrmDemo()  {
	  
	//Explicitly Wait
			WebDriverWait wait= new WebDriverWait(driver,30);
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("FirstName"))));
			
			click(ele);
			//Thread.sleep(2000);
			Sendkeys(driver.findElement(By.name("FirstName")), "Swati");
			//Thread.sleep(2000);
			
			
			click(driver.findElement(By.xpath("//input[@id='Form_submitRequest_LastName']")));
			//Thread.sleep(2000);
			Sendkeys(driver.findElement(By.xpath("//input[@id='Form_submitRequest_LastName']")),"Jathar");
			//Thread.sleep(2000);
			
			
			click(driver.findElement(By.id("Form_submitRequest_Email")));
			//Thread.sleep(2000);
			Sendkeys(driver.findElement(By.id("Form_submitRequest_Email")), "swatibujare92@gmail.com");
			//Thread.sleep(2000);
			
			
			click(driver.findElement(By.name("Phone")));
			//Thread.sleep(2000);
			Sendkeys(driver.findElement(By.name("Phone")), "8788853734");
			//Thread.sleep(2000);
			

  }
  
  public static boolean checkElement(WebElement ele) {
		if(true==checkEleIsDisplay(ele) && true==checkEleIsEnabled(ele)) {
			return true;	
		}
		return true;
		
	}
	
	public static boolean checkEleIsDisplay(WebElement ele) {
		return ele.isDisplayed();
	}
	
	public static boolean checkEleIsEnabled(WebElement ele) {
		return ele.isEnabled();
	}
	
	public static boolean checkEleIsSelected (WebElement ele) {
		return ele.isSelected();
	}
	
	public static void click(WebElement ele) {
		if(true==checkEleIsDisplay(ele) && true==checkEleIsEnabled(ele)) {
		ele.click();
		}
	}
	
	public static void Sendkeys(WebElement ele,String value) {
		if(true==checkEleIsDisplay(ele) && true==checkEleIsEnabled(ele)) {
		ele.sendKeys(value);
		}
	}
	
  @AfterTest
  public void afterMethod() {
	  driver.close();
  }


  /*@DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }*/
}
