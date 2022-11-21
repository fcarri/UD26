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

import com.example.demo.dto.Asignado_a;
import com.example.demo.Service.Asignado_aServiceImp;

@RestController
@RequestMapping("/api")
public class Asignado_aController {

	@Autowired
	Asignado_aServiceImp imp;
	
	@GetMapping("/asignado_a")
	public List<Asignado_a> listarAsignado_a(){
		return imp.listarAsignado_a();
	}
	/*
	@DeleteMapping("/asignado_a/{id}")
	public void eliminarAsignado_a(@PathVariable(name="id")String id) {
		imp.eliminarAsignado_a(id);
	}*/
	
	@PostMapping("/asignado_a")
	public Asignado_a guardarAsignado_a(@RequestBody Asignado_a asignado_a) {		
		return imp.guardarAsignado_a(asignado_a);
	}
	
	@PutMapping("/asignado_a/{id}")
	public Asignado_a actualizarAsignado_a(@PathVariable(name="id")String id,@RequestBody Asignado_a asignado_a) {
		
		//Asignado_a asignado_a_seleccionados= new Asignado_a();
		Asignado_a asignado_a_actualizados= new Asignado_a();	
		
		asignado_a_actualizados = imp.actualizarAsignado_a(asignado_a_actualizados);
	
		
		return asignado_a_actualizados;
	}
	/*
	@GetMapping("/asignado_a/{id}")
	public Asignado_a asignado_aXID(@PathVariable(name="id") String id) {
		
		Asignado_a asignado_a_xid= new Asignado_a();		
		asignado_a_xid=imp.asignado_aXID(id);		
		
		return asignado_a_xid;
	}*/
	
}
