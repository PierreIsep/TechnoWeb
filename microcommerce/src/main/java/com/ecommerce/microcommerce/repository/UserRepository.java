package com.ecommerce.microcommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.microcommerce.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
