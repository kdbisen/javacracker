package com.java.cracker.serviceimpl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.cracker.dao.FinalDao;
import com.java.cracker.model.QueAndAns;
import com.java.cracker.service.FinalService;
@Service ("finalService")
@Transactional
public class FinalServiceImpl implements FinalService{
	@Autowired
	private FinalDao finalDao;

	@Override
	public HashMap<String, List<QueAndAns>> getAllQueAns() {
		 
		return finalDao.getAllQueAns();
	}

	@Override
	public HashMap<String, List<HashMap<String, List<QueAndAns>>>> getAll() {
		// TODO Auto-generated method stub
		return finalDao.getAll();
	}
	
	

}
