package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IMaquinaRegistradoraDAO;
import com.example.demo.dto.MaquinaRegistradora;

@Service
public class MaquinaRegistradoraServiceImp implements IMaquinaRegistradoraService{

	@Autowired
	IMaquinaRegistradoraDAO iMaquinaRegistradoraDAO;
	
	@Override
	public List<MaquinaRegistradora> listarMaquinaRegistradora() {	
		return iMaquinaRegistradoraDAO.findAll();
	}
	
	@Override
	public MaquinaRegistradora guardarMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora) {		
		return iMaquinaRegistradoraDAO.save(maquinaRegistradora);
	}
	
	@Override
	public MaquinaRegistradora actualizarMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora) {		
		return iMaquinaRegistradoraDAO.save(maquinaRegistradora);
	}

	@Override
	public void eliminarMaquinaRegistradora(int codigo) {		
		iMaquinaRegistradoraDAO.deleteById(codigo);
		
	}
	
	@Override
	public MaquinaRegistradora maquinaRegistradoraXID(int codigo) {
		
		return iMaquinaRegistradoraDAO.findById(codigo).get();
	}
}
