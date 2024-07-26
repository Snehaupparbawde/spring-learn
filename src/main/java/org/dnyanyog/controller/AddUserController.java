package org.dnyanyog.controller;

import org.dnyanyog.dto.AddUserRequest;
import org.dnyanyog.dto.AddUserResponse;
import org.dnyanyog.service.AddUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddUserController {
	@Autowired
	private AddUserService addUserService;

	@PostMapping(path="/api/user/AddUser")
	public AddUserResponse adduser(@RequestBody AddUserRequest request) {
		return addUserService.addUser(request);
	}

}
