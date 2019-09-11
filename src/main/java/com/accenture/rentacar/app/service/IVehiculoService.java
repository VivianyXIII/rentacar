package com.accenture.rentacar.app.service;

import java.util.List;

import com.accenture.rentacar.app.entity.Vehiculo;

public interface IVehiculoService {
	public Vehiculo save( Vehiculo vehiculo );
	
	public void delete( Long id );
	
	public Vehiculo buscarVehiculoPorId( Long id );
	
	public List<Vehiculo> listarTodos();
	
	public List<Vehiculo> saveVarios (Vehiculo [] vehiculos);
}


