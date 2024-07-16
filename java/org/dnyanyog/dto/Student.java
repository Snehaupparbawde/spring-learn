package org.dnyanyog.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	public String firstName;
	public String lastName;
	public String mobile;
	
	@Autowired
	public Address address;
	
	@Autowired
	public Batch batch;

}
