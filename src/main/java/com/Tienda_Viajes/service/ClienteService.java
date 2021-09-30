package com.Tienda_Viajes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Tienda_Viajes.interfaceService.IClienteService;
import com.Tienda_Viajes.interfaces.ICliente;
import com.Tienda_Viajes.model.Cliente;


@Service
public class ClienteService implements IClienteService {

	@Autowired
	private ICliente data;

	@Override
	public List<Cliente> listar() {
		return (List<Cliente>) data.findAll();
	}

	@Override
	public Optional<Cliente> listarId(int id) {
		return data.findById(id);

	}

	@Override
	public int save(Cliente cliente) {
		if (data.save(cliente) != null) {

			return 1;
		}
		return 0;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
	}

}