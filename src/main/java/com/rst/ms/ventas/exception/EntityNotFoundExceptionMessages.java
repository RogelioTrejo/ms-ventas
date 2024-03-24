package com.rst.ms.ventas.exception;

/**
 * Clase de utilidad que contiene mensajes de error para excepciones de tipo EntityNotFoundException.
 */
public final class EntityNotFoundExceptionMessages {

	public static final String CLIENTE_NOT_FOUND = "El cliente con id proporcionado no fue encontrado";
	public static final String VENTAS_NOT_FOUND = "La venta con id proporcionado no fue encontrado";
	public static final String PRODUCTO_NOT_FOUND = "El producto con id proporcionado no fue encontrado";

	
	
    // Constructor privado para evitar instanciación
	private EntityNotFoundExceptionMessages() {
		throw new IllegalStateException ("Utility class");
	}
}
