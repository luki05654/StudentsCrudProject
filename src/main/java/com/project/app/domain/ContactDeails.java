package com.project.app.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ContactDeails {
	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;

	@Column(name = "EMAIL_ADDRESS")
	private String emailAddress;

	public ContactDeails() {
	}

	public ContactDeails(String phoneNumber, String emailAddress) {
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "ContactDeails [phoneNumber=" + phoneNumber + ", emailAddress=" + emailAddress + "]";
	}

}
