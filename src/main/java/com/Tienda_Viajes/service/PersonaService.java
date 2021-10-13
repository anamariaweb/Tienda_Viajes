package com.Tienda_Viajes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Tienda_Viajes.interfaceService.IPersonaService;
import com.Tienda_Viajes.interfaces.IPersona;
import com.Tienda_Viajes.model.Persona;

@Service
public class PersonaService implements IPersonaService {

	@Autowired
	private IPersona data;
	
	@Override
	public List<Persona> listar(){
		return (List<Persona>) data.findAll();
	}
	
	@Override
	public Optional<Persona> listarId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Persona persona) {
		
		if (data.save(persona) != null) {
			return 1;
		}
		
		return 0;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
		
	}

	@Override
	public List<Persona> findByUsuarioAndClave(String username, String password) {
		return data.findByUsuarioAndClave(username, password);
	}
	
}
