package com.fms.service;

import com.fms.dto.UserDTO;
import com.fms.entities.User;
import com.fms.exceptions.UserNotFoundException;

public interface UserService {

	public abstract User login(String email , String password) throws UserNotFoundException;
	
	public abstract User logout(int id) throws UserNotFoundException;
	
	public abstract User register(UserDTO user);


}
