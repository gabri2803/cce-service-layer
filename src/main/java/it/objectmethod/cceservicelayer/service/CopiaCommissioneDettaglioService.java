package it.objectmethod.cceservicelayer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import it.objectmethod.cceservicelayer.repository.CopiaCommissioneDettaglioRepository;
import it.objectmethod.cceservicelayer.service.dto.CopiaCommissioneDettaglioDTO;
import it.objectmethod.cceservicelayer.service.mapper.CopiaCommissioneDettaglioMapper;

@Component
public class CopiaCommissioneDettaglioService {

	@Autowired
	private CopiaCommissioneDettaglioRepository dettaglioRepo;

	@Autowired
	private CopiaCommissioneDettaglioMapper dettaglioMapper;

	public ResponseEntity<CopiaCommissioneDettaglioDTO> getById(Integer id) {
		ResponseEntity<CopiaCommissioneDettaglioDTO> resp = null;
		CopiaCommissioneDettaglioDTO dettaglioDto = null;
		try {
			dettaglioDto = dettaglioMapper.toDto(dettaglioRepo.findById(id).get());
			resp = new ResponseEntity<>(dettaglioDto, HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return resp;
	}

	public ResponseEntity<List<CopiaCommissioneDettaglioDTO>> getAllByIdCommissione(Integer idComm) {
		ResponseEntity<List<CopiaCommissioneDettaglioDTO>> resp = null;
		List<CopiaCommissioneDettaglioDTO> dettaglioDto = null;
		try {
			dettaglioDto = dettaglioMapper.toDto(dettaglioRepo.findAllByCopiaCommissioneId(idComm));
			resp = new ResponseEntity<>(dettaglioDto, HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return resp;
	}
}
