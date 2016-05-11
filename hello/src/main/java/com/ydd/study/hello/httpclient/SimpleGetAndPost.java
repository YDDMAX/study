package com.ydd.study.hello.httpclient;



import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Form;
import org.apache.http.client.fluent.Request;




public class SimpleGetAndPost {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		// The fluent API relieves the user from having to deal with manual deallocation of system
		// resources at the cost of having to buffer response content in memory in some cases.

		Request.Get("http://targethost/homepage")
		    .execute().returnContent();
		Request.Post("http://targethost/login")
		    .bodyForm(Form.form().add("username",  "vip").add("password",  "secret").build())
		    .execute().returnContent();

	}

}
