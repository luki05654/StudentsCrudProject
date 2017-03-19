package com.project.app.service;

import java.util.List;

import com.project.app.domain.Student;

public interface IStudentService {
	Student addStudent(Student student);

	void deleteStudent(Student student);

	Student getStudentById(long id);

	int getStudentsCount();

	List<Student> getAllStudents();

	List<Student> getStudents(int elementsInPage, int pageNumber, String order);

	List<Student> getStudentsByFirstName(String firstName, int elementsInPage, int pageNumber, String order);

	List<Student> getStudentsByLastName(String lasttName, int elementsInPage, int pageNumber, String order);

	List<Student> getStudentsByDepartment(String departmentName, int elementsInPage, int pageNumber, String order);
}