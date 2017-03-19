package com.project.app.domain;

public enum Sex {
	MALE("Male"), FEMALE("Female");

	private String value;

	private Sex(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}
}
