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
@Table(name="cientificos")
public class Cientificos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String dni;			
	
	@Column(name = "nomapels")
	private String nomApels;		
	

	@OneToMany
	@JoinColumn(name="dni")
	private List<Asignado_a> asignado_a;
	
	public Cientificos() {}

	public Cientificos(String dni, String nomApels, List<Asignado_a> asignado_a) {
		super();
		this.dni = dni;
		this.nomApels = nomApels;
		this.asignado_a = asignado_a;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNomApels() {
		return nomApels;
	}

	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}

	public List<Asignado_a> getAsignado_a() {
		return asignado_a;
	}

	public void setAsignado_a(List<Asignado_a> asignado_a) {
		this.asignado_a = asignado_a;
	}
	
	

}
