package it.objectmethod.cceservicelayer.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "condizioni_pagamento")
public class CondizioniPagamentoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "descrizione")
	private String descrizione;

	@Column(name = "codice")
	private String codice;

	@Column(name = "spesa")
	private Double spesa;

	@Column(name = "attivo")
	private boolean attivo;

	@JoinColumn(name = "condizioniPagamento_id")
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
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
		return "CondizioniPagamentoEntity [id=" + id + ", descrizione=" + descrizione + ", codice=" + codice
				+ ", spesa=" + spesa + ", attivo=" + attivo + ", copiaCommissione=" + copiaCommissione + "]";
	}
}
