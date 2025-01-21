package com.alquileres.alquileres.entity;

import java.io.Serializable;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="pagos")
public class Pagos implements Serializable {


	@Id
	private Long numPago;
	
	@ManyToOne
	@JoinColumn(name="dni")
	private Huesped huesped;
	
	@ManyToOne
	@JoinColumn(name="numContrato")
	private Contrato contrato;
	
	private String fechaPago;
	private Integer monto;
	private String fechaVencimiento;
	private String periodoAlquiler;
	public Long getNumPago() {
		return numPago;
	}
	public void setNumPago(Long numPago) {
		this.numPago = numPago;
	}
	public Huesped getHuesped() {
		return huesped;
	}
	public void setHuesped(Huesped huesped) {
		this.huesped = huesped;
	}
	public Contrato getContrato() {
		return contrato;
	}
	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}
	public String getFechaPago() {
		return fechaPago;
	}
	public void setFechaPago(String fechaPago) {
		this.fechaPago = fechaPago;
	}
	public Integer getMonto() {
		return monto;
	}
	public void setMonto(Integer monto) {
		this.monto = monto;
	}
	public String getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public String getPeriodoAlquiler() {
		return periodoAlquiler;
	}
	public void setPeriodoAlquiler(String periodoAlquiler) {
		this.periodoAlquiler = periodoAlquiler;
	}
	
	private static final long serialVersionUID = 1L;
	
	
}
