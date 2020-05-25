package it.objectmethod.cceservicelayer.service.dto;

import java.util.List;

import it.objectmethod.cceservicelayer.domain.ProdottoEntity;

public class LineaProdottoDTO {

	private Long id;

	private String codice;

	private String descrizione;

	private List<ProdottoEntity> prodotti;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public List<ProdottoEntity> getProdotti() {
		return prodotti;
	}

	public void setProdotti(List<ProdottoEntity> prodotti) {
		this.prodotti = prodotti;
	}

	@Override
	public String toString() {
		return "LineaProdottoDTO [id=" + id + ", codice=" + codice + ", descrizione=" + descrizione + ", prodotti="
				+ prodotti + "]";
	}
}
