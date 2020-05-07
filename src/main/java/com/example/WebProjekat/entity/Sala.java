package com.example.WebProjekat.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Sala implements Serializable{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	@Column
	private long Kapacitet;

	@Column(nullable=false)
	private String oznaka_sale;
	
	//VISE SALA SE NALAZI U OKVIRU 1 BIOSKOPA, N:1 VEZA
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	    private Bioskop bioskop;
	
	//VISE TERMINSKIHLISTIPROJEKCIJA U VISE SALA, N:N VEZA
	@ManyToMany
		@JoinTable(name = "Projekcije_sala",
	    	joinColumns = @JoinColumn(name = "sala_id", referencedColumnName = "id"),
	    	inverseJoinColumns = @JoinColumn(name = "terminskalistaprojekcija_id", referencedColumnName = "id"))
			private Set<TerminskaListaProjekcija> projekcije = new HashSet<>();

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public long getKapacitet() {
			return Kapacitet;
		}

		public void setKapacitet(long kapacitet) {
			Kapacitet = kapacitet;
		}

		public String getOznaka_sale() {
			return oznaka_sale;
		}

		public void setOznaka_sale(String oznaka_sale) {
			this.oznaka_sale = oznaka_sale;
		}

		public Bioskop getBioskop() {
			return bioskop;
		}

		public void setBioskop(Bioskop bioskop) {
			this.bioskop = bioskop;
		}

		public Set<TerminskaListaProjekcija> getProjekcije() {
			return projekcije;
		}

		public void setProjekcije(Set<TerminskaListaProjekcija> projekcije) {
			this.projekcije = projekcije;
		}

		public Sala(long id, long kapacitet, String oznaka_sale, Bioskop bioskop,Set<TerminskaListaProjekcija> projekcije) {
			super();
			this.id = id;
			Kapacitet = kapacitet;
			this.oznaka_sale = oznaka_sale;
			this.bioskop = bioskop;
			this.projekcije = projekcije;
		}

		@Override
		public String toString() {
			return "Sala {id=" + id 
					+ ", Kapacitet=" + Kapacitet 
					+ ", oznaka_sale=" + oznaka_sale 
					+ ", bioskop=" + bioskop 
					+ ", projekcije=" + projekcije + "}";
		}
		
		
	
}