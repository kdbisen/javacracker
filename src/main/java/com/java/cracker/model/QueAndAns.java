package com.java.cracker.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "que_and_ans")
@JsonIgnoreProperties
public class QueAndAns {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "question")
	private String question;

	@Column(name = "technology")
	private String technology;

	@Column(name = "answer")
	private String answer;

	@Column(name = "code")
	private String code;

	@Column(name = "section")
	private String section;

	@Column(name = "has_code")
	private boolean hasCode;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public boolean isHasCode() {
		return hasCode;
	}

	public void setHasCode(boolean hasCode) {
		this.hasCode = hasCode;
	}

	public String getTechnology() {
		return technology;
	}

	
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	
	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}
	
	@Override
	public String toString() {
		return "QueAndAns [id=" + id + ", question=" + question + ", technology=" + technology + ", answer=" + answer
				+ ", code=" + code + ", section=" + section + ", hasCode=" + hasCode + "]";
	} 

}
