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

import com.example.demo.dto.Cientificos;
import com.example.demo.Service.CientificosServiceImp;

@RestController
@RequestMapping("/api")
public class CientificosController {
	
	@Autowired
	CientificosServiceImp imp;
	
	@GetMapping("/cientificos")
	public List<Cientificos> listarCientificos(){
		return imp.listarCientificos();
	}
	
	@DeleteMapping("/cientificos/{dni}")
	public void eliminarCientificos(@PathVariable(name="dni")String dni) {
		imp.eliminarCientificos(dni);
	}
	
	@PostMapping("/cientificos")
	public Cientificos guardarCientificos(@RequestBody Cientificos cientificos) {		
		return imp.guardarCientificos(cientificos);
	}
	
	@PutMapping("/cientificos/{dni}")
	public Cientificos actualizarCientificos(@PathVariable(name="dni")String dni,@RequestBody Cientificos cientificos) {
		
		Cientificos cientificos_seleccionados= new Cientificos();
		Cientificos cientificos_actualizados= new Cientificos();	
		
		cientificos_actualizados = imp.actualizarCientificos(cientificos_actualizados);
		
		cientificos_seleccionados.setDni(cientificos.getDni());
		cientificos_seleccionados.setNomApels(cientificos.getNomApels());
		
		cientificos_actualizados = imp.actualizarCientificos(cientificos_seleccionados);		
		
		return cientificos_actualizados;
	}
	
	@GetMapping("/cientificos/{dni}")
	public Cientificos cientificosXID(@PathVariable(name="dni") String dni) {
		
		Cientificos cientificos_xdni= new Cientificos();		
		cientificos_xdni=imp.cientificosXDNI(dni);		
		
		return cientificos_xdni;
	}
	

}
