package com.project2.service;

import com.project2.entity.LoginDTO;
import com.project2.entity.UserDTO;
import com.project2.response.LoginResponse;

public interface UserService {

	public String addUser(UserDTO userDTO);

	public LoginResponse loginUser(LoginDTO loginDTO);
}
