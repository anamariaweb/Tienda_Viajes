package com.Tienda_Viajes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Tienda_Viajes.interfaceService.IClienteService;
import com.Tienda_Viajes.interfaceService.IFacturaService;
import com.Tienda_Viajes.interfaceService.IPersonaService;
import com.Tienda_Viajes.interfaceService.IProductoService;
import com.Tienda_Viajes.model.FacturaModel;

@Controller
@RequestMapping("/venta")
public class VentasController {
	
	@Autowired
	private IPersonaService serviceUsuario;
	@Autowired
	private IClienteService serviceCliente;
	@Autowired
	private IProductoService serviceProducto;
	@Autowired
	private IFacturaService serviceFactura;
	
	
	@GetMapping("/venta")
	public String mostrarFormVts(Model model)
	{
		model.addAttribute("personas", serviceUsuario.listar());
		model.addAttribute("clientes", serviceCliente.listar());
		model.addAttribute("producto", serviceProducto.listar());
		return "ventas/ventas";
		
	}
	@PostMapping("/saveFactura")
	public String saveFactura(FacturaModel f, Model model)
	{
		serviceFactura.saveFactura(f);
		return "redirect:/venta/venta";
		
	}
	
	@GetMapping("/listar")
	public String ventasCliente(Model model) 
	{
		model.addAttribute("facturas", serviceFactura.listar());
		return "ventas/reportes";
	}
}
