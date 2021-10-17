package com.Tienda_Viajes.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.Tienda_Viajes.model.FacturaModel;

public interface IFactura extends CrudRepository<FacturaModel, String>
{

}
