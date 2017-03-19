package com.project.app.domain;

public enum Departments {
	D1("Civil Engineering and Architecture Faculty"), 
	D2("Electrical Engineering and Computer Science Faculty"),
	D3("Mechanical Engineering Faculty"), 
	D4("Environmental Engineering Faculty"), 
	D5("Fundamentals of Technology Faculty"), 
	D6("Management Faculty");

	private String value;

	private Departments(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}
}
