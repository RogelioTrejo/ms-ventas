package com.rst.ms.ventas.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.rst.ms.ventas.dto.ClienteDTO;
import com.rst.ms.ventas.exception.EntityNotFoundException;
import com.rst.ms.ventas.exception.IllegalOperationException;
import com.rst.ms.ventas.util.ApiResponse;
import com.rst.ms.ventas.domain.Cliente;
import com.rst.ms.ventas.services.ClienteService;

import jakarta.validation.Valid;

/**
 * Se utiliza version en cabecera, utilizar Key = X-VERSION y Value 1.0.0
 */

@RestController
@RequestMapping("/api/v1/cliente")//, headers ="X-VERSION=1.0.0")

public class ClientesController{

	@Autowired
	private ClienteService cliSer;
	
	@Autowired
    private ModelMapper modelMapper;
	
	
	
	
	
	//***************************
	
	@GetMapping
	public List<Cliente> listarCliente() {
		// TODO Auto-generated method stub
		return cliSer.listarCliente();
	}

	@PostMapping
	public Cliente CrearCliente(@RequestBody Cliente cliente) {
		// TODO Auto-generated method stub
		return cliSer.grabar(cliente);
	}

	@PutMapping("/{id}")
	public Cliente editarCliente(@PathVariable Long id, @RequestBody Cliente cliente ) {
		// TODO Auto-generated method stub
		return cliSer.actualizar(cliente, id);
	}

	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Long id) {
		cliSer.eliminar(id);

	}

	
	
	
	

}
