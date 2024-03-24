package com.rst.ms.ventas.dto;



import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class ClienteDTO {
	private Long idCliente;
	
	@NotBlank(message = "El nombre no puede estar en blanco")
	@Size(min = 2, message = "El nombre debe tener al menos 3 caracteres")
	private String nombre;
	
	@NotBlank(message = "El apellido paterno no puede estar en blanco")
	@Size(min = 2, message = "El apellido debe tener al menos 3 caracteres")
	private String apellido;
	
	@NotBlank(message = "El DNI no puede estar en blanco")
    @Size(min = 8, max = 8, message = "El DNI debe tener exactamente 8 caracteres")
	@Pattern(regexp = "\\d+", message = "El DNI debe contener solo dígitos")
	private String dni;
	
	@NotBlank(message = "La direccion no puede estar en blanco")
	private String direccion;
	
	@NotBlank(message = "El telefono no puede estar en blanco")
	@Size(min = 9, max = 9, message = "El telefono debe tener exactamente 9 caracteres")
	private String telefono;
	
	@NotBlank(message = "El email no puede estar en blanco")
	@Email(message = " El email no cumple con una estructura valida")
	private String email;
	
}
