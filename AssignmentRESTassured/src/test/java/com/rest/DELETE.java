package com.rest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DELETEproduct {
  @Test
  public void DELETE() {
	  
	  RestAssured.baseURI="http://localhost:8082/productservice/102";
	  RequestSpecification httprequest = RestAssured.given();
	  
	  JSONObject requestparams = new JSONObject();
	  requestparams.put("productId", 102);
	  requestparams.put("productName", "Swift");
	  requestparams.put("productDescription", "Car");
	  requestparams.put("productPrice", 10000);
	  
	  httprequest.body(requestparams.toString());
	  httprequest.header("Content-Type","application/json");
	  httprequest.body(requestparams.toJSONString());
	  
	  Response response = httprequest.request(Method.DELETE,"http://localhost:8082/productservice/102");
	  System.out.println(response.statusCode());
	 }
}
