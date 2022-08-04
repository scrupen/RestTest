package Demo;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RestAssured.baseURI="https://reqres.in/";
		
		String response = given()
				.when().delete("/api/users/2")
				.then().assertThat().statusCode(204).header("server", "cloudflare")
				.extract().response().asString();
		System.out.println("\r\n" +response);
	}

}