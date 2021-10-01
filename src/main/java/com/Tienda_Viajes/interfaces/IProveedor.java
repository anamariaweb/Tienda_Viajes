package com.Tienda_Viajes.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Tienda_Viajes.model.Proveedor;

@Repository
public interface IProveedor extends CrudRepository<Proveedor, Integer>{

}
