package com.yimmy.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yimmy.demo.entity.Cargo;
import com.yimmy.demo.interfaces.ICargo;

import interfacesService.IcargoService;

@Service
public class CargoService implements IcargoService{
	
	@Autowired
	//private List<Cargo> cargos;
	private ICargo data;
	

	@Override
	public List<Cargo> Listar(){
		return (List<Cargo>)data.findAll();
	}
	
	

	@Override
	public int save(Cargo c)
	{
	  int res = 0;
	  Cargo cargo =data.save(c);
	  if(!cargo.equals(null))
	  {
		  res =1;
	  }
	  return res;
	}

	
	@Override
	public void delete(int id) {
		data.deleteById(id);
		
	}
	/*
	@Override
	public Cargo update(int id)
	{
		
	}
	*/
}
