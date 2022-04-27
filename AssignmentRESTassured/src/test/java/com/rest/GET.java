package com.rest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GETproduct {
  @Test
  public void GET() {
	  
	  RestAssured.baseURI="http://localhost:8082/productservice/101";
	  RequestSpecification httprequest = RestAssured.given();
	  Response response = httprequest.request(Method.GET,"");
	  System.out.println("THe Status Code is" + response.getStatusCode());
	  
	  Assert.assertEquals(200, response.getStatusCode());
	  
	  System.out.println(response.asString());
	  System.out.println("printing in json format:  "  +  response.prettyPrint());	  
	  System.out.println("printing status line: "  +  response.getStatusLine());
	 
	  
  }
}
