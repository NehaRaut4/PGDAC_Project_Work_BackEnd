package com.groupproject.rentnstore.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.groupproject.rentnstore.dto.UserDTO;
import com.groupproject.rentnstore.service.UserService;


@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	//creating user
	@PostMapping("/createUser")
	public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO){
		
		UserDTO user = userService.createUser(userDTO);
	
		
		return ResponseEntity.of(Optional.of(user));
	}
	
	
	//getting user by userid
	@GetMapping("/getUserById/{userid}")
	public ResponseEntity<UserDTO> getUserById(@PathVariable int userid){
		UserDTO user = userService.getUserById(userid);
		
		return ResponseEntity.of(Optional.of(user));
		
	}
	
	//getting all users
	@GetMapping("/getAllUsers")
	public ResponseEntity<List<UserDTO>> getAllUsers(){
		List<UserDTO> list = userService.getAllUsers();
		return ResponseEntity.of(Optional.of(list));
		
	}
	
	
	
	
	
	//deleting user
	@DeleteMapping("/deleteUser/{userid}")
	public ResponseEntity<List<UserDTO>> deleteUser(@PathVariable int userid){
		List<UserDTO> list = userService.deleteUser(userid);
		
		return ResponseEntity.of(Optional.of(list));
		
	}
	
}
