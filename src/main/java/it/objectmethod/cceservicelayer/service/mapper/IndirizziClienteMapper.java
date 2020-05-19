package it.objectmethod.cceservicelayer.service.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.objectmethod.cceservicelayer.domain.IndirizziClienteEntity;
import it.objectmethod.cceservicelayer.repository.ClienteRepository;
import it.objectmethod.cceservicelayer.service.dto.IndirizziClienteDTO;

@Component
public class IndirizziClienteMapper implements EntityMapper<IndirizziClienteDTO, IndirizziClienteEntity> {

	@Autowired
	private ClienteRepository clienteRepo;

	@Override
	public IndirizziClienteEntity toEntity(IndirizziClienteDTO dto) {
		IndirizziClienteEntity entity = new IndirizziClienteEntity();
		entity.setCap(dto.getCap());
		entity.setCitta(dto.getCitta());
		entity.setAttivo(dto.isAttivo());
		entity.setDestinatario(dto.getDestinatario());
		entity.setFatturazione(dto.isFatturazione());
		entity.setId(dto.getId());
		entity.setIndirizzo(dto.getIndirizzo());
		entity.setNazione(dto.getNazione());
		entity.setProvincia(dto.getProvincia());
		entity.setCliente(clienteRepo.findById(dto.getClienteId()).get());
		return entity;
	}

	@Override
	public IndirizziClienteDTO toDto(IndirizziClienteEntity entity) {
		IndirizziClienteDTO dto = new IndirizziClienteDTO();
		dto.setAttivo(entity.isAttivo());
		dto.setCap(entity.getCap());
		dto.setCitta(entity.getCitta());
		dto.setClienteId(entity.getCliente().getId());
		dto.setCognomeCliente(entity.getCliente().getCognome());
		dto.setDestinatario(entity.getDestinatario());
		dto.setFatturazione(entity.isFatturazione());
		dto.setId(entity.getId());
		dto.setIndirizzo(entity.getIndirizzo());
		dto.setNazione(entity.getNazione());
		dto.setNomeCliente(entity.getCliente().getNome());
		dto.setProvincia(entity.getProvincia());
		return dto;
	}

	@Override
	public List<IndirizziClienteEntity> toEntity(List<IndirizziClienteDTO> dtoList) {
		List<IndirizziClienteEntity> entityList = new ArrayList<>();
		for (IndirizziClienteDTO dto : dtoList) {
			IndirizziClienteEntity entity = new IndirizziClienteEntity();
			entity.setCap(dto.getCap());
			entity.setCitta(dto.getCitta());
			entity.setAttivo(dto.isAttivo());
			entity.setDestinatario(dto.getDestinatario());
			entity.setFatturazione(dto.isFatturazione());
			entity.setId(dto.getId());
			entity.setIndirizzo(dto.getIndirizzo());
			entity.setNazione(dto.getNazione());
			entity.setProvincia(dto.getProvincia());
			entity.setCliente(clienteRepo.findById(dto.getClienteId()).get());
			entityList.add(entity);
		}
		return entityList;
	}

	@Override
	public List<IndirizziClienteDTO> toDto(List<IndirizziClienteEntity> entityList) {
		List<IndirizziClienteDTO> dtoList = new ArrayList<>();
		for (IndirizziClienteEntity entity : entityList) {
			IndirizziClienteDTO dto = new IndirizziClienteDTO();
			dto.setAttivo(entity.isAttivo());
			dto.setCap(entity.getCap());
			dto.setCitta(entity.getCitta());
			dto.setClienteId(entity.getCliente().getId());
			dto.setCognomeCliente(entity.getCliente().getCognome());
			dto.setDestinatario(entity.getDestinatario());
			dto.setFatturazione(entity.isFatturazione());
			dto.setId(entity.getId());
			dto.setIndirizzo(entity.getIndirizzo());
			dto.setNazione(entity.getNazione());
			dto.setNomeCliente(entity.getCliente().getNome());
			dto.setProvincia(entity.getProvincia());
			dtoList.add(dto);
		}
		return dtoList;
	}

}
