package com.qa.POJO;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;

public class pojoTest 
{

	@Test
	void readFile() throws Exception
	{
		RestAssured.baseURI="https://reqres.in";
/*		
		String response= given().queryParam("page", "2")
		.when()
		.get("/api/users")
		.then()
		.log().all().extract().response().body().asString();
	
	
		System.out.println(response);*/

        //Design Pojo Set Up
		
		
		MasterClass masterPojo=given().queryParam("page", "2").expect().defaultParser(Parser.JSON)
		.when()
		.get("/api/users")
		.as(MasterClass.class);

		System.out.println(masterPojo.getPage());
		System.out.println(masterPojo.getTotal());
		
		System.out.println(masterPojo.getData().get(0).getFirst_name());
		
		System.out.println(masterPojo.getSupport().getUrl());
		System.out.println(masterPojo.getSupport().getText());
		
		
		
	}
}
