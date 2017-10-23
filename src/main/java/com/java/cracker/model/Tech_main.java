package com.java.cracker.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
 
@Entity
@Table(name = "tech_main")
@JsonIgnoreProperties
public class Tech_main {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_tm;
	private String tm_technologies;
	private Integer total_no_of_question=0;
	private Integer total_no_of_subsection=0;
	
	
	public Integer getId_tm() {
		return id_tm;
	}
	public void setId_tm(Integer id_tm) {
		this.id_tm = id_tm;
	}
	public String getTm_technologies() {
		return tm_technologies;
	}
	public void setTm_technologies(String tm_technologies) {
		this.tm_technologies = tm_technologies;
	}
	public Integer getTotal_no_of_question() {
		return total_no_of_question;
	}
	public void setTotal_no_of_question(Integer total_no_of_question) {
		this.total_no_of_question = total_no_of_question;
	}
	public Integer getTotal_no_of_subsection() {
		return total_no_of_subsection;
	}
	public void setTotal_no_of_subsection(Integer total_no_of_subsection) {
		this.total_no_of_subsection = total_no_of_subsection;
	}
	public Tech_main( String tm_technologies, Integer total_no_of_question,
			Integer total_no_of_subsection) {
		super();
	 
		this.tm_technologies = tm_technologies;
		this.total_no_of_question = total_no_of_question;
		this.total_no_of_subsection = total_no_of_subsection;
	}
	public Tech_main() {
		 
	}


	
	
	
}
