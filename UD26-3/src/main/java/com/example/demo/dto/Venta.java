package com.example.demo.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="venta")
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	@ManyToOne
	@JoinColumn(name = "cajeros")
	private Cajero cajero;
	
	@ManyToOne
	@JoinColumn(name = "maquinas_registradoras")
	private MaquinaRegistradora maquina;
	
	@ManyToOne
	@JoinColumn(name = "productos")
	private Producto producto;
	
	public Venta() {}
	
	public Venta(Cajero cajero, MaquinaRegistradora maquina, Producto producto, int codigo) {
		
		this.cajero = cajero;
		this.maquina = maquina;
		this.producto = producto;
		this.codigo = codigo;
	}

	public Cajero getCajero() {
		return cajero;
	}

	public void setCajero(Cajero cajero) {
		this.cajero = cajero;
	}

	public MaquinaRegistradora getMaquina() {
		return maquina;
	}

	public void setMaquina(MaquinaRegistradora maquina) {
		this.maquina = maquina;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	

}
