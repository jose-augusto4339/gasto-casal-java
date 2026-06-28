package com.br.jos.gasto_casal.model.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GastoDTO {
	
	private String nome;
	
	private LocalDate data;
	
	private Double valor;
	
	private String tipo;
}
