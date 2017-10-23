package com.java.cracker.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tech_section")
@JsonIgnoreProperties
public class Section {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String section;
	private String technology;
	private String no_of_question="0";
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public String getNo_of_question() {
		return no_of_question;
	}
	public void setNo_of_question(String no_of_question) {
		this.no_of_question = no_of_question;
	}
	
	

}
