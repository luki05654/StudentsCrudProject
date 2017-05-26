package com.project.app.parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.project.app.domain.ContactDetails;
import com.project.app.domain.Department;
import com.project.app.domain.HomeLocality;
import com.project.app.domain.PersonalData;
import com.project.app.domain.Student;

public class TextFileParser {
	public static List<Student> getStudentsFromFile(MultipartFile multipartFile) {
		List<Student> students = new ArrayList<>();
		
		InputStream inputStream;
		BufferedReader bufferedReader;
		
		try {
			inputStream = multipartFile.getInputStream();
			bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			String fileExtension = multipartFile.getOriginalFilename().split("\\.")[1];
			String line;
			Student student;
			PersonalData personalData;
			HomeLocality homeLocality;
			ContactDetails contactDetails;
			String[] lineSplits;
			List<Department> departments;
			Department department;
			
			if(fileExtension.equalsIgnoreCase("txt") || fileExtension.equalsIgnoreCase("csv")) {
				while ( (line = bufferedReader.readLine()) != null) {
					lineSplits = line.split(";");
					student = new Student();
					personalData = new PersonalData();
					homeLocality = new HomeLocality();
					contactDetails = new ContactDetails();
					departments = new ArrayList<>();
					
					personalData.setFirstName(lineSplits[0]);
					personalData.setLastName(lineSplits[1]);
					personalData.setSex(lineSplits[2]);
					homeLocality.setCity(lineSplits[3]);
					homeLocality.setStreet(lineSplits[4]);
					homeLocality.setBuildingNumber(lineSplits[5]);
					homeLocality.setPostalCode(lineSplits[6]);
					homeLocality.setPostOfficeLocation(lineSplits[7]);
					contactDetails.setPhoneNumber(lineSplits[8]);
					contactDetails.setEmailAddress(lineSplits[9]);
					
					String departmentsLine = lineSplits[10];
					String[] departmentsAsArray = departmentsLine.split("\\|");
					
					for(int i=0; i<departmentsAsArray.length; i++) {
						department = new Department();
						department.setDepartmentName(departmentsAsArray[i]);
						departments.add(department);
					}
					
					student.setPersonalData(personalData);
					student.setHomeLocality(homeLocality);
					student.setContactDetails(contactDetails);
					student.setDepartments(departments);
					students.add(student);
				}
			}
			else {
				throw new IllegalArgumentException("wrong file type!!! Only txt or csv");
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		
		return students;
	}
}
