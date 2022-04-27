package com.rest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GETallProduct {
  @Test
  public void GETALL() {
	  
	  RestAssured.baseURI="http://localhost:8082/productservice/products";
	  RequestSpecification httprequest = RestAssured.given();
	  Response response = httprequest.request(Method.GET,"");
	  
	  System.out.println("StatusReceived is:" + response.prettyPrint());
	  System.out.println("Status Code is:" + response.getStatusCode());
	  
	  Assert.assertEquals(200, response.getStatusCode());
	  
	  System.out.println(response.asString());
	  System.out.println("printing in json format: "  +  response.prettyPrint());	  
	  System.out.println("printing status line:  "  +  response.getStatusLine());
	   }
}
