package com.br.jos.gasto_casal.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/version")
public class Version {

	@GetMapping
	public ResponseEntity<String> version(){
		return ResponseEntity.ok("v1.0.0");
	}
}
