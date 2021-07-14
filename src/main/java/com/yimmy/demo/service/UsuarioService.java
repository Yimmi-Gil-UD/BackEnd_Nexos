package com.yimmy.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yimmy.demo.entity.Usuario;
import com.yimmy.demo.interfaces.IUsuario;

import interfacesService.IUsuarioService;

@Service
public class UsuarioService implements IUsuarioService{
	
	@Autowired
	private IUsuario data;
	
	@Override
	public List<Usuario> Listar()
	{
		return (List<Usuario>) data.findAll();
	}
	
	@Override
	public Usuario save(Usuario u)
	{
		data.save(u);
		return u;
	}
	
	@Override
	public void delete(int id)
	{
		data.deleteById(id);
	}
	
	
}
