package com.example.WebProjekat.entity;

import java.io.Serializable;
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
public class Film implements Serializable{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	@Column(nullable=false)
	private String Naziv;
	
	@Column
	private String Opis;
	
	@Column(nullable=false)
	private String Žanr;
	
	@Column
	private long Trajanje;

	//1 FILM IMA VISE TERMINSKIHLISTIPROJEKCIJA, 1:N VEZA
		@OneToMany(mappedBy="film",fetch=FetchType.LAZY,cascade=CascadeType.ALL,orphanRemoval=true)
			private Set<TerminskaListaProjekcija> projekcije=new HashSet<>();
	
	//1 FILM IMA VISE OCENAFILMA, 1:N VEZA
	@OneToMany(mappedBy="film",fetch=FetchType.LAZY,cascade=CascadeType.ALL,orphanRemoval=true)
		private Set<OcenaFilma> ocenjenifilmovi = new HashSet<>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNaziv() {
		return Naziv;
	}

	public void setNaziv(String naziv) {
		Naziv = naziv;
	}

	public String getOpis() {
		return Opis;
	}

	public void setOpis(String opis) {
		Opis = opis;
	}

	public String getŽanr() {
		return Žanr;
	}

	public void setŽanr(String žanr) {
		Žanr = žanr;
	}

	public long getTrajanje() {
		return Trajanje;
	}

	public void setTrajanje(long trajanje) {
		Trajanje = trajanje;
	}

	public Set<TerminskaListaProjekcija> getProjekcije() {
		return projekcije;
	}

	public void setProjekcije(Set<TerminskaListaProjekcija> projekcije) {
		this.projekcije = projekcije;
	}

	public Set<OcenaFilma> getOcenjenifilmovi() {
		return ocenjenifilmovi;
	}

	public void setOcenjenifilmovi(Set<OcenaFilma> ocenjenifilmovi) {
		this.ocenjenifilmovi = ocenjenifilmovi;
	}

	public Film(long id, String naziv, String opis, String žanr, long trajanje, Set<TerminskaListaProjekcija> projekcije, Set<OcenaFilma> ocenjenifilmovi) {
		super();
		this.id = id;
		Naziv = naziv;
		Opis = opis;
		Žanr = žanr;
		Trajanje = trajanje;
		this.projekcije = projekcije;
		this.ocenjenifilmovi = ocenjenifilmovi;
	}

	@Override
	public String toString() {
		return "Film {id=" + id 
				+ ", Naziv=" + Naziv 
				+ ", Opis=" + Opis 
				+ ", Žanr=" + Žanr 
				+ ", Trajanje=" + Trajanje
				+ ", projekcije=" + projekcije 
				+ ", ocenjenifilmovi=" + ocenjenifilmovi + "}";
	}
	
	
	
}
