package it.objectmethod.cceservicelayer.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "copia_commissione")
public class CopiaCommissioneEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "data")
	private Date data;

	@Column(name = "note")
	private String note;

	@Column(name = "stato")
	private Integer stato;

	@Column(name = "numero")
	private Integer numero;

	@Column(name = "mezzo_consegna_vettore")
	private Integer mezzoConsegnaVettore;

	@Column(name = "ragione_sociale_cliente")
	private String ragioneSocialeCliente;

	@Column(name = "esportato")
	private String esportato;

	@Column(name = "evaso")
	private Integer evaso;

	@Column(name = "importo_tot")
	private Double importoTot;

	@Column(name = "importo_tot_scontato")
	private Double importoTotScontato;

	@Column(name = "spesa_incasso")
	private Double spesaIncasso;

	@ManyToOne
	@JsonIgnore
	private ClienteEntity cliente;

	@ManyToOne
	@JsonIgnore
	private CondizioniPagamentoEntity condizioniPagamento;

	@JoinColumn(name = "copiaCommissione_id")
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<CopiaCommissioneDettaglioEntity> commissioneDettaglio;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Integer getStato() {
		return stato;
	}

	public void setStato(Integer stato) {
		this.stato = stato;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getMezzoConsegnaVettore() {
		return mezzoConsegnaVettore;
	}

	public void setMezzoConsegnaVettore(Integer mezzoConsegnaVettore) {
		this.mezzoConsegnaVettore = mezzoConsegnaVettore;
	}

	public String getRagioneSocialeCliente() {
		return ragioneSocialeCliente;
	}

	public void setRagioneSocialeCliente(String ragioneSocialeCliente) {
		this.ragioneSocialeCliente = ragioneSocialeCliente;
	}

	public String getEsportato() {
		return esportato;
	}

	public void setEsportato(String esportato) {
		this.esportato = esportato;
	}

	public Integer getEvaso() {
		return evaso;
	}

	public void setEvaso(Integer evaso) {
		this.evaso = evaso;
	}

	public Double getImportoTot() {
		return importoTot;
	}

	public void setImportoTot(Double importoTot) {
		this.importoTot = importoTot;
	}

	public Double getImportoTotScontato() {
		return importoTotScontato;
	}

	public void setImportoTotScontato(Double importoTotScontato) {
		this.importoTotScontato = importoTotScontato;
	}

	public Double getSpesaIncasso() {
		return spesaIncasso;
	}

	public void setSpesaIncasso(Double spesaIncasso) {
		this.spesaIncasso = spesaIncasso;
	}

	public ClienteEntity getCliente() {
		return cliente;
	}

	public void setCliente(ClienteEntity cliente) {
		this.cliente = cliente;
	}

	public CondizioniPagamentoEntity getCondizioniPagamento() {
		return condizioniPagamento;
	}

	public void setCondizioniPagamento(CondizioniPagamentoEntity condizioniPagamento) {
		this.condizioniPagamento = condizioniPagamento;
	}

	public List<CopiaCommissioneDettaglioEntity> getCommissioneDettaglio() {
		return commissioneDettaglio;
	}

	public void setCommissioneDettaglio(List<CopiaCommissioneDettaglioEntity> commissioneDettaglio) {
		this.commissioneDettaglio = commissioneDettaglio;
	}

	@Override
	public String toString() {
		return "CopiaCommissioneEntity [id=" + id + ", data=" + data + ", note=" + note + ", stato=" + stato
				+ ", numero=" + numero + ", mezzoConsegnaVettore=" + mezzoConsegnaVettore + ", ragioneSocialeCliente="
				+ ragioneSocialeCliente + ", esportato=" + esportato + ", evaso=" + evaso + ", importoTot=" + importoTot
				+ ", importoTotScontato=" + importoTotScontato + ", spesaIncasso=" + spesaIncasso + ", cliente="
				+ cliente + ", condizioniPagamento=" + condizioniPagamento + ", commissioneDettaglio="
				+ commissioneDettaglio + "]";
	}

}
