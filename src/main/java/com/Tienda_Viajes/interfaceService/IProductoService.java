package com.Tienda_Viajes.interfaceService;

import java.util.List;
import java.util.Optional;

import com.Tienda_Viajes.model.Producto;

public interface IProductoService {


	public List<Producto> listar();
	public Optional<Producto> listarId(int id);
	public int save(Producto producto);
	public void delete(int id);
}
