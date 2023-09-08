package com.groupproject.rentnstore.repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.groupproject.rentnstore.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
	
	public  Optional<User> findByUseremail(String useremail);
	public User findByuserid(int userid);

}
