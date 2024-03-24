package com.rst.ms.ventas.domain;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;
import lombok.Data;

@Entity
@Data
public class Cliente implements Serializable{
		
	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long idCliente;
	private String nombre;
	private String apellido;
	
	@Column(unique = true)
	private String dni;
	
	private String direccion;
	private String telefono;
	
	@Column(unique = true)
	private String email;
	
	  
	
	
	
}
