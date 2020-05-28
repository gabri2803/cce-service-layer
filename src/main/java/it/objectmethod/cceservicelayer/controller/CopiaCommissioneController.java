package it.objectmethod.cceservicelayer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.cceservicelayer.service.CopiaCommissioneService;
import it.objectmethod.cceservicelayer.service.dto.CopiaCommissioneDTO;

@RestController
@RequestMapping("service/copiaCommissione")
public class CopiaCommissioneController {

	@Autowired
	private CopiaCommissioneService commissioneService;

	@GetMapping("/{id}/getById")
	public ResponseEntity<CopiaCommissioneDTO> getById(@PathVariable("id") Integer id) {
		ResponseEntity<CopiaCommissioneDTO> resp = commissioneService.getCommissioneById(id);
		return resp;
	}

	@PostMapping("/save")
	public ResponseEntity<CopiaCommissioneDTO> saveCopiaCommissione(
			@RequestBody(required = false) CopiaCommissioneDTO dto) {
		ResponseEntity<CopiaCommissioneDTO> resp = commissioneService.saveCopiaCommissione(dto);
		return resp;
	}

//	@DeleteMapping("{idCommissione}/delete")
//	public ResponseEntity<CopiaCommissioneDTO> deleteCopiaCommissione(@PathVariable("idCommissione") int id) {
//		ResponseEntity<CopiaCommissioneDTO> resp = commissioneService.deleteCopiaCommissione(id);
//		return resp;
//	}
}
