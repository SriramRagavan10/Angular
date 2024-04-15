package com.directors.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.directors.entity.DirectorsEntity;
import com.directors.repository.DirectorsRepository;

@Repository
public class DirectorsDao {
	
	@Autowired
	DirectorsRepository dirRepo;
	
	public String insertAll(List<DirectorsEntity> de) {
		dirRepo.saveAll(de);
		return "All Details Successfully Saved";
	}

	public List<DirectorsEntity> getAll() {
		return dirRepo.findAll();
	}
}
