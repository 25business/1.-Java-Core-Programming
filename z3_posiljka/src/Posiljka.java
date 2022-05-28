public class Posiljka {
    String ime;
    String prezime;
    String ulica;
    int broj;
    String grad;


    String za_ispis() {
        return String.format("""
                Ime: %s
                Prezime: %s
                Ulica: %s
                Broj: %d
                Grad: %s """, ime, prezime, ulica, broj, grad);
    }
}
