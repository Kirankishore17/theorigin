package com.dam.theorigin.controller;



import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dam.theorigin.model.FileContentDetails;
import com.dam.theorigin.service.MasterService;

@RestController
public class MasterController {

    Logger log = LoggerFactory.getLogger(MasterController.class);

	@Autowired
	private MasterService masterService;
	
	@PostMapping(path = "push/replica")
	public String pushToReplica(@RequestBody FileContentDetails details) throws IOException {
		return masterService.pushToReplica(details);
	}
}
