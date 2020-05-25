package it.objectmethod.cceservicelayer.service.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import it.objectmethod.cceservicelayer.domain.LineaProdottoEntity;
import it.objectmethod.cceservicelayer.service.dto.LineaProdottoDTO;

@Component
public class LineaProdottoMapper implements EntityMapper<LineaProdottoDTO, LineaProdottoEntity> {

	@Override
	public LineaProdottoEntity toEntity(LineaProdottoDTO dto) {
		LineaProdottoEntity entity = new LineaProdottoEntity();
		entity.setCodice(dto.getCodice());
		entity.setDescrizione(dto.getDescrizione());
		entity.setId(dto.getId());
		entity.setProdotti(dto.getProdotti());
		return entity;
	}

	@Override
	public LineaProdottoDTO toDto(LineaProdottoEntity entity) {
		LineaProdottoDTO dto = new LineaProdottoDTO();
		dto.setCodice(entity.getCodice());
		dto.setDescrizione(entity.getDescrizione());
		dto.setId(entity.getId());
		dto.setProdotti(entity.getProdotti());
		return dto;
	}

	@Override
	public List<LineaProdottoEntity> toEntity(List<LineaProdottoDTO> dtoList) {
		List<LineaProdottoEntity> entityList = new ArrayList<>();
		for (LineaProdottoDTO dto : dtoList) {
			LineaProdottoEntity entity = new LineaProdottoEntity();
			entity.setCodice(dto.getCodice());
			entity.setDescrizione(dto.getDescrizione());
			entity.setId(dto.getId());
			entity.setProdotti(dto.getProdotti());
			entityList.add(entity);
		}
		return entityList;
	}

	@Override
	public List<LineaProdottoDTO> toDto(List<LineaProdottoEntity> entityList) {
		List<LineaProdottoDTO> dtoList = new ArrayList<>();
		for (LineaProdottoEntity entity : entityList) {
			LineaProdottoDTO dto = new LineaProdottoDTO();
			dto.setCodice(entity.getCodice());
			dto.setDescrizione(entity.getDescrizione());
			dto.setId(entity.getId());
			dto.setProdotti(entity.getProdotti());
			dtoList.add(dto);
		}
		return dtoList;
	}

}
