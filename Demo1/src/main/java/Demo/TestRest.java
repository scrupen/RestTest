package Demo;


import org.testng.Assert;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class TestRest {


	public static void main(String[] args) {
	
	RestAssured.baseURI = "https://reqres.in";
		
	RequestSpecification httpRequest = RestAssured.given();
	
	Response response = httpRequest.request(Method.GET, "/api/users");
	
	int statuscode = response.getStatusCode();
	
	Assert.assertEquals(200, statuscode);
	System.out.println("Response status code is " + statuscode);
	
	
	

	
	}

	
	
}
