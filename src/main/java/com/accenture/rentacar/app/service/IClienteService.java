package com.accenture.rentacar.app.service;

import java.util.List;

import com.accenture.rentacar.app.entity.Cliente;

public interface IClienteService {

	public Cliente save( Cliente cliente );
	
	public void delete( Long id );
	
	public Cliente buscarClientePorId( Long id );
	
	public List<Cliente> listarTodos();
}
