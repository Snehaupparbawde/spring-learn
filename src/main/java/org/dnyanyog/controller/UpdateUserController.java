package org.dnyanyog.controller;

import org.dnyanyog.dto.UpdateUserRequest;
import org.dnyanyog.dto.UpdateUserResponse;
import org.dnyanyog.service.UpdateUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateUserController {

	@Autowired
	private UpdateUserService updateUserService;

	@PostMapping(path = "/api/user/UpdateUser")
	public UpdateUserResponse updateuser(@RequestBody UpdateUserRequest request) {
		return updateUserService.updateUser(request);
	}
	
	

}
