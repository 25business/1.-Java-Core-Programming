import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        double a;
        double b;
        String operacija;

        Scanner input = new Scanner(System.in);
        System.out.println("Unesite prvi broj: ");
        a = Double.parseDouble(input.nextLine());
        System.out.println("Unesite drugi broj: ");
        b = Double.parseDouble(input.nextLine());
        System.out.println("Unesite operaciju: ");
        operacija = input.nextLine();

        if (operacija.equals("+")) {
            System.out.printf("%.1f + %.1f = %.2f", a, b, a + b);
        } else if (operacija.equals("-")) {
            System.out.printf("%.1f - %.1f = %.2f", a, b, a - b);
        } else if (operacija.equals("*")) {
            System.out.printf("%.1f * %.1f = %.2f", a, b, a * b);
        } else if (operacija.equals("/")) {
            if ((a == 0) || (b == 0)) {
                System.out.println("Ne mozete deliti sa nulom.");
            } else {
                System.out.printf("%.1f / %.1f = %.2f", a, b, a / b);
            }
        }
    }
}
