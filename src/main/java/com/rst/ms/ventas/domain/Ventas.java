package com.rst.ms.ventas.domain;

import java.sql.Date;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Ventas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVenta;
	private Date fechaVenta;
	private String cantidad;
	private String precio;
	private String totalVenta;
	
	@ManyToOne
	private Cliente cliente;
	
	@ManyToOne
	private Producto producto;
}
