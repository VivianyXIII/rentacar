package com.accenture.rentacar.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.rentacar.app.dao.IClienteDao;
import com.accenture.rentacar.app.entity.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteDao clienteDao;

	@Override
	public Cliente save(Cliente cliente) {
		// TODO Auto-generated method stub
		return clienteDao.save(cliente);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		clienteDao.deleteById(id);
	}

	@Override
	public Cliente buscarClientePorId(Long id) {
		// TODO Auto-generated method stub
		return clienteDao.findById(id).orElse(null);
	}

	@Override
	public List<Cliente> listarTodos() {
		// TODO Auto-generated method stub
		return (List<Cliente>) clienteDao.findAll();
	}
}

