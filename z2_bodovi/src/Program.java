import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite bodove od 0 - 100: ");
        int bodovi = Integer.parseInt(input.nextLine());
        int ocena = 0;


        if ((bodovi >= 0) && (bodovi <= 50)) {
            ocena = 5;
        } else if ((bodovi >= 51) && (bodovi <= 60)) {
            ocena = 6;
        } else if((bodovi >= 61) && (bodovi <= 70)) {
            ocena = 7;
        } else if((bodovi >= 71) && (bodovi <= 80)) {
            ocena = 8;
        } else if((bodovi >= 81) && (bodovi <= 90)) {
            ocena = 9;
        } else if((bodovi >= 91) && (bodovi <= 100)) {
            ocena = 10;
        }

        if ((bodovi < 0) || (bodovi > 100)) {
            System.out.println("Trebate uneti bodove od 0 - 100.");
        } else {
            System.out.printf("Ocena za %d bodova je %d", bodovi, ocena);
        }
    }
}
