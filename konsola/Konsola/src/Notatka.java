/**
     klasa: Notatka
     opis: Klasa reprezentująca notatkę z tytułem i treścią
     pola: licznikNotatek - statyczny licznik utworzonych notatek
     id - unikalny identyfikator notatki
     tytul - tytuł notatki
     tresc - treść notatki
     autor: 00000000000
**/
public class Notatka {
    private static int licznikNotatek = 0;
    private int id;
    protected String tytul;
    protected String tresc;

    public Notatka(String tytul, String tresc){
        licznikNotatek++;
        this.id = licznikNotatek;
        this.tytul = tytul;
        this.tresc = tresc;
    }

    public void wyswietl(){
        System.out.println("Tytuł: " + tytul);
        System.out.println("Treść: " + tresc);
    }

    public void diagnostyka(){
        System.out.println("ID: " + id + " Tytuł: " + tytul + " Treść: " + tresc + " Licznik: " + licznikNotatek);
    }
}
