package com.yimmy.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yimmy.demo.entity.Mercancia;
import com.yimmy.demo.interfaces.IMercancia;

import interfacesService.IMercanciaService;

@Service
public class MercanciaService implements IMercanciaService{
	
	@Autowired
	private IMercancia data;
	List<Object> ListaNombres = new ArrayList();
	
	
	
	@Override
	public List<Mercancia> Listar()
	{

		return (List<Mercancia>) data.findAll();
	}
	
	@Override
	public String Validacion(Mercancia m)
	{
		//ListaNombres.addAll((List<Mercancia>) data.findAll());
		if(ListaNombres.contains(m.getNombreProducto()))
		{
			return "El nombre del producto ya existe";
		}
		else
		{
			ListaNombres.add(m.getNombreProducto());
			return "ok";
			
		}
		
	}
	
	
	@Override
	public String save(Mercancia m)
	{
		
		if(Validacion(m).equals("ok"))
		{
			
			data.save(m);
			return "ok";
		}
		else
		{
			return "El nombre del producto ya existe";
		}
		
	}
	
	@Override
	public void delete(int id)
	{
		data.deleteById(id);
	}

}
