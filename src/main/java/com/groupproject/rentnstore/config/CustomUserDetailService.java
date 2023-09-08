package com.groupproject.rentnstore.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.groupproject.rentnstore.exception.ResourceNotFoundException;
import com.groupproject.rentnstore.model.User;
import com.groupproject.rentnstore.repository.UserRepository;

@Service
public class CustomUserDetailService implements UserDetailsService{

	@Autowired
	private UserRepository userRepo;
	
	
	@Override
	public UserDetails loadUserByUsername(String useremail) throws UsernameNotFoundException {
		
		User user = this.userRepo.findByUseremail(useremail).orElseThrow(()->new ResourceNotFoundException("User not found"));
		return user;
	}
	
	

}
