package com.example.demo.Service;

import java.util.List;

import com.example.demo.dto.Cientificos;

public interface ICientificosService{

	public List<Cientificos> listarCientificos();
	public Cientificos guardarCientificos(Cientificos cientificos);
	public Cientificos actualizarCientificos(Cientificos cientificos);
	public void eliminarCientificos(String dni);
	public Cientificos cientificosXDNI(String dni);
	
	
}
