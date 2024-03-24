package com.rst.ms.ventas.controller;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rst.ms.ventas.domain.Producto;
import com.rst.ms.ventas.services.ProductoService;

@RestController
@RequestMapping("/api/v1/producto")
public class ProductoController {
	
	@Autowired
	private ProductoService prodSer;
	
	
	@GetMapping
	public List<Producto> listarProducto() {
		// TODO Auto-generated method stub
		return prodSer.listarProducto();
	}

	@PostMapping
	public Producto CrearProducto(@RequestBody Producto producto) {
		// TODO Auto-generated method stub
		return prodSer.grabar(producto);
	}

	@PutMapping("/{id}")
	public Producto editarProducto(@PathVariable Long id, @RequestBody Producto producto ) {
		// TODO Auto-generated method stub
		return prodSer.actualizar(producto, id);
	}

	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Long id) {
		prodSer.eliminar(id);

	}
	
	
	
}
