package com.br.jos.gasto_casal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.jos.gasto_casal.model.Gasto;
import com.br.jos.gasto_casal.model.dto.GastoDTO;
import com.br.jos.gasto_casal.repository.GastoRepository;


@Service
public class GastoService {
	
	@Autowired
	private GastoRepository gastoRepository;

	public GastoDTO salvaGasto(GastoDTO gastoDTO) {
		Gasto gasto = new Gasto();
		
		gasto = converteDtoParaGasto(gastoDTO);
		gastoRepository.save(gasto);
		
		return gastoDTO;		
	}
	
	
	private Gasto converteDtoParaGasto(GastoDTO dto) {
		return new Gasto()
				.builder()
				.nome(dto.getNome())
				.data(dto.getData())
				.tipo(dto.getTipo())
				.valor(dto.getValor())
				.build();
	}
}
