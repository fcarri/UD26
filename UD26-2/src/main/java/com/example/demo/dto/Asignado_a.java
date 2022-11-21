package com.example.demo.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="asignado_A")
public class Asignado_a {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "cientifico")
	private Cientificos cientifico;
	
	@ManyToOne
	@JoinColumn(name = "proyecto")
	private Proyecto proyecto;

	public Asignado_a() {}

	public Asignado_a(int id, Cientificos cientifico, Proyecto proyecto) {
		this.id = id;
		this.cientifico = cientifico;
		this.proyecto = proyecto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cientificos getCientifico() {
		return cientifico;
	}

	public void setCientifico(Cientificos cientifico) {
		this.cientifico = cientifico;
	}

	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}
	
	
}
