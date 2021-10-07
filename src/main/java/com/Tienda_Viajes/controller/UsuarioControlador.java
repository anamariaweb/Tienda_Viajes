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
import com.Tienda_Viajes.interfaceService.IPersonaService;
import com.Tienda_Viajes.model.Persona;

@Controller
@RequestMapping("/user")
public class UsuarioControlador {

	@Autowired
	private IPersonaService service;

	@GetMapping("/listar")
	public String listar(Model model) {
		List<Persona> personas = service.listar();
		model.addAttribute("personas", personas);
		return "user/index";
	}

	@PostMapping(path = "/guardar", consumes = { MediaType.APPLICATION_FORM_URLENCODED_VALUE })
	public String guardar(Persona p) {
		service.save(p);
		return "redirect:/user/listar";

	}

	@GetMapping("/eliminar/{Cedula}")
	public String eliminar(@PathVariable int Cedula) {
		service.delete(Cedula);
		return "redirect:/user/listar";
	}

	@GetMapping("/crear")
	public String crear() {
		return "user/crear";

	}

	@GetMapping("/editar/{Cedula}")
	public String editar(@PathVariable int Cedula, Model model) {
		Optional<Persona> p = service.listarId(Cedula);
		model.addAttribute("persona", p);
		return "user/editar";
	}

}
