package it.objectmethod.cceservicelayer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.cceservicelayer.service.ComuneService;
import it.objectmethod.cceservicelayer.service.dto.ComuneDTO;

@RestController
@RequestMapping("service/comune")
public class ComuneController {

	@Autowired
	private ComuneService comuneService;

	@GetMapping("/list-by-prov/{nomeProv}/comuni")
	public ResponseEntity<List<ComuneDTO>> getComuniByProvincia(@PathVariable("nomeProv") String provincia) {
		ResponseEntity<List<ComuneDTO>> resp = comuneService.findAllByProvincia(provincia);
		return resp;
	}

	@GetMapping("/list-by-regione/{nomeReg}/province")
	public ResponseEntity<List<String>> getRegioniByProvincia(@PathVariable("nomeReg") String regione) {
		ResponseEntity<List<String>> resp = comuneService.getProvinceByRegione(regione);
		return resp;
	}

	@GetMapping("/lista-regioni")
	public ResponseEntity<List<String>> getAllRegioni() {
		ResponseEntity<List<String>> resp = comuneService.getAllRegioni();
		return resp;
	}

}
