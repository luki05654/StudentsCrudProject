package com.project.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.app.repository.IStudentRepository;

@Controller
public class StudentController {
	public final static String StudentViewName = "student";
	
	@Autowired
	private IStudentRepository studentRepository;
	
	@RequestMapping("/{id}")
	public String getStudentById(Model model, @PathVariable("id") long id) {
		model.addAttribute("student", studentRepository.getStudentById(id));
		
		return StudentViewName;
	}
}
