package com.whnm.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/persona")
public class PersonaController {
	
	@GetMapping("/saludar")
	public String saludar(@RequestParam(name = "nombre", required = false, defaultValue = "Wilson H. Neira Mija") String nombre, Model model) {
		model.addAttribute("nombre", nombre);
		return "persona";
	}
}
