package com.accenture.rentacar.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.accenture.rentacar.app.entity.Cliente;
import com.accenture.rentacar.app.service.IClienteService;

	@RestController
	@RequestMapping("/api")
	public class ClienteController {
		
	@Autowired
	private IClienteService clienteService;
	
	@GetMapping("/cliente")
	public List<Cliente> listar(){
		return clienteService.listarTodos();
	}
	
	@GetMapping("/cliente/{Id}")
	public Cliente buscarPorId( @PathVariable Long id ) {
		return clienteService.buscarClientePorId(id);
	}
	
	@PostMapping("/cliente")@GetMapping("/cliente/{Id}")
	public Cliente buscarPorId( @PathVariable Long id ) {
		return clienteService.buscarClientePorId(id);
	}
	
	@PostMapping("/clientes") 
	public Cliente save( @RequestBody Cliente cliente ) {
		return clienteService.save(cliente);	
	}
	
	@SuppressWarnings("unused")
	@PostMapping("/actualizar")
	public Cliente actualizar( @RequestBody Cliente cliente) {
		
		Cliente cliAActualizar = new Cliente();
		Cliente cliActual = clienteService.buscarClientePorId(  cliente.getId() );
		cliAActualizar.setId( cliente.getId( ));
		cliAActualizar.setCedula( cliente.getCedula() );
		cliAActualizar.setNombre( cliente.getNombre() );
		cliAActualizar.setApellido( cliente.getApellido() );
		cliAActualizar.setTelefono( cliente.getTelefono() );
		cliAActualizar.setDireccion( cliente.getDireccion() );
		cliAActualizar.setEmail( cliente.getEmail() );
		cliAActualizar.setFechaCreacionRegistro( cliente.getFechaCreacionRegistro() );
		
		return clienteService.save (cliAActualizar );
		
		
	} 
}
