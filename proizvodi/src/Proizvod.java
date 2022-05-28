public class Proizvod {
    String naziv;
    double cena;
    double porez;

    Proizvod(){}

    Proizvod(String in_naziv, double in_cena, double in_porez) {
        naziv = in_naziv;
        cena = in_cena;
        porez = in_porez;
    }

    Proizvod(String in_naziv, double in_cena) {
        naziv = in_naziv;
        cena = in_cena;
        porez = 0.2;
    }


    double cenaSaPorezom() {
        return cena + (cena * porez);
    }
}
