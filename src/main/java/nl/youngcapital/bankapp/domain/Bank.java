package nl.youngcapital.bankapp.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Bank {
	@Id
	@GeneratedValue
	private Long id;
	private String naam;
	private Long kluisInhoud;
	
	@OneToMany(mappedBy = "bank", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Vestiging> vestiging;
	
	public Bank(String naam) {
		this.naam = naam;
	}
	public Bank() {}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public Long getKluisInhoud() {
		return kluisInhoud;
	}
	public void setKluisInhoud(Long kluisInhoud) {
		this.kluisInhoud = kluisInhoud;
	}

}
