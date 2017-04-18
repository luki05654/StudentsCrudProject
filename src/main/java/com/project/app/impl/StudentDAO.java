package com.project.app.impl;

import java.util.List;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TransactionRequiredException;
import javax.persistence.TypedQuery;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.project.app.domain.Student;
import com.project.app.repository.IStudentRepository;

@Repository
public class StudentDAO implements IStudentRepository {
	private final static Logger logger = Logger.getLogger(StudentDAO.class);
	private EntityManagerFactory entityManagerFactory = Persistence
			.createEntityManagerFactory("oracleConfigurationUnit");
	private EntityManager entityManager = entityManagerFactory.createEntityManager();

	@Override
	public Student addStudent(Student student) {
		begin();

		try {
			entityManager.persist(student);
		} 
		catch (EntityExistsException e) {
			logger.error("Error (EntityExistsException): " + e.getMessage());
		} 
		catch (Exception e) {
			logger.error("Error (Exception): " + e.getMessage());
		} 
		finally {
			commit();
		}

		return student;
	}
	
	@Override
	public List<Student> addStudents(List<Student> students) {
		begin();
		try {
			for(Student student : students) {
				entityManager.persist(student);
			}			
		}
		catch (EntityExistsException e) {
			logger.error("Error (EntityExistsException): " + e.getMessage());
		} 
		catch (Exception e) {
			logger.error("Error (Exception): " + e.getMessage());
		} 
		finally {
			commit();
		}
		return students;
	}

	@Override
	public void deleteStudent(Student student) {
		begin();

		try {
			entityManager.remove(student);
		} 
		catch (TransactionRequiredException e) {
			logger.error("Error (TransactionRequiredException): " + e.getMessage());
		} 
		catch (Exception e) {
			logger.error("Error (Exception): " + e.getMessage());
		} 
		finally {
			commit();
		}
	}

	@Override
	public Student getStudentById(long id) {
		Student student;
		begin();
		TypedQuery<Student> query = entityManager.createQuery("select s from Student s where s.id = :id",
				Student.class);
		query.setParameter("id", id);

		try {
			student = query.getSingleResult();
		} 
		catch (NoResultException e) {
			logger.error("Error (NoResultException): " + e.getMessage());
			student = null;
		} 
		catch (Exception e) {
			logger.error("Error (Exception): " + e.getMessage());
			student = null;
		} 
		finally {
			commit();
		}

		return student;
	}

	@Override
	public int getStudentsCount() {
		int count;
		begin();
		TypedQuery<Long> query = entityManager.createQuery("select count(s.id) from Student s", Long.class);

		try {
			count = Integer.valueOf(query.getSingleResult().intValue());
		} 
		catch (NoResultException e) {
			logger.error("Error (NoResultException): " + e.getMessage());
			count = 0;
		} 
		catch (Exception e) {
			logger.error("Error (Exception): " + e.getMessage());
			count = -1;
		} 
		finally {
			commit();
		}

		return count;
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> students;
		begin();
		TypedQuery<Student> query = entityManager.createQuery("select s from Student s", Student.class);

		try {
			students = query.getResultList();
		} 
		catch (NoResultException e) {
			logger.error("Error (NoResultException): " + e.getMessage());
			students = null;
		} 
		catch (Exception e) {
			logger.error("Error (Exception): " + e.getMessage());
			students = null;
		} 
		finally {
			commit();
		}

		return students;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> getStudents(int elementsInPage, int startPosition, String order) {
		List<Student> students;
		begin();
		Query query = entityManager
				.createNativeQuery("select * from (select s.*, rownum r FROM STUDENTS s order by s.ID " + order
						+ ") where r >= :offset and r <= :limit", Student.class);
		query.setParameter("offset", startPosition + 1);
		query.setParameter("limit", (startPosition + elementsInPage));

		try {
			students = query.getResultList();
		} 
		catch (NoResultException e) {
			logger.error("Error (NoResultException): " + e.getMessage());
			students = null;
		} 
		catch (Exception e) {
			logger.error("Error (Exception): " + e.getMessage());
			students = null;
		} 
		finally {
			commit();
		}
		return students;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> getStudentsByFirstName(String firstName, int elementsInPage, int startPosition, String order) {
		List<Student> students;
		begin();
		Query query = entityManager.createNativeQuery(
				"select * from (select s.*, rownum r FROM STUDENTS s WHERE s.first_name like :firstName order by s.first_name "
						+ order + ") where r >= :offset and r < :limit",
				Student.class);
		query.setParameter("firstName", firstName);
		query.setParameter("offset", startPosition - 1);
		query.setParameter("limit", (startPosition + elementsInPage) - 1);
		try {
			students = query.getResultList();
		} 
		catch (NoResultException e) {
			logger.error("Error (NoResultException): " + e.getMessage());
			students = null;
		} 
		catch (Exception e) {
			logger.error("Error (Exception): " + e.getMessage());
			students = null;
		} 
		finally {
			commit();
		}

		return students;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> getStudentsByLastName(String lastName, int elementsInPage, int startPosition, String order) {
		List<Student> students;
		begin();
		Query query = entityManager.createNativeQuery(
				"select * from (select s.*, rownum r FROM STUDENTS s WHERE s.last_name like :lastName order by s.last_name "
						+ order + ") where r >= :offset and r < :limit",
				Student.class);
		query.setParameter("lastName", lastName);
		query.setParameter("offset", startPosition - 1);
		query.setParameter("limit", (startPosition + elementsInPage) - 1);
		try {
			students = query.getResultList();
		} 
		catch (NoResultException e) {
			logger.error("Error (NoResultException): " + e.getMessage());
			students = null;
		} 
		catch (Exception e) {
			logger.error("Error (Exception): " + e.getMessage());
			students = null;
		} 
		finally {
			commit();
		}

		return students;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> getStudentsByDepartment(String departmentName, int elementsInPage, int startPosition,
			String order) {
		List<Student> students;
		begin();
		Query query = entityManager.createNativeQuery(
				"select * from (select s.*, rownum r from STUDENTS_IN_DEPARTMENTS sd join STUDENTS s on sd.STUDENT_ID = s.ID join DEPARTMENTS d on sd.DEPARTMENT_ID = d.ID WHERE d.DEPARTMENT_NAME like :departmentName order by d.DEPARTMENT_NAME "
						+ order + ") where r >= :offset and r < :limit",
				Student.class);
		query.setParameter("departmentName", departmentName);
		query.setParameter("offset", startPosition - 1);
		query.setParameter("limit", (startPosition + elementsInPage) - 1);

		try {
			students = query.getResultList();
		} 
		catch (NoResultException e) {
			logger.error("Error (NoResultException): " + e.getMessage());
			students = null;
		} 
		catch (Exception e) {
			logger.error("Error (Exception): " + e.getMessage());
			students = null;
		} 
		finally {
			commit();
		}
		return students;
	}

	private void begin() {
		// entityManagerFactory =
		// Persistence.createEntityManagerFactory("oracleConfigurationUnit");
		// entityManager = entityManagerFactory.createEntityManager();
		// entityManager.getEntityManagerFactory().getCache().evictAll();
		entityManager.getTransaction().begin();

	}

	private void commit() {
		entityManager.getTransaction().commit();
		// entityManager.close();
		// entityManagerFactory.close();
	}
}
