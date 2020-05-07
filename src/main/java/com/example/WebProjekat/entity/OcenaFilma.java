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

@Entity
public class OcenaFilma implements Serializable {

	//za odgledani film!
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column
	private long ocenafilma;

	//VISE OCENA FILMOVA ZA 1 FILM, N:1 VEZA
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
		private Film film;
	
	//VISE OCENAFILMOVA ZA 1 GLEDAOCA, N:1
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
		private Gledalac gledalac;
	
	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public long getOcenafilma() {
		return ocenafilma;
	}

	public void setOcenafilma(long ocenafilma) {
		this.ocenafilma = ocenafilma;
	}

	public Gledalac getGledalac() {
		return gledalac;
	}

	public void setGledalac(Gledalac gledalac) {
		this.gledalac = gledalac;
	}

	public OcenaFilma(Long id, long ocenafilma, Film film, Gledalac gledalac) {
		super();
		this.id = id;
		this.ocenafilma = ocenafilma;
		this.film = film;
		this.gledalac = gledalac;
	}

	@Override
	public String toString() {
		return "OcenaFilma {id=" + id 
				+ ", ocenafilma=" + ocenafilma 
				+ ", film=" + film 
				+ ", gledalac=" + gledalac + "}";
	}

	
}