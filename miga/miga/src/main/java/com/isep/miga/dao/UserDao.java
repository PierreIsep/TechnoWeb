package com.isep.miga.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isep.miga.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
	
	
	User findById(int id);
}