package RequestUtility;

import io.restassured.path.json.JsonPath;

public class returnJsonObjectUtility 
{

	
	public static JsonPath rowToJson(String response)
	{
		JsonPath js = new JsonPath(response);
		return js;
	}
	
	
}
