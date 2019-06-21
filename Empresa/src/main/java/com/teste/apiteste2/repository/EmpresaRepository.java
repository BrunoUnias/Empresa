package com.teste.apiteste2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.apiteste2.domain.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

}
