package com.Tienda_Viajes.interfaceService;

import java.util.List;
import java.util.Optional;

import com.Tienda_Viajes.model.Persona;

public interface IPersonaService {
	
	public List<Persona> listar();
	public Optional<Persona> listarId(int id);
	public int save(Persona persona);
	public void delete(int id);
	public List<Persona> findByUsuarioAndClave(String username, String password);
	
	
}
