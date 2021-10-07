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

import com.Tienda_Viajes.interfaceService.IProductoService;
import com.Tienda_Viajes.model.Producto;


@RequestMapping("/product")
@Controller
public class ProductoController {


	@Autowired
	private IProductoService service;

	@GetMapping("/listar")
	public String listar(Model model) {
		List<Producto> productos= service.listar();
		model.addAttribute("productos", productos);
		return "product/index";
	}

	@PostMapping(path = "/guardar", consumes = { MediaType.APPLICATION_FORM_URLENCODED_VALUE })
	public String guardar(Producto pt) {
		service.save(pt);
		return "redirect:/product/listar";

	}

	@GetMapping("/eliminar/{Codigo}")
	public String eliminar(Model model, @PathVariable int Codigo) {
		service.delete(Codigo);
		return "redirect:/product/listar";
	}

	@GetMapping("/crear")
	public String crear() {
		return "product/crear";
	}

	@GetMapping("/editar/{Codigo}")
	public String editar(@PathVariable int Codigo, Model model) 
	{
		Optional<Producto> pt = service.listarId(Codigo);
		model.addAttribute("producto", pt);
		return "product/editar";
		
	}	


}
	

