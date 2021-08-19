package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.AlumniForm;

public interface AlumniRepoForm extends JpaRepository<AlumniForm, Integer> {

}
