package com.br.jos.gasto_casal.model;

import java.util.List;

import jakarta.persistence.Entity;

@Entity
public class Conta {
	
	private Long id;

	private List<Usuario> usuarios;
}
