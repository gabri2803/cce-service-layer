package it.objectmethod.cceservicelayer.service.dto;

import java.util.List;

import it.objectmethod.cceservicelayer.domain.CopiaCommissioneEntity;

public class CondizioniPagamentoDTO {

	private Long id;

	private String descrizione;

	private String codice;

	private Double spesa;

	private boolean attivo;

	private List<CopiaCommissioneEntity> copiaCommissione;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public Double getSpesa() {
		return spesa;
	}

	public void setSpesa(Double spesa) {
		this.spesa = spesa;
	}

	public boolean isAttivo() {
		return attivo;
	}

	public void setAttivo(boolean attivo) {
		this.attivo = attivo;
	}

	public List<CopiaCommissioneEntity> getCopiaCommissione() {
		return copiaCommissione;
	}

	public void setCopiaCommissione(List<CopiaCommissioneEntity> copiaCommissione) {
		this.copiaCommissione = copiaCommissione;
	}

	@Override
	public String toString() {
		return "CondizioniPagamentoDTO [id=" + id + ", descrizione=" + descrizione + ", codice=" + codice + ", spesa="
				+ spesa + ", attivo=" + attivo + ", copiaCommissione=" + copiaCommissione + "]";
	}
}
