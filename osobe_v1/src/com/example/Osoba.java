package com.example;

public class Osoba {
    private String ime;
    private String prezime;
    private int godiste;
    private double plata;

    public Osoba() {}

    public Osoba(String in_ime, String in_prezime, int in_godiste, double in_plata) {
        ime = in_ime;
        prezime = in_prezime;
        godiste = in_godiste;
        plata = in_plata;
    }

    public String getIme() { return ime; }
    public void setIme(String ime) { this.ime = ime; }

    public String getPrezime() { return prezime; }
    public void setPrezime(String prezime) { this.prezime = prezime; }

    public Integer getGodiste() { return godiste; }
    public void setGodiste(Integer godiste) { this.godiste = godiste; }

    public double getPlata() { return plata; }
    public void setPlata(double plata) { this.plata = plata; }

    public String toString() {
        return String.format("%s %s [%d] - %.2f", ime, prezime, godiste, plata);
    }
}
