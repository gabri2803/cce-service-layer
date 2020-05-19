package it.objectmethod.cceservicelayer.service.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import it.objectmethod.cceservicelayer.domain.ComuneEntity;
import it.objectmethod.cceservicelayer.service.dto.ComuneDTO;

@Component
public class ComuneMapper implements EntityMapper<ComuneDTO, ComuneEntity> {

	@Override
	public ComuneEntity toEntity(ComuneDTO dto) {
		ComuneEntity entity = new ComuneEntity();
		entity.setAbitanti(dto.getAbitanti());
		entity.setCap(dto.getCap());
		entity.setCodFisco(dto.getCodFisco());
		entity.setIstat(dto.getIstat());
		entity.setNome(dto.getNome());
		entity.setLink(dto.getLink());
		entity.setPrefisso(dto.getPrefisso());
		entity.setProvincia(dto.getProvincia());
		entity.setRegione(dto.getRegione());
		return entity;
	}

	@Override
	public ComuneDTO toDto(ComuneEntity entity) {
		ComuneDTO dto = new ComuneDTO();
		dto.setAbitanti(entity.getAbitanti());
		dto.setCap(entity.getCap());
		dto.setCodFisco(entity.getCodFisco());
		dto.setIstat(entity.getIstat());
		dto.setLink(entity.getLink());
		dto.setNome(entity.getNome());
		dto.setPrefisso(entity.getPrefisso());
		dto.setProvincia(entity.getProvincia());
		dto.setRegione(entity.getRegione());
		return dto;
	}

	@Override
	public List<ComuneEntity> toEntity(List<ComuneDTO> dtoList) {
		List<ComuneEntity> entityList = new ArrayList<>();
		ComuneEntity entity = new ComuneEntity();
		for (ComuneDTO dto : dtoList) {
			entity.setAbitanti(dto.getAbitanti());
			entity.setCap(dto.getCap());
			entity.setCodFisco(dto.getCodFisco());
			entity.setIstat(dto.getIstat());
			entity.setNome(dto.getNome());
			entity.setLink(dto.getLink());
			entity.setPrefisso(dto.getPrefisso());
			entity.setProvincia(dto.getProvincia());
			entity.setRegione(dto.getRegione());
			entityList.add(entity);
		}
		return entityList;
	}

	@Override
	public List<ComuneDTO> toDto(List<ComuneEntity> entityList) {
		List<ComuneDTO> dtoList = new ArrayList<>();
		ComuneDTO dto = new ComuneDTO();
		for (ComuneEntity entity : entityList) {
			dto.setAbitanti(entity.getAbitanti());
			dto.setCap(entity.getCap());
			dto.setCodFisco(entity.getCodFisco());
			dto.setIstat(entity.getIstat());
			dto.setNome(entity.getNome());
			dto.setLink(entity.getLink());
			dto.setPrefisso(entity.getPrefisso());
			dto.setProvincia(entity.getProvincia());
			dto.setRegione(entity.getRegione());
			dtoList.add(dto);
		}
		return dtoList;
	}

}
