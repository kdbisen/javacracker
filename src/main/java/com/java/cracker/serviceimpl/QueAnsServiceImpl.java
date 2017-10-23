package com.java.cracker.serviceimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.java.cracker.dao.QueAnsDao;
import com.java.cracker.model.QueAndAns;
import com.java.cracker.service.QueAnsService;

@Service ("queAnsService")
@Transactional
public class QueAnsServiceImpl implements QueAnsService{
	
	@Autowired
	private QueAnsDao queAnsDao;
	
	public void setQueAnsDao(QueAnsDao queAnsDao) {
		this.queAnsDao = queAnsDao;
	}

	@Override
	public List<QueAndAns> findAll() {
		return queAnsDao.findAll();
	}

	@Override
	public List<QueAndAns> findByTechnology(String technology) {
		return queAnsDao.findByTechnology(technology);
	}

	@Override
	public List<QueAndAns> findBySection(String section) {
		return queAnsDao.findBySection(section);
	}

	@Override
	public boolean addQueAns(QueAndAns queAndAns) {
		return queAnsDao.addQueAns(queAndAns);
	}
	
	@Override
	public List<QueAndAns> findByTechAndSection(String technology, String section) {
		return queAnsDao.findByTechAndSection(technology, section);
		
	}

}
