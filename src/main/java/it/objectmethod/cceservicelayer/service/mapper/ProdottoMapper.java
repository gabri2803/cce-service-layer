package it.objectmethod.cceservicelayer.service.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.objectmethod.cceservicelayer.domain.ProdottoEntity;
import it.objectmethod.cceservicelayer.repository.TipoProdottoRepository;
import it.objectmethod.cceservicelayer.service.dto.ProdottoDTO;

@Component
public class ProdottoMapper implements EntityMapper<ProdottoDTO, ProdottoEntity> {

	@Autowired
	private TipoProdottoRepository tipoProdottoRepo;

	@Override
	public ProdottoEntity toEntity(ProdottoDTO dto) {
		ProdottoEntity entity = new ProdottoEntity();
		entity.setAttivo(dto.getAttivo());
		entity.setBarcode(dto.getBarcode());
		entity.setBarcodeCfCt(dto.getBarcodeCfCt());
		entity.setCodice(dto.getCodice());
		entity.setDataCreazione(dto.getDataCreazione());
		entity.setDataUltimaModifica(dto.getDataUltimaModifica());
		entity.setDescrizione(dto.getDescrizione());
		entity.setDescrizioneBreve(dto.getDescrizioneBreve());
		entity.setDescrizioneInglese(dto.getDescrizioneInglese());
		entity.setDescrizioneSito(dto.getDescrizioneSito());
		entity.setErogatore(dto.getErogatore());
		entity.setEsportato(dto.getEsportato());
		entity.setEsportatoPbb(dto.getEsportatoPbb());
		entity.setFormato(dto.getFormato());
		entity.setFornitore(dto.getFornitore());
		entity.setGiacenza(dto.getGiacenza());
		entity.setId(dto.getId());
		entity.setImmagine(dto.getImmagine());
		entity.setLinea(dto.getLinea());
		entity.setLineaInglese(dto.getLineaInglese());
		entity.setModoUso(dto.getModoUso());
		entity.setMolteplicita(dto.getMolteplicita());
		entity.setMolteplicitaCfCt(dto.getMolteplicitaCfCt());
		entity.setNumerazione(dto.getNumerazione());
		entity.setOmaggio(dto.getOmaggio());
		entity.setPathBrochure(dto.getPathBrochure());
		entity.setPesoLordo(dto.getPesoLordo());
		entity.setPesoLordoCfCt(dto.getPesoLordoCfCt());
		entity.setPrezzo(dto.getPrezzo());
		entity.setTipoProdotto(tipoProdottoRepo.findById(dto.getIdTipoProdotto()).get());
		entity.setVolume(dto.getVolume());
		entity.setVolumeProdotto(dto.getVolumeProdotto());
		entity.setWeb(dto.getWeb());
		return entity;
	}

	@Override
	public ProdottoDTO toDto(ProdottoEntity entity) {
		ProdottoDTO dto = new ProdottoDTO();
		dto.setAttivo(entity.getAttivo());
		dto.setBarcode(entity.getBarcode());
		dto.setBarcodeCfCt(entity.getBarcodeCfCt());
		dto.setCodice(entity.getCodice());
		dto.setDataCreazione(entity.getDataCreazione());
		dto.setDataUltimaModifica(entity.getDataUltimaModifica());
		dto.setDescrizione(entity.getDescrizione());
		dto.setDescrizioneBreve(entity.getDescrizioneBreve());
		dto.setDescrizioneInglese(entity.getDescrizioneInglese());
		dto.setDescrizioneSito(entity.getDescrizioneSito());
		dto.setErogatore(entity.getErogatore());
		dto.setEsportato(entity.getEsportato());
		dto.setEsportatoPbb(entity.getEsportatoPbb());
		dto.setFormato(entity.getFormato());
		dto.setFornitore(entity.getFornitore());
		dto.setGiacenza(entity.getGiacenza());
		dto.setId(entity.getId());
		dto.setImmagine(entity.getImmagine());
		dto.setLinea(entity.getLinea());
		dto.setLineaInglese(entity.getLineaInglese());
		dto.setModoUso(entity.getModoUso());
		dto.setMolteplicita(entity.getMolteplicita());
		dto.setMolteplicitaCfCt(entity.getMolteplicitaCfCt());
		dto.setNumerazione(entity.getNumerazione());
		dto.setOmaggio(entity.getOmaggio());
		dto.setPathBrochure(entity.getPathBrochure());
		dto.setPesoLordo(entity.getPesoLordo());
		dto.setPesoLordoCfCt(entity.getPesoLordoCfCt());
		dto.setPrezzo(entity.getPrezzo());
		dto.setIdTipoProdotto(entity.getTipoProdotto().getId());
		dto.setVolume(entity.getVolume());
		dto.setVolumeProdotto(entity.getVolumeProdotto());
		dto.setWeb(entity.getWeb());
		return dto;
	}

