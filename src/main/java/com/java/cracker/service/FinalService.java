package com.java.cracker.service;

import java.util.HashMap;
import java.util.List;

import com.java.cracker.model.QueAndAns;

public interface FinalService {
	public  HashMap< String , List<QueAndAns>> getAllQueAns();
	public HashMap<String, List<HashMap< String , List<QueAndAns>>>> getAll();
}
