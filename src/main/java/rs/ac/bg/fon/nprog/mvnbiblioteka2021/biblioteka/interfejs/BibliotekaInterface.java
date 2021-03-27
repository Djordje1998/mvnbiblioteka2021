package rs.ac.bg.fon.nprog.mvnbiblioteka2021.biblioteka.interfejs;

import java.util.LinkedList;

import rs.ac.bg.fon.nprog.mvnbiblioteka2021.biblioteka.Autor;
import rs.ac.bg.fon.nprog.mvnbiblioteka2021.biblioteka.Knjiga;

public interface BibliotekaInterface {

	public void dodajKnjigu(Knjiga knjiga);
	
	public void obrisiKnjigu(Knjiga knjiga);
	
	public LinkedList<Knjiga> vratiSveKnjige();
	
	public LinkedList<Knjiga> pronadjiKnjigu(
			Autor autor,
			String isbn,
			String naslov,
			String izdavac);
	
}
