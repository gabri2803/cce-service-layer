package it.objectmethod.cceservicelayer.service.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import it.objectmethod.cceservicelayer.domain.CondizioniPagamentoEntity;
import it.objectmethod.cceservicelayer.service.dto.CondizioniPagamentoDTO;

@Component
public class CondizioniPagamentoMapper implements EntityMapper<CondizioniPagamentoDTO, CondizioniPagamentoEntity> {

	@Override
	public CondizioniPagamentoEntity toEntity(CondizioniPagamentoDTO dto) {
		CondizioniPagamentoEntity entity = new CondizioniPagamentoEntity();
		entity.setAttivo(dto.isAttivo());
		entity.setCodice(dto.getCodice());
		entity.setCopiaCommissione(dto.getCopiaCommissione());
		entity.setDescrizione(dto.getDescrizione());
		entity.setId(dto.getId());
		entity.setSpesa(dto.getSpesa());
		return entity;
	}

	@Override
	public CondizioniPagamentoDTO toDto(CondizioniPagamentoEntity entity) {
		CondizioniPagamentoDTO dto = new CondizioniPagamentoDTO();
		dto.setAttivo(entity.isAttivo());
		dto.setCodice(entity.getCodice());
		dto.setCopiaCommissione(entity.getCopiaCommissione());
		dto.setDescrizione(entity.getDescrizione());
		dto.setId(entity.getId());
		dto.setSpesa(entity.getSpesa());
		return dto;
	}

	@Override
	public List<CondizioniPagamentoEntity> toEntity(List<CondizioniPagamentoDTO> dtoList) {
		List<CondizioniPagamentoEntity> entityList = new ArrayList<>();
		for (CondizioniPagamentoDTO dto : dtoList) {
			CondizioniPagamentoEntity entity = new CondizioniPagamentoEntity();
			entity.setAttivo(dto.isAttivo());
			entity.setCodice(dto.getCodice());
			entity.setCopiaCommissione(dto.getCopiaCommissione());
			entity.setDescrizione(dto.getDescrizione());
			entity.setId(dto.getId());
			entity.setSpesa(dto.getSpesa());
			entityList.add(entity);
		}
		return entityList;
	}

	@Override
	public List<CondizioniPagamentoDTO> toDto(List<CondizioniPagamentoEntity> entityList) {
		List<CondizioniPagamentoDTO> dtoList = new ArrayList<>();
		for (CondizioniPagamentoEntity entity : entityList) {
			CondizioniPagamentoDTO dto = new CondizioniPagamentoDTO();
			dto.setAttivo(entity.isAttivo());
			dto.setCodice(entity.getCodice());
			dto.setCopiaCommissione(entity.getCopiaCommissione());
			dto.setDescrizione(entity.getDescrizione());
			dto.setId(entity.getId());
			dto.setSpesa(entity.getSpesa());
			dtoList.add(dto);
		}
		return dtoList;
	}

}
