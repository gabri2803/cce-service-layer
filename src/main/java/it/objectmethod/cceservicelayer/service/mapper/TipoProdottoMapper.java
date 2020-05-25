package it.objectmethod.cceservicelayer.service.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import it.objectmethod.cceservicelayer.domain.TipoProdottoEntity;
import it.objectmethod.cceservicelayer.service.dto.TipoProdottoDTO;

@Component
public class TipoProdottoMapper implements EntityMapper<TipoProdottoDTO, TipoProdottoEntity> {

	@Override
	public TipoProdottoEntity toEntity(TipoProdottoDTO dto) {
		TipoProdottoEntity entity = new TipoProdottoEntity();
		entity.setDescrizione(dto.getDescrizione());
		entity.setId(dto.getId());
		entity.setProdotti(dto.getProdotti());
		return entity;
	}

	@Override
	public TipoProdottoDTO toDto(TipoProdottoEntity entity) {
		TipoProdottoDTO dto = new TipoProdottoDTO();
		dto.setDescrizione(entity.getDescrizione());
		dto.setId(entity.getId());
		dto.setProdotti(entity.getProdotti());
		return dto;
	}

	@Override
	public List<TipoProdottoEntity> toEntity(List<TipoProdottoDTO> dtoList) {
		List<TipoProdottoEntity> entityList = new ArrayList<>();
		for (TipoProdottoDTO dto : dtoList) {
			TipoProdottoEntity entity = new TipoProdottoEntity();
			entity.setDescrizione(dto.getDescrizione());
			entity.setId(dto.getId());
			entity.setProdotti(dto.getProdotti());
			entityList.add(entity);
		}
		return entityList;
	}

	@Override
	public List<TipoProdottoDTO> toDto(List<TipoProdottoEntity> entityList) {
		List<TipoProdottoDTO> dtoList = new ArrayList<>();
		for (TipoProdottoEntity entity : entityList) {
			TipoProdottoDTO dto = new TipoProdottoDTO();
			dto.setDescrizione(entity.getDescrizione());
			dto.setId(entity.getId());
			dto.setProdotti(entity.getProdotti());
			dtoList.add(dto);
		}
		return dtoList;
	}

}
