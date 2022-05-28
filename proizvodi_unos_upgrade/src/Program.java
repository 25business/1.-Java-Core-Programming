public class Program {
    public static void main(String[] args) {

        Proizvod p = new Proizvod();
        p.setNaziv("Cokoladno mleko");
        p.setCena(50);
        p.setPorez(0.2);

        System.out.println(p.za_ispis());
    }
}