	@Override
	public List<ProdottoEntity> toEntity(List<ProdottoDTO> dtoList) {
		List<ProdottoEntity> entityList = new ArrayList<>();
		for (ProdottoDTO dto : dtoList) {
			ProdottoEntity entity = new ProdottoEntity();
			entity.setAttivo(dto.getAttivo());
			entity.setBarcode(dto.getBarcode());
			entity.setBarcodeCfCt(dto.getBarcodeCfCt());
			entity.setCodice(dto.getCodice());
			entity.setDataCreazione(dto.getDataCreazione());
			entity.setDataUltimaModifica(dto.getDataUltimaModifica());
			entity.setDescrizione(dto.getDescrizione());
			entity.setDescrizioneBreve(dto.getDescrizioneBreve());
			entity.setDescrizioneInglese(dto.getDescrizioneInglese());
			entity.setDescrizioneSito(dto.getDescrizioneSito());
			entity.setErogatore(dto.getErogatore());
			entity.setEsportato(dto.getEsportato());
			entity.setEsportatoPbb(dto.getEsportatoPbb());
			entity.setFormato(dto.getFormato());
			entity.setFornitore(dto.getFornitore());
			entity.setGiacenza(dto.getGiacenza());
			entity.setId(dto.getId());
			entity.setImmagine(dto.getImmagine());
			entity.setLinea(dto.getLinea());
			entity.setLineaInglese(dto.getLineaInglese());
			entity.setModoUso(dto.getModoUso());
			entity.setMolteplicita(dto.getMolteplicita());
			entity.setMolteplicitaCfCt(dto.getMolteplicitaCfCt());
			entity.setNumerazione(dto.getNumerazione());
			entity.setOmaggio(dto.getOmaggio());
			entity.setPathBrochure(dto.getPathBrochure());
			entity.setPesoLordo(dto.getPesoLordo());
			entity.setPesoLordoCfCt(dto.getPesoLordoCfCt());
			entity.setPrezzo(dto.getPrezzo());
			entity.setVolume(dto.getVolume());
			entity.setVolumeProdotto(dto.getVolumeProdotto());
			entity.setWeb(dto.getWeb());
			entity.setTipoProdotto(tipoProdottoRepo.findById(dto.getIdTipoProdotto()).get());
			entityList.add(entity);
		}
		return entityList;
	}

	@Override
	public List<ProdottoDTO> toDto(List<ProdottoEntity> entityList) {
		List<ProdottoDTO> dtoList = new ArrayList<>();
		for (ProdottoEntity entity : entityList) {
			ProdottoDTO dto = new ProdottoDTO();
			dto.setAttivo(entity.getAttivo());
			dto.setBarcode(entity.getBarcode());
			dto.setBarcodeCfCt(entity.getBarcodeCfCt());
			dto.setCodice(entity.getCodice());
			dto.setDataCreazione(entity.getDataCreazione());
			dto.setDataUltimaModifica(entity.getDataUltimaModifica());
			dto.setDescrizione(entity.getDescrizione());
			dto.setDescrizioneBreve(entity.getDescrizioneBreve());
			dto.setDescrizioneInglese(entity.getDescrizioneInglese());
			dto.setDescrizioneSito(entity.getDescrizioneSito());
			dto.setErogatore(entity.getErogatore());
			dto.setEsportato(entity.getEsportato());
			dto.setEsportatoPbb(entity.getEsportatoPbb());
			dto.setFormato(entity.getFormato());
			dto.setFornitore(entity.getFornitore());
			dto.setGiacenza(entity.getGiacenza());
			dto.setId(entity.getId());
			dto.setImmagine(entity.getImmagine());
			dto.setLinea(entity.getLinea());
			dto.setLineaInglese(entity.getLineaInglese());
			dto.setModoUso(entity.getModoUso());
			dto.setMolteplicita(entity.getMolteplicita());
			dto.setMolteplicitaCfCt(entity.getMolteplicitaCfCt());
			dto.setNumerazione(entity.getNumerazione());
			dto.setOmaggio(entity.getOmaggio());
			dto.setPathBrochure(entity.getPathBrochure());
			dto.setPesoLordo(entity.getPesoLordo());
			dto.setPesoLordoCfCt(entity.getPesoLordoCfCt());
			dto.setPrezzo(entity.getPrezzo());
			dto.setVolume(entity.getVolume());
			dto.setIdTipoProdotto(entity.getTipoProdotto().getId());
			dto.setVolumeProdotto(entity.getVolumeProdotto());
			dto.setWeb(entity.getWeb());
			dtoList.add(dto);
		}
		return dtoList;
	}

}
