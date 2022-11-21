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


import com.example.demo.dto.Producto;
import com.example.demo.service.ProductoServiceImp;


@RestController
@RequestMapping("/api")
public class ProductoController {
	
	@Autowired
	ProductoServiceImp imp;
	
	@GetMapping("/producto")
	public List<Producto> listarProducto(){
		return imp.listarProducto();
	}
	
	@DeleteMapping("/producto/{codigo}")
	public void eliminarProducto(@PathVariable(name="codigo")int codigo) {
		imp.eliminarProducto(codigo);
	}
	
	@PostMapping("/producto")
	public Producto guardarProducto(@RequestBody Producto producto) {		
		return imp.guardarProducto(producto);
	}
	
	@PutMapping("/producto/{codigo}")
	public Producto actualizarProducto(@PathVariable(name="codigo")int codigo,@RequestBody Producto producto) {
		
		Producto producto_seleccionados= new Producto();
		Producto producto_actualizados= new Producto();	
		
		producto_actualizados = imp.actualizarProducto(producto_actualizados);
		
		producto_seleccionados.setCodigo(producto.getCodigo());
		producto_seleccionados.setPrecio(producto.getPrecio());
		
		producto_actualizados = imp.actualizarProducto(producto_seleccionados);		
		
		return producto_actualizados;
	}
	
	@GetMapping("/producto/{codigo}")
	public Producto productoXID(@PathVariable(name="codigo") int codigo) {
		
		Producto producto_xcodigo= new Producto();		
		producto_xcodigo=imp.productoXID(codigo);		
		
		return producto_xcodigo;
	}
	



}
