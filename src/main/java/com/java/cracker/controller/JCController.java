package com.java.cracker.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.cracker.model.QueAndAns;
import com.java.cracker.model.Section;
import com.java.cracker.service.FinalService;
import com.java.cracker.service.QueAnsService;
import com.java.cracker.service.SectionService;

@RestController
public class JCController {
	
	
	@Autowired
	private SectionService sectionService;
	
	@Autowired
	private QueAnsService queAnsService;
	
	@Autowired
	private FinalService finalService;
	
	@RequestMapping("/javacracker/technologies/{technology}")
	@ResponseBody
	public List<Section> findAllbyTechnology(@PathVariable("technology") String technology) {
		List<Section> sections = null;
		try {
			sections = (List<Section>) sectionService.findByTechnology(technology);
		} catch (Exception e) {
			e.printStackTrace();
		}
	 
		return sections;
	}
	
	@RequestMapping(value="/addQuestion/submitForm", method = RequestMethod.POST)
    public @ResponseBody boolean  submittedFromData(@RequestBody QueAndAns queAndAns, HttpServletRequest request) {	
		
		 return queAnsService.addQueAns(queAndAns);
	}
	
	@RequestMapping(value="/addSection/section", method = RequestMethod.POST)
    public @ResponseBody boolean  addSection(@RequestBody Section section, HttpServletRequest request) {	
		System.out.println("ssssssss - - "+section.getSection());
		System.out.println("ppppppp - -"+section.getTechnology());
		 return sectionService.addSection(section);
	}

	
	
	@RequestMapping("/javacracker/que_ans")
	@ResponseBody
	public List<QueAndAns> findAllQueAns() {
		List<QueAndAns> queAndAns = null;
		try {
			queAndAns = (List<QueAndAns>) queAnsService.findAll();
		} catch (Exception e) {
			e.printStackTrace();
	 

		}
		return queAndAns;

	}
	
	
	
	
	
	@RequestMapping("/javacracker/sections")
	@ResponseBody
	public List<Section> findAllSections() {
		List<Section> queAndAns = null;
		try {
			queAndAns = (List<Section>) sectionService.findAll();
		} catch (Exception e) {
			e.printStackTrace();
	 

		}
		return queAndAns;

	}
	
	
	
	@RequestMapping("/javacracker/full")
	@ResponseBody
	public  HashMap<String, List<QueAndAns>>  getAll() {
		 
		return finalService.getAllQueAns();

	}
	
	@RequestMapping("/javacracker/")
	@ResponseBody
	public  HashMap<String, List<HashMap<String, List<QueAndAns>>>>  getAll1() {
		 
		return finalService.getAll();

	}
	
}
