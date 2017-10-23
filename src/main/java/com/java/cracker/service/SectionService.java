package com.java.cracker.service;

import java.util.List;

import com.java.cracker.model.QueAndAns;
import com.java.cracker.model.Section;

public interface SectionService {
	public Section findById(int id);
	public List<Section> findAll();
	public List<Section> findByTechnology(String technology);
	public boolean addSection(Section section);
}
