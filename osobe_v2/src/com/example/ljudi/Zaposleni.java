package com.example.ljudi;

public class Zaposleni extends Osoba {

    private double plata;
    public Zaposleni(String ime, String prezime, int godine, double plata) {
        super(ime, prezime, godine);
        this.plata = plata;
    }

    public double getPlata() { return plata; }
    public void setPlata(double plata) { this.plata = plata; }

    public String toString() {
        return super.toString() + String.format(" - %.2f", plata);
    }
}
