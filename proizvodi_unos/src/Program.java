import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // I nacin

        System.out.println("Unesite naziv proizvoda: ");
        String naziv = input.nextLine();
        System.out.println("Unesite cenu proizvoda: ");
        double cena = Double.parseDouble(input.nextLine());
        System.out.println("Unesite porez: ");
        double porez = Double.parseDouble(input.nextLine());
        Proizvod p1 = new Proizvod(naziv, cena, porez);

        // II nacin

        Proizvod p2 = new Proizvod();
        System.out.println("Unesite naziv proizvoda: ");
        p2.naziv = input.nextLine();
        System.out.println("Unesite cenu proizvoda: ");
        p2.cena = Double.parseDouble(input.nextLine());
        System.out.println("Unesite porez: ");
        p2.porez = Double.parseDouble(input.nextLine());
        if(p1.porez > 1) {
            p1.porez = p1.porez / 100;
        }


        System.out.println(p1.za_ispis());
        System.out.println(p2.za_ispis());

    }
}
