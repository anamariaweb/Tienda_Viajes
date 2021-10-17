package com.Tienda_Viajes.interfaceService;

import java.util.List;

import com.Tienda_Viajes.model.FacturaModel;

public interface IFacturaService {

	public int saveFactura(FacturaModel f);
	public List<FacturaModel> listar();
	
}
