package com.example.ljudi;

public class Osoba {
    protected String ime;
    protected String prezime;
    protected int godine;

    public Osoba(String ime, String prezime, int godine) {
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
    }

    public String getIme() { return ime; }
    public void setIme(String ime) { this.ime = ime; }

    public String getPrezime() { return prezime; }
    public void setPrezime(String prezime) { this.prezime = prezime; }

    public Integer getGodine() { return godine; }
    public void setGodine(Integer godine) { this.godine = godine; }

    public String toString() {
        return String.format("%s %s (%d)", ime, prezime, godine);
    }
}
