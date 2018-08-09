package Case;

import Moudle.ReadFile;
import Moudle.RequestAPI;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestWeb {
  @Test
  public void testWeb() throws Exception {
	  ReadFile read = new ReadFile();
	  RequestAPI request = new RequestAPI();
	  String apiName,host,requestAddress,requestMethod,URL;
	  HashMap m = new HashMap();
	  m = read.readExcelFile(1);
	  apiName = m.get(1).toString();
	  host = m.get(2).toString();
	  requestAddress = m.get(3).toString();
	  requestMethod = m.get(4).toString();
	  System.out.println(requestMethod);
	  URL="http://"+host+requestAddress;

	  if(requestMethod.equals("GET")) {
		  System.out.println("if");
		  Assert.assertEquals(request.doGet(URL), 0);
	  }else {
		  System.out.println("else");
	  }	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

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

}
