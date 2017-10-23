package com.java.cracker;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.cracker.daoimpl.QueAnsDaoImpl;
import com.java.cracker.model.QueAndAns;
import com.java.cracker.model.Tech_main;

@RestController
public class RestServiceController {

	@Autowired
	private ITech_mainImpl _iTech_mainipl;
	
/*	@Autowired
	private QueAnsDaoImpl queAnsDaoImpl;
	*/
	

	static final Logger logger = LogManager.getLogger(RestServiceController.class.getName());

	@RequestMapping("/javacracker/technologies")
	@ResponseBody
	public List<Tech_main> findAllMovie() {
		List<Tech_main> tech_main = null;
		try {
			tech_main = (List<Tech_main>) _iTech_mainipl.findAll();
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());

		}
		return tech_main;

	}

	// CREATE
	@RequestMapping(value = "/javacracker/technologies/add", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Tech_main> createTechnology(@RequestBody Tech_main main) {

		try {

			_iTech_mainipl.save(main);

		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());

		}
		return new ResponseEntity<Tech_main>(main, HttpStatus.OK);
	}

	@RequestMapping(value ="/javacracker/technology/{id}",method = RequestMethod.GET )
	@ResponseBody
	public  Tech_main  create(@PathVariable("id") int tm_id) {
		
		
		return _iTech_mainipl.getTechnologyById(tm_id);
	}
	
	
	
	/*@RequestMapping("/queandans/")
	@ResponseBody
	public List<QueAndAns> findAllQueAns() {
		List<QueAndAns> queAndAns = null;
		try {
			queAndAns = (List<QueAndAns>) queAnsDaoImpl.findAll();
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());

		}
		return queAndAns;

	}

	
	
	
	@RequestMapping("/queandans/{technology}")
	@ResponseBody
	public List<QueAndAns> findAllQueAnsByTechnology(@PathVariable("technology")  String technology  ) {
		List<QueAndAns> queAndAns = null;
		try {
			queAndAns = (List<QueAndAns>) queAnsDaoImpl.findByTechnology(technology);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());

		}
		return queAndAns;

	}
	
	
	@RequestMapping("/queandans/{section}")
	@ResponseBody
	public List<QueAndAns> findAllQueAnsBySection(@PathVariable("section")  String section  ) {
		List<QueAndAns> queAndAns = null;
		try {
			queAndAns = (List<QueAndAns>) queAnsDaoImpl.findBySection(section);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());

		}
		return queAndAns;

	}
	*/

	
	
	
}