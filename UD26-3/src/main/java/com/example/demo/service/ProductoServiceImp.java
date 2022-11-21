package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IProductoDAO;
import com.example.demo.dto.Producto;

@Service
public class ProductoServiceImp implements IProductoService{
	
	@Autowired
	IProductoDAO iProductoDAO;
	
	@Override
	public List<Producto> listarProducto() {	
		return iProductoDAO.findAll();
	}
	
	@Override
	public Producto guardarProducto(Producto producto) {		
		return iProductoDAO.save(producto);
	}
	
	@Override
	public Producto actualizarProducto(Producto producto) {		
		return iProductoDAO.save(producto);
	}

	@Override
	public void eliminarProducto(int codigo) {		
		iProductoDAO.deleteById(codigo);
		
	}
	
	@Override
	public Producto productoXID(int codigo) {
		
		return iProductoDAO.findById(codigo).get();
	}

}
