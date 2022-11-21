package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ICajeroDAO;
import com.example.demo.dto.Cajero;

@Service
public class CajeroServiceImp implements ICajeroService{
	
	@Autowired
	ICajeroDAO iCajeroDAO;
	
	@Override
	public List<Cajero> listarCajero() {	
		return iCajeroDAO.findAll();
	}
	
	@Override
	public Cajero guardarCajero(Cajero cajero) {		
		return iCajeroDAO.save(cajero);
	}
	
	@Override
	public Cajero actualizarCajero(Cajero cajero) {		
		return iCajeroDAO.save(cajero);
	}

	@Override
	public void eliminarCajero(int codigo) {		
		iCajeroDAO.deleteById(codigo);
		
	}
	
	@Override
	public Cajero cajeroXID(int codigo) {
		
		return iCajeroDAO.findById(codigo).get();
	}
	

}
