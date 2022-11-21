package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Producto;

public interface IProductoService {
	
	public List<Producto> listarProducto();
	public Producto guardarProducto(Producto producto);
	public Producto actualizarProducto(Producto producto);
	public void eliminarProducto(int codigo);
	public Producto productoXID(int codigo);

}
