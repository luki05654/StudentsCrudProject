package com.project.app.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.app.domain.ContactDetails;
import com.project.app.domain.Department;
import com.project.app.domain.HomeLocality;
import com.project.app.domain.PersonalData;
import com.project.app.domain.Sex;
import com.project.app.domain.Student;
import com.project.app.repository.IStudentRepository;

import hurtownie.danych.DatabaseCreator;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	public final static String HomeViewName = "home";
	private final static Logger logger = Logger.getLogger(HomeController.class);
	
	@Autowired
	private IStudentRepository studentRepository;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is " + locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );	
		
		//new DatabaseCreator();
		
		//createFakeData();
		
		//logger.info("Student repository size: " + studentRepository.getStudentsCount());
		//logger.info("Student by ID: " + studentRepository.getStudentById(1L));
		//logger.info("All students: " + studentRepository.getAllStudents().toString());
		//logger.info("Students in page: " + studentRepository.getStudents(2, 3, Order.DESC));
		
		//Student student =  studentRepository.getStudentById(199L);
		//studentRepository.deleteStudent(student);
		//logger.info("Student by firstName: " + studentRepository.getStudentsByFirstName("FirstName0", 10, 0, Order.ASC));
		//logger.info("Student by lastName: " + studentRepository.getStudentsByLastName("LastName2", 10, 0, Order.ASC));
		//logger.info("Student by departmentName: " + studentRepository.getStudentsByDepartment("DepartmentName0", 10, 0, Order.ASC).toString());
		return HomeViewName;
	}
	
	@RequestMapping(value = "/{userType}", method = RequestMethod.GET)
	public String redirectToPage(@PathVariable(value="userType") String userType) {
		switch (userType) {
		case "admin":
			return "redirect:/students-admin";
		
		case "plainUser":
			return "redirect:/students";
			
		default:
			return "";
		}
	}
	
	private void createFakeData() {
		for (int i = 0; i < 100; i++) {
			Student student = new Student();
			ArrayList<Department> departments = new ArrayList<>();
			PersonalData personalData = new PersonalData();			
			HomeLocality homeLocality = new HomeLocality();
			Department department = new Department();
			ContactDetails contactDetails = new ContactDetails();
			
			personalData.setFirstName("FirstName" + i);
			personalData.setLastName("LastName" + i);
			if(i%2==0) {
				personalData.setSex(Sex.FEMALE.toString());
			}
			else {
				personalData.setSex(Sex.MALE.toString());
			}
			
			homeLocality.setBuildingNumber("" + i);
			homeLocality.setCity("City" + i);
			homeLocality.setPostalCode("1" + i + "" + i*3/2);
			homeLocality.setPostOfficeLocation("PostLocation" + i);
			homeLocality.setStreet("Street" + i);	
			
			contactDetails.setEmailAddress("addreassEmail@" + i + ".com");
			contactDetails.setPhoneNumber("" + i + i + i + i + i + i + i + i + i);
			
			department.setDepartmentName("DepartmentName" + i);	
			
			student.setContactDetails(contactDetails);
			student.setHomeLocality(homeLocality);
			student.setPersonalData(personalData);
			
			departments.add(department);
			student.setDepartments(departments);
			
			studentRepository.addStudent(student);
		}
	}
}