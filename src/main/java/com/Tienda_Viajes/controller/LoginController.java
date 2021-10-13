package com.Tienda_Viajes.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Tienda_Viajes.interfaceService.IPersonaService;
import com.Tienda_Viajes.model.Persona;


@Controller
public class LoginController {

	
	@Autowired
	private IPersonaService service;
	
	@GetMapping("/")
	public String login() {
		return "login/login";
		
	}
	
	@ResponseBody
	@PostMapping("/login")
	public int loginForm(HttpServletRequest request) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		List<Persona> personas= service.findByUsuarioAndClave(username, password);
		
		if (personas.size() > 0) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
}
