package it.objectmethod.cceservicelayer.service.dto;

import java.util.Date;
import java.util.List;

public class CopiaCommissioneDTO {

	private int id;

	private Date data;

	private String note;

	private Integer stato;

	private Integer numero;

	private Integer mezzoConsegnaVettore;

	private String ragioneSocialeCliente;

	private String esportato;

	private Integer evaso;

	private Double importoTot;

	private Double importoTotScontato;

	private Double spesaIncasso;

	private Integer idCliente;

	private Long idCondizioniPagamento;

	private List<CopiaCommissioneDettaglioDTO> commissioneDettaglio;

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

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Long getIdCondizioniPagamento() {
		return idCondizioniPagamento;
	}

	public void setIdCondizioniPagamento(Long idCondizionePagamento) {
		this.idCondizioniPagamento = idCondizionePagamento;
	}

	public List<CopiaCommissioneDettaglioDTO> getCommissioneDettaglio() {
		return commissioneDettaglio;
	}

	public void setCommissioneDettaglio(List<CopiaCommissioneDettaglioDTO> commissioneDettaglio) {
		this.commissioneDettaglio = commissioneDettaglio;
	}

	@Override
	public String toString() {
		return "CopiaCommissioneDTO [id=" + id + ", data=" + data + ", note=" + note + ", stato=" + stato + ", numero="
				+ numero + ", mezzoConsegnaVettore=" + mezzoConsegnaVettore + ", ragioneSocialeCliente="
				+ ragioneSocialeCliente + ", esportato=" + esportato + ", evaso=" + evaso + ", importoTot=" + importoTot
				+ ", importoTotScontato=" + importoTotScontato + ", spesaIncasso=" + spesaIncasso + ", idCliente="
				+ idCliente + ", idCondizioniPagamento=" + idCondizioniPagamento + ", commissioneDettaglio="
				+ commissioneDettaglio + "]";
	}
}
