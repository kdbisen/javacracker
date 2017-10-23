package com.java.cracker.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.java.cracker.dao.SectionDao;
import com.java.cracker.model.QueAndAns;
import com.java.cracker.model.Section;
import com.java.cracker.service.SectionService;

@Service ("sectionService")
@Transactional
public class SectionServiceImpl implements SectionService  {
	
	@Autowired
	private SectionDao sectionDao;
	
	public void setSectionDao(SectionDao sectionDao) {
		this.sectionDao = sectionDao;
	}
	
	@Override
	public Section findById(int id) {
		 
		return sectionDao.findById(id);
	}

	@Override
	public List<Section> findAll() {
		 
		return sectionDao.findAll();
	}

	@Override
	public List<Section> findByTechnology(String technology) {
		 
		return sectionDao.findByTechnology(technology);
	}

	@Override
	public boolean addSection(Section section) {
		// TODO Auto-generated method stub
		return sectionDao.addSection(section);
	}

	 
	
	
	
}
