package com.rest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AddProduct {
  @Test
  public void ADD() {
	  
	  RestAssured.baseURI="http://localhost:8082/productservice/addProduct";
	  RequestSpecification httprequest = RestAssured.given();
	  JSONObject requestparams = new JSONObject();
	  
	  requestparams.put("productId", 101);
	  requestparams.put("productName", "Sumo");
	  requestparams.put("productDescription", "Sumo");
	  requestparams.put("productPrice", 10000);
	  
	  httprequest.body(requestparams.toString());
	  httprequest.header("Content-Type","application/json");
	  httprequest.body(requestparams.toJSONString());
	  
	  Response response = httprequest.request(Method.POST,"http://localhost:8082/productservice/addProduct");
	  System.out.println(response.statusCode());
	  }
}
