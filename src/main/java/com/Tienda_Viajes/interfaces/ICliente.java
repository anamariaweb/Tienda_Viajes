package com.Tienda_Viajes.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Tienda_Viajes.model.Cliente;

@Repository
public interface ICliente extends CrudRepository<Cliente, Integer>{

}
