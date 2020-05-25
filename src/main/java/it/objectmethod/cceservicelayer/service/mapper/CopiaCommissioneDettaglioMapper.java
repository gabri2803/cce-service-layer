package it.objectmethod.cceservicelayer.service.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.objectmethod.cceservicelayer.domain.CopiaCommissioneDettaglioEntity;
import it.objectmethod.cceservicelayer.repository.CopiaCommissioneRepository;
import it.objectmethod.cceservicelayer.repository.ProdottoRepository;
import it.objectmethod.cceservicelayer.service.dto.CopiaCommissioneDettaglioDTO;

@Component
public class CopiaCommissioneDettaglioMapper
		implements EntityMapper<CopiaCommissioneDettaglioDTO, CopiaCommissioneDettaglioEntity> {

	@Autowired
	private CopiaCommissioneRepository copiaCommissioneRepo;

	@Autowired
	private ProdottoRepository prodottoRepo;

	@Override
	public CopiaCommissioneDettaglioEntity toEntity(CopiaCommissioneDettaglioDTO dto) {
		CopiaCommissioneDettaglioEntity entity = new CopiaCommissioneDettaglioEntity();
		entity.setCopiaCommissione(copiaCommissioneRepo.findById(dto.getIdCopiaCommissione()).get());
		entity.setEvaso(dto.getEvaso());
		entity.setId(dto.getId());
		entity.setImporto(dto.getImporto());
		entity.setImportoScontato(dto.getImportoScontato());
		entity.setPezziInviati(dto.getPezziInviati());
		entity.setPrezzoSingolo(dto.getPrezzoSingolo());
		entity.setProdotto(prodottoRepo.findById(dto.getIdProdotto()).get());
		entity.setSconto(dto.getSconto());
		entity.setTotPezzi(dto.getTotPezzi());
		return entity;
	}

	@Override
	public CopiaCommissioneDettaglioDTO toDto(CopiaCommissioneDettaglioEntity entity) {
		CopiaCommissioneDettaglioDTO dto = new CopiaCommissioneDettaglioDTO();
		dto.setIdCopiaCommissione(entity.getCopiaCommissione().getId());
		dto.setEvaso(entity.getEvaso());
		dto.setId(entity.getId());
		dto.setImporto(entity.getImporto());
		dto.setImportoScontato(entity.getImportoScontato());
		dto.setPezziInviati(entity.getPezziInviati());
		dto.setPrezzoSingolo(entity.getPrezzoSingolo());
		dto.setIdProdotto(entity.getProdotto().getId());
		dto.setSconto(entity.getSconto());
		dto.setTotPezzi(entity.getTotPezzi());
		return dto;
	}

	@Override
	public List<CopiaCommissioneDettaglioEntity> toEntity(List<CopiaCommissioneDettaglioDTO> dtoList) {
		List<CopiaCommissioneDettaglioEntity> entityList = new ArrayList<>();
		for (CopiaCommissioneDettaglioDTO dto : dtoList) {
			CopiaCommissioneDettaglioEntity entity = new CopiaCommissioneDettaglioEntity();
			entity.setCopiaCommissione(copiaCommissioneRepo.findById(dto.getIdCopiaCommissione()).get());
			entity.setEvaso(dto.getEvaso());
			entity.setId(dto.getId());
			entity.setImporto(dto.getImporto());
			entity.setImportoScontato(dto.getImportoScontato());
			entity.setPezziInviati(dto.getPezziInviati());
			entity.setPrezzoSingolo(dto.getPrezzoSingolo());
			entity.setProdotto(prodottoRepo.findById(dto.getIdProdotto()).get());
			entity.setSconto(dto.getSconto());
			entity.setTotPezzi(dto.getTotPezzi());
			entityList.add(entity);
		}
		return entityList;
	}

	@Override
	public List<CopiaCommissioneDettaglioDTO> toDto(List<CopiaCommissioneDettaglioEntity> entityList) {
		List<CopiaCommissioneDettaglioDTO> dtoList = new ArrayList<>();
		for (CopiaCommissioneDettaglioEntity entity : entityList) {
			CopiaCommissioneDettaglioDTO dto = new CopiaCommissioneDettaglioDTO();
			dto.setIdCopiaCommissione(entity.getCopiaCommissione().getId());
			dto.setEvaso(entity.getEvaso());
			dto.setId(entity.getId());
			dto.setImporto(entity.getImporto());
			dto.setImportoScontato(entity.getImportoScontato());
			dto.setPezziInviati(entity.getPezziInviati());
			dto.setPrezzoSingolo(entity.getPrezzoSingolo());
			dto.setIdProdotto(entity.getProdotto().getId());
			dto.setSconto(entity.getSconto());
			dto.setTotPezzi(entity.getTotPezzi());
			dtoList.add(dto);
		}
		return dtoList;
	}

}
