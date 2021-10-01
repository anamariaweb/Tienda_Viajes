package com.Tienda_Viajes.interfaceService;

import java.util.List;
import java.util.Optional;

import com.Tienda_Viajes.model.Proveedor;


public interface IProveedorService {
	
	
	public List<Proveedor> listar();
	public Optional<Proveedor> listarId(int id);
	public int save(Proveedor proveedor);
	public void delete(int id);

}
