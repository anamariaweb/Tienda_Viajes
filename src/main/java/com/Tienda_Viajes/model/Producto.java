package com.Tienda_Viajes.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_Productos")
public class Producto {

	@Id
	private int Codigo;
	private String Nombre_Producto;
	private String NIT_Proveedor;
	private String Precio_Producto;
	private String Precio_Ventas;
	private String IVA;
	
	
	
	public Producto() {
		
	}



	public Producto(int codigo, String nombre_Producto, String nIT_Proveedor, String precio_Producto,
			String precio_Ventas, String iVA) {
		super();
		Codigo = codigo;
		Nombre_Producto = nombre_Producto;
		NIT_Proveedor = nIT_Proveedor;
		Precio_Producto = precio_Producto;
		Precio_Ventas = precio_Ventas;
		IVA = iVA;
		
		
	}



	public int getCodigo() {
		return Codigo;
	}



	public void setCodigo(int codigo) {
		Codigo = codigo;
	}



	public String getNombre_Producto() {
		return Nombre_Producto;
	}



	public void setNombre_Producto(String nombre_Producto) {
		Nombre_Producto = nombre_Producto;
	}



	public String getNIT_Proveedor() {
		return NIT_Proveedor;
	}



	public void setNIT_Proveedor(String nIT_Proveedor) {
		NIT_Proveedor = nIT_Proveedor;
	}



	public String getPrecio_Producto() {
		return Precio_Producto;
	}



	public void setPrecio_Producto(String precio_Producto) {
		Precio_Producto = precio_Producto;
	}



	public String getPrecio_Ventas() {
		return Precio_Ventas;
	}



	public void setPrecio_Ventas(String precio_Ventas) {
		Precio_Ventas = precio_Ventas;
	}



	public String getIVA() {
		return IVA;
	}



	public void setIVA(String iVA) {
		IVA = iVA;
	}
}
