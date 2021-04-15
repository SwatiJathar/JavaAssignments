package SeleniumBasics;

import java.util.Properties;
import java.util.Set;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownAndMuliwindow extends ChromDriverDemo{

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
		
		try {
			FileInputStream FIS = new FileInputStream("D:\\Coding\\JavaAssignments\\src\\SeleniumBasics\\OR.properties");
			
			or = new Properties();
			or.load(FIS);
			System.out.println(or.getProperty("lnkforgotpass"));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		OpenBrowser("https://retail.onlinesbi.com/retail/login.htm");
		//orangehrmDemo();
		LoginSBI();
		ForgotUN();
		NewUser();
		CloseBrowser();
		
		
		//Select country = new Select(driver.findElement(By.xpath("//select[@id='Form_submitRequest_Country']")));
		//country.selectByIndex(1);
		
		
		//click(driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")));
		
	}	
		
	public static void LoginSBI() {
		click(driver.findElement(By.linkText("CONTINUE TO LOGIN")));
	}

		
		
	
	
	public static void ForgotUN() throws InterruptedException {
		
		click(driver.findElement(By.xpath(or.getProperty("lnkforgotpass"))));
		WindowMovenSelectDropdown();
		
	}
	
	public static void NewUser() throws InterruptedException{
		click(driver.findElement(By.xpath(or.getProperty("lnkNwUserReg"))));
		Alert alert=driver.switchTo().alert();
		alert.accept();
		WindowMovenSelectDropdown();
		
		
	}
	
	public static void WindowMovenSelectDropdown() throws InterruptedException {
		String parentWindowID=driver.getWindowHandle();
		Set<String> windowID = driver.getWindowHandles();
		
		for (String winIDS : windowID) {
			if(false== parentWindowID.equalsIgnoreCase(winIDS)) {
				driver.switchTo().window(winIDS);
				Select forgotPass=new Select(driver.findElement(By.xpath(or.getProperty("DropdownIssuev"))));
				forgotPass.selectByIndex(1);
				Thread.sleep(2000);
				
				click(driver.findElement(By.xpath(or.getProperty("btnNext"))));
				Thread.sleep(2000);
				driver.close();
				
				driver.switchTo().window(parentWindowID);
				break;
																}
		}
		
	}
	
	
		
	
	
	
	}
