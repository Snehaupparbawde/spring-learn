package org.dnyanyog.service;

import org.dnyanyog.dao.UsersDao;
import org.dnyanyog.dto.AddUserRequest;
import org.dnyanyog.dto.AddUserResponse;
import org.dnyanyog.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AddUserService {
	@Autowired
	UsersDao usersDao;

	public AddUserResponse addUser(AddUserRequest request) {
		Users usersTable = new Users();

		usersTable.setFirstName(request.getFirstName());
		usersTable.setLastName(request.getLastName());
		usersTable.setLoginName(request.getUser());
		usersTable.setPassword(request.getPassword());
		usersTable.setUser_id(1);

		Users dataInsertedByDaoIncludingGeneratedValue = usersDao.save(usersTable);

		AddUserResponse response = new AddUserResponse();

		response.setResponseCode("0000");
		response.setMessage("User added successfully");
		response.setRequest(request);

		response.setUser_id(dataInsertedByDaoIncludingGeneratedValue.getUser_id());

		return response;
	}
}
