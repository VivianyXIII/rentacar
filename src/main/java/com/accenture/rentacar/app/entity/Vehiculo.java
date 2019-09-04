package com.accenture.rentacar.app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="vehiculos")


public class Vehiculo {
      
	@Id
	@GeneratedValue
	(strategy = GenerationType.IDENTITY) //Estrategia de generación de ese ID
	private Long id;
	
	@Column(name="modelo_auto") 
	private short modeloAuto;
	private String marca;
	private String placa;
	private String linea;
	private String color;
	
	@Column(name="fechaCreacionRegistro")
	@Temporal(TemporalType.DATE)
	private Date fechaCreacionRegistro;
	
	@PrePersist
	private void preGuardado() { //Se llama como quiera, se busca
		fechaCreacionRegistro = new Date(); 
	}
	
	public Date getFechaCreacionRegistro() {
		return fechaCreacionRegistro;
	}
	
	public void setFechaCreacionRegistro(Date fechaCreacionRegistro) {
		this.fechaCreacionRegistro = fechaCreacionRegistro;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public short getModeloAuto() {
		return modeloAuto;
	}
	
	public void setModeloAuto(short modeloAuto) {
		this.modeloAuto = modeloAuto;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getLinea() {
		return linea;
	}
	
	public void setLinea(String linea) {
		this.linea = linea;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
}
