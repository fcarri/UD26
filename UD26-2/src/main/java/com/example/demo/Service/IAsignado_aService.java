package com.example.demo.Service;

import java.util.List;

import com.example.demo.dto.Asignado_a;

public interface IAsignado_aService {
	
	public List<Asignado_a> listarAsignado_a();
	public Asignado_a guardarAsignado_a(Asignado_a asignado_a);
	public Asignado_a actualizarAsignado_a(Asignado_a asignado_a);
	//public void eliminarAsignado_a(String id);
	//public Asignado_a asignado_aXID(String id);

}
