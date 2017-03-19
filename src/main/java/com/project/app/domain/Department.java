package com.project.app.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DEPARTMENTS")
public class Department {
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private long id;

	@Column(name = "DEPARTMENT_NAME")
	private String departmentName;

	@ManyToMany(mappedBy = "departments")
	@JoinTable(
			name="STUDENTS_IN_DEPARTMENTS",
			joinColumns = {@JoinColumn(name="STUDENT_ID")},
			inverseJoinColumns = {@JoinColumn(name="DEPARTMENT_ID")})
	@Column(name = "STUDENT")
	private List<Student> students;

	public Department() {
	}

	public Department(String departmentName, List<Student> students) {
		this.departmentName = departmentName;
		this.students = students;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentName=" + departmentName + ", students=" + students + "]";
	}
}
