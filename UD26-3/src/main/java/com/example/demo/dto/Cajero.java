package com.example.demo.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="cajeros")
public class Cajero {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;			
	
	@Column(name = "nomapels")
	private String nomApels;	
	
	@OneToMany
	@JoinColumn(name="codigo")
	private List<Venta> venta;
	
	public Cajero() {}
	
	public Cajero(int codigo, String nomApels, List<Venta>venta) {
		
		this.codigo = codigo;
		this.nomApels = nomApels;
		this.venta = venta;
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNomApels() {
		return nomApels;
	}

	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}

	public List<Venta> getVenta() {
		return venta;
	}

	public void setVenta(List<Venta> venta) {
		this.venta = venta;
	}
	
	

}
