package com.rst.ms.ventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rst.ms.ventas.domain.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
	
}