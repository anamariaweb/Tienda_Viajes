package com.Tienda_Viajes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Tienda_Viajes.interfaceService.IClienteService;
import com.Tienda_Viajes.interfaceService.IFacturaService;
import com.Tienda_Viajes.interfaces.IFactura;
import com.Tienda_Viajes.model.Cliente;
import com.Tienda_Viajes.model.FacturaModel;

@Service
public class FacturaService  implements IFacturaService{

	@Autowired
	private IFactura facturabd;
	
	@Autowired
	private IClienteService servicec;
	
	public int saveFactura(FacturaModel f)
	{
		int res=0;
		int cedulaC = Integer.parseInt(f.getCedula_C());
		Optional<Cliente> cliente = servicec.listarId(cedulaC); 
		String nombreC =  cliente.get().getNombre();
		f.setNombre_C(nombreC);
		FacturaModel factura = facturabd.save(f);
		if (factura.equals(null))
		{
			res=1;	
		}
		return res;
		
		
	}

	@Override
	public List<FacturaModel> listar() {
		return (List<FacturaModel>) facturabd.findAll();				
			
	}

	
}
