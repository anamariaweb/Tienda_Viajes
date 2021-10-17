package com.Tienda_Viajes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tabla_Ventas_Factura")
public class FacturaModel {
	
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	private int codigo_Vta;
	private String cedula_U;
	private String cedula_C;
	private String nombre_C;
	private int cantidad;
	private double valor_Vta;
	private double valor_Iva;
	private double valor_Total;
	
	
	public FacturaModel() {
		super();
	}


	public FacturaModel(int codigo_Vta, String cedula_U, String cedula_C, String nombre_C, int cantidad, double valor_Vta,
			double valor_Iva, double valor_Total) {
		super();
		this.codigo_Vta = codigo_Vta;
		this.cedula_U = cedula_U;
		this.cedula_C = cedula_C;
		this.nombre_C = nombre_C;
		this.cantidad = cantidad;
		this.valor_Vta = valor_Vta;
		this.valor_Iva = valor_Iva;
		this.valor_Total = valor_Total;
	}


	public int getCodigo_Vta() {
		return codigo_Vta;
	}


	public void setCodigo_Vta(int codigo_Vta) {
		this.codigo_Vta = codigo_Vta;
	}


	public String getCedula_U() {
		return cedula_U;
	}


	public void setCedula_U(String cedula_U) {
		this.cedula_U = cedula_U;
	}


	public String getCedula_C() {
		return cedula_C;
	}


	public void setCedula_C(String cedula_C) {
		this.cedula_C = cedula_C;
	}


	public String getNombre_C() {
		return nombre_C;
	}


	public void setNombre_C(String nombre_C) {
		this.nombre_C = nombre_C;
	}


	public double getValor_Vta() {
		return valor_Vta;
	}


	public void setValor_Vta(double valor_Vta) {
		this.valor_Vta = valor_Vta;
	}


	public double getValor_Iva() {
		return valor_Iva;
	}


	public void setValor_Iva(double valor_Iva) {
		this.valor_Iva = valor_Iva;
	}


	public double getValor_Total() {
		return valor_Total;
	}


	public void setValor_Total(double valor_Total) {
		this.valor_Total = valor_Total;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	

}
