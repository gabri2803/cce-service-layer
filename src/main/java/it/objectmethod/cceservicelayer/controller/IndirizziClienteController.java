package it.objectmethod.cceservicelayer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.cceservicelayer.service.IndirizziClienteService;
import it.objectmethod.cceservicelayer.service.dto.IndirizziClienteDTO;

@RestController
@RequestMapping("service/indirizzi")
public class IndirizziClienteController {

	@Autowired
	private IndirizziClienteService indirizziService;

	@GetMapping("/{idCliente}/find-all-by-idCliente")
	public ResponseEntity<List<IndirizziClienteDTO>> getIndirizziByCliente(@PathVariable("idCliente") int idCliente) {
		ResponseEntity<List<IndirizziClienteDTO>> resp = indirizziService.getAllByClienteId(idCliente);
		return resp;
	}
}
