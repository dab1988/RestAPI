package ReqResAPIAutomation;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import RequestUtility.returnJsonObjectUtility;
import RequestUtility.getRequestUtility;
import RequestUtility.peopertyUtil;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class firstDataTest extends beforeTestUtil 
{
	
	/*JsonPath json;
	peopertyUtil util;
	
	@BeforeClass
	void getTestAPI()
	{
		util= new peopertyUtil("D:\\ecclipse\\TESTING\\src\\main\\java\\restAPIdata.properties");
		String getResponseBody=getRequestUtility.getRequestasString(2);
		 json= returnJsonObjectUtility.rowToJson(getResponseBody);
	}
	*/
	@Test
	void pageTest()
	{
		Assert.assertEquals(json.getInt("page"), 1);
		System.out.println(json.getString("data[0].email"));
	}
	
	@Test
	void firstEmailTest()
	{
		Assert.assertEquals(json.getString("data[0].email"),peopertyUtil.readFirstEmail());
	}
	@Test
	void firstName()
	{
		Assert.assertEquals(json.getString("data[0].first_name"), peopertyUtil.readFirstName());
	}
	
	@Test
	void lastName()
	{
		Assert.assertEquals(json.getString("data[0].last_name"), peopertyUtil.readLastName());
	}
}