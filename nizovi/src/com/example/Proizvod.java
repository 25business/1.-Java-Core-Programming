package com.example;

public class Proizvod {
    private String naziv;
    private double cena;
    private double porez;

    public Proizvod() {}

    public Proizvod(String in_naziv, double in_cena, double in_porez) {
        naziv = in_naziv;
        cena = in_cena;
        dodelaVrednostiPoreza(in_porez);
    }

    private void dodelaVrednostiPoreza(double vrednost) {
        if((vrednost > 0 ) && (vrednost < 1)) {
            porez = vrednost;
        } else {
            System.err.println("Vrednost poreza mora biti izmedju 0 i 1.");
        }
    }

    private String formatPorez() {
        return String.format("%.2f %%", porez * 100);
    }

    public String getNaziv() { return naziv; }
    public void setNaziv(String value) { naziv = value; }

    public double getCena() { return cena; }
    public void setCena(double value) {
        if(value > 0) {
            cena = value;
        } else {
            System.err.println("Vrednost cene mora biti veca od 0.");
        }
    }

    public double getPorez() { return porez; }
    public void setPorez(double value) {
        dodelaVrednostiPoreza(value);
    }

    double cenaSaPorezom() {
        return cena + (cena * porez);
    }



    public String za_ispis() {
        return String.format("""
                Naziv: %s
                Cena: %.2f
                Porez: %s
                """, naziv, cena, formatPorez());
    }
}