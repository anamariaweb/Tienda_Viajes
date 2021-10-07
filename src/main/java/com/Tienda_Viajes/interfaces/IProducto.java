package com.Tienda_Viajes.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Tienda_Viajes.model.Producto;

@Repository
public interface IProducto extends CrudRepository<Producto, Integer> {

}
