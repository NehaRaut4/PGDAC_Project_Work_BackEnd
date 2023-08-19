package com.project2.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.project2.entity.User;

@EnableJpaRepositories
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
	
	Optional<User> findOneByUseremailAndUserpassword(String email, String password);
	User findByUseremail(String email);

}
