package org.dnyanyog.service;

import static org.dnyanyog.common.JavaUtil.isNotNull;

import org.dnyanyog.dao.UsersDao;
import org.dnyanyog.dto.LoginRequest;
import org.dnyanyog.dto.LoginResponse;
import org.dnyanyog.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginService {

	@Autowired
	UsersDao userDao;

	public LoginResponse login(LoginRequest loginBody) {
		LoginResponse response = new LoginResponse();

		Users userReceivedFromDb = userDao.findByLoginName(loginBody.user);
		if (isNotNull(userReceivedFromDb)) {

			if (userReceivedFromDb.getLoginName().equals(loginBody.user)
					&& userReceivedFromDb.getPassword().equals(loginBody.password)) {
				response.responseCode = "0000";
				response.message = "Login Success";
				response.firstName = userReceivedFromDb.getFirstName();
				response.lastName = userReceivedFromDb.getLastName();
				response.loginName = userReceivedFromDb.getLoginName();
				response.password = userReceivedFromDb.getPassword();

				return response;

			} else {
				response.responseCode = "911";
				response.message = "Login Failed!!";
				
			}
			return response;

		}

		else {
			response.responseCode = "911";
			response.message = "User Not Found!!";
			return response;
		}
	}
}
