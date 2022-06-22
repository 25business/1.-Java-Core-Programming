package com.example.proizvodi;

public class Majica extends Proizvod {
    private String brend;
    private String velicina; // S, M, L, XL, XXL
    private String tip; // muski, zenski, unisex, deciji

    public Majica(String naziv, String kategorija, double cena, String brend, String velicina, String tip) {
        super(naziv, kategorija, cena);
        this.brend = brend;
        this.velicina = velicina;
        this.tip = tip;
    }
    public String getBrend() { return brend; }
    public void setBrend(String brend) { this.brend = brend; }
    public String getVelicina() { return velicina; }
    public void setVelicina(String velicina) { this.velicina = velicina; }
    public String getTip() { return tip; }
    public void setTip(String tip) { this.tip = tip; }

    public String toString() {
        return super.toString() + String.format("""
                Brend: %s
                Velicina: %s
                Tip: %s
                """, brend, velicina, tip);
    }
}
