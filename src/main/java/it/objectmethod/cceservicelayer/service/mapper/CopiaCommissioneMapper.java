package it.objectmethod.cceservicelayer.service.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.objectmethod.cceservicelayer.domain.CopiaCommissioneEntity;
import it.objectmethod.cceservicelayer.repository.ClienteRepository;
import it.objectmethod.cceservicelayer.repository.CondizioniPagamentoRepository;
import it.objectmethod.cceservicelayer.service.dto.CopiaCommissioneDTO;

@Component
public class CopiaCommissioneMapper implements EntityMapper<CopiaCommissioneDTO, CopiaCommissioneEntity> {

	@Autowired
	private ClienteRepository clienteRepo;

	@Autowired
	private CondizioniPagamentoRepository condizioniPagamentoRepo;

	@Override
	public CopiaCommissioneEntity toEntity(CopiaCommissioneDTO dto) {
		CopiaCommissioneEntity entity = new CopiaCommissioneEntity();
		entity.setId(dto.getId());
		entity.setCommissioneDettaglio(dto.getCommissioneDettaglio());
		entity.setData(dto.getData());
		entity.setEsportato(dto.getEsportato());
		entity.setEvaso(dto.getEvaso());
		entity.setImportoTot(dto.getImportoTot());
		entity.setImportoTotScontato(dto.getImportoTotScontato());
		entity.setMezzoConsegnaVettore(dto.getMezzoConsegnaVettore());
		entity.setNote(dto.getNote());
		entity.setNumero(dto.getNumero());
		entity.setRagioneSocialeCliente(dto.getRagioneSocialeCliente());
		entity.setSpesaIncasso(dto.getSpesaIncasso());
		entity.setStato(dto.getStato());
		entity.setCliente(clienteRepo.findById(dto.getIdCliente()).get());
		entity.setCondizioniPagamento(condizioniPagamentoRepo.findById(dto.getIdCondizioniPagamento()).get());
		return entity;
	}

	@Override
	public CopiaCommissioneDTO toDto(CopiaCommissioneEntity entity) {
		CopiaCommissioneDTO dto = new CopiaCommissioneDTO();
		dto.setId(entity.getId());
		dto.setIdCliente(entity.getCliente().getId());
		dto.setCommissioneDettaglio(entity.getCommissioneDettaglio());
		dto.setIdCondizioniPagamento(entity.getCondizioniPagamento().getId());
		dto.setData(entity.getData());
		dto.setEsportato(entity.getEsportato());
		dto.setEvaso(entity.getEvaso());
		dto.setImportoTot(entity.getImportoTot());
		dto.setImportoTotScontato(entity.getImportoTotScontato());
		dto.setMezzoConsegnaVettore(entity.getMezzoConsegnaVettore());
		dto.setNote(entity.getNote());
		dto.setNumero(entity.getNumero());
		dto.setRagioneSocialeCliente(entity.getRagioneSocialeCliente());
		dto.setSpesaIncasso(entity.getSpesaIncasso());
		dto.setStato(entity.getStato());
		return dto;
	}

	@Override
	public List<CopiaCommissioneEntity> toEntity(List<CopiaCommissioneDTO> dtoList) {
		List<CopiaCommissioneEntity> entityList = new ArrayList<>();
		for (CopiaCommissioneDTO dto : dtoList) {
			CopiaCommissioneEntity entity = new CopiaCommissioneEntity();
			entity.setId(dto.getId());
			entity.setCommissioneDettaglio(dto.getCommissioneDettaglio());
			entity.setData(dto.getData());
			entity.setEsportato(dto.getEsportato());
			entity.setEvaso(dto.getEvaso());
			entity.setImportoTot(dto.getImportoTot());
			entity.setImportoTotScontato(dto.getImportoTotScontato());
			entity.setMezzoConsegnaVettore(dto.getMezzoConsegnaVettore());
			entity.setNote(dto.getNote());
			entity.setNumero(dto.getNumero());
			entity.setRagioneSocialeCliente(dto.getRagioneSocialeCliente());
			entity.setSpesaIncasso(dto.getSpesaIncasso());
			entity.setStato(dto.getStato());
			entity.setCliente(clienteRepo.findById(dto.getIdCliente()).get());
			entity.setCondizioniPagamento(condizioniPagamentoRepo.findById(dto.getIdCondizioniPagamento()).get());
			entityList.add(entity);
		}
		return entityList;
	}

	@Override
	public List<CopiaCommissioneDTO> toDto(List<CopiaCommissioneEntity> entityList) {
		List<CopiaCommissioneDTO> dtoList = new ArrayList<>();
		for (CopiaCommissioneEntity entity : entityList) {
			CopiaCommissioneDTO dto = new CopiaCommissioneDTO();
			dto.setId(entity.getId());
			dto.setIdCliente(entity.getCliente().getId());
			dto.setIdCondizioniPagamento(entity.getCondizioniPagamento().getId());
			dto.setCommissioneDettaglio(entity.getCommissioneDettaglio());
			dto.setData(entity.getData());
			dto.setEsportato(entity.getEsportato());
			dto.setEvaso(entity.getEvaso());
			dto.setImportoTot(entity.getImportoTot());
			dto.setImportoTotScontato(entity.getImportoTotScontato());
			dto.setMezzoConsegnaVettore(entity.getMezzoConsegnaVettore());
			dto.setNote(entity.getNote());
			dto.setNumero(entity.getNumero());
			dto.setRagioneSocialeCliente(entity.getRagioneSocialeCliente());
			dto.setSpesaIncasso(entity.getSpesaIncasso());
			dto.setStato(entity.getStato());
			dtoList.add(dto);
		}
		return dtoList;
	}

}
