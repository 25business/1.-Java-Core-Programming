package com.example.proizvodi;

public class Patike extends Proizvod {
    private String brend;
    private int velicina;
    private String tip; // muski, zenski, unisex, deciji

    public Patike(String naziv, String kategorija, double cena, String brend, int velicina, String tip) {
        super(naziv, kategorija, cena);
        this.brend = brend;
        this.velicina = velicina;
        this.tip = tip;
    }

    public String getBrend() { return brend; }
    public void setBrend(String brend) { this.brend = brend; }
    public int getVelicina() { return velicina; }
    public void setVelicina(int velicina) { this.velicina = velicina; }
    public String getTip() { return tip; }
    public void setTip(String tip) { this.tip = tip; }

    public String toString() {
        return super.toString() + String.format("""
                Brend: %s
                Velicina: %d
                Tip: %s
                """, brend, velicina, tip);
    }
}