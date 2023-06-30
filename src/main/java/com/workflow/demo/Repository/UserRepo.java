package com.workflow.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workflow.demo.Entity.Users;


@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {
	public Optional<Users> findByuserName(Optional user2);
	//public Optional<Users> findById(Integer id);
}
