package com.alquileres.alquileres.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alquileres.alquileres.entity.Departamento;

import com.alquileres.alquileres.repository.IDepartamentoRepository;


@Service
public class DepartamentoService {

	@Autowired
	private IDepartamentoRepository departamentoRepository;
	
	public List<Departamento> getAllDepartamentos() {
		return (List<Departamento>) departamentoRepository.findAll();
	}

	public Departamento createDepartamento(Departamento departamento) {
		return departamentoRepository.save(departamento);
	}

	public Departamento updateDepartamento(Departamento departamentoDetails) {
		Departamento existingDepartamento = departamentoRepository.findById(departamentoDetails.getId()).orElse(null);
		if (existingDepartamento != null) {

			existingDepartamento.setId(departamentoDetails.getId());
			existingDepartamento.setDireccion(departamentoDetails.getDireccion());
			existingDepartamento.setNumHabitaciones(departamentoDetails.getNumHabitaciones());
			existingDepartamento.setRentaMensual(departamentoDetails.getRentaMensual());
			

			return departamentoRepository.save(existingDepartamento);
		} else {
			return null;
		}
	}

	public String deleteDepartamento(Long id) {
		departamentoRepository.deleteById(id);
        return "cuenta removed !! " +id;
    }
	
	public Departamento getDepartamentoById(Long id) {
        return departamentoRepository.findById(id).orElse(null);
    }
}
