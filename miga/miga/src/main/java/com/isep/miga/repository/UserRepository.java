package com.isep.miga.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isep.miga.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
