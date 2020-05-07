INSERT INTO BIOSKOP (Naziv, Adresa, broj_telefona_centrale,email) 
VALUES ('Cineplexx', 'TC Promenada', '441551','Cineplexx.rs');
INSERT INTO BIOSKOP (Naziv, Adresa, broj_telefona_centrale,email) 
VALUES ('CineStar', 'Delta City', '661771','CineStar.rs');
INSERT INTO BIOSKOP (Naziv, Adresa, broj_telefona_centrale,email) 
VALUES ('Arena Cineplexx','Bulevar Mihajla Pupina 5','221331','ArenaCineplexx.rs');

INSERT INTO FILM (Naziv,Opis,Žanr,Trajanje) VALUES ('Matrix','Distopijska budućnost,simulirana stvarnost-Matriks.','SF,akcija',190);
INSERT INTO FILM (Naziv,Opis,Žanr,Trajanje) VALUES ('Gospodar Prstenova:Dve kule','Nastavak filma Gospodar prstenova: Družina prstena, a prati ga Gospodar prstenova: Povratak kralja.','SF',320);
INSERT INTO FILM (Naziv,Opis,Žanr,Trajanje) VALUES ('Hari Poter i kamen mudrosti','Pozvan da pohađa Školu čarobnjaštva i veštičarenja “Hogwarts”,Harry se upušta u avanturu svog života u Hogwartsu.','SF',160);

INSERT INTO SALA (Kapacitet,oznaka_sale,bioskop_id) VALUES (200, 'A1',1);
INSERT INTO SALA (Kapacitet,oznaka_sale,bioskop_id) VALUES (250, 'A2',2);
INSERT INTO SALA (Kapacitet,oznaka_sale,bioskop_id) VALUES (180, 'A3',3);

INSERT INTO KORISNIK (dtype,korisničko_ime,Lozinka,Ime,Prezime,kontakt_telefon,email,Aktivan,uloga,datum,bioskop_id) 
VALUES ('GLEDALAC','PrviKorisnik','sdfijdf','Marko','Marković','067321450','markomarkovic@gmail.com',true,1,'1995-01-01',1);
INSERT INTO KORISNIK (dtype,korisničko_ime,Lozinka,Ime,Prezime,kontakt_telefon,email,Aktivan,uloga,datum) 
VALUES ('GLEDALAC','DrugiKorisnik','ufygaeu','Milica','Milić','069321450','milicamilic@gmail.com',true,2,'1989-02-02');
INSERT INTO KORISNIK (dtype,korisničko_ime,Lozinka,Ime,Prezime,kontakt_telefon,email,Aktivan,uloga,datum,bioskop_id) 
VALUES ('GLEDALAC','TreciKorisnik','iowdjao','Nikolina','Nikolić','061321450','nikolinanikolic@gmail.com',true,3,'1998-03-03',2);
INSERT INTO KORISNIK (dtype,korisničko_ime,Lozinka,Ime,Prezime,kontakt_telefon,email,Aktivan,uloga,datum) 
VALUES ('MENADŽER','CetvrtiKorisnik','bvrueue','Jelena','Janković','062321450','jelenajankovic@gmail.com',true,1,'1988-04-04');
INSERT INTO KORISNIK (dtype,korisničko_ime,Lozinka,Ime,Prezime,kontakt_telefon,email,Aktivan,uloga,datum) 
VALUES ('MENADŽER','PetiKorisnik','iotjerof','Dejan','Dejanović','063321450','dejandejanovic@gmail.com',true,2,'1991-05-05');
INSERT INTO KORISNIK (dtype,korisničko_ime,Lozinka,Ime,Prezime,kontakt_telefon,email,Aktivan,uloga,datum,bioskop_id) 
VALUES ('MENADŽER','SestiKorisnik','aersad','Nikola','Nikolić','064321450','nikolanikolic@gmail.com',true,1,'1995-01-01',3);

INSERT INTO OCENA_FILMA(ocenafilma,gledalac_id,film_id) VALUES (5,2,2);
INSERT INTO OCENA_FILMA(ocenafilma,gledalac_id,film_id) VALUES (4,1,1);

INSERT INTO TERMINSKA_LISTA_PROJEKCIJA(cena_projekcije,vreme_projekcije,bioskop_id,film_id) 
VALUES (200,'18h',3,2);
INSERT INTO TERMINSKA_LISTA_PROJEKCIJA(cena_projekcije,vreme_projekcije,bioskop_id,film_id) 
VALUES (250,'19h',1,3);
INSERT INTO TERMINSKA_LISTA_PROJEKCIJA(cena_projekcije,vreme_projekcije,bioskop_id,film_id) 
VALUES (300,'20h',2,3);

INSERT INTO REZERVISANI_FILMOVI(gledalac_id,terminskalistaprojekcija_id) VALUES (3,2);
INSERT INTO REZERVISANI_FILMOVI(gledalac_id,terminskalistaprojekcija_id) VALUES (1,2);
INSERT INTO REZERVISANI_FILMOVI(gledalac_id,terminskalistaprojekcija_id) VALUES (3,1);

INSERT INTO PROJEKCIJE_SALA(sala_id,terminskalistaprojekcija_id) VALUES (2,1);
INSERT INTO PROJEKCIJE_SALA(sala_id,terminskalistaprojekcija_id) VALUES (3,2);
INSERT INTO PROJEKCIJE_SALA(sala_id,terminskalistaprojekcija_id) VALUES (1,3);


