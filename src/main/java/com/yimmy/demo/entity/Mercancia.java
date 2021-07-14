package com.yimmy.demo.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Mercancia")
public class Mercancia {

	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombreProducto;
	private int cantidad;
	private Date fechaIngreso;
	
	@ManyToOne
	private Usuario usuario;
	private String nombreUsuarioModificacion;
	private Date fechaActualizacion;
	
	
	public Mercancia()
	{
		
	}
	
	public Mercancia(int id,String nombreProducto,int cantidad, Date fechaIngreso,String nombreUsuarioModificacion, Date fechaActualizacion)
	{
		this.id = id;
		this.nombreProducto = nombreProducto;
		this.cantidad = cantidad;
		this.fechaIngreso = fechaIngreso;
		this.nombreUsuarioModificacion = nombreUsuarioModificacion;
		this.fechaActualizacion = fechaActualizacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getNombreUsuarioModificacion() {
		return nombreUsuarioModificacion;
	}

	public void setNombreUsuarioModificacion(String nombreUsuarioModificacion) {
		this.nombreUsuarioModificacion = nombreUsuarioModificacion;
	}

	public Date getFechaActualizacion() {
		return fechaActualizacion;
	}

	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}
	
	
	
}
