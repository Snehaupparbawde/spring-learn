package org.dnyanyog.service;

import java.util.List;

import org.dnyanyog.dao.UsersDao;
import org.dnyanyog.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserManagementService {

	@Autowired
	UsersDao userDao;

	public List<Users> getAllUsers() {
		return userDao.findAll();
	}

	public Users getUserById(Integer userid) {
		return userDao.findById(userid).get();
	}

	

}
