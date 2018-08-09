package Case;

import org.testng.annotations.Test;

import Moudle.Login;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestStartClient {
	Login login = new Login();
  @Test
  public void TestEnterLoginPage() throws Exception{
	  try {
//		  Assert.assertEquals(login.StartFirefox(), 0);
		  Assert.assertEquals(login.StartChrome(), 0);
//		  login.StartChrome();
		  System.out.println("Enter LoginPage Success!!!");
//		  Assert.assertEquals(login.CloseChrome(), 0);
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
  }
  
  @Test
  public void TestLogin() {
	  try {
		  Assert.assertEquals(login.LoginSystem(), 0);
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod");
//	  login.CloseFirefox();
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  login.CloseChrome();
	  System.out.println("afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest");
  }

}
