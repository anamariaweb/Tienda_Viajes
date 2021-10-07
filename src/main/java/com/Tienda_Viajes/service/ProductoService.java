package com.Tienda_Viajes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Tienda_Viajes.interfaceService.IProductoService;
import com.Tienda_Viajes.interfaces.IProducto;
import com.Tienda_Viajes.model.Producto;


@Service
public class ProductoService implements IProductoService{

	
	@Autowired
	private IProducto data;

	@Override
	public List<Producto> listar() {
		return (List<Producto>) data.findAll();
	}

	@Override
	public Optional<Producto> listarId(int id) {
		return data.findById(id);

	}

	@Override
	public int save(Producto producto) {
		if (data.save(producto) != null) {

			return 1;
		}
		return 0;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
	}
	
}
