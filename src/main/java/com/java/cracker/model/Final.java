package com.java.cracker.model;

import java.util.HashMap;
import java.util.List;

public class Final {
	private int id;
	private HashMap< String , List<QueAndAns>> finalMap;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public HashMap<String, List<QueAndAns>> getFinalMap() {
		return finalMap;
	}
	public void setFinalMap(HashMap<String, List<QueAndAns>> finalMap) {
		this.finalMap = finalMap;
	}
	
	

}
