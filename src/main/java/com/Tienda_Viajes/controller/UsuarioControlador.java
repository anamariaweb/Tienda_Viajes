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
import com.Tienda_Viajes.interfaceService.IPersonaService;
import com.Tienda_Viajes.model.Persona;

@Controller
@RequestMapping("/user")
public class UsuarioControlador {
	
	
	@Autowired
	private IPersonaService service;
	
	@GetMapping("/listar")
	public String listar(Model model)
	{
		List<Persona> personas = service.listar();
		System.out.println(personas.size());
		model.addAttribute("personas", personas);		
		return "index";
	}
	
	@PostMapping(path="/guardar",consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
	public String guardar(Persona p) {
		service.save(p);
		return "redirect:/user/listar";
		
	}
	
	
	
	@GetMapping("/eliminar")
	public String eliminar(int id) {
		 service.delete(id);
		return "redirect:/user/listar";
	}
	
	@GetMapping("/crear")
	public String crear(){
		return "crear";
		
	}
	
	@GetMapping("/editar")
	public String editar(int id, Model model) {
		Optional<Persona> p = service.listarId(id);
		model.addAttribute("persona", p);
		return "editar";
	}
	
}
