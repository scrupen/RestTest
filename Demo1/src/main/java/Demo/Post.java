package Demo;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;

public class Post {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://reqres.in/";
		
		String response = given().header("Content-Type","text/plain").body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}")
				.when().post("/api/users")
				.then().assertThat().statusCode(201).header("server", "cloudflare")
				.extract().response().asString();
		System.out.println("\r\n" +response);
		
				
				
				
				
}

}