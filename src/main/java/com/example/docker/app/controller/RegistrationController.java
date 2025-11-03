package com.example.docker.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
	// creating a logger
	Logger logger = LoggerFactory.getLogger(RegistrationController.class);

	@GetMapping(path = "/status")
	public Object serviceStatusCheck() {
		StatusResponseDTO dto = new StatusResponseDTO();
		dto.setCode("200");
		dto.setMessage("Service is healthly");
		logger.trace("Log level: TRACE");
        logger.info("Log level: INFO");
        logger.debug("Log level: DEBUG");
        logger.error("Log level: ERROR");
        logger.warn("Log level: WARN");

		System.out.println("=========================================");
		for (int i = 0; i < 100; i++) {
			logger.info("Counter values  = {}", i);

		}

		ResponseEntity<StatusResponseDTO> responseEnity = new ResponseEntity<>(dto, HttpStatus.OK);
		return responseEnity;
	}

}
