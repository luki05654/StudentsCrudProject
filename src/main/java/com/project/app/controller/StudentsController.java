package com.project.app.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.project.app.domain.Order;
import com.project.app.domain.Student;
import com.project.app.service.IStudentService;

@Controller
public class StudentsController {
	public final static String StudentsViewName = "students";
	public final static String StudentsAdminViewName = "students-admin";
	private final static Logger logger = Logger.getLogger(StudentsController.class);	
	
	@Autowired
	private IStudentService studentsService;	
	
	private List<Student> students;
	
	private int startPosition = 0;
	private int elementsInPage = 10;
	private int currentPageNumber = 1;
	private int pagesCount;
	
	@RequestMapping(value = "/" + StudentsViewName, method = RequestMethod.GET)
	private String showAllStudents(Model model) {		
		logger.info("In showAllStudents()");	
		students = studentsService.getStudents(elementsInPage, startPosition, Order.ASC);
		pagesCount = studentsService.getStudentsCount()/elementsInPage;
		
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
		students = studentsService.getStudents(elementsInPage, startPosition, Order.ASC);
		pagesCount = studentsService.getStudentsCount()/elementsInPage;
		
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
	
	@RequestMapping(value = "/firstPage", method = RequestMethod.GET)
	private @ResponseBody String firstPage() {
		startPosition = 0;
		currentPageNumber = 1;
		return "First page";
	}
	
	@RequestMapping(value = "/previousPage", method = RequestMethod.GET)
	private @ResponseBody String previousPage() {
		if(startPosition >= elementsInPage) {
			startPosition -= elementsInPage;
			currentPageNumber--;
		}
		return "Previous page";
	}
	
	@RequestMapping(value = "/nextPage", method = RequestMethod.GET)
	private @ResponseBody String nextPage() {
		if(currentPageNumber < pagesCount){
			startPosition += elementsInPage;
			currentPageNumber++;
		}
		
		return "Next page";
	}
}
