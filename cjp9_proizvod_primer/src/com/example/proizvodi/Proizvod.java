package com.example.proizvodi;

public class Proizvod {
    protected String naziv;
    protected String kategorija;
    protected double cena;
    private static final double PDV = 0.2;

    public Proizvod() {}
    public Proizvod(String naziv, String kategorija, double cena) {
        this.naziv = naziv;
        this.kategorija = kategorija;
        this.cena = cena;
    }
    public String getNaziv() { return naziv; }
    public void setNaziv(String naziv) { this.naziv = naziv; }
    public String getKategorija() { return kategorija; }
    public void setKategorija(String kategorija) { this.kategorija = kategorija; }
    public double getCena() { return cena; }
    public void setCena(double cena) { this.cena = cena; }

    public double cenaSaPorezom() {
        return cena + (cena * PDV);
    }

    public String toString() {
        return String.format("""
                Naziv: %s
                Kategorija: %s
                Cena: %.2f
                Porez: %.0f %%
                Cena sa porezom: %.2f
                """, naziv, kategorija, cena, PDV*100, cenaSaPorezom());
    }


}
