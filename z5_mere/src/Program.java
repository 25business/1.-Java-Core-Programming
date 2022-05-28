import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite vrednost u metrima: ");
        double metar = Double.parseDouble(input.nextLine());

        Metar m = new Metar(metar);

        System.out.println(m.za_ispis());
    }
}
