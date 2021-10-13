package com.Tienda_Viajes.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Tienda_Viajes.model.Persona;

@Repository
public interface IPersona extends CrudRepository<Persona, Integer>{
	
	
	@Query("select u from Persona u where u.Usuario= ?1 and u.Clave= ?2")
	List<Persona> findByUsuarioAndClave(String usuario, String clave);
	
	
}
