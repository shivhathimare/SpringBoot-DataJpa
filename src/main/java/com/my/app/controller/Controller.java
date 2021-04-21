package com.my.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.my.app.StudentServiceImpl;
import com.my.app.model.Student;
import com.my.app.service.StudentService;

@org.springframework.stereotype.Controller
@RequestMapping("/student")
public class Controller {
	@Autowired
	private StudentService service;
	
	@GetMapping("/show")
	public String showData() {
		return "StdData";
	}
	
	
	@PostMapping("/save")
	public String saveStudent(@ModelAttribute Student student,Model model) {
		
		Integer std = service.addStudent(student);
		
		String message="Student '"+std+"' Saved";
		
		model.addAttribute("message",message);
		
		return "StdData";
		
	}

}
