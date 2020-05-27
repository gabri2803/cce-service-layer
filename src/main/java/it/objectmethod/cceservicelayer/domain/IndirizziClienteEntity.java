package it.objectmethod.cceservicelayer.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "indirizzi_cliente")
public class IndirizziClienteEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "indirizzo")
	private String indirizzo;

	@Column(name = "citta")
	private String citta;

	@Column(name = "cap")
	private String cap;

	@Column(name = "provincia")
	private String provincia;

	@Column(name = "nazione")
	private String nazione;

	@Column(name = "fatturazione")
	private boolean fatturazione;

	@Column(name = "destinatario")
	private String destinatario;

	@Column(name = "attivo")
	private boolean attivo;

	@ManyToOne
	private ClienteEntity cliente;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getNazione() {
		return nazione;
	}

	public void setNazione(String nazione) {
		this.nazione = nazione;
	}

	public boolean isFatturazione() {
		return fatturazione;
	}

	public void setFatturazione(boolean fatturazione) {
		this.fatturazione = fatturazione;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public boolean isAttivo() {
		return attivo;
	}

	public void setAttivo(boolean attivo) {
		this.attivo = attivo;
	}

	public ClienteEntity getCliente() {
		return cliente;
	}

	public void setCliente(ClienteEntity cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "IndirizziClienteEntity [id=" + id + ", indirizzo=" + indirizzo + ", citta=" + citta + ", cap=" + cap
				+ ", provincia=" + provincia + ", nazione=" + nazione + ", fatturazione=" + fatturazione
				+ ", destinatario=" + destinatario + ", attivo=" + attivo + ", cliente=" + cliente + "]";
	}

}
