package nl.youngcapital.bankapp.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Vestiging {
	@Id
	@GeneratedValue
	private Long id;
	
	private String straat;

	@ManyToOne
	@JoinColumn(name = "bank_id")
	private Bank bank;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStraat() {
		return straat;
	}

	public void setStraat(String straat) {
		this.straat = straat;
	}
	
	
}
