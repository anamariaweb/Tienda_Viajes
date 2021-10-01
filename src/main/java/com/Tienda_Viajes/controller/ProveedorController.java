package com.Tienda_Viajes.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Tienda_Viajes.interfaceService.IProveedorService;
import com.Tienda_Viajes.model.Proveedor;

@Controller
@RequestMapping("/provider")
public class ProveedorController {

	
	@Autowired
	private IProveedorService service;

	@GetMapping("/listar")
	public String listar(Model model) {
		List<Proveedor> proveedores = service.listar();
		model.addAttribute("proveedores", proveedores);
		return "provider/index";
	}

	@PostMapping(path = "/guardar", consumes = { MediaType.APPLICATION_FORM_URLENCODED_VALUE })
	public String guardar(Proveedor pr) {
		service.save(pr);
		return "redirect:/provider/listar";

	}

	@GetMapping("/eliminar")
	public String eliminar(int id) {
		service.delete(id);
		return "redirect:/provider/listar";
	}

	@GetMapping("/crear")
	public String crear() {
		return "provider/crear";
	}

	@GetMapping("/editar")
	public String editar(int id, Model model) {
		Optional<Proveedor> pr = service.listarId(id);
		model.addAttribute("proveedor", pr);
		return "provider/editar";
		
	}	
}
