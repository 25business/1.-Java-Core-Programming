public class Program {
    public static void main(String[] args) {

        Proizvod p1 = new Proizvod();
        p1.naziv = "Cokoladno mleko 250ml";
        p1.cena = 50.99;
        p1.porez = 0.2;

        Proizvod p2 = new Proizvod("Hleb", 36.99, 0.2);

        Proizvod p3 = new Proizvod("Grand kafa 200g", 250);

        System.out.printf("""
                -----------------
                Naziv: %s
                Cena: %.2f
                Porez: %.2f
                Cena sa porezom: %.2f
                """, p1.naziv, p1.cena, p1.porez, p1.cenaSaPorezom());

        System.out.printf("""
                -----------------
                Naziv: %s
                Cena: %.2f
                Porez: %.2f
                Cena sa porezom: %.2f
                """, p2.naziv, p2.cena, p2.porez, p2.cenaSaPorezom());

        System.out.printf("""
                -----------------
                Naziv: %s
                Cena: %.2f
                Porez: %.2f
                Cena sa porezom: %.2f
                """, p3.naziv, p3.cena, p3.porez, p3.cenaSaPorezom());
    }
}
