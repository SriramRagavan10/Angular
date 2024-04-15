package com.directors.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.directors.dao.DirectorsDao;
import com.directors.entity.DirectorsEntity;

@Service
public class DirectorsService {

	@Autowired
	DirectorsDao directorsDao;

	public String insertAll(List<DirectorsEntity> de) throws Exception {
		int count = 0;
		for (DirectorsEntity x : de) {
			if (x.getName() == null || x.getName().equals("")) {
				count--;
			} else {
				count++;
			}
		}
		if (count == de.size()) {
			return directorsDao.insertAll(de);
		} else {
			throw new NullPointerException("The Directors Name is Not Given");
		}
	}

	public List<DirectorsEntity> getAll() {
		return directorsDao.getAll();
	}

}
