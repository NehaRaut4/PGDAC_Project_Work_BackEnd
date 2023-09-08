package com.groupproject.rentnstore.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.groupproject.rentnstore.dto.UserDTO;
import com.groupproject.rentnstore.model.User;
import com.groupproject.rentnstore.repository.UserRepository;
import com.groupproject.rentnstore.service.UserService;


@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private ModelMapper mapper;
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public UserDTO createUser(UserDTO userDTO) {
		
		//UserDTO to User
		User user = this.mapper.map(userDTO, User.class);
		//encrypting password
		String pass = user.getUserpassword();
		String encodedpass = this.passwordEncoder.encode(pass);
		user.setUserpassword(encodedpass);
		
		//save user
		User saveuser = this.userRepo.save(user);
		//User to UserDTO
		UserDTO saveuserDTO = this.mapper.map(saveuser,UserDTO.class);
		
		return saveuserDTO;
	}

	@Override
	public UserDTO getUserById(int userid) {
		
		User user = this.userRepo.findByuserid(userid);
		UserDTO userDTO = this.mapper.map(user, UserDTO.class);
		return userDTO;
	}

	@Override
	public List<UserDTO> getAllUsers() {
		
		List<User> userlist = this.userRepo.findAll();
		
		List<UserDTO> userdtolist = userlist.stream().map(each->this.mapper.map(each,UserDTO.class)).collect(Collectors.toList());
		
		return userdtolist;
	}

	@Override
	public List<UserDTO> deleteUser(int userid) {
		User user = this.userRepo.findByuserid(userid);
		this.userRepo.delete(user);
		
        List<User> userlist = this.userRepo.findAll();
		List<UserDTO> userdtolist = userlist.stream().map(each->this.mapper.map(each,UserDTO.class)).collect(Collectors.toList());
		return userdtolist;
		
		
	}

}
