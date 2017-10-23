package com.java.cracker.service;

import java.util.List;

import com.java.cracker.model.QueAndAns;

public interface QueAnsService {
	
	
	public List<QueAndAns> findAll();
	public List<QueAndAns> findByTechnology(String technology);
	public List<QueAndAns>  findBySection(String section);
	public boolean addQueAns(QueAndAns queAndAns);
	public List<QueAndAns> findByTechAndSection(String technology, String section);
	
	
}
