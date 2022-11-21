package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IProyectoDAO;
import com.example.demo.dto.Proyecto;

@Service
public class ProyectoServiceImp implements IProyectoService{
	
	@Autowired
	IProyectoDAO iProyectoDAO;
	
	@Override
	public List<Proyecto> listarProyecto() {	
		return iProyectoDAO.findAll();
	}
	
	@Override
	public Proyecto guardarProyecto(Proyecto proyecto) {		
		return iProyectoDAO.save(proyecto);
	}
	
	@Override
	public Proyecto actualizarProyecto(Proyecto proyecto) {		
		return iProyectoDAO.save(proyecto);
	}

	@Override
	public void eliminarProyecto(String id) {		
		iProyectoDAO.deleteById(id);
		
	}
	
	@Override
	public Proyecto proyectoXID(String id) {
		
		return iProyectoDAO.findById(id).get();
	}

}
