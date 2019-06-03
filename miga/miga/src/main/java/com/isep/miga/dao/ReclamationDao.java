package com.isep.miga.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isep.miga.model.Reclamation;

@Repository
public interface ReclamationDao extends JpaRepository<Reclamation, Integer> {
	
	
	Reclamation findById(int id);
}