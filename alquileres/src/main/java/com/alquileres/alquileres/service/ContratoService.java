package com.alquileres.alquileres.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alquileres.alquileres.entity.Contrato;
import com.alquileres.alquileres.repository.IContratoRepository;


@Service
public class ContratoService {

	@Autowired
	private IContratoRepository contratoRepository;
	
	public List<Contrato> getAllContratos() {
		return (List<Contrato>) contratoRepository.findAll();
	}
	
	public Contrato createContrato(Contrato contrato) {
		return contratoRepository.save(contrato);
	}

	public Contrato updateContrato(Contrato contratoDetails) {
		Contrato existingContrato = contratoRepository.findById(contratoDetails.getNumContrato()).orElse(null);
		if (existingContrato != null) {

			existingContrato.setNumContrato(contratoDetails.getNumContrato());
			existingContrato.setHuesped(contratoDetails.getHuesped());
			existingContrato.setDepartamento(contratoDetails.getDepartamento());
			existingContrato.setFechaInicio(contratoDetails.getFechaInicio());
			existingContrato.setFechaFin(contratoDetails.getFechaFin());
			existingContrato.setMontoTotal(contratoDetails.getMontoTotal());
			existingContrato.setDescripcion(contratoDetails.getDescripcion());
			
			
			return contratoRepository.save(existingContrato);
		} else {
			return null;
		}
	}
	public String deleteContrato(Long numContrato) {
		contratoRepository.deleteById(numContrato);
        return "cuenta removed !! " +numContrato;
    }
	
	public Contrato getContratoById(Long numContrato) {
        return contratoRepository.findById(numContrato).orElse(null);
    }
	
}
