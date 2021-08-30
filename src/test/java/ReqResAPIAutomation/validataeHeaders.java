package ReqResAPIAutomation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import RequestUtility.getRequestUtility;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

//public class validataeHeaders extends beforeTestUtil
public class validataeHeaders 
{

	
	@Test (enabled=false)
	void validateHeaders()
	{
		ExtractableResponse<Response> response=getRequestUtility.getRequestasResponse(2);
		
		Headers header=response.headers();
		
		List<Header> listHeader= header.asList();
		System.out.println(listHeader.size());
		
		for(Header head: listHeader)
		{
			System.out.println(head.getName() +"  "+ head.getValue());
		}
		JsonPath json= response.jsonPath();
		
		System.out.println(json.get("total_pages"));
	}
	
	@Test (enabled=false)
	void negativeTest()
	{
		ExtractableResponse<Response> response=getRequestUtility.getRequestasResponse(23);
		
		int code =response.statusCode();
		Assert.assertEquals(code!=200, false);
		System.out.println("Invalid User Test Passed");
	}
	
	
}
