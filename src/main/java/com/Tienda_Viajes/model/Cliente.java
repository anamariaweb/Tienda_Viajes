package com.Tienda_Viajes.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_Clientes")
public class Cliente {

	
	@Id
	
	private int Cedula;
	private String Nombre;
	private String Direccion;
	private String Telefono;
	private String Correo;
	
	
	public Cliente() {
		
	}


	public Cliente(int cedula, String nombre, String direccion, String telefono, String correo) {
		super();
		Cedula = cedula;
		Nombre = nombre;
		Direccion = direccion;
		Telefono = telefono;
		Correo = correo;
	}


	public int getCedula() {
		return Cedula;
	}


	public void setCedula(int cedula) {
		Cedula = cedula;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getDireccion() {
		return Direccion;
	}


	public void setDireccion(String direccion) {
		Direccion = direccion;
	}


	public String getTelefono() {
		return Telefono;
	}


	public void setTelefono(String telefono) {
		Telefono = telefono;
	}


	public String getCorreo() {
		return Correo;
	}


	public void setCorreo(String correo) {
		Correo = correo;
	}
	
	
	
}
