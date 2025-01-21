package com.alquileres.alquileres.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alquileres.alquileres.entity.Departamento;
import com.alquileres.alquileres.service.DepartamentoService;


@RestController
@RequestMapping("/departamentos")
public class DepartamentoController {

	@Autowired
	private DepartamentoService departamentoService;
	
	@GetMapping("/All") // FUNCIONA
	public List<Departamento> getAllDepartamento() {
		return departamentoService.getAllDepartamentos();
	}

	 @GetMapping("/departamentoById/{id}")//FUNCIONA
	    public Departamento findById(@PathVariable Long id) {
	        return departamentoService.getDepartamentoById(id);
	    }

	@PostMapping("/create") // FUNCIONA
	public Departamento createDepartamento(@RequestBody Departamento departamento) {
		return departamentoService.createDepartamento(departamento);
	}

	@PutMapping("/update/{id}") // FUNCIONA
	public Departamento updateDepartamento(@RequestBody Departamento departamento) {
		return departamentoService.updateDepartamento(departamento);
	}
	
	@DeleteMapping("/delete/{id}")//FUNCIONA
    public String deleteDepartamento(@PathVariable Long id) {
        return departamentoService.deleteDepartamento(id);
    }
}
