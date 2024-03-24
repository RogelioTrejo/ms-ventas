package com.rst.ms.ventas.services;

import java.util.List;
import java.util.Map;


import com.rst.ms.ventas.domain.Producto;
import com.rst.ms.ventas.exception.EntityNotFoundException;
import com.rst.ms.ventas.exception.IllegalOperationException;

public interface ProductoService {
	
		List <Producto> listarProducto();
		
		Producto buscarPorId(Long id);
		Producto grabar(Producto producto);
		Producto actualizar(Producto producto, Long id);
		void eliminar (Long id);
		
		//Producto findByProducto (String dni);
		Producto actualizarPorAtributos(Long id, Map<String, Object> camposActualizados)
				throws EntityNotFoundException, IllegalOperationException ;

}
