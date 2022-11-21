package com.example.demo.controller;

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

import com.example.demo.service.CajeroServiceImp;
import com.example.demo.dto.Cajero;

@RestController
@RequestMapping("/api")
public class CajeroController {
	
	@Autowired
	CajeroServiceImp imp;
	
	@GetMapping("/cajero")
	public List<Cajero> listarCajero(){
		return imp.listarCajero();
	}
	
	@DeleteMapping("/cajero/{codigo}")
	public void eliminarCajero(@PathVariable(name="codigo")int codigo) {
		imp.eliminarCajero(codigo);
	}
	
	@PostMapping("/cajero")
	public Cajero guardarCajero(@RequestBody Cajero cajero) {		
		return imp.guardarCajero(cajero);
	}
	
	@PutMapping("/cajero/{codigo}")
	public Cajero actualizarCajero(@PathVariable(name="codigo")int codigo,@RequestBody Cajero cajero) {
		
		Cajero cajero_seleccionados= new Cajero();
		Cajero cajero_actualizados= new Cajero();	
		
		cajero_actualizados = imp.actualizarCajero(cajero_actualizados);
				
		cajero_seleccionados.setNomApels(cajero.getNomApels());
		
		cajero_actualizados = imp.actualizarCajero(cajero_seleccionados);		
		
		return cajero_actualizados;
	}
	
	@GetMapping("/cajero/{codigo}")
	public Cajero cajeroXID(@PathVariable(name="codigo") int codigo) {
		
		Cajero cajero_xcodigo= new Cajero();		
		cajero_xcodigo=imp.cajeroXID(codigo);		
		
		return cajero_xcodigo;
	}
	

	

}
