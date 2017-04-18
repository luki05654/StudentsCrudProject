package com.project.app.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.app.domain.Order;
import com.project.app.domain.Student;
import com.project.app.service.IStudentService;

@Controller
public class StudentsController {
	public final static String StudentsViewName = "students";
	public final static String StudentsAdminViewName = "students-admin";
	private final static Logger logger = Logger.getLogger(StudentsController.class);
	private int elementsInPageCount = 10;
	private int currentPageNumber = 1;
	
	@Autowired
	private IStudentService studentsService;
	
	@RequestMapping(value = "/" + StudentsViewName, method = RequestMethod.GET)
	private String showAllStudents(Model model) {		
		logger.info("In showAllStudents()");	
		List<Student> students = studentsService.getStudents(10, 10, Order.ASC);
		int pagesCount = studentsService.getStudentsCount()/elementsInPageCount;
		
		if(students != null && students.isEmpty()) {
			logger.info("Empty students list");
		}
		else {
			model.addAttribute("studentsList", students);
			model.addAttribute("pagesCount", pagesCount);
			model.addAttribute("currentPageNumber", currentPageNumber);
		}		
		
		return StudentsViewName;
	}
	
	@RequestMapping(value = "/" + StudentsAdminViewName, method = RequestMethod.GET)
	private String showAllStudentsAdmin(Model model) {		
		logger.info("In showAllStudents()");	
		List<Student> students = studentsService.getStudents(10, 10, Order.ASC);
		int pagesCount = studentsService.getStudentsCount()/elementsInPageCount;
		
		if(students != null && students.isEmpty()) {
			logger.info("Empty students list");
		}
		else {
			model.addAttribute("studentsList", students);
			model.addAttribute("pagesCount", pagesCount);
			model.addAttribute("currentPageNumber", currentPageNumber);
		}
		
		return StudentsAdminViewName;
	}
}
