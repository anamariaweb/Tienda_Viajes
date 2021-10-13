package com.Tienda_Viajes.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Tienda_Viajes.interfaceService.IClienteService;
import com.Tienda_Viajes.model.Cliente;

@Controller
@RequestMapping("/client")
public class ClienteController {

	@Autowired
	private IClienteService service;

	@GetMapping("/listar")
	public String listar(Model model) {
		List<Cliente> cliente = service.listar();
		model.addAttribute("clientes", cliente);
		
		return "client/index";
	}

	@PostMapping(path = "/guardar", consumes = { MediaType.APPLICATION_FORM_URLENCODED_VALUE })
	public String guardar(Cliente c) {
		service.save(c);
		return "redirect:/client/listar";

	}

	@GetMapping("/eliminar/{Cedula}")
	public String eliminar(@PathVariable int Cedula) {
		service.delete(Cedula);
		return "redirect:/client/listar";
	}

	@GetMapping("/crear")
	public String crear() {
		return "client/crear";
	}

	@GetMapping("/editar/{Cedula}")
	public String editar(@PathVariable int Cedula, Model model) {
		Optional<Cliente> c = service.listarId(Cedula);
		model.addAttribute("cliente", c);
		return "client/editar";
	}

}
