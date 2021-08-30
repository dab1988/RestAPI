package SerialiazablePOJO;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class serialiazablePostTest 
{

	List<String> list;
	locationChild location;
	@Test
	void postTest ()
	{
		
		MasterSerializeClass masterPojo= new MasterSerializeClass();
		
		location= new locationChild();
		list= new ArrayList<String>();
	
		location.setLat(-60.383494);
		location.setLng(-98.383450);
		masterPojo.setAccuracy(740);
		masterPojo.setLocation(location);
		masterPojo.setName("Tiger Hill");
		masterPojo.setPhone_number("(+91) 944 9693 3937");
		masterPojo.setAddress("90, side layout, cohen 09");
		list.add(0,"Sher Levis");
		
		String [] str= new String[2];
		str[0]="Noida Mall";
		str[1]="Delhi Job";
		list=Arrays.asList(str);
		masterPojo.setTypes(list);
		masterPojo.setWebsite("https://seleniumhq.org/");
		masterPojo.setLanguage("French");
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		Response response= given().queryParam("key", "qaclick123")
		
		.body(masterPojo)
		.when()
		.post("/maps/api/place/add/json")
		.then().extract().response();
		
		System.out.println(response.asString());
		System.out.println("Status Code is-->"+ response.getStatusCode());
		System.out.println("Status Line is-->"+ response.getStatusLine());
		JsonPath postResponse= new JsonPath(response.asString());
		String Place_Id= postResponse.getString("place_id");
		String Id= postResponse.getString("id");
		System.out.println("Place Id is-->"+ Place_Id+" And Id is-->"+ Id);
		
	}
}
