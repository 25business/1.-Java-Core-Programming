package com.example;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws InterruptedException {
        //prvih 20 brojeva deljivih sa 3 i 7

        /*
        int brojac = 0;
        int broj = 8;
        while(brojac < 20) {
            if((broj % 3 == 0) && (broj % 7 == 0)) {
                System.out.println(broj);
                brojac = brojac + 1;
            }
            broj = broj + 1;
        }*/
        /*
        int i = 0;
        while(true) {
            i = i + 1;
            System.out.println(i);
        } */
        /*
        while(true) {
            System.out.println("CRVENO");
            Thread.sleep(2000);
            System.out.println("ZUTO");
            Thread.sleep(250);
            System.out.println("ZELENO");
            Thread.sleep(3000);
        }*/
        /*
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("Unesite taster (Q za izlazak): ");
            String unos = input.nextLine();
            if(unos.toUpperCase().equals("Q")) {
                break;
            } else {
                System.err.println("Unesite taster Q!");
            }
        }*/

        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.print("""
                    --- Interaktivni Meni ---
                    [1] Opcija 1
                    [2] Opcija 2
                    [3] Opcija 3
                    [Q] Izlaz
                    Vas izbor: """);
            String izbor = input.nextLine();
            if(izbor.equals("1")) {
                System.out.println("Opcija 1");
            } else if(izbor.equals("2")) {
                System.out.println("Opcija 2");
            } else if(izbor.equals("3")) {
                System.out.println("Opcija 3");
            } else if(izbor.toUpperCase().equals("Q")) {
                break;
            } else {
                System.err.println("Neispravna opcija!");
            }
        }

    }
}
