package it.objectmethod.cceservicelayer.service.dto;

public class IndirizziClienteDTO {

	private int id;

	private String indirizzo;

	private String citta;

	private String cap;

	private String provincia;

	private String nazione;

	private boolean fatturazione;

	private String destinatario;

	private boolean attivo;

	private int clienteId;

	private String nomeCliente;

	private String cognomeCliente;

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

	public int getClienteId() {
		return clienteId;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCognomeCliente() {
		return cognomeCliente;
	}

	public void setCognomeCliente(String cognomeCliente) {
		this.cognomeCliente = cognomeCliente;
	}

	@Override
	public String toString() {
		return "IndirizziClienteDTO [id=" + id + ", indirizzo=" + indirizzo + ", citta=" + citta + ", cap=" + cap
				+ ", provincia=" + provincia + ", nazione=" + nazione + ", fatturazione=" + fatturazione
				+ ", destinatario=" + destinatario + ", attivo=" + attivo + ", clienteId=" + clienteId
				+ ", nomeCliente=" + nomeCliente + ", cognomeCliente=" + cognomeCliente + "]";
	}

}
