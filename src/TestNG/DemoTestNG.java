package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class DemoTestNG {
	
	@BeforeMethod
	  public void beforeMethod() {
		System.out.println("beforeMethod");
	  }
	@AfterMethod
	  public void afterMethod() {
		System.out.println("afterMethod");
	  }
	
  @Test(priority=1, dependsOnMethods = {"z"},enabled=false)
  public void OpenBrowser() {
	  System.out.println("OpenBrowser");
  }
  
  @Test(priority=2,dataProvider = "LoginData")
  public void Login(String username,String Pass) {
	  System.out.println("Login"+username+ "====" +Pass);
	  
  }
  
  @Test(priority=3)
  public void z() {
	  System.out.println("Z execution");
  }
  
  
  @DataProvider
  public Object[][] LoginData() {
    return new Object[][] {
      new Object[] { "username1", "Pass1" },
      new Object[] { "username2", "Pass2" },
    };
  }
  
  
  
  /* 

  @AfterMethod
  public void afterMethod() {
  }


  
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }
*/
}
