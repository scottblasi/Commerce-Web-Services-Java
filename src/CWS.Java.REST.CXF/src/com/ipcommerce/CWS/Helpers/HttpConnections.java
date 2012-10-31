package com.ipcommerce.CWS.Helpers;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.conn.params.ConnRoutePNames;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

public class HttpConnections {

	// For proxy settings to view in Fiddler2
	private static Boolean proxy = true;
	
	public static enum HttpMethod
	{
		GET, PUT, POST, DELETE; 
	}	
	
	public static String sendPostRequest(String targetURL, String token, String body, boolean isJson)
	{
		HttpClient client = new DefaultHttpClient();
		HttpPost httpPost = new HttpPost(targetURL);
		token = token + ":"; // Username is "token" password follows : and is empty
		String encodedToken = new String(Base64.encodeBase64(token.getBytes()));

		if(proxy)
		{
			HttpHost proxy = new HttpHost("127.0.0.1", 8888, "http");
			client.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, proxy);
		}		
		// VM args 
		// -DproxySet=true -DproxyHost=127.0.0.1 -DproxyPort=8888
		//-Djavax.net.ssl.trustStore="C:\Program Files\Java\jre7\bin\FiddlerKeystore"
		//-Djavax.net.ssl.trustStore="C:\Program Files\Java\jre7\bin\CWS-01.cert.keystore"
		
		try{			
			httpPost.setEntity(new StringEntity(body));
			if(isJson)
				httpPost.setHeader("Content-Type", "application/json");
			else
				httpPost.setHeader("Content-Type", "application/xml");
			httpPost.setHeader("User-Agent", "Mozilla/4.0");
			httpPost.setHeader("Authorization", "Basic " + encodedToken);
			httpPost.setHeader("Host", "cws-01.cert.ipcommerce.com"); // TODO: Parse targetURL string for this
			httpPost.setHeader("Connection", "Keep-Alive");			
			
			System.out.println("EXECUTING POST...");			
			HttpResponse response = client.execute(httpPost);			
			System.out.println("Status: " + response.getStatusLine().getStatusCode() + " " + response.getStatusLine().getReasonPhrase());
			
			HttpEntity resEntity = response.getEntity();
			if(resEntity != null)
			{
				BufferedReader br = new BufferedReader(new InputStreamReader(resEntity.getContent()));
				StringBuilder data = new StringBuilder();
				String s = "";
				while((s = br.readLine()) != null)
				    data.append(s);
				return data.toString();		
			}

		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			httpPost.releaseConnection();
			client.getConnectionManager().shutdown();
		}		
		return null;
	}
	
	// Currently not using httpMethod - may remove if requests methods are seperate.
	public static String sendPutRequest(String targetURL, String token, String body, HttpMethod httpMethod, boolean isJson)
	{
		HttpClient client = new DefaultHttpClient();
		HttpPut httpPut = new HttpPut(targetURL);
		token = token + ":"; // Username is "token" password follows : and is empty
		String encodedToken = new String(Base64.encodeBase64(token.getBytes()));

		if(proxy)
		{
			HttpHost proxy = new HttpHost("127.0.0.1", 8888, "http");
			client.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, proxy);
		}		
		// VM args 
		// -DproxySet=true -DproxyHost=127.0.0.1 -DproxyPort=8888
		//-Djavax.net.ssl.trustStore="C:\Program Files\Java\jre7\bin\FiddlerKeystore"
		//-Djavax.net.ssl.trustStore="C:\Program Files\Java\jre7\bin\CWS-01.cert.keystore"
		
		try{			
			httpPut.setEntity(new StringEntity(body));
			if(isJson)
				httpPut.setHeader("Content-Type", "application/json");
			else
				httpPut.setHeader("Content-Type", "application/xml");
			httpPut.setHeader("User-Agent", "Mozilla/4.0");
			httpPut.setHeader("Authorization", "Basic " + encodedToken);
			httpPut.setHeader("Host", "cws-01.cert.ipcommerce.com"); // TODO: Parse targetURL string for this
			httpPut.setHeader("Connection", "Keep-Alive");			
			
			System.out.println("EXECUTING PUT...");			
			HttpResponse response = client.execute(httpPut);			
			System.out.println("Status: " + response.getStatusLine().getStatusCode() + " " + response.getStatusLine().getReasonPhrase());
			
			HttpEntity resEntity = response.getEntity();
			if(resEntity != null)
			{
				BufferedReader br = new BufferedReader(new InputStreamReader(resEntity.getContent()));
				StringBuilder data = new StringBuilder();
				String s = "";
				while((s = br.readLine()) != null)
				    data.append(s);
				return data.toString();		
			}

		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			httpPut.releaseConnection();
			client.getConnectionManager().shutdown();
		}		
		return null;
	}
	
	// Currently not using httpMethod - may remove if requests methods are seperate.
	public static String sendGetRequest(String targetURL, String token, HttpMethod httpMethod, boolean isJson)
	{
		HttpClient client = new DefaultHttpClient();
		HttpGet httpGet = new HttpGet(targetURL);
		token = token + ":"; // Username is "token" password follows : and is empty
		String encodedToken = new String(Base64.encodeBase64(token.getBytes()));
		
		if(proxy)
		{
			HttpHost proxy = new HttpHost("127.0.0.1", 8888, "http");
			client.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, proxy);
		}		
		// VM args 
		// -DproxySet=true -DproxyHost=127.0.0.1 -DproxyPort=8888
		//-Djavax.net.ssl.trustStore="C:\Program Files\Java\jre7\bin\FiddlerKeystore"
		//-Djavax.net.ssl.trustStore="C:\Program Files\Java\jre7\bin\CWS-01.cert.keystore"
		
		try{			
			
			if(isJson)
				httpGet.setHeader("Content-Type", "application/json");
			else
				httpGet.setHeader("Content-Type", "application/xml");
			httpGet.setHeader("User-Agent", "Mozilla/4.0");
			httpGet.setHeader("Authorization", "Basic " + encodedToken);
			httpGet.setHeader("Host", GetHostFromURL(targetURL)); 
			httpGet.setHeader("Connection", "Keep-Alive");			
			
			System.out.println("EXECUTING GET...");			
			HttpResponse response = client.execute(httpGet);			
			System.out.println("Status: " + response.getStatusLine().getStatusCode() + " " + response.getStatusLine().getReasonPhrase());
			
			HttpEntity resEntityGet = response.getEntity();
			if(resEntityGet != null)
			{
				BufferedReader br = new BufferedReader(new InputStreamReader(resEntityGet.getContent()));
				StringBuilder data = new StringBuilder();
				String s = "";
				while((s = br.readLine()) != null)
				    data.append(s);
				return data.toString();		
			}

		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			httpGet.releaseConnection();
			client.getConnectionManager().shutdown();
		}		
		return null;
	}	
	
	private static String GetHostFromURL(String requestUrl)
	{
		int beginIndex;
		if(requestUrl.contains("https"))
			beginIndex = 8;
		else beginIndex = 7;
		int endIndex = requestUrl.indexOf('/', beginIndex);
		return requestUrl.substring(beginIndex, endIndex);
	}
}
