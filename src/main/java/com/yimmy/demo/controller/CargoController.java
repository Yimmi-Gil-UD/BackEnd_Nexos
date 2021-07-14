package com.yimmy.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yimmy.demo.entity.Cargo;
import com.yimmy.demo.service.CargoService;

import interfacesService.IcargoService;

@CrossOrigin(origins= "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping("/Cargo")
public class CargoController {
	
	@Autowired
	private  IcargoService service;
		
	@GetMapping("/Listar")
	public Iterable<Cargo> List()
	{
		return service.Listar();
	}
	
	@PostMapping("/Save")
	public Cargo create(@RequestBody Cargo car)
	{
		service.save(car);
		return car;
		
	}
	
	/*
	@PutMapping("/{id}")
	public Cargo update(@PathVariable("id") int id, @RequestBody Cargo cargo)
	{
		return service.update(id,cargo);
	}*/
	
	@DeleteMapping("/Eliminar/{id}")
	public String delete(@PathVariable("id") int id)
	{
		service.delete(id);
		return "ok";
	}
	

}
