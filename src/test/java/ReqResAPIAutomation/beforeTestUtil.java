package ReqResAPIAutomation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import RequestUtility.getRequestUtility;
import RequestUtility.peopertyUtil;
import RequestUtility.returnJsonObjectUtility;
import io.restassured.path.json.JsonPath;

public class beforeTestUtil
{
	public static JsonPath json;
	public static  peopertyUtil util;
	@BeforeTest
	public void setUp()
	{
		util= new peopertyUtil("D:\\ecclipse\\TESTING\\src\\main\\java\\restAPIdata.properties");
		String getResponseBody=getRequestUtility.getRequestasString(2);
		 json= returnJsonObjectUtility.rowToJson(getResponseBody);
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("Test Completed");
	}

}
