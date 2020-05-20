package it.objectmethod.cceservicelayer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import it.objectmethod.cceservicelayer.repository.IndirizziClienteRepository;
import it.objectmethod.cceservicelayer.service.dto.IndirizziClienteDTO;
import it.objectmethod.cceservicelayer.service.mapper.IndirizziClienteMapper;

@Component
public class IndirizziClienteService {

	@Autowired
	private IndirizziClienteRepository indirizziRepo;

	@Autowired
	private IndirizziClienteMapper indirizziMapper;

	public ResponseEntity<List<IndirizziClienteDTO>> getAllByClienteId(int clienteId) {
		ResponseEntity<List<IndirizziClienteDTO>> resp = null;
		try {
			List<IndirizziClienteDTO> indirizziCliente = indirizziMapper
					.toDto(indirizziRepo.findAllByClienteId(clienteId));
			resp = new ResponseEntity<>(indirizziCliente, HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return resp;

	}
}
