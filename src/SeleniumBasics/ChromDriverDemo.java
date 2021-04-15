package SeleniumBasics;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;
import java.util.concurrent.TimeUnit;  

public class ChromDriverDemo {

	static WebDriver driver= null;
	static Properties or = null;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String browser="chrome";
        //WebDriver driver= null;
		if(browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "D:\\Swara\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
			
			 driver = new ChromeDriver();
			
			}else if(browser.equalsIgnoreCase("firfox")) {
				
				System.setProperty("webdriver.gecko.driver", "D:\\Swara\\DreamEra\\Automation\\14.  2-11-20\\Selenium files\\geckodriver-v0.28.0-win64\\geckodriver.exe");
				driver = new FirefoxDriver();
				}	
		//Implicitly Wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		OpenBrowser("https://www.orangehrm.com/");
		//getTitle();
		//currentUrl();
		//getPageSource();
		orangehrmDemo();
		Login();
		CloseBrowser();
	}

	
		public static void OpenBrowser(String url) throws InterruptedException {
		
		driver.get(url);
		Thread.sleep(5000);
		/*driver.navigate().to("https://www.onlinesbi.com/");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);*/
	}
	public static void getTitle() {
		System.out.println("Title====="+driver.getTitle());
	}
	
	public static void currentUrl() {
		System.out.println("currentUrl====="+driver.getCurrentUrl());
	}
	public static void getPageSource() {
		System.out.println("GetPageSource====="+driver.getPageSource());
	}
	
	public static void orangehrmDemo() throws InterruptedException {
		driver.findElement(By.partialLinkText("Get a ")).click();
		//Thread.sleep(5000);
	}
	
	//Code for checkElement Method
	/*public static void Login() throws InterruptedException {
		
		if(true==checkElement(driver.findElement(By.name("FirstName")))) {
		driver.findElement(By.name("FirstName")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("FirstName")).sendKeys("Swati");;
		Thread.sleep(2000);
		}
		
		if(true==checkElement(driver.findElement(By.xpath("//input[@id='Form_submitRequest_LastName']")))) {
		driver.findElement(By.xpath("//input[@id='Form_submitRequest_LastName']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Form_submitRequest_LastName']")).sendKeys("Jathar");;
		Thread.sleep(2000);
		}
		
		if(true==checkElement(driver.findElement(By.id("Form_submitRequest_Email")))) {
		driver.findElement(By.id("Form_submitRequest_Email")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Form_submitRequest_Email")).sendKeys("swatibujare92@gmail.com");
		Thread.sleep(2000);
		}
		
		if(true==checkElement(driver.findElement(By.name("Phone")))) {
		driver.findElement(By.name("Phone")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("Phone")).sendKeys("8788853734");
		Thread.sleep(2000);
		}
		
		/*if(true==checkElement(driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")))) {
			driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")).click();
			Thread.sleep(2000);
		}*/
	

//Code optimization using  Click() and Sendkey() Method

	public static void Login() throws InterruptedException {
		
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
		Thread.sleep(2000);
		
		
		click(driver.findElement(By.name("Phone")));
		//Thread.sleep(2000);
		Sendkeys(driver.findElement(By.name("Phone")), "8788853734");
		//Thread.sleep(2000);
		
		
		/*if(true==checkElement(driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")))) {
			driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")).click();
			Thread.sleep(2000);
		}*/
		////select[@id='Form_submitRequest_Country']
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
	
	
	
	public static void CloseBrowser() {
		
		driver.close();
		//driver.quit();
		
	}
	
	
}
