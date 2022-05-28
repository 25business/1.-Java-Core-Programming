import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Posiljka p = new Posiljka();
        System.out.println("Unesite Vase ime: ");
        p.ime = input.nextLine();
        System.out.println("Unesite Vase prezime: ");
        p.prezime = input.nextLine();
        System.out.println("Unesite Vasu ulicu: ");
        p.ulica = input.nextLine();
        System.out.println("Unesite Vas broj kuce: ");
        p.broj = Integer.parseInt(input.nextLine());
        System.out.println("Unesite grad u kom zivite: ");
        p.grad = input.nextLine();

        System.out.println(p.za_ispis());

    }
}
