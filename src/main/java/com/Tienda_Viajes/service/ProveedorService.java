package com.Tienda_Viajes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Tienda_Viajes.interfaceService.IProveedorService;
import com.Tienda_Viajes.interfaces.IProveedor;
import com.Tienda_Viajes.model.Proveedor;




@Service
public class ProveedorService implements IProveedorService{


	@Autowired
	private IProveedor data;

	@Override
	public List<Proveedor> listar() {
		return (List<Proveedor>) data.findAll();
	}

	@Override
	public Optional<Proveedor> listarId(int id) {
		return data.findById(id);

	}

	@Override
	public int save(Proveedor proveedor) {
		if (data.save(proveedor) != null) {

			return 1;
		}
		return 0;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
	}
	
}
