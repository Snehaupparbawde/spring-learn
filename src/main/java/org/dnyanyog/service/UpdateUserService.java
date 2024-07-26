package org.dnyanyog.service;

import java.util.Optional;
import org.dnyanyog.dao.UsersDao;
import org.dnyanyog.dto.UpdateUserRequest;
import org.dnyanyog.dto.UpdateUserResponse;
import org.dnyanyog.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateUserService {
	@Autowired
	UsersDao usersDao;

	public UpdateUserResponse updateUser(UpdateUserRequest request) {
		UpdateUserResponse response = new UpdateUserResponse();

		// If user_id not sent in request
		if (request.getUser_id() == null) {
			response.setResponseCode("911");
			response.setMessage("User ID is required");
			return response;
		}

		// If user_id not present in DB
		Optional<Users> usersPresentInDb = usersDao.findById(request.getUser_id());

		if (!usersPresentInDb.isPresent()) {
			response.setResponseCode("912");
			response.setMessage("User_id Not Present in DB");
			response.setRequest(request);
			return response;
		}

		Users usersTable = new Users();

		usersTable.setFirstName(request.getFirstName());
		usersTable.setLastName(request.getLastName());
		usersTable.setLoginName(request.getUser());
		usersTable.setPassword(request.getPassword());
		usersTable.setUser_id(1);

		usersDao.save(usersTable);
		response.setResponseCode("0000");
		response.setMessage("User Updated Successfully");
		response.setRequest(request);
		return response;

	}
}
