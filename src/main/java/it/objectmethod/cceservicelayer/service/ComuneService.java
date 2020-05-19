package it.objectmethod.cceservicelayer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import it.objectmethod.cceservicelayer.domain.ComuneEntity;
import it.objectmethod.cceservicelayer.repository.ComuneRepository;
import it.objectmethod.cceservicelayer.service.dto.ComuneDTO;
import it.objectmethod.cceservicelayer.service.mapper.ComuneMapper;

@Component
public class ComuneService {

	@Autowired
	private ComuneRepository comuneRepo;

	@Autowired
	private ComuneMapper comuneMap;

	public ResponseEntity<List<ComuneDTO>> findAllByProvincia(String nomeProv) {
		List<ComuneDTO> comuniList = null;
		ResponseEntity<List<ComuneDTO>> resp = null;
		try {
			List<ComuneEntity> comuni = comuneRepo.findAllByProvincia(nomeProv);
			comuniList = comuneMap.toDto(comuni);
			resp = new ResponseEntity<>(comuniList, HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return resp;
	}

	public ResponseEntity<List<String>> getProvinceByRegione(String regione) {
		List<String> province = null;
		ResponseEntity<List<String>> resp = null;
		try {
			province = comuneRepo.findProvinceByRegione(regione);
			resp = new ResponseEntity<>(province, HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return resp;
	}

	public ResponseEntity<List<String>> getAllRegioni() {
		List<String> regioni = null;
		ResponseEntity<List<String>> resp = null;
		try {
			regioni = comuneRepo.getAllRegione();
			resp = new ResponseEntity<>(regioni, HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return resp;
	}

}
