/**
 * @file: ProductoServiceImp.java
 
 */

package com.rst.ms.ventas.services;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rst.ms.ventas.domain.Producto;
import com.rst.ms.ventas.exception.EntityNotFoundException;
import com.rst.ms.ventas.exception.EntityNotFoundExceptionMessages;
import com.rst.ms.ventas.exception.IllegalOperationException;
import com.rst.ms.ventas.repository.ProductoRepository;

import jakarta.transaction.Transactional;

@Service
public class ProductoServiceImp implements ProductoService{
	
	@Autowired
	private ProductoRepository proRep;
	
	@Override
	@Transactional
	public List<Producto> listarProducto() {
		return proRep.findAll();
	}

	
	@Override
	@Transactional
	public Producto buscarPorId(Long id) throws EntityNotFoundException {
		Optional<Producto> producto = proRep.findById(id);
		if(producto.isEmpty())throw new EntityNotFoundException(EntityNotFoundExceptionMessages.PRODUCTO_NOT_FOUND);
		return producto.get();
	}
	
	
	@Override
	public Producto grabar(Producto producto) {
		// TODO Auto-generated method stub
		return proRep.save(producto);
	}

	@Override
	public Producto actualizar(Producto producto, Long id) {
		producto.setIdProducto(id);
		return proRep.save(producto);
	}

	@Override
	public void eliminar(Long id) {
		proRep.deleteById(id);

	}


	@Override
	public Producto actualizarPorAtributos(Long id, Map<String, Object> camposActualizados)
			throws EntityNotFoundException, IllegalOperationException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
