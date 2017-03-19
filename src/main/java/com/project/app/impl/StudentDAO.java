package com.project.app.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.project.app.domain.Student;
import com.project.app.repository.IStudentRepository;

@Repository
public class StudentDAO implements IStudentRepository {
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	
	@Override
	public Student addStudent(Student student) {	
		begin();
		entityManager.persist(student);
		commit();
		
		return student;
	}

	@Override
	public void deleteStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student getStudentById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getStudentsCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getStudents(int elementsInPage, int pageNumber, String order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getStudentsByFirstName(String firstName, int elementsInPage, int pageNumber, String order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getStudentsByLastName(String lasttName, int elementsInPage, int pageNumber, String order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getStudentsByDepartment(String departmentName, int elementsInPage, int pageNumber,
			String order) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private void begin() {
		entityManagerFactory = Persistence.createEntityManagerFactory("oracleConfigurationUnit");
		entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
	}
	
	private void commit() {
		entityManager.getTransaction().commit();
		entityManager.close();		
		entityManagerFactory.close();
	}
	

}
