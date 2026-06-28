package com.br.jos.gasto_casal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.jos.gasto_casal.model.dto.GastoDTO;
import com.br.jos.gasto_casal.service.GastoService;

@RestController()
@RequestMapping("/gasto")
public class GastoController {
	
	@Autowired
	private GastoService gastoService;
	
	@GetMapping
	private ResponseEntity<List<GastoDTO>> listaGastos(@PathVariable Long contaId){
		
		return ResponseEntity.ok(null);
	}
	
	@PostMapping("/salva")
	private ResponseEntity<GastoDTO> salvaGasto(@RequestBody GastoDTO gastoDTO){
		
		GastoDTO gasto = gastoService.salvaGasto(gastoDTO);
		
		return ResponseEntity.ok(gasto);
	}

}
