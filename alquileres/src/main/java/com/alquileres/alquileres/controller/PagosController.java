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

import com.alquileres.alquileres.entity.Pagos;
import com.alquileres.alquileres.service.PagosService;

@RestController
@RequestMapping("/pagos")
public class PagosController {

	@Autowired
	private PagosService pagosService;
	
	@GetMapping("/All") // FUNCIONA
	public List<Pagos> getAllPagos() {
		return pagosService.getAllPagos();
	}
	
	@GetMapping("/pagosById/{numPago}")//FUNCIONA
    public Pagos findById(@PathVariable Long numPago) {
        return pagosService.getPagosById(numPago);
    }
	
	@PostMapping("/create") // FUNCIONA
	public Pagos createPagos(@RequestBody Pagos pago) {
		return pagosService.createPagos(pago);
	}
	
	@PutMapping("/update/{numPago}") // FUNCIONA
	public Pagos updatePagos(@RequestBody Pagos pagos) {
		return pagosService.updatePagos(pagos);
	}
	
	@DeleteMapping("/delete/{numPago}")//FUNCIONA
    public String deletePagos(@PathVariable Long numPago) {
        return pagosService.deletePagos(numPago);
    }

}
