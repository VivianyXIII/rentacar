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
@Table(name="cliente")

public class Cliente {

	@Id
	@GeneratedValue
	(strategy = GenerationType.IDENTITY) //Estrategia de generación de ese ID
	private Long id;
	
	private Long cedula;
	private String nombre;
	private String apellido;
	private String telefono;
	private String direccion;
	private String email;
	
	@Column(name="fecha_Creacion_Registro")
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
	public Long getCedula() {
		return cedula;
	}
	public void setCedula(Long cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}








