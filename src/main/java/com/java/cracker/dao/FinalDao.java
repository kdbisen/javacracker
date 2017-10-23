package com.java.cracker.dao;

import java.util.HashMap;
import java.util.List;

import com.java.cracker.model.QueAndAns;

public interface FinalDao {

	
	public  HashMap< String , List<QueAndAns>> getAllQueAns();
	
	
	public HashMap<String, List<HashMap< String , List<QueAndAns>>>> getAll();
}



