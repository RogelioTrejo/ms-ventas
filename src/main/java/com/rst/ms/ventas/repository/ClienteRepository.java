package com.rst.ms.ventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rst.ms.ventas.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
}
