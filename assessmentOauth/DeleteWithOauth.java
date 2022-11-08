package assessmentOauth;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteWithOauth {
	
	 @Test
		public void delete() {
	    	
	    	RestAssured.baseURI="https://dev120775.service-now.com/api/now/table";
	    	Response response = RestAssured.given().header("Authorization","Bearer 2mZ0f1u7Eaoj29KVco_KHCtJOzfdEbfPWyU8vTckP9QA2v0Yer8dhYe8ziHC2OavD5AdloyHytNk1Au49qRjDA")
	    			.delete("/incident/d4f9327697721110aba1318c1253af97");
	   
	    	System.out.println(response.getStatusCode());
	    	
	  

		}


}
