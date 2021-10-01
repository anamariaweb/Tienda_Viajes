package com.Tienda_Viajes.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_Proveedores")
public class Proveedor {

	@Id
	private int NIT;
	private String Nombre_Proveedor;
	private String Direccion;
	private String Telefono;
	private String Ciudad;
	
	
	public Proveedor() {
		
	}
	
	public Proveedor(int nIT, String nombre_Proveedor, String direccion, String telefono, String ciudad) {
		super();
		NIT = nIT;
		Nombre_Proveedor = nombre_Proveedor;
		Direccion = direccion;
		Telefono = telefono;
		Ciudad = ciudad;
	}

	public int getNIT() {
		return NIT;
	}

	public void setNIT(int nIT) {
		NIT = nIT;
	}

	public String getNombre_Proveedor() {
		return Nombre_Proveedor;
	}

	public void setNombre_Proveedor(String nombre_Proveedor) {
		Nombre_Proveedor = nombre_Proveedor;
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

	public String getCiudad() {
		return Ciudad;
	}

	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}
	
	
	
}
