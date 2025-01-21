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

import com.alquileres.alquileres.entity.Contrato;

import com.alquileres.alquileres.service.ContratoService;
;
@RestController
@RequestMapping("/contratos")
public class ContratoController {

	@Autowired
	private ContratoService contratoService;
	
	@GetMapping("/All") // FUNCIONA
	public List<Contrato> getAllContrato() {
		return contratoService.getAllContratos();
	}

	 @GetMapping("/contratoById/{numContrato}")//FUNCIONA
	    public Contrato findById(@PathVariable Long numContrato) {
	        return contratoService.getContratoById(numContrato);
	    }

	@PostMapping("/create") // FUNCIONA
	public Contrato createContrato(@RequestBody Contrato contrato) {
		return contratoService.createContrato(contrato);
	}

	@PutMapping("/update/{numContrato}") // FUNCIONA
	public Contrato updateContrato(@RequestBody Contrato contrato) {
		return contratoService.updateContrato(contrato);
	}
	
	@DeleteMapping("/delete/{id}")//FUNCIONA
    public String deleteContrato(@PathVariable Long numContrato) {
        return contratoService.deleteContrato(numContrato);
    }
}
