package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Empleado;
import com.example.demo.repository.EmpleadoRepository;


@Controller
public class EmpleadoController {

	@Autowired
	private EmpleadoRepository repository;
	
	@GetMapping("/")
	public String home (Model model) {
		List<Empleado>listaempleado = repository.findAll();
		model.addAttribute("listaempleado",listaempleado);
		return"home";
	}
	
	
	@GetMapping("/registrar")
	public String RegistrarEmpleado(Model model) {
		model.addAttribute("user", new Empleado());
		return  "registrar";
	}
	
	@PostMapping("/registrar")
	public String registrarEmpleado (@ModelAttribute Empleado emple, Model model) {
		repository.save(emple);
		return"redirevct:/";
	}
	
}
