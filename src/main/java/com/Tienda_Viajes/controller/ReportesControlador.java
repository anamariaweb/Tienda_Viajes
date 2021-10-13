package com.Tienda_Viajes.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Tienda_Viajes.interfaceService.IClienteService;
import com.Tienda_Viajes.interfaceService.IPersonaService;
import com.Tienda_Viajes.interfaceService.IProductoService;
import com.Tienda_Viajes.interfaceService.IProveedorService;



@Controller
@RequestMapping
public class ReportesControlador {
	
	
	@Autowired
	private IProveedorService servicep;
	
	@Autowired
	private IClienteService servicec;
	
	@Autowired
	private IPersonaService serviceu;
	
	@Autowired
	private IProductoService service;
	
	
	@GetMapping("/reportes")
	public String mostrarReportes(Model model) {
		int usuarios= serviceu.listar().size();
		int clientes= servicec.listar().size();
		int proveedores= servicep.listar().size();
		int productos= service.listar().size();
		model.addAttribute("numero_usuario", usuarios);
		model.addAttribute("numero_cliente", clientes);
		model.addAttribute("numero_proveedor", proveedores);
		model.addAttribute("numero_producto",productos);
		
		
		return "reportes/reportes";
		
	
		
	}
	

	
}
