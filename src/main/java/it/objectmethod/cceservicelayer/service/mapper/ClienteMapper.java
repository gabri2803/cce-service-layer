package it.objectmethod.cceservicelayer.service.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import it.objectmethod.cceservicelayer.domain.ClienteEntity;
import it.objectmethod.cceservicelayer.service.dto.ClienteDTO;

@Component
public class ClienteMapper implements EntityMapper<ClienteDTO, ClienteEntity> {

	@Override
	public ClienteEntity toEntity(ClienteDTO dto) {
		ClienteEntity entity = new ClienteEntity();
		entity.setId(dto.getId());
		entity.setAbi(dto.getAbi());
		entity.setBancaAppoggio(dto.getBancaAppoggio());
		entity.setCab(dto.getCab());
		entity.setCellulare(dto.getCellulare());
		entity.setCodiceCliente(dto.getCodiceCliente());
		entity.setCodiceFiscale(dto.getCodiceFiscale());
		entity.setCodiceZona(dto.getCodiceZona());
		entity.setCognome(dto.getCognome());
		entity.setComuneNascita(dto.getComuneNascita());
		entity.setCondizioniPagamento(dto.getCondizioniPagamento());
		entity.setDataNascita(dto.getDataNascita());
		entity.setEmail(dto.getEmail());
		entity.setNome(dto.getNome());
		entity.setNote(dto.getNote());
		entity.setPartitaIva(dto.getPartitaIva());
		entity.setProvinciaNascita(dto.getProvinciaNascita());
		entity.setRagioneSociale(dto.getRagioneSociale());
		entity.setSesso(dto.getSesso());
		entity.setStato(dto.getStato());
		entity.setStatoNascita(dto.getStatoNascita());
		entity.setTelefono(dto.getTelefono());
		entity.setTipo(dto.getTipo());
		return entity;
	}

	@Override
	public ClienteDTO toDto(ClienteEntity entity) {
		ClienteDTO dto = new ClienteDTO();
		dto.setId(entity.getId());
		dto.setAbi(entity.getAbi());
		dto.setBancaAppoggio(entity.getBancaAppoggio());
		dto.setCab(entity.getCab());
		dto.setCellulare(entity.getCellulare());
		dto.setCodiceCliente(entity.getCodiceCliente());
		dto.setCodiceFiscale(entity.getCodiceFiscale());
		dto.setCodiceZona(entity.getCodiceZona());
		dto.setCognome(entity.getCognome());
		dto.setComuneNascita(entity.getComuneNascita());
		dto.setCondizioniPagamento(entity.getCondizioniPagamento());
		dto.setDataNascita(entity.getDataNascita());
		dto.setEmail(entity.getEmail());
		dto.setNome(entity.getNome());
		dto.setNote(entity.getNote());
		dto.setPartitaIva(entity.getPartitaIva());
		dto.setProvinciaNascita(entity.getProvinciaNascita());
		dto.setRagioneSociale(entity.getRagioneSociale());
		dto.setSesso(entity.getSesso());
		dto.setStato(entity.getStato());
		dto.setStatoNascita(entity.getStatoNascita());
		dto.setTelefono(entity.getTelefono());
		dto.setTipo(entity.getTipo());
		return dto;
	}

	@Override
	public List<ClienteEntity> toEntity(List<ClienteDTO> dtoList) {
		List<ClienteEntity> entityList = new ArrayList<>();
		for (ClienteDTO dto : dtoList) {
			ClienteEntity entity = new ClienteEntity();
			entity.setId(dto.getId());
			entity.setAbi(dto.getAbi());
			entity.setBancaAppoggio(dto.getBancaAppoggio());
			entity.setCab(dto.getCab());
			entity.setCellulare(dto.getCellulare());
			entity.setCodiceCliente(dto.getCodiceCliente());
			entity.setCodiceFiscale(dto.getCodiceFiscale());
			entity.setCodiceZona(dto.getCodiceZona());
			entity.setCognome(dto.getCognome());
			entity.setComuneNascita(dto.getComuneNascita());
			entity.setCondizioniPagamento(dto.getCondizioniPagamento());
			entity.setDataNascita(dto.getDataNascita());
			entity.setEmail(dto.getEmail());
			entity.setNome(dto.getNome());
			entity.setNote(dto.getNote());
			entity.setPartitaIva(dto.getPartitaIva());
			entity.setProvinciaNascita(dto.getProvinciaNascita());
			entity.setRagioneSociale(dto.getRagioneSociale());
			entity.setSesso(dto.getSesso());
			entity.setStato(dto.getStato());
			entity.setStatoNascita(dto.getStatoNascita());
			entity.setTelefono(dto.getTelefono());
			entity.setTipo(dto.getTipo());
			entityList.add(entity);
		}
		return entityList;
	}

	@Override
	public List<ClienteDTO> toDto(List<ClienteEntity> entityList) {
		List<ClienteDTO> dtoList = new ArrayList<>();
		for (ClienteEntity entity : entityList) {
			ClienteDTO dto = new ClienteDTO();
			dto.setId(entity.getId());
			dto.setAbi(entity.getAbi());
			dto.setBancaAppoggio(entity.getBancaAppoggio());
			dto.setCab(entity.getCab());
			dto.setCellulare(entity.getCellulare());
			dto.setCodiceCliente(entity.getCodiceCliente());
			dto.setCodiceFiscale(entity.getCodiceFiscale());
			dto.setCodiceZona(entity.getCodiceZona());
			dto.setCognome(entity.getCognome());
			dto.setComuneNascita(entity.getComuneNascita());
			dto.setCondizioniPagamento(entity.getCondizioniPagamento());
			dto.setDataNascita(entity.getDataNascita());
			dto.setEmail(entity.getEmail());
			dto.setNome(entity.getNome());
			dto.setNote(entity.getNote());
			dto.setPartitaIva(entity.getPartitaIva());
			dto.setProvinciaNascita(entity.getProvinciaNascita());
			dto.setRagioneSociale(entity.getRagioneSociale());
			dto.setSesso(entity.getSesso());
			dto.setStato(entity.getStato());
			dto.setStatoNascita(entity.getStatoNascita());
			dto.setTelefono(entity.getTelefono());
			dto.setTipo(entity.getTipo());
			dtoList.add(dto);
		}
		return dtoList;
	}

}
