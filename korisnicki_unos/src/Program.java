import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Unesite Vase ime: ");
        String ime = input.nextLine();
        System.out.println("Unesite Vase prezime: ");
        String prezime = input.nextLine();
        System.out.println("Unesite Vasu godinu rodjenja: ");
        int godina = Integer.parseInt(input.nextLine());
        System.out.println("Unesite grad u kom zivite: ");
        String grad = input.nextLine();

        Osoba o = new Osoba(ime, prezime, godina, grad);

        System.out.println(o.za_ispis());
    }
}
