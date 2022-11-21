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
@Table(name="proyecto")
public class Proyecto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private String id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "horas")
	private int horas;
	
	@OneToMany
	@JoinColumn(name="id")
	private List<Asignado_a> asignado_a;

	public Proyecto() {}
	
	public Proyecto(String id, String nombre, int horas, List<Asignado_a> asignado_a) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;
		this.asignado_a = asignado_a;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public List<Asignado_a> getAsignado_a() {
		return asignado_a;
	}

	public void setAsignado_a(List<Asignado_a> asignado_a) {
		this.asignado_a = asignado_a;
	}
	
	

}
