import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite vrednost stranice a: ");
        int a = Integer.parseInt(input.nextLine());
        System.out.println("Unesite vrednost stranice b: ");
        int b = Integer.parseInt(input.nextLine());
        System.out.println("Unesite vrednost stranice c: ");
        int c = Integer.parseInt(input.nextLine());

        Trougao t = new Trougao(a, b, c);

        System.out.println(t.za_ispis());
    }
}
