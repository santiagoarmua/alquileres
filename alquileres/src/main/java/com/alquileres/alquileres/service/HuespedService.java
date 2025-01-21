package com.alquileres.alquileres.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.alquileres.alquileres.entity.Huesped;
import com.alquileres.alquileres.repository.IHuespedRepository;



@Service
public class HuespedService {

	@Autowired
	private IHuespedRepository huespedRepository;

	public List<Huesped> getAllHuespedes() {
		return (List<Huesped>) huespedRepository.findAll();
	}

	public Huesped createHuesped(Huesped huesped) {
		return huespedRepository.save(huesped);
	}

	public Huesped updateHuesped(Huesped huespedDetails) {
		Huesped existingHuesped = huespedRepository.findById(huespedDetails.getDni()).orElse(null);
		if (existingHuesped != null) {

			existingHuesped.setDni(huespedDetails.getDni());
			existingHuesped.setNombre(huespedDetails.getNombre());
			existingHuesped.setApellido(huespedDetails.getApellido());
			existingHuesped.setEmail(huespedDetails.getEmail());
			existingHuesped.setTelefono(huespedDetails.getTelefono());

			return huespedRepository.save(existingHuesped);
		} else {
			return null;
		}
	}

	public String deleteHuesped(Long dni) {
		huespedRepository.deleteById(dni);
        return "cuenta removed !! " +dni;
    }
	
	public Huesped getHuespedById(Long dni) {
        return huespedRepository.findById(dni).orElse(null);
    }

}
