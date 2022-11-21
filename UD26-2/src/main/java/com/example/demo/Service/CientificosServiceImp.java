package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ICientificosDAO;
import com.example.demo.dto.Cientificos;

@Service
public class CientificosServiceImp implements ICientificosService{

	@Autowired
	ICientificosDAO iCientificosDAO;
	
	@Override
	public List<Cientificos> listarCientificos() {	
		return iCientificosDAO.findAll();
	}
	
	@Override
	public Cientificos guardarCientificos(Cientificos cientificos) {		
		return iCientificosDAO.save(cientificos);
	}
	
	@Override
	public Cientificos actualizarCientificos(Cientificos cientificos) {		
		return iCientificosDAO.save(cientificos);
	}

	@Override
	public void eliminarCientificos(String dni) {		
		iCientificosDAO.deleteById(dni);
		
	}
	
	@Override
	public Cientificos cientificosXDNI(String dni) {
		
		return iCientificosDAO.findById(dni).get();
	}
	
}
