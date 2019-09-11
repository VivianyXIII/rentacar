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

import com.accenture.rentacar.app.entity.Vehiculo;
import com.accenture.rentacar.app.service.IVehiculoService;

	@RestController
	@RequestMapping("/api")
	public class VehiculoController {
	@Autowired
	private IVehiculoService vehiculoService;
	
	@GetMapping("/vehiculos")
	public List<Vehiculo> listar(){
		return vehiculoService.listarTodos();
	}

	@GetMapping("/vehiculos/{Id}")
	public Vehiculo buscarPorId( @PathVariable Long id ) {
		return vehiculoService.buscarVehiculoPorId(id);
	}
	
	@PostMapping("/vehiculos") 
	public Vehiculo save( @RequestBody Vehiculo [] vehiculos ) {
		return vehiculoService.save(vehiculos);	
	}
	
	@PostMapping("varios-vehículos")
	public List<Vehiculo> saveVehiculos( @RequestBody Vehiculo [] vehiculos ) {
		return vehiculoService.saveVarios(vehiculos);
	}
	
	@SuppressWarnings("unused")
	@PostMapping("/actualizar")
	public Vehiculo actualizar( @RequestBody Vehiculo vehiculo) {
		
		Vehiculo vehiAActualizar = new Vehiculo();
		Vehiculo vehiActual = vehiculoService.buscarVehiculoPorId(  vehiculo.getId() );
		vehiAActualizar.setId( vehiculo.getId( ));
		vehiAActualizar.setColor( vehiculo.getColor() );
		vehiAActualizar.setLinea( vehiculo.getLinea() );
		vehiAActualizar.setMarca( vehiculo.getMarca() );
		vehiAActualizar.setModeloAuto( vehiculo.getModeloAuto() );
		vehiAActualizar.setPlaca( vehiculo.getPlaca() );
		
		return vehiculoService.save (vehiAActualizar );
		
		//Vehiculo vehiNuevo = new Vehiculo( "Toyota" );
		//Vehiculo vehiNuevoDos = new Vehiculo( (short) 2021 );
	} //Declaré				Estancie, invoque el constructor de esa clar, método de la clase que se ejecuta cuando yo instancio la clase.

	@DeleteMapping("/vehiculos/{Id}")
	public String delete ( @PathVariable Long Id ){
		vehiculoService.delete(Id);
		return "El vehículo se elimino correctamente: ";
	}
}
	
	
	
