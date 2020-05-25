package it.objectmethod.cceservicelayer.service.dto;

public class CopiaCommissioneDettaglioDTO {

	private int id;

	private int sconto;

	private int totPezzi;

	private Double prezzoSingolo;

	private Double importo;

	private Double importoScontato;

	private int evaso;

	private int pezziInviati;

	private Integer idCopiaCommissione;

	private Long idProdotto;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSconto() {
		return sconto;
	}

	public void setSconto(int sconto) {
		this.sconto = sconto;
	}

	public int getTotPezzi() {
		return totPezzi;
	}

	public void setTotPezzi(int totPezzi) {
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

	public int getEvaso() {
		return evaso;
	}

	public void setEvaso(int evaso) {
		this.evaso = evaso;
	}

	public int getPezziInviati() {
		return pezziInviati;
	}

	public void setPezziInviati(int pezziInviati) {
		this.pezziInviati = pezziInviati;
	}

	public Integer getIdCopiaCommissione() {
		return idCopiaCommissione;
	}

	public void setIdCopiaCommissione(Integer idCopiaCommissione) {
		this.idCopiaCommissione = idCopiaCommissione;
	}

	public Long getIdProdotto() {
		return idProdotto;
	}

	public void setIdProdotto(Long idProdotto) {
		this.idProdotto = idProdotto;
	}

	@Override
	public String toString() {
		return "CopiaCommissioneDettaglioDTO [id=" + id + ", sconto=" + sconto + ", totPezzi=" + totPezzi
				+ ", prezzoSingolo=" + prezzoSingolo + ", importo=" + importo + ", importoScontato=" + importoScontato
				+ ", evaso=" + evaso + ", pezziInviati=" + pezziInviati + ", copiaCommissione=" + idCopiaCommissione
				+ ", prodotto=" + idProdotto + "]";
	}
}
