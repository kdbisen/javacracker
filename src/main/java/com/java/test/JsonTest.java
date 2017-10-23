package com.java.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class JsonTest {
	
	public static void main(String[] args) throws org.json.simple.parser.ParseException{
		
		
		JSONParser parser = new JSONParser();

		try {

			Object obj = parser.parse(new FileReader("C:\\Users\\kuldeep.bisen\\Desktop\\javacracker.json"));

			JSONObject jsonObject = (JSONObject) obj;
			System.out.println("- - "+jsonObject.toJSONString());

			JSONArray jsonObject2 = (JSONArray) jsonObject.get("Java");
			
			
			
			
			
			/*
			String name = (String) jsonObject.get("name");
			System.out.println(name);

			long age = (Long) jsonObject.get("age");
			System.out.println(age);

			// loop array
			JSONArray msg = (JSONArray) jsonObject.get("messages");
			Iterator<String> iterator = msg.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
			*/

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
