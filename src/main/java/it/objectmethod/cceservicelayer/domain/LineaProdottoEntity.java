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
@Table(name = "linea_prodotto")
public class LineaProdottoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "codice")
	private String codice;

	@Column(name = "descrizione")
	private String descrizione;

	@JoinColumn(name = "linea_prodotto_id")
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
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
		return "LineaProdottoEntity [id=" + id + ", codice=" + codice + ", descrizione=" + descrizione + ", prodotti="
				+ prodotti + "]";
	}
}
