package com.directors.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.directors.entity.DirectorsEntity;

public interface DirectorsRepository extends JpaRepository<DirectorsEntity, Integer> {

}
