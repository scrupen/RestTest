package Demo;

import static io.restassured.RestAssured.given;


import io.restassured.RestAssured;

public class BDDtype {
	
	public static void main(String[] args) {
	
	RestAssured.baseURI="https://reqres.in/";
	
	String response = given()
			.when().get("/api/users")
			.then().assertThat().statusCode(200)
			.extract().response().asString();
	System.out.println("\r\n" +response);
	
	}
}
