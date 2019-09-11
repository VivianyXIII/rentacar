package com.accenture.rentacar.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.rentacar.app.dao.IVehiculoDao;
import com.accenture.rentacar.app.entity.Vehiculo;

@Service
public class VehiculoServiceImpl implements IVehiculoService {
	
	@Autowired
	private IVehiculoDao vehiculoDao;
	
	@Override
	public Vehiculo save(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		return vehiculoDao.save(vehiculo);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		vehiculoDao.deleteById(id);
	}

	@Override
	public Vehiculo buscarVehiculoPorId(Long id) {
		// TODO Auto-generated method stub
		return vehiculoDao.findById(id).orElse(null);
	}

	@Override
	public List<Vehiculo> listarTodos() {
		// TODO Auto-generated method stub
		return (List<Vehiculo>) vehiculoDao.findAll();
	}
	
	@Override
	public List<Vehiculo> saveVarios(Vehiculo [] vehiculos){
		List<Vehiculo> retorno = new ArrayList<Vehiculo>(); //Como se declara un array en Java
		
		for (Vehiculo vehiculo : vehiculos) { //Vehiculos, es un Array una lista de objetos
			retorno.add(vehiculoDao.save(vehiculo)); //ADD le agrego un objeto a esa lista
		}
		
		for (int i=0; i < vehiculos.length; i++);{
			retorno.add(vehiculoDao.save(vehiculos[i]));
		}
		return retorno;
	}
}
