package org.dnyanyog.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Batch {
	public String batchName;
	public String branchName;
	public String classTeacher;

	@Autowired
	public Address batchLocation;

}
