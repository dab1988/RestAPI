package RequestUtility;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;

public class getRequestUtility 
{


	public static String getRequestasString(int id)
	{
		peopertyUtil util= new peopertyUtil("D:\\ecclipse\\TESTING\\src\\main\\java\\restAPIdata.properties");
	     RestAssured.baseURI=util.readURI();
		return given().queryParam("page", "id").when()
				.get("/api/users").then().log().all().extract().response().asString();
	}
	
	public static ExtractableResponse<Response> getRequestasResponse(int id)
	{
		peopertyUtil util= new peopertyUtil("D:\\ecclipse\\TESTING\\src\\main\\java\\restAPIdata.properties");
	//	String response= RestAssured.baseURI=util.readURI();
		 RestAssured.baseURI=util.readURI();
		return given().queryParam("page", "id").when()
				.get("/api/users").then().log().all().extract();
	}
	
	
	public static ExtractableResponse<Response> getRequestasResponsebyPathParam(int id)
	{
		peopertyUtil util= new peopertyUtil("D:\\ecclipse\\TESTING\\src\\main\\java\\restAPIdata.properties");
	//	String response= RestAssured.baseURI=util.readURI();
		 RestAssured.baseURI=util.readURI();
		return given().queryParam("page", "id").when()
				.get("/api/users").then().log().all().extract();
	}
	
	public static Response  postBody(String name, String Job)
	{
		peopertyUtil util= new peopertyUtil("D:\\ecclipse\\TESTING\\src\\main\\java\\restAPIdata.properties");
	//	String response= RestAssured.baseURI=util.readURI();
		 RestAssured.baseURI=util.readURI();
		return given().header("Content-Type", "application/json").body(postBody.post(name, Job))
				.when().post("/api/users")
				.then()
				.assertThat()
				.log().all().extract().response();
	}
	
	
	public static Headers getHeaderst(int id)
	{
		return given().queryParam("page", "id").when()
				.get("/api/users").then().log().all().extract().response().headers();
	}
}
