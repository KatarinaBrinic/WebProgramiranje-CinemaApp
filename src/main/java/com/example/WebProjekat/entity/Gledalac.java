package com.example.WebProjekat.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
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
import javax.persistence.OneToMany;

@Entity
public class Gledalac extends Korisnik implements Serializable {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	//VISE GLEDALACA GLEDA VISE FILMOVA (VEZNA TABELA REZERVACIJE), N:N VEZA
    @ManyToMany
    @JoinTable(name = "Rezervisani_filmovi",
           joinColumns = @JoinColumn(name = "gledalac_id", referencedColumnName = "id"),
           inverseJoinColumns = @JoinColumn(name = "terminskalistaprojekcija_id", referencedColumnName = "id"))
    	private Set<Film> rezervisaniFilmovi = new HashSet<>();
		    
    //1 GLEDALAC IMA VISE OCENAFILMOVA, 1:N VEZA
    @OneToMany(mappedBy="gledalac",fetch=FetchType.LAZY,cascade=CascadeType.ALL,orphanRemoval=true)
		private Set<OcenaFilma> odgledaniFilmovi=new HashSet<>();
    
   	public Set<Film> getRezervisaniFilmovi() {
		return rezervisaniFilmovi;
	}

	public void setRezervisaniFilmovi(Set<Film> rezervisaniFilmovi) {
		this.rezervisaniFilmovi = rezervisaniFilmovi;
	}

	public Set<OcenaFilma> getOdgledaniFilmovi() {
		return odgledaniFilmovi;
	}

	public void setOdgledaniFilmovi(Set<OcenaFilma> odgledaniFilmovi) {
		this.odgledaniFilmovi = odgledaniFilmovi;
	}

	public Gledalac(long id, String korisničko_ime, String ime, String prezime, String lozinka, String email,String kontakt_telefon, String datum, Uloga uloga, boolean aktivan, Bioskop bioskop, long id2,Set<Film> rezervisaniFilmovi, Set<OcenaFilma> odgledaniFilmovi) {
		super(id, korisničko_ime, ime, prezime, lozinka, email, kontakt_telefon, datum, uloga, aktivan, bioskop);
		id = id2;
		this.rezervisaniFilmovi = rezervisaniFilmovi;
		this.odgledaniFilmovi = odgledaniFilmovi;
	}


	
	
	
}
