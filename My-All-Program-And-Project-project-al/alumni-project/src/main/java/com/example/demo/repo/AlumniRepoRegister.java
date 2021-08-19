package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Register;

public interface AlumniRepoRegister  extends JpaRepository<Register,Integer>{

	//public String saveRegister();
	
}
