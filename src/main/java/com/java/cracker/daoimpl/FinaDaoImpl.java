package com.java.cracker.daoimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.cracker.ITech_mainImpl;
import com.java.cracker.dao.FinalDao;
import com.java.cracker.dao.QueAnsDao;
import com.java.cracker.dao.SectionDao;
import com.java.cracker.model.QueAndAns;
import com.java.cracker.model.Section;
import com.java.cracker.model.Tech_main;
@Repository("finalDao")
public class FinaDaoImpl  implements FinalDao{
	 

	@Autowired
	private ITech_mainImpl _iTech_mainipl;
	@Autowired
	private QueAnsDao queAnsDao;
	
	@Autowired
	private SectionDao sectionDao;
	
	public void setQueAnsDao(QueAnsDao queAnsDao) {
		this.queAnsDao = queAnsDao;
	}
	@Override
	public HashMap<String, List<QueAndAns>> getAllQueAns() {
		
		HashMap<String, List<QueAndAns>> map = new HashMap<String, List<QueAndAns>>();
		 List<Tech_main> listofTech =    _iTech_mainipl.findAll();
		 
		 int lenght = listofTech.size();
		 
		 
		 for(int i =0;i<lenght; i++){
			 String tech = listofTech.get(i).getTm_technologies();
			 System.out.println(tech);
			 List<QueAndAns> lis= 	 queAnsDao.findByTechnology(tech);
			 map.put(tech, lis);
		 }
		
		
		return map;
	}
	@Override
	public HashMap<String, List<HashMap<String, List<QueAndAns>>>> getAll() {
		
		
		HashMap<String, List<HashMap<String, List<QueAndAns>>>> finalMap = new HashMap<String, List<HashMap<String, List<QueAndAns>>>>();
		
		
		 List<Tech_main> listofTech =    _iTech_mainipl.findAll();
		 int lenght = listofTech.size();

		for (int i = 0; i < lenght; i++) {
			String tech = listofTech.get(i).getTm_technologies();
			List<Section> section = sectionDao.findByTechnology(tech);

			List<HashMap<String, List<QueAndAns>>> listtt = new ArrayList<HashMap<String, List<QueAndAns>>>();
			HashMap<String, List<QueAndAns>> map = new HashMap<String, List<QueAndAns>>();

			int lenght2 = section.size();
			for (int j = 0; j < lenght2; j++) {

				List<QueAndAns> list = queAnsDao.findByTechAndSection(tech, section.get(j).getSection());

				map.put(section.get(j).getSection(), list);

			}
			
			listtt.add(map);
			finalMap.put(tech, listtt);
		}
		
		
		return finalMap;
	}
	

}
