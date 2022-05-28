public class Osoba {
    String ime;
    String prezime;
    int godina;
    String grad;

    Osoba(String in_ime, String in_prezime, int in_godina, String in_grad) {
        ime = in_ime;
        prezime = in_prezime;
        godina = in_godina;
        grad = in_grad;
    }

    String za_ispis() {
        return String.format("Vasi podaci: %s %s (%d) - %s", ime, prezime, godina, grad);
    }
}
