package com.rest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PUTproduct {
  @Test
  public void PUT() {
	  
	  RestAssured.baseURI="http://localhost:8082/productservice/115";
	  RequestSpecification httprequest = RestAssured.given();
	  JSONObject requestparams = new JSONObject();
	  
	  requestparams.put("productId", 115);
	  requestparams.put("productName", "Benz");
	  requestparams.put("productDescription", "Car");
	  requestparams.put("productPrice", 50000);
	  
	  httprequest.body(requestparams.toString());
	  httprequest.header("Content-Type","application/json");
	  httprequest.body(requestparams.toJSONString());
	  
	  Response response = httprequest.request(Method.PUT,"http://localhost:8082/productservice/115");
	  System.out.println(response.statusCode());
	 
  }
}
