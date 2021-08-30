package RequestUtility;

public class postBody 
{

	public  static String post(String name, String Job )
	{
		
		return "{\r\n" + 
				"    \"name\": \" "+name+" \",\r\n" + 
				"    \"job\": \""+Job+"\"\r\n" + 
				"}";
	}
}
