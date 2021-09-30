package com.Tienda_Viajes.interfaceService;

import java.util.List;
import java.util.Optional;

import com.Tienda_Viajes.model.Cliente;

public interface IClienteService {
	
	public List<Cliente> listar();
	public Optional<Cliente> listarId(int id);
	public int save(Cliente cliente);
	public void delete(int id);

}
