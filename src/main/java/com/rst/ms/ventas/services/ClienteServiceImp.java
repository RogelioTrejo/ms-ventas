/**
 * @file: ClienteServiceImp.java
 
 */
package com.rst.ms.ventas.services;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.rst.ms.ventas.exception.EntityNotFoundException;
import com.rst.ms.ventas.exception.EntityNotFoundExceptionMessages;
import com.rst.ms.ventas.exception.IllegalOperationException;
import com.rst.ms.ventas.domain.Cliente;
import com.rst.ms.ventas.repository.ClienteRepository;

import jakarta.transaction.Transactional;


@Service
public class ClienteServiceImp implements ClienteService {

	@Autowired
	private ClienteRepository cliRep;
	
	@Override
	@Transactional
	public List<Cliente> listarCliente() {
		return cliRep.findAll();
	}

	
	@Override
	@Transactional
	public Cliente buscarPorId(Long id) throws EntityNotFoundException {
		Optional<Cliente> investigador = cliRep.findById(id);
		if(investigador.isEmpty())throw new EntityNotFoundException(EntityNotFoundExceptionMessages.CLIENTE_NOT_FOUND);
		return investigador.get();
	}
	
	
	@Override
	public Cliente grabar(Cliente cliente) {
		// TODO Auto-generated method stub
		return cliRep.save(cliente);
	}

	@Override
	public Cliente actualizar(Cliente cliente, Long id) {
		cliente.setIdCliente(id);
		return cliRep.save(cliente);
	}

	@Override
	public void eliminar(Long id) {
		cliRep.deleteById(id);

	}


	@Override
	public Cliente actualizarPorAtributos(Long id, Map<String, Object> camposActualizados)
			throws EntityNotFoundException, IllegalOperationException {
		// TODO Auto-generated method stub
		return null;
	}

}
