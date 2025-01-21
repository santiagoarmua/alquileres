package com.alquileres.alquileres.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alquileres.alquileres.entity.Pagos;
import com.alquileres.alquileres.repository.IPagosRepository;

@Service
public class PagosService {

	@Autowired
	private IPagosRepository pagosRepository;
	
	public List<Pagos> getAllPagos() {
		return (List<Pagos>) pagosRepository.findAll();
	}
	
	public Pagos createPagos(Pagos pagos) {
		return pagosRepository.save(pagos);
	}
	
	public Pagos updatePagos(Pagos pagosDetails) {
		Pagos existingPagos = pagosRepository.findById(pagosDetails.getNumPago()).orElse(null);
		if (existingPagos != null) {

			existingPagos.setNumPago(pagosDetails.getNumPago());
			existingPagos.setHuesped(pagosDetails.getHuesped());
			existingPagos.setContrato(pagosDetails.getContrato());
			existingPagos.setFechaPago(pagosDetails.getFechaPago());
			existingPagos.setMonto(pagosDetails.getMonto());
			existingPagos.setFechaVencimiento(pagosDetails.getFechaVencimiento());
			existingPagos.setPeriodoAlquiler(pagosDetails.getPeriodoAlquiler());
			

			return pagosRepository.save(existingPagos);
		} else {
			return null;
		}
	}
	
	public String deletePagos(Long numPago) {
		pagosRepository.deleteById(numPago);
        return "pago removed !! " +numPago;
    }
	
	public Pagos getPagosById(Long numPago) {
        return pagosRepository.findById(numPago).orElse(null);
    }
}
