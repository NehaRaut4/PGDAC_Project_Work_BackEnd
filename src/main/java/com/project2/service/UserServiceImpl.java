package com.project2.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project2.entity.LoginDTO;
import com.project2.entity.User;
import com.project2.entity.UserDTO;
import com.project2.repository.UserRepository;
import com.project2.response.LoginResponse;

@Service
public class UserServiceImpl implements UserService{
	

	@Autowired
    private UserRepository userRepository;
	@Override
	public String addUser(UserDTO userDTO) {
		// TODO Auto-generated method stub
		User user = new User(
				userDTO.getUserid(),
				userDTO.getUseremail(),
				userDTO.getUserpassword(),
				userDTO.getUserrole());
		userRepository.save(user);
		return user.getUseremail();
	}

	@Override
	public LoginResponse loginUser(LoginDTO loginDTO) {
		// TODO Auto-generated method stub
		String msg = "";
		User user1 = userRepository.findByUseremail(loginDTO.getUseremail());
		if(user1 != null)
		{
			Optional<User> user = userRepository.findOneByUseremailAndUserpassword(loginDTO.getUseremail(), loginDTO.getUserpassword());
			if (user.isPresent()) {
                return new LoginResponse("Login Success", true);
            } else {
                return new LoginResponse("Login Failed", false);
            }
		}
		else {
            return new LoginResponse("Email not exits", false);
		}
	}


}
