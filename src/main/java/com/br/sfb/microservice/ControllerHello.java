package com.br.sfb.microservice;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/hello")
public class ControllerHello {
	private static final Logger logger = LoggerFactory.getLogger(ControllerHello.class);

	@GetMapping
    public ResponseEntity<String> hello() {

        logger.debug("Debugging log");
        logger.info("Info log");
        logger.warn("Hey, This is a warning!");
        logger.error("Oops! We have an Error. OK");

        return ResponseEntity.ok("Hello");
    }
}
