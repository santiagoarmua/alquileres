package com.alquileres.alquileres.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alquileres.alquileres.entity.Huesped;
import com.alquileres.alquileres.service.HuespedService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/huespedes")
public class HuespedController {

	@Autowired
	private HuespedService huespedService;

	@GetMapping() // FUNCIONA
	public List<Huesped> getAllHuespedes() {
		return huespedService.getAllHuespedes();
	}

	 @GetMapping("/{dni}")//FUNCIONA
	    public Huesped findById(@PathVariable Long dni) {
	        return huespedService.getHuespedById(dni);
	    }

	@PostMapping("/create") // FUNCIONA
	public Huesped createHuesped(@RequestBody Huesped huesped) {
		return huespedService.createHuesped(huesped);
	}

	@PutMapping("/{dni}") // FUNCIONA
	public Huesped updateHuesped(@RequestBody Huesped huesped) {
		return huespedService.updateHuesped(huesped);
	}
	
	@DeleteMapping("/{dni}")//FUNCIONA
    public String deleteHuesped(@PathVariable Long dni) {
        return huespedService.deleteHuesped(dni);
    }

}
