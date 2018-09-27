package com.pluralsight.model;

import javax.validation.constraints.Size;

public class Attendee {

	@Size(min=2, max=30)
	private String name;
	
//	@NotNull @Email
	private String emailAddress;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}
