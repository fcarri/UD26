package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Cajero;

public interface ICajeroService {
	
	public List<Cajero> listarCajero();
	public Cajero guardarCajero(Cajero cajero);
	public Cajero actualizarCajero(Cajero cajero);
	public void eliminarCajero(int codigo);
	public Cajero cajeroXID(int codigo);

}
