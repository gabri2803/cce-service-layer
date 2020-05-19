package it.objectmethod.cceservicelayer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import it.objectmethod.cceservicelayer.domain.ClienteEntity;
import it.objectmethod.cceservicelayer.repository.ClienteRepository;
import it.objectmethod.cceservicelayer.service.dto.ClienteDTO;
import it.objectmethod.cceservicelayer.service.mapper.ClienteMapper;

@Component
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepo;

	@Autowired
	private ClienteMapper clienteMapper;

	public ResponseEntity<ClienteDTO> getClienteById(int id) {
		ResponseEntity<ClienteDTO> resp = null;
		ClienteDTO cliente = null;
		try {
			ClienteEntity cli = clienteRepo.findById(id).get();
			cliente = clienteMapper.toDto(cli);
			resp = new ResponseEntity<>(cliente, HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return resp;
	}

	public ResponseEntity<List<ClienteDTO>> getAll() {
		ResponseEntity<List<ClienteDTO>> resp = null;
		List<ClienteDTO> clienti = null;
		try {
			List<ClienteEntity> clientiList = clienteRepo.findAll();
			clienti = clienteMapper.toDto(clientiList);
			resp = new ResponseEntity<>(clienti, HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return resp;
	}

}
