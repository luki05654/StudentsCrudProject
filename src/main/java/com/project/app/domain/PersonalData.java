package com.project.app.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PersonalData {
	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "SEX")
	private String sex;

	public PersonalData() {
	}

	public PersonalData(String firstName, String lastName, String sex) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.sex = sex;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "PersonalData [firstName=" + firstName + ", lastName=" + lastName + ", sex=" + sex + "]";
	}
}
