package Demo;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class Put {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI="https://reqres.in/";
				
				String response = given().header("Content-Type","text/plain").body("{\r\n"
						+ "    \"name\": \"morpheus\",\r\n"
						+ "    \"job\": \"zion resident\"\r\n"
						+ "}")
						.when().put("/api/users/2")
						.then().assertThat().statusCode(200).header("server", "cloudflare")
						.extract().response().asString();
				System.out.println("\r\n" +response);
			}

		

}
