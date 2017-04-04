package com.project.app.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.app.domain.Student;
import com.project.app.repository.IStudentRepository;
import com.project.app.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {
	@Autowired
	private IStudentRepository studentRepository;

	@Override
	public Student addStudent(Student student) {
		return studentRepository.addStudent(student);
	}

	@Override
	public void deleteStudent(Student student) {
		studentRepository.deleteStudent(student);
	}

	@Override
	public Student getStudentById(long id) {
		return studentRepository.getStudentById(id);
	}

	@Override
	public int getStudentsCount() {
		return studentRepository.getStudentsCount();
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.getAllStudents();
	}

	@Override
	public List<Student> getStudents(int elementsInPage, int startPosition, String order) {
		return studentRepository.getStudents(elementsInPage, startPosition, order);
	}

	@Override
	public List<Student> getStudentsByFirstName(String firstName, int elementsInPage, int startPosition, String order) {
		return studentRepository.getStudentsByFirstName(firstName, elementsInPage, startPosition, order);
	}

	@Override
	public List<Student> getStudentsByLastName(String lastName, int elementsInPage, int startPosition, String order) {
		return studentRepository.getStudentsByLastName(lastName, elementsInPage, startPosition, order);
	}

	@Override
	public List<Student> getStudentsByDepartment(String departmentName, int elementsInPage, int startPosition,
			String order) {
		return studentRepository.getStudentsByDepartment(departmentName, elementsInPage, startPosition, order);
	}
}
