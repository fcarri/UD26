package com.example.demo.Service;

import java.util.List;

import com.example.demo.dto.Proyecto;

public interface IProyectoService {
	
	public List<Proyecto> listarProyecto();
	public Proyecto guardarProyecto(Proyecto proyecto);
	public Proyecto actualizarProyecto(Proyecto proyecto);
	public void eliminarProyecto(String id);
	public Proyecto proyectoXID(String id);

}
