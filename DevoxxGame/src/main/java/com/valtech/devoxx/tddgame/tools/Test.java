package com.valtech.devoxx.tddgame.tools;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class Test {
	public static void search(String address, String zipcode, String city) {
		try {
			URL url = new URL("https://maps.googleapis.com/maps/api/directions/json?origin=Bangalore,India&amp;destination=Belgaum,India&amp;sensor=false");
			
				HttpURLConnection conn = (HttpURLConnection)url.openConnection();
				conn.connect();
				//InputStream is = conn.getInputStream();
				InputSource geocoderResultInputSource = new    
						InputSource(conn.getInputStream());
				Document geocoderResultDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(geocoderResultInputSource);
			} catch (SAXException e) {
				e.printStackTrace();
			} catch (ParserConfigurationException e) {
				e.printStackTrace();
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
	}

