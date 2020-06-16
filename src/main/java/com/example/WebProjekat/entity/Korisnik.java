package com.example.WebProjekat.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

enum Uloga{GLEDALAC,MENADŽER,ADMINISTRATOR};

@Entity
public class Korisnik implements Serializable{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	@Column(nullable=false)
	private String korisničko_ime;
	
	@Column(nullable=false)
	private String Ime;
	
	@Column(nullable=false)
	private String Prezime;
	
	@Column(nullable=false)
	private String Lozinka;
	
	@Column(nullable=false)
	private String email;	
	
	@Column
	private String kontakt_telefon;
	
	@Column
	private String datum;
	
	@Column(nullable=false)
	private Uloga uloga;

	@Column
	private boolean Aktivan;
	
	//VISE KORISNIKA(MENADZERA) U 1 BIOSKOPU, N:1 VEZA
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
		private Bioskop bioskop;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getKorisničko_ime() {
		return korisničko_ime;
	}

	public void setKorisničko_ime(String korisničko_ime) {
		this.korisničko_ime = korisničko_ime;
	}

	public String getIme() {
		return Ime;
	}

	public void setIme(String ime) {
		Ime = ime;
	}

	public String getPrezime() {
		return Prezime;
	}

	public void setPrezime(String prezime) {
		Prezime = prezime;
	}

	public String getLozinka() {
		return Lozinka;
	}

	public void setLozinka(String lozinka) {
		Lozinka = lozinka;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getKontakt_telefon() {
		return kontakt_telefon;
	}

	public void setKontakt_telefon(String kontakt_telefon) {
		this.kontakt_telefon = kontakt_telefon;
	}

	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}

	public Uloga getUloga() {
		return uloga;
	}

	public void setUloga(Uloga uloga) {
		this.uloga = uloga;
	}

	public boolean isAktivan() {
		return Aktivan;
	}

	public void setAktivan(boolean aktivan) {
		Aktivan = aktivan;
	}

	public Bioskop getBioskop() {
		return bioskop;
	}

	public void setBioskop(Bioskop bioskop) {
		this.bioskop = bioskop;
	}

	public Korisnik(long id, String korisničko_ime, String ime, String prezime, String lozinka, String email,String kontakt_telefon, String datum, Uloga uloga, boolean aktivan, Bioskop bioskop) {
		super();
		this.id = id;
		this.korisničko_ime = korisničko_ime;
		Ime = ime;
		Prezime = prezime;
		Lozinka = lozinka;
		this.email = email;
		this.kontakt_telefon = kontakt_telefon;
		this.datum = datum;
		this.uloga = uloga;
		Aktivan = aktivan;
		this.bioskop = bioskop;
	}


	public Korisnik() {
		super();
	}

	@Override
	public String toString() {
		return "Korisnik {id=" + id 
				+ ", korisničko_ime=" + korisničko_ime 
				+ ", Ime=" + Ime + ", Prezime=" + Prezime
				+ ", Lozinka=" + Lozinka 
				+ ", email=" + email 
				+ ", kontakt_telefon=" + kontakt_telefon 
				+ ", datum=" + datum 
				+ ", uloga=" + uloga 
				+ ", Aktivan=" + Aktivan 
				+ ", bioskop=" + bioskop + "}";
	}
	
	
	
}
	