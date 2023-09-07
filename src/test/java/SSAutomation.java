



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
//	@Test
	//public void ssautomationtest() {
//
//		String key = "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6ImI4ZjM1NjRlNTEzY2M1NGY3OTFmNmQzN2VjOGY5MGViZWZiOTRhYzcifQ.eyJpc3MiOiJodHRwczovL2F1dGgtZm9zcy1hbmFseXRpY3MtbGFuZGluZ3pvbmUtc3RhZ2luZy5pbnRlcm5hbC5lcmljc3Nvbi5jb20iLCJzdWIiOiJDaXMzUW05NWNuWTFjbEpsYUU4MGF6QlNkMHBqTWswd1JsZEtVa05IU1RGT2VrMVZOVEJxYjA5S1ptVlJFZ2x0YVdOeWIzTnZablEiLCJhdWQiOiJzb2Z0c2Vuc2UiLCJleHAiOjE2ODg0MTczMzEsImlhdCI6MTY4ODMzMDkzMSwibm9uY2UiOiI4MzY3YjUzYWQ0Y2M0YzNhODU2NTU4OTY3MGJkMGJjNiIsImF0X2hhc2giOiJRZjlDZzJDaHF2ZVhtNTlvYnJzLVJBIiwiZW1haWwiOiJkb3NhcGF0aS5zdXJ5YXRlamFAZXJpY3Nzb24uY29tIiwiZW1haWxfdmVyaWZpZWQiOnRydWUsImdyb3VwcyI6WyIzMTJlYTZkNS05MjIwLTQ1NGEtYTEyYS0wNWIxMTQ1Y2E4ZDMiXSwibmFtZSI6IkRvc2FwYXRpIFN1cnlhdGVqYSIsImZlZGVyYXRlZF9jbGFpbXMiOnsiY29ubmVjdG9yX2lkIjoibWljcm9zb2Z0IiwidXNlcl9pZCI6IjdCb3lydjVyUmVoTzRrMFJ3SmMyTTBGV0pSQ0dJMU56TVU1MGpvT0pmZVEifX0.LMs8Q8jaYfxcT1LnmG4J6LCX0p6SrwOLihi1mqyJDcjYUp0tcYMQm4whF7fJTpR2ZY_cyC9GbPonTeVK-X0tVUGZroVZiIL14gzIOFPZF7M-cmfUW_iJN1zU0SdPtTkKLGePgXQ5sKrD_NkGpwhKEu0dVeUMG__QNntjTI1JKQGwDVabtm7LV_lZ-xHWAObO3Tdj0zfKEx5tbxtMTW4MOvBH0ARlfux6tHfTwREBZ2x-DelStGBNQEuatwrUxZFO3JqID6DRGbj5aF4Q4ajxC0buOTqHuaAaSAs6T2A4MOxwrWxAAl6RzXz3GK9IAFuWN0tN2PLtcyv_Xrs7h8kRUg";
//		String BaseUrl = "https://api-foss-analytics-landingzone-staging.internal.ericsson.com/api/v0";
//
//		JSONArray myArray = new JSONArray();
//
//		Response response_pkglist = RestAssured.given().relaxedHTTPSValidation().header("Authorization", key)
//				.header("accept", "application/json").when().get(BaseUrl + "/analysis/packages");
//		String pkg_list = response_pkglist.asString();
//		JsonPath jp1 = new JsonPath(pkg_list);
//		int pkgurl_count = jp1.getInt("size()");
//		for (int i = 0; i < pkgurl_count; i++) {
//			String newurl = jp1.getString("[" + i + "]");
//			String encodedPkgValue;
//			try {
//				encodedPkgValue = URLEncoder.encode(newurl, "UTF-8");
//			} catch (UnsupportedEncodingException e) {
//				e.printStackTrace();
//				return;
//			}
//			String encoded_Url = BaseUrl + "/analysis/packages/" + encodedPkgValue + "/revisions";
//			String revision_list = RestAssured.given().urlEncodingEnabled(false).relaxedHTTPSValidation()
//					.header("Authorization", key).header("accept", "application/json").when().get(encoded_Url)
//					.asString();
//			JsonPath jp2 = new JsonPath(revision_list);
//			System.out.println(revision_list);
//			int revid_count = jp2.getInt("size()");
//			for (int j = 0; j < 1; j++) {
//				String pkgurl_list = jp2.getString("[" + j + "].pkg");
//				String rev_id = jp2.getString("[" + j + "].id");
//				System.out.println(pkgurl_list);
//				System.out.println(rev_id);
//
//				String analysis_Url = BaseUrl + "/analysis/packages/" + encodedPkgValue + "/revisions/" + rev_id
//						+ "/subanalyses/vulnerabilities";
//				String pkg_vul_analysis = RestAssured.given().urlEncodingEnabled(false).relaxedHTTPSValidation()
//						.header("Authorization", key).header("accept", "application/json").when().get(analysis_Url)
//						.asString();
//				JsonPath jp3 = new JsonPath(pkg_vul_analysis);
//				System.out.println(pkg_vul_analysis);
//				String cve_id = jp3.getString("vulnerabilities[0].id");
//				if (!(cve_id == null || cve_id.length() == 0)) {
//					System.out.println(pkgurl_list);
//					System.out.println(rev_id);
//					System.out.println(cve_id);
//					JSONObject jj = new JSONObject();
//					jj.put("pkg", pkgurl_list);
//					jj.put("id", rev_id);
//					jj.put("vul", cve_id);
//					myArray.add(jj);
//
//				}
//
//			}
//
//		}
//
//		String final_result = myArray.toString();
//		System.out.println(final_result);

	     //RestAssured.baseURI="https://webui.3rdpartyproducts-management-sandbox.internal.ericsson.com";
        String refreshtokenvalue ="0.AREA60zokv37q0e-UggMa4eVP8LwbiAetJFLuQdpay-I5fkRAJc.AgABAAEAAAD--DLA3VO7QrddgJg7WevrAgDs_wUA9P8xRMYnXT7rbaYzX9hqNWrawDdKCeGZbJfoa991il2OiZJF0uIJYZ27oeKk54ixCvpBoNuOMJJryBlRbZfc8-JWfS72KR-sz5kzIoMCY_SsyK13XfjEZx-Wup39KmSV2J_ubbD3RudWn-dWC7oJqOXXff4DXZHe_CugjO7G2C51YNaYZ_bpCcA2KXBVjn-x44PPx8ee90sgDKEtXC21XyYOYT3wwb4rqH6blNRVsxChoF3J9vT3e06UPAmBHWlOb9BQBlh4d8wQrbOFu_ZZ0f6vElXv19d0p7BPhMOUiTm3019m507QwkDsHZKOrPAdBcPOhpL_5jRr0Ifocblf1vkaR6jl15GuEYMBTKHv5dlqX5gX-CBHlyZJ2brOOhIjDg9pubOyNszRljGMOGb984Ev_KGlfh1Y-pQ9qUCns6bbow93l_0Nz8tl5Jyur74bjhs61FCcg5_dbd0aSNi4ICe_-IyBkeCLYKG9FPVfEI3w5ZXDI1iExP5A-OsC_xn1CgW2rA2f5c1anpXd2ZPlUbjJgZqWSSIzp61DwjBITC7d7vXiI3iyY_HbrfiMF6DEX2WlN20EgDgKU1qdTo7r_XgDEuNV8FWF8ueN24TpV0rjZfk6BOpRTrhiCVDHBPWC0faecoKuWBm7hoGpHT-lb4zq8ccAMG4fg9fTQkMuH0rrm86ve4-PHS8DlozuSpXui-T5OWhXUy-T3L_Rkeao5eDnJd-6Jafm59Khymjt6g7QFEYvRxlW-ZWoI5YKmBoWQhib77Mb6fPnriG7k06C2VxNb6hWB5tdWiIPTs33N5EUxjn9Cfw4OwfoyuwsXAFxfAGcuV4at8wekOeX0WuY"; 
        String Result= RestAssured.given().config(RestAssured.config().encoderConfig(EncoderConfig.encoderConfig().encodeContentTypeAs("x-www-form-urlencoded", ContentType.URLENC))).contentType(ContentType.URLENC.withCharset("UTF-8")).formParam("refresh_token",refreshtokenvalue).when().post("https://webui.3rdpartyproducts-management-sandbox.internal.ericsson.com/api/token").asPrettyString();

        System.out.println(Result);
		
		System.out.println("test");
		
		
		
		
	}
}