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

import com.yimmy.demo.entity.Mercancia;

import interfacesService.IMercanciaService;

@CrossOrigin(origins= "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping("/Mercancia")
public class MercanciaController {

	@Autowired
	private IMercanciaService service;
	
	@GetMapping("/Listar")
	public Iterable<Mercancia> List()
	{
		return service.Listar();
	}
	
	@PostMapping("/Save")
	public String create(@RequestBody Mercancia mer)
	{
		return service.save(mer);
	
	}
	
	@DeleteMapping("/Delete/{id}")
	public String Delete(@PathVariable("id") int id)
	{
		service.delete(id);
		return "Ok";
	}
	
}
