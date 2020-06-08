package it.objectmethod.cceservicelayer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import it.objectmethod.cceservicelayer.domain.CopiaCommissioneDettaglioEntity;
import it.objectmethod.cceservicelayer.domain.CopiaCommissioneEntity;
import it.objectmethod.cceservicelayer.repository.CopiaCommissioneRepository;
import it.objectmethod.cceservicelayer.service.dto.CopiaCommissioneDTO;
import it.objectmethod.cceservicelayer.service.mapper.CopiaCommissioneDettaglioMapper;
import it.objectmethod.cceservicelayer.service.mapper.CopiaCommissioneMapper;

@Component
public class CopiaCommissioneService {

	@Autowired
	private CopiaCommissioneRepository commissioneRepo;

	@Autowired
	private CopiaCommissioneMapper commissioneMapper;

	public ResponseEntity<CopiaCommissioneDTO> getCommissioneById(Integer id) {
		ResponseEntity<CopiaCommissioneDTO> resp = null;
		CopiaCommissioneDTO commissioneDTO = null;
		try {
			CopiaCommissioneEntity commissioneEntity = commissioneRepo.findById(id).get();
			commissioneDTO = commissioneMapper.toDto(commissioneEntity);
			resp = new ResponseEntity<>(commissioneDTO, HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return resp;
	}

	public ResponseEntity<CopiaCommissioneDTO> saveCopiaCommissione(CopiaCommissioneDTO dto) {
		ResponseEntity<CopiaCommissioneDTO> resp = null;
		CopiaCommissioneEntity entity = commissioneMapper.toEntity(dto);
		try {
			for (CopiaCommissioneDettaglioEntity dettagli : entity.getCommissioneDettaglio()) {
				dettagli.setCopiaCommissione(entity);
			}
			CopiaCommissioneDTO commissioneInserita = commissioneMapper.toDto(commissioneRepo.save(entity));
			resp = new ResponseEntity<>(commissioneInserita, HttpStatus.ACCEPTED);
		} catch (Exception e) {
			resp = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return resp;
	}
}
