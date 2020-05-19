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
@Table(name = "cliente")
public class ClienteEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "ragione_sociale")
	private String ragioneSociale;

	@Column(name = "codice_fiscale")
	private String codiceFiscale;

	@Column(name = "telefono")
	private String telefono;

	@Column(name = "partita_iva")
	private String partitaIva;

	@Column(name = "banca_appoggio")
	private String bancaAppoggio;

	@Column(name = "abi")
	private String abi;

	@Column(name = "cab")
	private String cab;

	@Column(name = "codice_zona")
	private String codiceZona;

	@Column(name = "codice_cliente")
	private String codiceCliente;

	@Column(name = "stato")
	private String stato;

	@Column(name = "cellulare")
	private String cellulare;

	@Column(name = "cognome")
	private String cognome;

	@Column(name = "comune_nascita")
	private String comuneNascita;

	@Column(name = "nome")
	private String nome;

	@Column(name = "provincia_nascita")
	private String provinciaNascita;

	@Column(name = "sesso")
	private String sesso;

	@Column(name = "stato_nascita")
	private String statoNascita;

	@Column(name = "tipo")
	private String tipo;

	@Column(name = "data_nascita")
	private String dataNascita;

	@Column(name = "condizioni_pagamento")
	private String condizioniPagamento;

	@Column(name = "note")
	private String note;

	@Column(name = "email")
	private String email;

	@JoinColumn(name = "cliente_id")
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<IndirizziClienteEntity> indirizzi;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getPartitaIva() {
		return partitaIva;
	}

	public void setPartitaIva(String partitaIva) {
		this.partitaIva = partitaIva;
	}

	public String getBancaAppoggio() {
		return bancaAppoggio;
	}

	public void setBancaAppoggio(String bancaAppoggio) {
		this.bancaAppoggio = bancaAppoggio;
	}

	public String getAbi() {
		return abi;
	}

	public void setAbi(String abi) {
		this.abi = abi;
	}

	public String getCab() {
		return cab;
	}

	public void setCab(String cab) {
		this.cab = cab;
	}

	public String getCodiceZona() {
		return codiceZona;
	}

	public void setCodiceZona(String codiceZona) {
		this.codiceZona = codiceZona;
	}

	public String getCodiceCliente() {
		return codiceCliente;
	}

	public void setCodiceCliente(String codiceCliente) {
		this.codiceCliente = codiceCliente;
	}

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

	public String getCellulare() {
		return cellulare;
	}

	public void setCellulare(String cellulare) {
		this.cellulare = cellulare;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getComuneNascita() {
		return comuneNascita;
	}

	public void setComuneNascita(String comuneNascita) {
		this.comuneNascita = comuneNascita;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProvinciaNascita() {
		return provinciaNascita;
	}

	public void setProvinciaNascita(String provinciaNascita) {
		this.provinciaNascita = provinciaNascita;
	}

	public String getSesso() {
		return sesso;
	}

	public void setSesso(String sesso) {
		this.sesso = sesso;
	}

	public String getStatoNascita() {
		return statoNascita;
	}

	public void setStatoNascita(String statoNascita) {
		this.statoNascita = statoNascita;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(String dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getCondizioniPagamento() {
		return condizioniPagamento;
	}

	public void setCondizioniPagamento(String condizioniPagamento) {
		this.condizioniPagamento = condizioniPagamento;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<IndirizziClienteEntity> getIndirizzi() {
		return indirizzi;
	}

	public void setIndirizzi(List<IndirizziClienteEntity> indirizzi) {
		this.indirizzi = indirizzi;
	}

	@Override
	public String toString() {
		return "ClienteEntity [id=" + id + ", ragioneSociale=" + ragioneSociale + ", codiceFiscale=" + codiceFiscale
				+ ", telefono=" + telefono + ", partitaIva=" + partitaIva + ", bancaAppoggio=" + bancaAppoggio
				+ ", abi=" + abi + ", cab=" + cab + ", codiceZona=" + codiceZona + ", codiceCliente=" + codiceCliente
				+ ", stato=" + stato + ", cellulare=" + cellulare + ", cognome=" + cognome + ", comuneNascita="
				+ comuneNascita + ", nome=" + nome + ", provinciaNascita=" + provinciaNascita + ", sesso=" + sesso
				+ ", statoNascita=" + statoNascita + ", tipo=" + tipo + ", dataNascita=" + dataNascita
				+ ", condizioniPagamento=" + condizioniPagamento + ", note=" + note + ", email=" + email
				+ ", indirizzi=" + indirizzi + "]";
	}

}
