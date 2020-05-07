package com.example.WebProjekat.entity;

import javax.persistence.*;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Bioskop implements Serializable{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	@Column
	private String Naziv;
	
	@Column
	private String Adresa;
	
	@Column
	private String broj_telefona_centrale;
	
	@Column
	private String email;
		
    //1 BIOSKOP IMA VISE SALA, 1:N VEZA
   	@OneToMany(mappedBy = "bioskop", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
   		private Set<Sala> sale = new HashSet<>();
   	 
   	//1 BIOSKOP IMA VISE TERMINSKIHLISTIPROJEKCIJA, 1:N VEZA
 	@OneToMany(mappedBy = "bioskop", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
 	private Set<TerminskaListaProjekcija> rasporedOdrzavanja=new HashSet<>();

 	//1 BIOSKOP IMA VISE MENADZERA, 1:N VEZA
 	@OneToMany(mappedBy="bioskop",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
 		private Set<Korisnik> menadžeri=new HashSet<>();

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

	public String getAdresa() {
		return Adresa;
	}

	public void setAdresa(String adresa) {
		Adresa = adresa;
	}

	public String getBroj_telefona_centrale() {
		return broj_telefona_centrale;
	}

	public void setBroj_telefona_centrale(String broj_telefona_centrale) {
		this.broj_telefona_centrale = broj_telefona_centrale;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Sala> getSale() {
		return sale;
	}

	public void setSale(Set<Sala> sale) {
		this.sale = sale;
	}

	public Set<TerminskaListaProjekcija> getRasporedOdrzavanja() {
		return rasporedOdrzavanja;
	}

	public void setRasporedOdrzavanja(Set<TerminskaListaProjekcija> rasporedOdrzavanja) {
		this.rasporedOdrzavanja = rasporedOdrzavanja;
	}

	public Set<Korisnik> getMenadžeri() {
		return menadžeri;
	}

	public void setMenadžeri(Set<Korisnik> menadžeri) {
		this.menadžeri = menadžeri;
	}

	public Bioskop(long id, String naziv, String adresa, String broj_telefona_centrale, String email, Set<Sala> sale,Set<TerminskaListaProjekcija> rasporedOdrzavanja, Set<Korisnik> menadžeri) {
		super();
		this.id = id;
		Naziv = naziv;
		Adresa = adresa;
		this.broj_telefona_centrale = broj_telefona_centrale;
		this.email = email;
		this.sale = sale;
		this.rasporedOdrzavanja = rasporedOdrzavanja;
		this.menadžeri = menadžeri;
	}

	@Override
	public String toString() {
		return "Bioskop {id=" + id 
				+ ", Naziv=" + Naziv 
				+ ", Adresa=" + Adresa 
				+ ", broj_telefona_centrale=" + broj_telefona_centrale 
				+ ", email=" + email 
				+ ", sale=" + sale 
				+ ", rasporedOdrzavanja="+ rasporedOdrzavanja 
				+ ", menadžeri=" + menadžeri + "}";
	}
	
	
}
