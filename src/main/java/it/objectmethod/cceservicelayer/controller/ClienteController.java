package it.objectmethod.cceservicelayer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.cceservicelayer.service.ClienteService;
import it.objectmethod.cceservicelayer.service.dto.ClienteDTO;

@RestController
@RequestMapping("service/cliente")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@GetMapping("/{id}/findById")
	public ResponseEntity<ClienteDTO> getClienteById(@PathVariable("id") int id) {
		ResponseEntity<ClienteDTO> resp = clienteService.getClienteById(id);
		return resp;
	}

	@GetMapping("/list")
	public ResponseEntity<List<ClienteDTO>> getAllClienti() {
		ResponseEntity<List<ClienteDTO>> resp = clienteService.getAll();
		return resp;
	}

}
