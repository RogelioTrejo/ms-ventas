package com.rst.ms.ventas.services;

import java.util.List;
import java.util.Map;

import com.rst.ms.ventas.exception.EntityNotFoundException;
import com.rst.ms.ventas.exception.IllegalOperationException;
import com.rst.ms.ventas.domain.Cliente;


public interface ClienteService {
	List<Cliente> listarCliente();
	Cliente buscarPorId(Long id);
	Cliente grabar(Cliente cliente);//throws IllegalOperationException;
	Cliente actualizar(Cliente cliente, Long id);//throws EntityNotFoundException, IllegalOperationException;;
	void eliminar (Long id);
	
	
	Cliente actualizarPorAtributos(Long id, Map<String, Object> camposActualizados)
			throws EntityNotFoundException, IllegalOperationException ;
}
