package com.project.app.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class HomeLocality {
	@Column(name = "CITY")
	protected String city;

	@Column(name = "STREET")
	protected String street;

	@Column(name = "BUILDING_NUMBER")
	protected String buildingNumber;

	@Column(name = "POSTAL_CODE")
	protected String postalCode;

	@Column(name = "POST_OFFICE_LOCATION")
	protected String postOfficeLocation;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getBuildingNumber() {
		return buildingNumber;
	}

	public void setBuildingNumber(String buildingNumber) {
		this.buildingNumber = buildingNumber;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getPostOfficeLocation() {
		return postOfficeLocation;
	}

	public void setPostOfficeLocation(String postOfficeLocation) {
		this.postOfficeLocation = postOfficeLocation;
	}

	@Override
	public String toString() {
		return "HomeLocality [city=" + city + ", street=" + street + ", buildingNumber=" + buildingNumber
				+ ", postalCode=" + postalCode + ", postOfficeLocation=" + postOfficeLocation + "]";
	}

}
