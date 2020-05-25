package it.objectmethod.cceservicelayer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.cceservicelayer.service.CopiaCommissioneDettaglioService;
import it.objectmethod.cceservicelayer.service.dto.CopiaCommissioneDettaglioDTO;

@RestController
@RequestMapping("service/dettaglioCommissione")
public class CopiaCommissioneDettaglioController {

	@Autowired
	private CopiaCommissioneDettaglioService dettaglioService;

	@GetMapping("/{id}/findById")
	public ResponseEntity<CopiaCommissioneDettaglioDTO> getDettaglioCommissioneById(@PathVariable("id") Integer id) {
		ResponseEntity<CopiaCommissioneDettaglioDTO> resp = dettaglioService.getById(id);
		return resp;
	}

}
