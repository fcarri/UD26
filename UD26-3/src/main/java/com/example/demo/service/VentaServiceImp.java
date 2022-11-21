package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IVentaDAO;
import com.example.demo.dto.Venta;

@Service
public class VentaServiceImp implements IVentaService{
	
	@Autowired
	IVentaDAO iVentaDAO;
	
	@Override
	public List<Venta> listarVenta() {	
		return iVentaDAO.findAll();
	}
	
	@Override
	public Venta guardarVenta(Venta venta) {		
		return iVentaDAO.save(venta);
	}
	
	@Override
	public Venta actualizarVenta(Venta venta) {		
		return iVentaDAO.save(venta);
	}

	@Override
	public void eliminarVenta(int codigo) {		
		iVentaDAO.deleteById(codigo);
		
	}
	
	@Override
	public Venta ventaXID(int codigo) {
		
		return iVentaDAO.findById(codigo).get();
	}

}
