package com.rst.ms.ventas.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Producto implements Serializable{

	private static final long serialVersionUID=1L;	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long idProducto;
	private String nombre;
	private String descripcion;
	private float precio;
	private String stock;
	
	
	
	
	
}
