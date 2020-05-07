package com.example.WebProjekat.entity;

import java.io.Serializable;
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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class TerminskaListaProjekcija implements Serializable{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	@Column
	private long cena_projekcije;
	
	@Column
	private String vreme_projekcije;
	
	//VISE TERMINSKIHLISTIPROJEKCIJA SADRZI VISE GLEDALACA (VEZNA TABELA REZERVACIJE), VEZA N:N
	@ManyToMany(mappedBy="rezervisaniFilmovi")
			private Set<Gledalac> gledaoci=new HashSet<>();
		
	//VISE TERMINSKIHLISTIPROJEKCIJA U 1 BIOSKOPU, N:1 VEZA
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
		private Bioskop bioskop;
			
	//VISE TERMINSKIHLISTIPROJEKCIJA U VISE SALA (VEZNA TABELA ), VEZA N:N
	@ManyToMany(mappedBy="projekcije")
		private Set<Sala> sale=new HashSet<>();
		
	//VISE TERMINSKIHLISTAPROJEKCIJA SADRZANO U 1 FILMU, N:1 VEZA
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
		private Film film;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCena_projekcije() {
		return cena_projekcije;
	}

	public void setCena_projekcije(long cena_projekcije) {
		this.cena_projekcije = cena_projekcije;
	}

	public String getVreme_projekcije() {
		return vreme_projekcije;
	}

	public void setVreme_projekcije(String vreme_projekcije) {
		this.vreme_projekcije = vreme_projekcije;
	}

	public Set<Gledalac> getGledaoci() {
		return gledaoci;
	}

	public void setGledaoci(Set<Gledalac> gledaoci) {
		this.gledaoci = gledaoci;
	}

	public Bioskop getBioskop() {
		return bioskop;
	}

	public void setBioskop(Bioskop bioskop) {
		this.bioskop = bioskop;
	}

	public Set<Sala> getSale() {
		return sale;
	}

	public void setSale(Set<Sala> sale) {
		this.sale = sale;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public TerminskaListaProjekcija(long id, long cena_projekcije, String vreme_projekcije, Set<Gledalac> gledaoci,Bioskop bioskop, Set<Sala> sale, Film film) {
		super();
		this.id = id;
		this.cena_projekcije = cena_projekcije;
		this.vreme_projekcije = vreme_projekcije;
		this.gledaoci = gledaoci;
		this.bioskop = bioskop;
		this.sale = sale;
		this.film = film;
	}

	@Override
	public String toString() {
		return "TerminskaListaProjekcija {id=" + id 
				+ ", cena_projekcije=" + cena_projekcije 
				+ ", vreme_projekcije="	+ vreme_projekcije 
				+ ", gledaoci=" + gledaoci 
				+ ", bioskop=" + bioskop 
				+ ", sale=" + sale 
				+ ", film=" + film + "}";
	}
	
	
	
}