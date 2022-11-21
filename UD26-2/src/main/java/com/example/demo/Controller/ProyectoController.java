package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ProyectoServiceImp;
import com.example.demo.dto.Proyecto;

@RestController
@RequestMapping("/api")
public class ProyectoController {

	@Autowired
	ProyectoServiceImp imp;
	
	@GetMapping("/proyecto")
	public List<Proyecto> listarProyecto(){
		return imp.listarProyecto();
	}
	
	@DeleteMapping("/proyecto/{id}")
	public void eliminarProyecto(@PathVariable(name="id")String id) {
		imp.eliminarProyecto(id);
	}
	
	@PostMapping("/proyecto")
	public Proyecto guardarProyecto(@RequestBody Proyecto proyecto) {		
		return imp.guardarProyecto(proyecto);
	}
	
	@PutMapping("/proyecto/{id}")
	public Proyecto actualizarProyecto(@PathVariable(name="id")String id,@RequestBody Proyecto proyecto) {
		
		Proyecto proyecto_seleccionado= new Proyecto();
		Proyecto proyecto_actualizado= new Proyecto();	
		
		proyecto_actualizado = imp.actualizarProyecto(proyecto_actualizado);
		
		proyecto_seleccionado.setId(proyecto.getId());
		proyecto_seleccionado.setNombre(proyecto.getNombre());
		proyecto_seleccionado.setHoras(proyecto.getHoras());
	
		proyecto_actualizado = imp.actualizarProyecto(proyecto_seleccionado);		
		
		return proyecto_actualizado;
	}
	
	@GetMapping("/proyecto/{id}")
	public Proyecto proyectoXID(@PathVariable(name="id") String id) {
		
		Proyecto proyecto_xid= new Proyecto();		
		proyecto_xid=imp.proyectoXID(id);		
		
		return proyecto_xid;
	}
	

	
}
