package com.java.cracker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QueAnsController {

	@RequestMapping("/addQuestion")
	public String submitQuestion() {
		return "queans.html";
	}

	@RequestMapping("/admin")
	public String admin() {
		return "admin/production/queationadd_form.html";
	}

	@RequestMapping("/que_ans_table")
	public String que_ans_table() {
		System.out.println();
		return "admin/production/que_ans_table.html";
	}
	
}
