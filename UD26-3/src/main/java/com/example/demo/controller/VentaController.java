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

import com.example.demo.dto.Venta;
import com.example.demo.service.VentaServiceImp;

@RestController
@RequestMapping("/api")
public class VentaController {
	
	@Autowired
	VentaServiceImp imp;
	
	@GetMapping("/venta")
	public List<Venta> listarVenta(){
		return imp.listarVenta();
	}
	
	@DeleteMapping("/venta/{codigo}")
	public void eliminarVenta(@PathVariable(name="codigo")int codigo) {
		imp.eliminarVenta(codigo);
	}
	
	@PostMapping("/venta")
	public Venta guardarVenta(@RequestBody Venta venta) {		
		return imp.guardarVenta(venta);
	}
	
	@PutMapping("/venta/{codigo}")
	public Venta actualizarVenta(@PathVariable(name="codigo")int codigo,@RequestBody Venta venta) {
		
		Venta venta_seleccionados= new Venta();
		Venta venta_actualizados= new Venta();	
		
		venta_actualizados = imp.actualizarVenta(venta_actualizados);
		
		venta_seleccionados.setCajero(venta.getCajero());
		venta_seleccionados.setMaquina(venta.getMaquina());
		
		venta_actualizados = imp.actualizarVenta(venta_seleccionados);		
		
		return venta_actualizados;
	}
	
	@GetMapping("/venta/{codigo}")
	public Venta ventaXID(@PathVariable(name="codigo") int codigo) {
		
		Venta venta_xcodigo= new Venta();		
		venta_xcodigo=imp.ventaXID(codigo);		
		
		return venta_xcodigo;
	}
	



}
