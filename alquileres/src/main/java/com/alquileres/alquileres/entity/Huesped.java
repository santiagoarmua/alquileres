package com.alquileres.alquileres.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="huespedes")
public class Huesped implements Serializable{

	@Id
	private Long dni;
	
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	
	@OneToMany(mappedBy = "huesped", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Contrato> contratos;
	
	public Long getDni() {
		return dni;
	}
	public void setDni(Long dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	private static final long serialVersionUID = 1L;
	
	
}
