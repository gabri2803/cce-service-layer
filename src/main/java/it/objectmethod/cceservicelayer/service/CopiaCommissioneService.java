package it.objectmethod.cceservicelayer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import it.objectmethod.cceservicelayer.domain.CopiaCommissioneEntity;
import it.objectmethod.cceservicelayer.repository.ClienteRepository;
import it.objectmethod.cceservicelayer.repository.CondizioniPagamentoRepository;
import it.objectmethod.cceservicelayer.repository.CopiaCommissioneRepository;
import it.objectmethod.cceservicelayer.repository.ProdottoRepository;
import it.objectmethod.cceservicelayer.service.dto.CopiaCommissioneDTO;
import it.objectmethod.cceservicelayer.service.mapper.CopiaCommissioneDettaglioMapper;
import it.objectmethod.cceservicelayer.service.mapper.CopiaCommissioneMapper;

@Component
public class CopiaCommissioneService {

	@Autowired
	private CopiaCommissioneRepository commissioneRepo;

	@Autowired
	private CopiaCommissioneMapper commissioneMapper;

	@Autowired
	private ClienteRepository clienteRepo;

	@Autowired
	private CondizioniPagamentoRepository condizioniPagamentoRepo;

	@Autowired
	private ProdottoRepository prodottoRepo;

	@Autowired
	private CopiaCommissioneDettaglioMapper dettaglioMapper;

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

//	public ResponseEntity<CopiaCommissioneDTO> saveCopiaCommissione(CopiaCommissioneDTO dto) {
//		ResponseEntity<CopiaCommissioneDTO> resp = null;
//		List<CopiaCommissioneDettaglioEntity> dettagliList = new ArrayList<>();
//		CopiaCommissioneEntity entity = null;
//		CondizioniPagamentoEntity condizioniPagamento = null;
//		ProdottoEntity prodotto = null;
//		CopiaCommissioneDettaglioEntity dettaglioEntity = null;
//		try {
//			ClienteEntity clienteInserito = clienteRepo.findById(dto.getIdCliente()).get();
//			condizioniPagamento = condizioniPagamentoRepo.findById(dto.getIdCondizioniPagamento()).get();
//			for (CopiaCommissioneDettaglioDTO dettagliDto : dto.getCommissioneDettaglio()) {
//				prodotto = prodottoRepo.findById(dettagliDto.getIdProdotto()).get();
//				dettaglioEntity = dettaglioMapper.toEntity(dettagliDto);
//				dettaglioEntity.setProdotto(prodotto);
//				dettagliList.add(dettaglioEntity);
//			}
//			entity = commissioneMapper.toEntity(dto);
//			entity.setCliente(clienteInserito);
//			entity.setCondizioniPagamento(condizioniPagamento);
//			entity.setCommissioneDettaglio(dettagliList);
//			commissioneRepo.save(entity);
//			CopiaCommissioneDTO commissioneInserita = commissioneMapper.toDto(entity);
//			resp = new ResponseEntity<>(commissioneInserita, HttpStatus.ACCEPTED);
//		} catch (Exception e) {
//			resp = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//		}
//		return resp;
//	}
}
