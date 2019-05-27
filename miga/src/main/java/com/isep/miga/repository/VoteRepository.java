package com.isep.miga.repository;

import com.isep.miga.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<User, Integer>{

}
