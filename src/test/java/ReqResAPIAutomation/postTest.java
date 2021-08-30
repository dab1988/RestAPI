package ReqResAPIAutomation;

import org.testng.Assert;
import org.testng.annotations.Test;

import RequestUtility.getRequestUtility;
import RequestUtility.returnJsonObjectUtility;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class postTest extends beforeTestUtil
{

	
	@Test
	void createUser()
	{
		Response response= getRequestUtility.postBody("Delan", "Kon");	
		JsonPath json=response.jsonPath();
		
		Assert.assertEquals(response.statusCode(), 201);
	}
	
}
