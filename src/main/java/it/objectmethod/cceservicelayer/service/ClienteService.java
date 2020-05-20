package it.objectmethod.cceservicelayer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import it.objectmethod.cceservicelayer.domain.ClienteEntity;
import it.objectmethod.cceservicelayer.domain.IndirizziClienteEntity;
import it.objectmethod.cceservicelayer.repository.ClienteRepository;
import it.objectmethod.cceservicelayer.service.dto.ClienteDTO;
import it.objectmethod.cceservicelayer.service.mapper.ClienteMapper;
import it.objectmethod.cceservicelayer.service.mapper.IndirizziClienteMapper;

@Component
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepo;

	@Autowired
	private ClienteMapper clienteMapper;

	@Autowired
	private IndirizziClienteMapper indirizziMapper;

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

	public ResponseEntity<ClienteDTO> saveCliente(ClienteEntity c) {
		ResponseEntity<ClienteDTO> resp = null;
		try {
			for (IndirizziClienteEntity indirizzi : c.getIndirizzi()) {
				indirizzi.setCliente(c);
			}
			ClienteDTO clienteSalvato = clienteMapper.toDto(clienteRepo.save(c));
			resp = new ResponseEntity<>(clienteSalvato, HttpStatus.ACCEPTED);
		} catch (Exception e) {
			System.out.println(e);
			resp = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return resp;
	}

	public ResponseEntity<ClienteDTO> deleteCliente(int id) {
		ResponseEntity<ClienteDTO> resp = null;
		try {
			clienteRepo.deleteById(id);
			resp = new ResponseEntity<>(HttpStatus.ACCEPTED);
		} catch (Exception e) {
			resp = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return resp;

	}

}
