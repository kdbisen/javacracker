package com.java.cracker.dao;

import java.util.List;

import com.java.cracker.model.Section;

public interface SectionDao {
	
	public Section findById(int id);
	public List<Section> findAll();
	public List<Section> findByTechnology(String technology);	
	public boolean addSection(Section section);
	

}
