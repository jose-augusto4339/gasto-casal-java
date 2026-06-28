package com.br.jos.gasto_casal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.jos.gasto_casal.model.Gasto;

@Repository
public interface GastoRepository extends JpaRepository<Gasto, Long>{

}
