package com.yimmy.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yimmy.demo.entity.Usuario;

import interfacesService.IUsuarioService;

@CrossOrigin(origins= "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping("/Usuario")
public class UsuarioController {

	@Autowired
	private IUsuarioService service;
	
	@GetMapping("/Listar")
	public Iterable <Usuario> List()
	{
		return service.Listar();
	}
	
	@PostMapping("/Save")
	public Usuario create(@RequestBody Usuario u)
	{
		service.save(u);
		return u;
	}
	
	@DeleteMapping("/Delete/{id}")
	public String delete(@PathVariable("id") int id)
	{
		service.delete(id);
		return "Ok";
	}
}
