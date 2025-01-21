package com.alquileres.alquileres.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="contratos")
public class Contrato implements Serializable{

	@Id
	
	private Long numContrato;
	
	@ManyToOne
	@JoinColumn(name="dni", referencedColumnName = "dni", nullable = false)
	private Huesped huesped;
	
	
	
	@ManyToOne
    @JoinColumn(name = "idDepto")
    private Departamento departamento;
	
	  
	private String fechaInicio;
	private String fechaFin;
	private Integer montoTotal;
	private String descripcion;
	
	
	
	public Long getNumContrato() {
		return numContrato;
	}



	public void setNumContrato(Long numContrato) {
		this.numContrato = numContrato;
	}



	public Huesped getHuesped() {
		return huesped;
	}



	public void setHuesped(Huesped huesped) {
		this.huesped = huesped;
	}



	public Departamento getDepartamento() {
		return departamento;
	}



	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}



	public String getFechaInicio() {
		return fechaInicio;
	}



	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}



	public String getFechaFin() {
		return fechaFin;
	}



	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}



	public Integer getMontoTotal() {
		return montoTotal;
	}



	public void setMontoTotal(Integer montoTotal) {
		this.montoTotal = montoTotal;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	private static final long serialVersionUID = 1L;
	
}
