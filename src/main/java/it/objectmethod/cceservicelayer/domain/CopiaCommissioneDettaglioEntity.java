package it.objectmethod.cceservicelayer.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "copia_commissione_dettaglio")
public class CopiaCommissioneDettaglioEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "sconto")
	private Integer sconto;

	@Column(name = "tot_pezzi")
	private Integer totPezzi;

	@Column(name = "prezzo_singolo")
	private Double prezzoSingolo;

	@Column(name = "importo")
	private Double importo;

	@Column(name = "importo_scontato")
	private Double importoScontato;

	@Column(name = "evaso")
	private Integer evaso;

	@Column(name = "pezzi_inviati")
	private Integer pezziInviati;

	@ManyToOne
	@JsonIgnore
	private CopiaCommissioneEntity copiaCommissione;

	@ManyToOne
	@JsonIgnore
	private ProdottoEntity prodotto;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getSconto() {
		return sconto;
	}

	public void setSconto(Integer sconto) {
		this.sconto = sconto;
	}

	public Integer getTotPezzi() {
		return totPezzi;
	}

	public void setTotPezzi(Integer totPezzi) {
		this.totPezzi = totPezzi;
	}

	public Double getPrezzoSingolo() {
		return prezzoSingolo;
	}

	public void setPrezzoSingolo(Double prezzoSingolo) {
		this.prezzoSingolo = prezzoSingolo;
	}

	public Double getImporto() {
		return importo;
	}

	public void setImporto(Double importo) {
		this.importo = importo;
	}

	public Double getImportoScontato() {
		return importoScontato;
	}

	public void setImportoScontato(Double importoScontato) {
		this.importoScontato = importoScontato;
	}

	public Integer getEvaso() {
		return evaso;
	}

	public void setEvaso(Integer evaso) {
		this.evaso = evaso;
	}

	public Integer getPezziInviati() {
		return pezziInviati;
	}

	public void setPezziInviati(Integer pezziInviati) {
		this.pezziInviati = pezziInviati;
	}

	public CopiaCommissioneEntity getCopiaCommissione() {
		return copiaCommissione;
	}

	public void setCopiaCommissione(CopiaCommissioneEntity copiaCommissione) {
		this.copiaCommissione = copiaCommissione;
	}

	public ProdottoEntity getProdotto() {
		return prodotto;
	}

	public void setProdotto(ProdottoEntity prodotto) {
		this.prodotto = prodotto;
	}

	@Override
	public String toString() {
		return "CopiaCommissioneDettaglioEntity [id=" + id + ", sconto=" + sconto + ", totPezzi=" + totPezzi
				+ ", prezzoSingolo=" + prezzoSingolo + ", importo=" + importo + ", importoScontato=" + importoScontato
				+ ", evaso=" + evaso + ", pezziInviati=" + pezziInviati + ", copiaCommissione=" + copiaCommissione
				+ ", prodotto=" + prodotto + "]";
	}
}
