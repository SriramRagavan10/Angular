package com.directors.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.directors.entity.DirectorsEntity;
import com.directors.service.DirectorsService;

@RestController
@RequestMapping(value = "/direct")
public class DirectorsController {

	@Autowired
	DirectorsService directorsService;

	static Logger log = Logger.getLogger(DirectorsController.class);

	@PostMapping(value = "/postAll")
	public String insertAll(@RequestBody List<DirectorsEntity> de) throws Exception {
		PropertyConfigurator.configure("log.properties");
		log.info(directorsService.insertAll(de));
		return directorsService.insertAll(de);
	}

	@GetMapping(value = "/getAll")
	public List<DirectorsEntity> getAll() {
		PropertyConfigurator.configure("log.properties");
		log.info(directorsService.getAll());
		return directorsService.getAll();
	}

}
