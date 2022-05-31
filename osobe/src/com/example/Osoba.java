package com.example;

public class Osoba {

    private String ime;
    private String prezime;
    private int godiste;

    public Osoba() {}

    public Osoba(String in_ime, String in_prezime, int in_godiste) {
        ime = in_ime;
        prezime = in_prezime;
        godiste = in_godiste;
    }

    public String getIme() { return ime; }
    public void setIme(String value) { ime = value;}

    public String getPrezime() { return prezime; }
    public void setPrezime(String value) { prezime = value;}

    public Integer getGodiste() { return godiste; }
    public void setGodiste(Integer value) { godiste = value;}

    public String toString() {
        return String.format("%s %s (%d)", ime, prezime, godiste);
    }
}
