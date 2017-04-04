package com.project.app.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENTS")
public class Student {
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private long id;

	@Embedded
	private PersonalData personalData;
	@Embedded
	private HomeLocality homeLocality;

	@Embedded
	private ContactDetails contactDetails;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "STUDENTS_IN_DEPARTMENTS",
	joinColumns = 	{
		@JoinColumn(name = "STUDENT_ID") 
	}, 
	inverseJoinColumns = { 
			@JoinColumn(name = "DEPARTMENT_ID") 
	})
	private List<Department> departments;

	public Student() {
	}

	public Student(Student student) {
		this.id = student.getId();
		this.personalData = student.getPersonalData();
		this.homeLocality = student.getHomeLocality();
		this.contactDetails = student.getContactDetails();
		this.departments = student.getDepartments();
	}

	public Student(PersonalData personalData, HomeLocality homeLocality, ContactDetails contactDetails,
			List<Department> departments) {
		this.personalData = personalData;
		this.homeLocality = homeLocality;
		this.contactDetails = contactDetails;
		this.departments = departments;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public PersonalData getPersonalData() {
		return personalData;
	}

	public void setPersonalData(PersonalData personalData) {
		this.personalData = personalData;
	}

	public HomeLocality getHomeLocality() {
		return homeLocality;
	}

	public void setHomeLocality(HomeLocality homeLocality) {
		this.homeLocality = homeLocality;
	}

	public ContactDetails getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", personalData=" + personalData + ", homeLocality=" + homeLocality
				+ ", contactDetails=" + contactDetails + ", departments=" + departments + "]";
	}
}
