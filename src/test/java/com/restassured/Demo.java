package com.restassured;

import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.specification.RequestSpecification;

public class Demo {

	@Test
	public void testing()
	{
		//RequestSpecification rs = null;
		String url = "http://ergast.com/api/f1/2017/circuits.json";
		
		//String res = RestAssured.given().when().spec(rs).get(url).asString();
		String res = RestAssured.get(url).asString();
		JsonPath js = new JsonPath(res);
		System.out.println(js.getString("MRData.CircuitTable.Circuits.circuitId[15]"));
		
		//RestAssured.given().when().spec(rs).body("").post("").asString();
		//RestAssured.given().when().spec(rs).body("").delete().asString();
	}
}
