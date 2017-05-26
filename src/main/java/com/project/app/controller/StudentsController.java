package com.project.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.project.app.domain.ContactDetails;
import com.project.app.domain.Departments;
import com.project.app.domain.MyFile;
import com.project.app.domain.Order;
import com.project.app.domain.Sex;
import com.project.app.domain.Student;
import com.project.app.parser.TextFileParser;
import com.project.app.service.IStudentService;

@Controller
public class StudentsController {
	public final static String StudentsViewName = "students";
	public final static String StudentsAdminViewName = "students-admin";
	public final static String StudentsAdminAddStudent = "students-admin-add-student";
	private final static Logger logger = Logger.getLogger(StudentsController.class);	
	
	@Autowired
	private IStudentService studentsService;	
	
	private List<Student> students;
	
	private int startPosition = 0;
	private int elementsInPage = 10;
	private int currentPageNumber = 1;
	private int pagesCount;
	private String filter;
	
	@RequestMapping(value = "/" + StudentsViewName, method = RequestMethod.GET)
	private String showAllStudents(Model model) {		
		logger.info("In showAllStudents()");	
		
		if(filter == null || filter.isEmpty()) {
			students = studentsService.getStudents(elementsInPage, startPosition, Order.ASC);
			pagesCount = studentsService.getStudentsCount()/elementsInPage;
		}
		else {
			pagesCount = students.size()/elementsInPage;
			pagesCount++;
		}
		
		
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
		MyFile myFile = new MyFile();
		
		if(students != null && students.isEmpty()) {
			logger.info("Empty students list");
		}
		else {
			model.addAttribute("studentsList", students);
			model.addAttribute("pagesCount", pagesCount);
			model.addAttribute("currentPageNumber", currentPageNumber);
			model.addAttribute("myFile", myFile);
		}	
		
		return StudentsAdminViewName;
	}
	
	@RequestMapping(value = "/" + StudentsAdminViewName, method = RequestMethod.POST)
	private String addStudentsFromFile(@ModelAttribute("myFile") @Valid MyFile myFile, HttpServletRequest request) {
		MultipartFile multipartFile = myFile.getData();
		List<Student> st = TextFileParser.getStudentsFromFile(multipartFile);
		studentsService.addStudents(st);
		students = studentsService.getStudents(elementsInPage, startPosition, Order.ASC);
		studentsService.getAllStudents();
		return "redirect:/" + StudentsAdminViewName;
	}
	
	@RequestMapping(value = "/" + StudentsAdminAddStudent, method = RequestMethod.GET)
	private String addStudent(Model model) {
		Student student = new Student();
		String[] sexs = new String[]{Sex.MALE.toString(), Sex.FEMALE.toString()};		
		Departments[] dEnumValues = Departments.values();
		String[] departments = new String[dEnumValues.length];
		
		for(int i=0; i<dEnumValues.length; i++) {
			departments[i] = dEnumValues[i].toString();
		}
		
		model.addAttribute("newStudent", student);
		model.addAttribute("sexs", sexs);
		model.addAttribute("departments", departments);
		ContactDetails contactDetails = student.getContactDetails();
		/*if(contactDetails != null) {
			return "redirect:/" + StudentsAdminViewName;
		}*/
		
		return StudentsAdminAddStudent;
	}
	
	@RequestMapping(value = "/" + StudentsAdminAddStudent, method = RequestMethod.POST)
	private String processAddNewStudent(@ModelAttribute("newStudent") Student newStudent) {
		studentsService.addStudent(newStudent);
		students = studentsService.getStudents(elementsInPage, startPosition, Order.ASC);
		return "redirect:/" + StudentsAdminViewName;
	}
	
	@RequestMapping(value = "/students-admin-delete/{id}")
	private String deleteStudent(@PathVariable(name="id") long id) {
		Student studentToDelete = studentsService.getStudentById(id);
		studentsService.deleteStudent(studentToDelete);
		students = studentsService.getStudents(elementsInPage, startPosition, Order.ASC);
		return "redirect:/"+StudentsAdminViewName;
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
	
	@RequestMapping(value = "/students/searchByFirstName/{firstName}", method = RequestMethod.GET)
	private @ResponseBody String searchByFirstName(@PathVariable(value = "firstName") String firstName) {
		filter = firstName;
		
		if(firstName.length() > 0) {			
			students = studentsService.getStudentsByFirstName(firstName, elementsInPage, startPosition, Order.ASC);
		}
		
		return "Searching by firstname: " + firstName;
	}
	
	@RequestMapping(value = "/students/noFilter", method = RequestMethod.GET)
	private @ResponseBody String noFilter() {
		filter = "";		
		students = studentsService.getStudents(elementsInPage, startPosition, Order.ASC);
		
		return "noFilter";
	}
	
	@InitBinder
	public void initialiseBinder(WebDataBinder binder) {
		
	}
}
