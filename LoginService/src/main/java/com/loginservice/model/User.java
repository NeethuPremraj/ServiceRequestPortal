package com.loginservice.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {

	private String firstName;
	private String lastName;
	private String userId;
	private Account account;
	private String location;
	private String email;
	 
	
	
	
	
}
