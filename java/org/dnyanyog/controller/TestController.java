package org.dnyanyog.controller;

import org.dnyanyog.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
	Student std;

	@GetMapping("/")
	public Student test() {
		std.firstName = "Sneha";
		std.lastName = "Upparbawde";
		std.mobile = "7972000000";

		std.address.street = "Nagar Road";
		std.address.city = "Pune";
		std.address.state = "Maharashtra";
		std.address.country = "India";

		std.batch.batchName = "BE";
		std.batch.branchName = "CSE";
		std.batch.classTeacher = "Shivanjali";

		std.batch.batchLocation.street = "Nagar Road";
		std.batch.batchLocation.city = "Pune";
		std.batch.batchLocation.state = "Maharashtra";
		std.batch.batchLocation.country = "India";

		return std;

	}

}
