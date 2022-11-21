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


import com.example.demo.dto.MaquinaRegistradora;
import com.example.demo.service.MaquinaRegistradoraServiceImp;


@RestController
@RequestMapping("/api")
public class MaquinaRegistradoraController {
	
	@Autowired
	MaquinaRegistradoraServiceImp imp;
	
	@GetMapping("/maquinaRegistradora")
	public List<MaquinaRegistradora> listarMaquinaRegistradora(){
		return imp.listarMaquinaRegistradora();
	}
	
	@DeleteMapping("/maquinaRegistradora/{codigo}")
	public void eliminarMaquinaRegistradora(@PathVariable(name="codigo")int codigo) {
		imp.eliminarMaquinaRegistradora(codigo);
	}
	
	@PostMapping("/maquinaRegistradora")
	public MaquinaRegistradora guardarMaquinaRegistradora(@RequestBody MaquinaRegistradora maquinaRegistradora) {		
		return imp.guardarMaquinaRegistradora(maquinaRegistradora);
	}
	
	@PutMapping("/maquinaRegistradora/{codigo}")
	public MaquinaRegistradora actualizarMaquinaRegistradora(@PathVariable(name="codigo")int codigo,@RequestBody MaquinaRegistradora maquinaRegistradora) {
		
		MaquinaRegistradora maquinaRegistradora_seleccionados= new MaquinaRegistradora();
		MaquinaRegistradora maquinaRegistradora_actualizados= new MaquinaRegistradora();	
		
		maquinaRegistradora_actualizados = imp.actualizarMaquinaRegistradora(maquinaRegistradora_actualizados);
		
		maquinaRegistradora_seleccionados.setCodigo(maquinaRegistradora.getCodigo());
		maquinaRegistradora_seleccionados.setPiso(maquinaRegistradora.getPiso());
		
		maquinaRegistradora_actualizados = imp.actualizarMaquinaRegistradora(maquinaRegistradora_seleccionados);		
		
		return maquinaRegistradora_actualizados;
	}
	
	@GetMapping("/maquinaRegistradora/{codigo}")
	public MaquinaRegistradora maquinaRegistradoraXID(@PathVariable(name="codigo") int codigo) {
		
		MaquinaRegistradora maquinaRegistradora_xcodigo= new MaquinaRegistradora();		
		maquinaRegistradora_xcodigo=imp.maquinaRegistradoraXID(codigo);		
		
		return maquinaRegistradora_xcodigo;
	}
	



}
