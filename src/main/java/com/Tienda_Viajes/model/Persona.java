package com.Tienda_Viajes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="T_Usuarios")
public class Persona {

	@Id
	@Column(name="Cedula_U")
	private int Cedula;
	@Column(name="Nombre_U")
	private String Nombre;
	@Column(name="Correo_U")
	private String Correo;
	private String Usuario;
	private String Clave;
	
	
	public Persona()
	{
		

	}


	public Persona(int cedula, String nombre, String correo, String usuario, String clave) {
		super();
		Cedula = cedula;
		Nombre = nombre;
		Correo = correo;
		Usuario = usuario;
		Clave = clave;
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


	public String getCorreo() {
		return Correo;
	}


	public void setCorreo(String correo) {
		Correo = correo;
	}


	public String getUsuario() {
		return Usuario;
	}


	public void setUsuario(String usuario) {
		Usuario = usuario;
	}


	public String getClave() {
		return Clave;
	}


	public void setClave(String clave) {
		Clave = clave;
	}
	

	
}

