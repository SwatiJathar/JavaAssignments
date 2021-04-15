package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo extends ChromDriverDemo {

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
		OpenBrowser("https://www.amazon.in/");
		
		
		

		
		Actions actions= new Actions(driver);
		
		actions.moveToElement((driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]/../..")))).build().perform();
		Thread.sleep(2000);
		//actions.moveToElement((driver.findElement(By.xpath("//span[contains(text(),'Your Account')]")))).click().build().perform();
		//Thread.sleep(2000);
		actions.moveToElement((driver.findElement(By.xpath("//span[contains(text(),'Your Account')]")))).contextClick().build().perform();
		
		
	}

}
