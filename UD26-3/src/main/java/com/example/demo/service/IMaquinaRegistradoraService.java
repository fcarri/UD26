package com.example.demo.service;

import java.util.List;
import com.example.demo.dto.MaquinaRegistradora;

public interface IMaquinaRegistradoraService {
	
	public List<MaquinaRegistradora> listarMaquinaRegistradora();
	public MaquinaRegistradora guardarMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora);
	public MaquinaRegistradora actualizarMaquinaRegistradora(MaquinaRegistradora maquinaRegistradora);
	public void eliminarMaquinaRegistradora(int codigo);
	public MaquinaRegistradora maquinaRegistradoraXID(int codigo);

}
