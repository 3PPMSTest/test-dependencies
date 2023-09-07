



import io.restassured.RestAssured;
import io.restassured.config.EncoderConfig;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


import static io.restassured.RestAssured.*;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class SSAutomation {

	public static void main(String[] args) {
        String refreshtokenvalue ="0.ARDs_wUA9P8xRMYnXT7rbaYzX9hqNWrawDdKCeGZbZfc8-JWfS72KR-sz5kzIoMCY_SsyK13XfjEZx-Wup39KmSV2J_ubbD3RudWn-dWC7oJqOXXff4DXZHe_CugjO7G2C51YNaYZ_bpCcA2KXBVjn-x44PPx8ee90sgDKEtXC21XyYOYT3wwb4rqH6blNRVsxChoF3J9vT3e06UPAmBHWlOb9BQBlh4d8wQrbOFu_ZZ0f6vElXv19d0p7BPhMOUiTm3019m507QwkDsHZKOrPAdBcPOhpL_5jRr0Ifocblf1vkaR6jl15GuEYMBTKHv5dlqX5gX-CBHlyZJ2brOOhIjDg9pubOyNszRljGMOGb984Ev_KGlfh1Y-pQ9qUCns6bbow93l_0Nz8tl5Jyur74bjhs61FCcg5_dbd0aSNi4ICe_-IyBkeCLYKG9FPVfEI3w5ZXDI1iExP5A-OsC_xn1CgW2rA2f5c1anpXd2ZPlUbjJgZqWSSIzp61DwjBITC7d7vXiI3iyY_HbrfiMF6DEX2WlN20EgDgKU1qdTo7r_XgDEuNV8FWF8ueN24TpV0rjZfk6BOpRTrhiCVDHBPWC0faecoKuWBm7hoGpHT-lb4zq8ccAMG4fg9fTQkMuH0rrm86ve4-PHS8DlozuSpXui-T5OWhXUy-T3L_Rkeao5eDnJd-6Jafm59Khymjt6g7QFEYvRxlW-ZWoI5YKmBoWQhib77Mb6fPnriG7k06C2VxNb6hWB5tdWiIPTs33N5EUxjn9Cfw4OwfoyuwsXAFxfAGcuV4at8wekOeX0WuY"; 
        String Result= RestAssured.given().config(RestAssured.config().encoderConfig(EncoderConfig.encoderConfig().encodeContentTypeAs("x-www-form-urlencoded", ContentType.URLENC))).contentType(ContentType.URLENC.withCharset("UTF-8")).formParam("refresh_token",refreshtokenvalue).when().post("https://on.com/api/token").asPrettyString();

        System.out.println(Result);
		
		System.out.println("test");
		
		
		
		
	}
}
