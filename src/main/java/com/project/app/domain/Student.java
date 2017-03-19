package com.project.app.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
	private DomicileLocality domicileLocality;

	@Embedded
	private HomeLocality homeLocality;

	@Embedded
	private ContactDeails contactDetails;

	@ManyToMany
	@Column(name = "DEPARTMENT")
	private List<Department> departments;

	public Student() {
	}

	public Student(PersonalData personalData, DomicileLocality domicileLocality, HomeLocality homeLocality,
			ContactDeails contactDetails, List<Department> departments) {
		this.personalData = personalData;
		this.domicileLocality = domicileLocality;
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

	public DomicileLocality getDomicileLocality() {
		return domicileLocality;
	}

	public void setDomicileLocality(DomicileLocality domicileLocality) {
		this.domicileLocality = domicileLocality;
	}

	public HomeLocality getHomeLocality() {
		return homeLocality;
	}

	public void setHomeLocality(HomeLocality homeLocality) {
		this.homeLocality = homeLocality;
	}

	public ContactDeails getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(ContactDeails contactDetails) {
		this.contactDetails = contactDetails;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}
}
