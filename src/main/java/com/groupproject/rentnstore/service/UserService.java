package com.groupproject.rentnstore.service;

import java.util.List;

import com.groupproject.rentnstore.dto.UserDTO;



public interface UserService {

	public UserDTO createUser(UserDTO userDTO);

	public UserDTO getUserById(int userid);

	public List<UserDTO> getAllUsers();

	public List<UserDTO> deleteUser(int userid);
}
